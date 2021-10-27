package by.jonline.module04.simple_class.task05;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на  единицу  в  заданном  диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными  
 * значениями. Счетчик  имеет  методы увеличения  и  уменьшения состояния, 
 * и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса
 */

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();

		System.out.println("Текущее состояние счетчика, инициализированного по умолчанию:");
		System.out.println(counter.getValue());

		System.out.println("Увеличение счетчика:");
		for (int i = 0; i < 12; i++) {
			counter.increment();
			System.out.println(counter.getValue() + " ");
		}

		System.out.println("Уменьшение счетчика:");
		for (int i = 0; i < 12; i++) {
			counter.decrement();
			System.out.println(counter.getValue() + " ");
		}

		System.out.println("Инициализация произвольным значением:");
		Counter counter2 = new Counter(5);

		System.out.println("Текущее состояние счетчика 2:");
		System.out.println(counter2.getValue());
	}

}
