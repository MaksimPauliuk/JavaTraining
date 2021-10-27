package by.jonline.module01.cycle;

/*
 * Вывести на экран соответствий между символами 
 * и их численными обозначениями в памяти компьютера.

 */

public class Task06 {

	public static void main(String[] args) {
		
		System.out.println("Символ|код");
		
		for (int i = 32; i <= 127; i++) {
			System.out.println((char)i+"     |"+i);
		}
		
	}

}
