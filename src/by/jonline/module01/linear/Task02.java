package by.jonline.module01.linear;

/*
 * Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
 * (b+sqrt(b^2+4ac))/2a - (a^3)c + b^(-2)
*/

public class Task02 {

	public static void main(String[] args) {
		double a = 15;
		double b = 8;
		double c = 4.5;
		double z;
		
		z = (b+Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a) 
			 - Math.pow(a, 3)*c + Math.pow(b, -2);
		
		System.out.println("Значение выражения = " + z);

	}

}
