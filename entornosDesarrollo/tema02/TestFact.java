package tema02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFact {

	@Test
	void test1() {
		int esperado = -1, resultado = 0;
		resultado = (int) Factorial.factorial(-1);
		assertEquals(esperado, resultado);
	}

	@Test
	void test2() {
		int esperado = 720, resultado = 0;
		resultado = (int) Factorial.factorial(6);
		assertEquals(esperado, resultado);
	}

}
