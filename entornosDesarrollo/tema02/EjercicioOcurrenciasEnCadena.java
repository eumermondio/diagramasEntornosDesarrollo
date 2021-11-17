package tema02;

public class EjercicioOcurrenciasEnCadena {

	public static int letra(String cadena, char letra) {
		int contador = 0, n = 0, lon;
		lon = cadena.length();
		if (lon > 0) {
			do {
				if (cadena.charAt(contador) == letra) {
					n++;
				}
				contador++;
				lon--;
			} while (lon > 0);
		}
		return n;

	}

}
