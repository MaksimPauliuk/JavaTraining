package by.jonline.module04.simple_class.task06;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности
 * установки времени и изменения его отдельных полей (час, минута, секунда)
 * с проверкой допустимости вводимых значений. В случае недопустимых  значений 
 * полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения 
 * времени на заданное количество часов, минут и секунд.
 */

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		
		outTime(time);
		
		System.out.println("Устанавливаем время в значение 05:14:02");
		time.setTime(5, 14, 2);
		outTime(time);
		
		System.out.println("Устанавливаем минуты и секнды в значение 28");
		time.setMinute(28);
		time.setSecond(28);
		outTime(time);
		
		System.out.println("Устанавливаем время в некорректное значение 24:86:92");
		time.setTime(24, 86, 92);
		outTime(time);
		
	}
	
	public static void outTime(Time tm) {
		System.out.print("Время (часы:минуты:секунды) = ");
		if(tm.getHour() < 10) {
			System.out.print("0");
		}
		System.out.print("" + tm.getHour() + ":");
		
		if(tm.getMinute() < 10) {
			System.out.print("0");
		}
		System.out.print("" + tm.getMinute() + ":");
		
		if(tm.getSecond() < 10) {
			System.out.print("0");
		}
		System.out.printf("%d\n",tm.getSecond());
	}

}
