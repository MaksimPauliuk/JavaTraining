package by.jonline.module01.linear;

/*
 * ƒано действительное число R вида nnn.ddd 
 * (три цифровых разр€да в дробной и целой част€х). 
 * ѕомен€ть местами дробную и целую части числа 
 * и вывести полученное значение числа.
 */

public class Task04 {

	public static void main(String[] args) {
		double R = 356.918;
		int intPart;
		int fractPart;

		intPart = (int) R;
		fractPart = (int) (R * 1000 - intPart * 1000);

		System.out.println(fractPart + "." + intPart);

	}

}
