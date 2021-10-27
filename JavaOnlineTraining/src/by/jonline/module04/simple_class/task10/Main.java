package by.jonline.module04.simple_class.task10;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс, 
 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 *   
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 Найти и вывести: 
a) список рейсов для заданного пункта назначения; 
b) список рейсов для заданного дня недели; 
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {
		Airport airport = new Airport();
		
		airport.addAirline(new Airline("Hamburg","LH012","A320","18:45","Mon,Wed,Fri"));
		airport.addAirline(new Airline("Danzing","LO360","A330","15:00","Mon,Fri"));
		airport.addAirline(new Airline("Danzing","LO366","A320","19:00","Sun,Sut"));
		airport.addAirline(new Airline("Gomel","MN017","Boeing-737","18:45","Mon,Fri,Sut"));
		airport.addAirline(new Airline("Hamburg","MN112","Boeing-747","13:15","Tue,Wed,Fri,Sut"));

		System.out.println("Все рейсы:");
		airport.showAirlines();
		
		System.out.println("Рейсы по пункту назначения:");
		airport.showAirlineByDestination("Hamburg");
		
		System.out.println("Рейсы по дню недели:");
		airport.showAirlineBy("mon");
		
		System.out.println("Рейсы по дню недели, где время вылета больше заданного:");
		airport.showAirlineBy("Mon", "15:00");
	}
}
