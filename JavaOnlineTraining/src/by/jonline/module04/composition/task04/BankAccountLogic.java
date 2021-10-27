package by.jonline.module04.composition.task04;

public class BankAccountLogic {

	public void blockAccount(BankAccount bankAcc) {
		bankAcc.setBlocked(true);
	}

	public void unblockAccount(BankAccount bankAcc) {
		bankAcc.setBlocked(false);
	}

	public void addBalance(BankAccount bankAcc, double balance) {
		if (!bankAcc.isBlocked()) {
			bankAcc.setBalance(bankAcc.getBalance() + balance);
			System.out.printf("Баланс счета %s увеличен на значение %10.2f\n", bankAcc.getAccountNumber(), balance);
		} else {
			System.out.printf("Счет %s заблокирован! Невозможно изменить баланс!\n", bankAcc.getAccountNumber());
		}
	}

	public void reduceBalance(BankAccount bankAcc, double balance) {
		if (!bankAcc.isBlocked()) {
			bankAcc.setBalance(bankAcc.getBalance() - balance);
			System.out.printf("Баланс счета %s уменьшен на значение %10.2f\n", bankAcc.getAccountNumber(), balance);
		} else {
			System.out.printf("Счет %s заблокирован! Невозможно изменить баланс!\n", bankAcc.getAccountNumber());
		}
	}
}
