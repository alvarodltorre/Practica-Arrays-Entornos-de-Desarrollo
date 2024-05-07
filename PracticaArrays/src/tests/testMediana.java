package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.misArrays;

class testMediana {
	private static int[] arrayNotas1;
	private static int[] arrayNotas2;
	private static int[] arrayNotas3;

	@BeforeAll
	static void setup() {
		arrayNotas1 = new int[] { 1, 2, 3, 4, 5 };
		arrayNotas2 = new int[] { 1, 2, 3, 4, 5, 6 };
		arrayNotas3 = new int[] { -4, 6, 1, 2, 9 };
	}

	@Test
	void testMedia1() {

		double obtenido = misArrays.medianaNotas(arrayNotas1);
		double esperado = 3;

		assertEquals(esperado, obtenido);
	}

	@Test
	void testMedia2() {

		double obtenido = misArrays.medianaNotas(arrayNotas2);
		double esperado = 3.5;

		assertEquals(esperado, obtenido);
	}

	@Test
	void testMedia3() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> misArrays.medianaNotas(arrayNotas3));

		String esperado = "Uno de los numeros no esta entre 0 y 10.";
		String obtenido = e.getMessage();
		assertEquals(esperado, obtenido);
	}

}
