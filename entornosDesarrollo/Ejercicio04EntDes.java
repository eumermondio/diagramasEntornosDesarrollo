

import java.util.Scanner;

public class Ejercicio04EntDes {

	public static void main(String[] args) {

		int num = 0, num1 = 0;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Dime el primer número");
			num = sc.nextInt();
			System.out.println("Dime el segundo número");
			num1 = sc.nextInt();
			

		} while (num != num1);
		sc.close();

	}

}