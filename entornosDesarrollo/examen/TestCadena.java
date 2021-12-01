package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCadena {

	@Test
	void test1() {
		// En este test se prueba el caso de que la cadena sea vacia
		String esperado, resultado;
		esperado = "";
		resultado = Ejercicio02.cambio("", 'a');
		assertEquals(esperado, resultado);
	}

	@Test
	void test2() {
		// En este test se prueba el caso de que la cadena sea distinta de a
		String esperado, resultado;
		esperado = "m";
		resultado = Ejercicio02.cambio("m", 'a');
		assertEquals(esperado, resultado);
	}

	@Test
	void test3() {
		// En este test se prueba el caso de que la cadena sea igual de a
		String esperado, resultado;
		esperado = "e";
		resultado = Ejercicio02.cambio("a", 'a');
		assertEquals(esperado, resultado);
	}

}
