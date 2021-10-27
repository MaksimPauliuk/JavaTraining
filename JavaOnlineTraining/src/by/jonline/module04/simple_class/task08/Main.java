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

public class Main {

	public static void main(String[] args) {
		ShopCustomers shop = new ShopCustomers();

		shop.addCustomer(new Customer(156, "Петров", "Петр", "Петрович", "Минск", 4255200579522655L, 24984544));
		shop.addCustomer(new Customer(452, "Петров", "Иван", "Петрович", "Гомель", 4254984651554544L, 41424444));
		shop.addCustomer(new Customer(125, "Иванов", "Иван", "Иванович", "Гомель", 4255198554654154L, 24011544));
		shop.addCustomer(new Customer(421, "Петров", "Иван", "Иванович", "Брест", 4255200518905455L, 24425444));
		shop.addCustomer(new Customer(45, "Сидоров", "Петр", "Иванович", "Гомель", 425520051020655L, 15245245));

		System.out.println("Список всех покупателей:");
		shop.outInConsoleCustomers();

		System.out.println("Список покупателей в алфавитном порядке:");
		shop.showCustomersSortByFIO();

		System.out.println("Список покупателей по номеру карты в интервале:");
		shop.showCustomersByCardNumber(4254200579522655L, 4255984651554544L);
	}

}
