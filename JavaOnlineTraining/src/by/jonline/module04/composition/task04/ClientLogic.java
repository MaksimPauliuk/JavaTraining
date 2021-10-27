package by.jonline.module04.composition.task04;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность 
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим 
 * положительный и отрицательный балансы отдельно.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientLogic {
	
	public Client createDefaultClient() {
		List<BankAccount> bankAcc = new ArrayList<BankAccount>();

		bankAcc.add(new BankAccount("BY20OLMP31350000001000000933", 61965124.0, false));
		bankAcc.add(new BankAccount("RU20OLMP31350019519564400933", 1541, false));
		bankAcc.add(new BankAccount("BY20OLMP31659816516654009312", -665450.05, false));

		return new Client("Павлюк Максим", "HB2609435", "г.Гомель", "+375259845124", bankAcc);
	}

	public void addBankAccount(Client client, BankAccount bankAcc) {
		client.getAccounts().add(bankAcc);
	}

	public List<BankAccount> findAccountByBlock(Client client, boolean isBlocked) {
		List<BankAccount> tempBankAcc = new ArrayList<BankAccount>();

		for (BankAccount ba : client.getAccounts()) {
			if (ba.isBlocked() == isBlocked) {
				tempBankAcc.add(ba);
			}
		}
		return tempBankAcc;
	}

	public BankAccount findAccountByNumber(Client client, String accountNumber) {
		for (BankAccount bankAcc : client.getAccounts()) {
			if (bankAcc.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				return bankAcc;
			}
		}
		return null;
	}

	public List<BankAccount> sortAccountByBalance(Client client) {
		List<BankAccount> tempBankAcc;
		tempBankAcc = new ArrayList<BankAccount>(client.getAccounts());

		Comparator<BankAccount> cpm = Comparator.comparing(obj -> obj.getBalance());
		tempBankAcc.sort(cpm);

		return tempBankAcc;
	}

	public double countTotalBalance(Client client) {
		double totalBalance = 0;
		for (BankAccount bankAcc : client.getAccounts()) {
			totalBalance += bankAcc.getBalance();
		}
		return totalBalance;
	}

	public double countTotalPositiveBalance(Client client) {
		double totalBalance = 0;
		for (BankAccount bankAcc : client.getAccounts()) {
			if (bankAcc.getBalance() > 0) {
				totalBalance += bankAcc.getBalance();
			}
		}
		return totalBalance;
	}

	public double countTotalNegativeBalance(Client client) {
		double totalBalance = 0;
		for (BankAccount bankAcc : client.getAccounts()) {
			if (bankAcc.getBalance() < 0) {
				totalBalance += bankAcc.getBalance();
			}
		}
		return totalBalance;
	}
}
