package by.jonline.module01.cycle;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = {x, x>2; 
 *     {-x, x<=2
 * 			
 */

public class Task02 {

	public static void main(String[] args) {

		double a = 0;
		double b = 5;
		double h = 0.5;
		double x = a;
		double y;

		while (x <= b) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}

			System.out.println("При x = " + x + " y = " + y);
			x += h;
		}

	}

}
