package by.jonline.module04.simple_class.task08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

public class ShopCustomers {
	private List<Customer> clients;

	public ShopCustomers() {
		clients = new ArrayList<Customer>();
	}

	public ShopCustomers(List<Customer> clients) {
		this.clients = clients;
	}
	
	public List<Customer> getClients() {
		return clients;
	}

	public void setClients(List<Customer> clients) {
		this.clients = clients;
	}

	public void addCustomer(Customer c) {
		clients.add(c);
	}
	
	public void outInConsoleCustomers () {
		for(Customer c: clients) {
			System.out.println(c);
		}
	}
	
	public void showCustomersSortByFIO () {
		Comparator<Customer> cmp = Comparator.comparing(obj -> obj.getSurname());
		cmp = cmp.thenComparing(obj -> obj.getMiddleName());
		cmp = cmp.thenComparing(obj -> obj.getName());
		
		clients.sort(cmp);
		outInConsoleCustomers();
	}
	
	public void showCustomersByCardNumber(long rangeStart, long rangeEnd) {
		for(Customer c: clients) {
			if(c.getCardNumber() >= rangeStart && c.getCardNumber() <= rangeEnd) {
				System.out.println(c);
			}
		}
	}
}
