package tema01;


import java.util.Scanner;

public class Ejercicio05EntDes {

	public static void main(String[] args) {

		int num1, suma = 0, repes, cont2 = 1;
		float cont = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos números quieres operar");
		repes = sc.nextInt();

		for (int i = 0; i < repes; i++) {

			System.out.println("Dime el número " + cont2++);
			num1 = sc.nextInt();

			if (num1 > 0) {
				cont++;
				suma += num1;
			}
			if (num1 < 0) {
				System.out.println("Mete un número positivo");
				break;
			}

		}

		System.out.println("La media de los números es: " + (suma / cont));
		sc.close();
	}

}