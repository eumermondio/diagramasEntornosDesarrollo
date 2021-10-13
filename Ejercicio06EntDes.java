package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio04EntDes {

	public static void main(String[] args) {

		int cont = 1, suspenso = 0, aprobado = 0, excelente = 0;
		float nota;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\tNotas de alumnos\n");

		for (int i = 0; i < 6; i++) {

			System.out.println("Introduzca la nota " + cont++);
			nota = sc.nextFloat();
			if (nota > 10 || nota < 0) {
				System.out.println("Nota incorrecta");
				break;
			}
			if (nota < 5) {
				suspenso++;
			} else {
				if (nota < 9) {
					aprobado++;
				} else {
					excelente++;
				}
			}

		}
		System.out.println("El número de suspensos es: " + suspenso + "\nEl número de aprobados es: " + aprobado + "\nEl número de excelente es: " + excelente);
		sc.close();
	}
}