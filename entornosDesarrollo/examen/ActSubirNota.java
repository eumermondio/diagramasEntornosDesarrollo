package examen;

public class ActSubirNota {
	public static void main(String[] args) {

		System.out.println(Intervalo(4, 3, 5));
	}

	public static int Intervalo(int x, int y, int num) {
		int c = 0;
		if (x > 0 && y > 0) {
			// Comprueba que x e y sean positivos
			if (num >= x && num <= y) {
				c = 1;
			} else {
				c = -1;
			}
		} else {
			c = -1;
		}
		return c;

	}
}