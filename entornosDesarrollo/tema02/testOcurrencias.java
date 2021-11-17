package tema02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOcurrencias {

	@Test
	public void testUno() {
		int resultado = EjercicioOcurrenciasEnCadena.letra("a", 'a');
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	public void testDos() {
		int resultado = EjercicioOcurrenciasEnCadena.letra("b", 'a');
		int esperado = 0;
		assertEquals(resultado, esperado);
	}

	@Test
	public void testTres() {
		int resultado = EjercicioOcurrenciasEnCadena.letra("ab", 'a');
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	public void testCuatro() {
		int resultado = EjercicioOcurrenciasEnCadena.letra(" ", 'a');
		int esperado = 0;
		assertEquals(resultado, esperado);
	}

}
