package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ActSubirNotaTest {

	@Test
	void test1() {
		int esperado, resultado;
		resultado = ActSubirNota.Intervalo(-1, 0, 4);
		esperado = -1;
		assertEquals(resultado, esperado);
	}

	@Test
	void test2() {
		int esperado, resultado;
		resultado = ActSubirNota.Intervalo(1, 5, 4);
		esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	void test3() {
		int esperado, resultado;
		resultado = ActSubirNota.Intervalo(4, 5, 1);
		esperado = -1;
		assertEquals(resultado, esperado);
	}

	@Test
	void test4() {
		int esperado, resultado;
		resultado = ActSubirNota.Intervalo(4, -5, 1);
		esperado = -1;
		assertEquals(resultado, esperado);
	}

	@Test
	void test5() {
		int esperado, resultado;
		resultado = ActSubirNota.Intervalo(4, 3, 5);
		esperado = -1;
		assertEquals(resultado, esperado);
	}

}
