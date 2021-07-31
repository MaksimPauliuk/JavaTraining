package by.jonline.module01.cycle;

import java.math.BigInteger;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Task04 {

	public static void main(String[] args) {
		BigInteger res = BigInteger.valueOf(1);

		for(int i = 2; i <= 200; i++) {
		    res = res.multiply(BigInteger.valueOf(i * i));
		}

		System.out.println("Произведение квадратов перевых 200 чисел = " + res);
	}

}
