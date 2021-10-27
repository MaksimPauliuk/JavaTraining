package by.jonline.module01.linear;

/*
 * Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
 * (sinx + cosx)/(cosx - sinx) * tg(xy) 
 */
public class Task03 {

	public static void main(String[] args) {
		
		double x = 2;
		double y = 4;
		double res;
		
		res = (Math.sin(x) + Math.cos(y)) / 
			  (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
		
		System.out.println("Значение выражения (sinx + cosx)/(cosx - sinx)"
						   + " * tg(xy)," + " где x=" + x +", y=" + y
						   + " равно " + res);
	}

}
