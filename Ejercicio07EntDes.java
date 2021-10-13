package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio04EntDes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contImpares = 0, comprobar, multiplicarImpares = 1;
	
		for (int i = 0; contImpares < 10 ;i++) {
			comprobar = i & 1;
			 if (comprobar == 1) {
				System.out.println("El número " + i + " es impar");
				multiplicarImpares *= i;
				contImpares++;
			 }
		}

		System.out.println("La multiplicación de los números impares es: " + multiplicarImpares);

	}
}