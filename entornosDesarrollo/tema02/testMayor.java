package tema02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testMayor {

	@Test
	void mayorPrimer() {
		int mayor = EjercicioPruebaJUnit.mayorDeDos(3, 6);
		int esperado = 6;
		assertEquals(mayor, esperado);
	}
	@Test
	void mayorSegundo() {
		int mayor = EjercicioPruebaJUnit.mayorDeDos(4, 2);
		int esperado = 4;
		assertEquals(mayor, esperado);
	}

}