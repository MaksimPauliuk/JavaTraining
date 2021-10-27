package by.jonline.module02.decomposition;

/*
 * Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  
 * массива,  элементами  которого являются цифры числа N
 */

public class Task10 {

	public static void main(String[] args) {
		
		int N = 4861054;
		int[] m;
		
		m = new int[сountDigits(N)];
		
		initArray(N, m);
		outArray(m);

	}

	public static int сountDigits(int N) {
		
		int count;
		
		count = (N == 0) ? 1 : 0;
		
		while (N != 0) {
			count++;
			N /= 10;
		}
		return count;
	}

	public static void initArray(int N, int[] m) {
		
		int n;
		
		n = сountDigits(N);
		
		do {
			m[n - 1] = N % 10;
			N = N / 10;
			n--;
		} while (n > 0);
	}

	public static void outArray(int[] m) {
		
		int n = m.length;
		
		System.out.println("Сгенерированный массив:");
		
		for (int i = 0; i < n; i++) {
			System.out.println("D[" + (i + 1) + "] = " + m[i]);
		}
	}

}
