package examen;

public class Ejercicio01 {

	public static void main(String[] args) {
		System.out.println(calculaPrecio(10, 1));
	}

	public static float calculaPrecio(int botones, int precioU) {
		float precioF;
		int precioN;
		if (botones >= 1000) {
			precioF = (botones * precioU) * 0.1f;
			precioN = botones * precioU;
			return precioN - precioF;
		} else {
			if (botones > 100 && botones < 1000) {
				precioF = (botones * precioU) * 0.05f;
				precioN = botones * precioU;
				return precioN - precioF;
			} else {
				precioF = botones * precioU;
				return precioF;
			}
		}

	}

}
