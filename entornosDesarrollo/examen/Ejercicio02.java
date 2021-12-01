package examen;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cad;
		System.out.println("Dame cadena");
		cad = sc.next();
		System.out.println(cambio(cad, 'a'));
	}

	public static String cambio(String cad, char letra) {
		String newCad = "";
		int lon = cad.length();
		int i = 0;
		if (lon > 0) {
			do {
				if (cad.charAt(i) == letra) {
					newCad += 'e';
				} else {
					newCad += cad.charAt(i);
				}
				i++;
				lon--;
			} while (lon > 0);

		}
		return newCad;

	}
}
