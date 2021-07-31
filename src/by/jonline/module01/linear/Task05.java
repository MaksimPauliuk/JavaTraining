package by.jonline.module01.linear;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task05 {

	public static void main(String[] args) {
		int T = 4895;
		int HH;
		int MM;
		int SS;

		HH = T / 3600;
		MM = (T - HH * 3600) / 60;
		SS = T % 60;

		System.out.println(T + " секунд = " + HH + "ч " + MM + "мин " + SS + "c");

	}

}
