package tema02;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime número");
		num = sc.nextInt();
		System.out.println(factorial(num));
	}

	public static long factorial(int num) {
		if (num > 0) {
			long fact = 1;
			int i = 1;
			for (; i < num;) {
				fact *= num;
				num--;
			}
			return fact;
		} else {
			System.out.println("El número proporcionado es negativo");
			System.out.println("Error");
			return -1;
		}
	}

}
