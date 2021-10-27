package by.jonline.module04.simple_class.task04;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, 
 * номер поезда, время отправления. Создайте данные в массив из пяти элементов 
 * типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, 
 * номер которого введен пользователем. Добавьте возможность  сортировки  массив  
 * по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами назначения
 *  должны быть упорядочены по времени отправления
 */

public class Train {
	private String destination;
	private String numberOfTrain;
	private int departureTime;
	
	public Train(String destination, String numberOfTrain, int departureTime) {
		super();
		this.destination = destination;
		this.numberOfTrain = numberOfTrain;
		this.departureTime = departureTime;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNumberOfTrain() {
		return numberOfTrain;
	}

	public void setNumberOfTrain(String numberOfTrain) {
		this.numberOfTrain = numberOfTrain;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
}
