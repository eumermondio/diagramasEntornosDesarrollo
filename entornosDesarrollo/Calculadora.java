import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 1, num, num1 = 0, num2 = 0;
		do {
			System.out.println("Dime el número " + cont);
			num = sc.nextInt();
			if (cont == 1)
				num1 = num;
			cont++;
		} while (cont <= 2);
		System.out.println("Dame un tercer número: ");
		num2 = sc.nextInt();
		System.out.println("La suma es: " + suma(num1, num));
		System.out.println("La resta es: " + resta(num1, num));
		System.out.println("La multiplicación es: " + multiplicar(num1, num));
		System.out.println("La división es: " + dividir(num1, num));
		System.out.println("La mitad del tercer número es: " + mitadSiPar(num2));
		System.out.println("La mitad del tercer número es: " + esPar(num2));

	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static float dividir(float a, int b) {
		if (b == 0) {
			System.out.println("No se divide por 0");
			return -1;
		}
		return a / b;
	}

	public static float mitad(float a) {
		return a / 2;
	}

	public static float mitadSiPar(int a) {
		if (esPar(a) == true) {
			return a / 2;
		} else {
			System.out.println("No es par");
			return 0;
		}

	}

	public static boolean esPar(int a) {
		boolean esPar = false;
		if ((a & 1) == 0) {
			esPar = true;
			return esPar;
		} else {
			return esPar;
		}
	}
}
