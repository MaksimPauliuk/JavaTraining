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

public class Airline {
	private String destination;
	private String flightNumber;
	private String aircraft;
	private String depatureTime;
	private String daysOfWeek;

	public Airline( ) {
		
	}
	
	public Airline(String destination, String flightNumber, String aircraft, String depatureTime,
			String daysOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraft = aircraft;
		this.depatureTime = depatureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[destination=" + destination + ", flightNumber=" + flightNumber
				+ ", aircraftType=" + aircraft + ", depatureTime=" + depatureTime + ", daysOfTheWeek="
				+ daysOfWeek + "]";
	}
}
