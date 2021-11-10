

import java.util.Scanner;

public class Ej02EntDes {

	public static void main(String[] args) {

		int num, suma = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dame un número");
			num = sc.nextInt();
			suma += num;
		}while (num != 0); 

		System.out.println("La suma es: " + suma);
		
		sc.close();
	}

}
