package by.jonline.module04.simple_class.task04;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, 
 * номер поезда, время отправления. Создайте данные в массив из пяти элементов 
 * типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, 
 * номер которого введен пользователем. Добавьте возможность  сортировки  массив  
 * по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами назначения
 *  должны быть упорядочены по времени отправления
 */

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> trainsList = new ArrayList<Train>();
		trainsList.add(new Train("Гомель", "655A", 2119));
		trainsList.add(new Train("Брест", "187Б", 1957));
		trainsList.add(new Train("Минск", "265", 2317));
		trainsList.add(new Train("Минск", "658Б", 1810));
		trainsList.add(new Train("Жлобин", "635А", 1756));
		
		String numberOfTrain;

		System.out.println("Все поезда:");
		outInConsoleAllTrains(trainsList);

		sortByNumber(trainsList);
		System.out.println("Отсортированные по номеру поезда:");
		outInConsoleAllTrains(trainsList);

		numberOfTrain = inFromConsoleNumber();
		System.out.println("Информация о поезде с номером:" + numberOfTrain);
		trainInfo(numberOfTrain, trainsList);

		sortByDestination(trainsList);
		System.out.println("Отсортированные по пункту назначения поезда:");
		outInConsoleAllTrains(trainsList);
	}

	public static void outInConsoleTrainInfo(int index, ArrayList<Train> list) {
		System.out.printf("%-10s %-5s %d", list.get(index).getDestination(), list.get(index).getNumberOfTrain(),
				list.get(index).getDepartureTime());
	}

	public static void outInConsoleAllTrains(ArrayList<Train> list) {
		System.out.println("Назначение|Номер|Время отправления");
		for (int i = 0; i < list.size(); i++) {
			outInConsoleTrainInfo(i, list);
			System.out.println();
		}
		System.out.println();
	}

	public static String inFromConsoleNumber() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер поезда ->");
		return sc.next();
	}

	public static void trainInfo(String number, ArrayList<Train> list) {
		boolean trigger = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumberOfTrain().compareTo(number) == 0) {
				outInConsoleTrainInfo(i, list);
				System.out.println();
				trigger = true;
			}
		}
		if (!trigger) {
			System.out.println("Нет поезда с таким номером!");
		}
		System.out.println();
	}

	public static void sortByNumber(ArrayList<Train> list) {
		Train temp;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getNumberOfTrain().compareTo(list.get(j).getNumberOfTrain()) > 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}

	
	public static void sortByDestination(ArrayList<Train> list) {
		Train temp;
		int index = 0;
		int startIndex = 0;
		boolean trigger = false;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getDestination().compareTo(list.get(j).getDestination()) > 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		while (index < list.size() - 1) {
			if (list.get(index).getDestination().compareTo(list.get(index + 1).getDestination()) == 0) {
				if (!trigger) {
					startIndex = index;
				}
				trigger = true;
				index++;
				if (index != list.size() - 1) {
					continue;
				}
			}
			if (trigger) {
				for (int i = startIndex; i < index; i++) {
					for (int j = i + 1; j <= index; j++) {
						if (list.get(i).getDepartureTime() > list.get(j).getDepartureTime()) {
							temp = list.get(i);
							list.set(i, list.get(j));
							list.set(j, temp);
						}
					}
				}
				trigger = false;
			}
			index++;
		}
	}
}
