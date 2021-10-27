package by.jonline.module04.simple_class.task05;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на  единицу  в  заданном  диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными  
 * значениями. Счетчик  имеет  методы увеличения  и  уменьшения состояния, 
 * и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса
 */

public class Counter {
	private int value;

	public Counter() {
		value = 0;
	}

	public Counter(int value) {
		super();
		if (value > 10) {
			this.value = 10;
		} else if (value < 0) {
			this.value = 0;
		} else
			this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void increment() {
		if (value < 10) {
			value++;
		} else
			value = 10;
	}

	public void decrement() {
		if (value > 0) {
			value--;
		} else
			value = 0;
	}
}
