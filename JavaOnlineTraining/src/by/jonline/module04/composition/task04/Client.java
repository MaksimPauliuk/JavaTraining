package by.jonline.module04.composition.task04;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private String passportID;
	private String adress;
	private String phone;
	private List<BankAccount> accounts;
	
	public Client() {
		accounts = new ArrayList<BankAccount>();
	}
	
	public Client(String name, String passportID, String adress, String phone, List<BankAccount> accounts) {
		this.name = name;
		this.passportID = passportID;
		this.adress = adress;
		this.phone = phone;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportID() {
		return passportID;
	}

	public void setPassportID(String passportID) {
		this.passportID = passportID;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", passportID=" + passportID + ", adress=" + adress + ", phone=" + phone
				+ ", accounts=" + accounts + "]";
	}
}
