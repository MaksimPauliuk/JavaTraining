package by.jonline.module04.simple_class.task08;

/*Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, 
 * с подходящими конструкторами и методами. Задать критерии выбора данных и 
 * вывести эти данные на консоль.
 *  
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, 
номер банковского счета.
 
Найти и вывести: 
a) список покупателей в алфавитном порядке; 
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/

public class Customer {
	private int id;
	private String surname;
	private String middleName;
	private String name;
	private String adress;
	private long cardNumber;
	private long bancAccountNumber;

	public Customer() {

	}

	public Customer(int id, String surname, String middleName, String name, String adress, long cardNumber,
			long bancAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.middleName = middleName;
		this.name = name;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.bancAccountNumber = bancAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBancAccountNumber() {
		return bancAccountNumber;
	}

	public void setBancAccountNumber(long bancAccountNumber) {
		this.bancAccountNumber = bancAccountNumber;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", surname=" + surname + ", middleName=" + middleName + ", name=" + name
				+ ", adress=" + adress + ", cardNumber=" + cardNumber + ", bancAccountNumber=" + bancAccountNumber
				+ "]";
	}

}
