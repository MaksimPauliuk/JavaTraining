package by.jonline.module04.simple_class.task06;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности
 * установки времени и изменения его отдельных полей (час, минута, секунда)
 * с проверкой допустимости вводимых значений. В случае недопустимых  значений 
 * полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения 
 * времени на заданное количество часов, минут и секунд.
 */

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		checkTime();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		checkTime();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		checkTime();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		checkTime();
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		checkTime();
	}
	
	public void checkTime() {
		if (hour > 23 || hour < 0) {
			hour = 0;
		}
		if (minute > 59 || minute < 0) {
			minute = 0;
		}
		if (second > 59 || second < 0) {
			second = 0;
		}
	}	
}
