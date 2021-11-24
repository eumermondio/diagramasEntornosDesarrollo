import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculadora {

	@Test
	void testSuma() {
		int esperado, resultado;
		esperado = 5;
		resultado = Calculadora.suma(1, 4);
		assertEquals(esperado, resultado);
	}

	@Test
	void testResta() {
		int esperado, resultado;
		esperado = 5;
		resultado = Calculadora.resta(10, 5);
		assertEquals(esperado, resultado);
	}

	@Test
	void testMult() {
		int esperado, resultado;
		esperado = 20;
		resultado = Calculadora.multiplicar(4, 5);
		assertEquals(esperado, resultado);
	}

	@Test
	void testDivMasCero() {
		int esperado;
		float resultado;
		esperado = 6;
		resultado = Calculadora.dividir(12, 2);
		assertEquals(esperado, resultado);
	}

	@Test
	void testDivCero() {
		int esperado;
		float resultado;
		esperado = -1;
		resultado = Calculadora.dividir(34, 0);
		assertEquals(esperado, resultado);
	}

	@Test
	void testMitad() {
		int esperado, resultado;
		esperado = 20;
		resultado = (int) Calculadora.mitad(40f);
		assertEquals(esperado, resultado);
	}

	@Test
	void testPar() {
		boolean esperado, resultado;
		esperado = true;
		resultado = Calculadora.esPar(40);
		assertEquals(esperado, resultado);
	}

	@Test
	void testImpar() {
		boolean esperado, resultado;
		esperado = false;
		resultado = Calculadora.esPar(41);
		assertEquals(esperado, resultado);
	}

	@Test
	void testMitadSiPar() {
		int esperado;
		float resultado;
		esperado = 20;
		resultado = Calculadora.mitadSiPar(40);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMitadSiImpar() {
		int esperado;
		float resultado;
		esperado = 0;
		resultado = Calculadora.mitadSiPar(41);
		assertEquals(esperado, resultado);
	}

}
