package by.jonline.module04.simple_class.task10;

import java.util.ArrayList;
import java.util.List;

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

public class Airport {
	private List<Airline> airlines;

	public Airport() {
		airlines = new ArrayList<Airline>();
	}

	public Airport(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public void addAirline(Airline a) {
		airlines.add(a);
	}

	public void showAirlines() {
		for (Airline a : airlines) {
			System.out.println(a);
		}
	}

	public void showAirlineByDestination(String destination) {
		for (Airline a : airlines) {
			if (a.getDestination().equalsIgnoreCase(destination)) {
				System.out.println(a);
			}
		}
	}

	public void showAirlineBy(String dayOfWeek) {
		dayOfWeek = dayOfWeek.toLowerCase();

		for (Airline a : airlines) {
			if (a.getDaysOfWeek().toLowerCase().contains(dayOfWeek)) {
				System.out.println(a);
			}
		}
	}

	public void showAirlineBy(String dayOfWeek, String afterTime) {
		dayOfWeek = dayOfWeek.toLowerCase();

		for (Airline a : airlines) {
			if (a.getDaysOfWeek().toLowerCase().contains(dayOfWeek)
				&& a.getDepatureTime().compareToIgnoreCase(afterTime) > 0) {
				System.out.println(a);
			}
		}
	}
}
