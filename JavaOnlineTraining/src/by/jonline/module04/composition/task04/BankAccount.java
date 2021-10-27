package by.jonline.module04.composition.task04;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private boolean isBlocked;

	public BankAccount() {

	}

	public BankAccount(String accountNumber, double balance, boolean isBlocked) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.isBlocked = isBlocked;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (!isBlocked) {
			this.balance = balance;
		}
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[accountNumber=" + accountNumber + ", balance=" + balance + ", isBlocked="
				+ isBlocked + "]";
	}
}
