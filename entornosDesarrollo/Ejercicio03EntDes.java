

import java.util.Scanner;

public class Ejercicio03EntDes {

	public static void main(String[] args) {

		int num, suma = 0, cont = 0, cont2 = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dime el número " + cont2++);
			num = sc.nextInt();
			suma += num;
			cont++;
		} while (cont < 10);

		System.out.println("La suma es: " + suma);
		sc.close();
	}

}
