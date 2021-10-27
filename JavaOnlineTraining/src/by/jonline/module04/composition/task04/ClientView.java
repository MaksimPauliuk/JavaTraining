package by.jonline.module04.composition.task04;

import java.util.List;

public class ClientView {
	private ClientLogic cLogic = new ClientLogic();
	
	public void showAccountList(List<BankAccount> bankAccount) {
		System.out.println("Номер счета                 |Баланс         |Блокировка");
		for (BankAccount bankAcc : bankAccount) {
			System.out.printf("%s|%15.2f|%b\n", bankAcc.getAccountNumber(), bankAcc.getBalance(), bankAcc.isBlocked());
		}
		System.out.println();
	}
	
	public void showClientInfo(Client client) {
		System.out.println("Информация о клиенте:");
		System.out.println("Имя " + client.getName());
		System.out.println("Номер паспорта " + client.getPassportID());
		System.out.println("Адрес " + client.getAdress());
		System.out.println("Номер телефона " + client.getPhone());
		System.out.printf("\nСписок счетов:\n");
		showAccountList(client.getAccounts());
	}
	
	public void showBlockedAccounts(Client client) {
		System.out.println("Список заблокированных счетов:");
		showAccountList(cLogic.findAccountByBlock(client, true));
	}
	
	public void showActiveAccounts(Client client) {
		System.out.println("Список активных счетов:");
		showAccountList(cLogic.findAccountByBlock(client, false));
	}
	
	public void showAccountInfo(Client client, String bankAccount) {
		System.out.println("Информация о запрашиваемом счете:");
		if(cLogic.findAccountByNumber(client, bankAccount) != null) {
			BankAccount bankAcc = cLogic.findAccountByNumber(client, bankAccount);
			System.out.println("Номер счета                 |Баланс         |Блокировка");
			System.out.printf("%s|%15.2f|%b\n", bankAcc.getAccountNumber(), bankAcc.getBalance(), bankAcc.isBlocked());
		}
		else {
			System.out.println("Такого счета нет");
		}
	}
	
	public void showSortAccounts(Client client) {
		System.out.println("Счета, упорядоченные по величине баланса:");
		showAccountList(cLogic.sortAccountByBalance(client));
	}
	
	public void showTotalBalance(Client client) {
		System.out.println("Сумма баланса всех счетов:");
		System.out.printf("%10.2f\n",cLogic.countTotalBalance(client));
	}
	
	public void showTotalPositiveBalance(Client client) {
		System.out.println("Сумма счетов, с положительным балансом:");
		System.out.printf("%10.2f\n",cLogic.countTotalPositiveBalance(client));
	}
	
	public void showTotalNegativeBalance(Client client) {
		System.out.println("Сумма счетов, с отрицательным балансом:");
		System.out.printf("%10.2f\n",cLogic.countTotalNegativeBalance(client));
	}
}
