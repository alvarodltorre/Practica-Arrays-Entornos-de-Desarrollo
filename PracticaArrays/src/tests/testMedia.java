package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.misArrays;
	class testMedia {
		private static int[] notas1;
		private static int[] notas2;
		private static int[] notas3;

		@BeforeAll
		static void setup() {
			notas1 = new int[]{1, 2, 3, 4, 5};
			notas2 = new int[]{5, 5, 5, 5, 5};
			notas3 = new int[]{-4, 6, 1, 2, 9};
		}
		
		@Test
		void testMedia1() {
		 
			double obtenido=misArrays.mediaNotas(notas1);
			double esperado=3;
			
			assertEquals(esperado, obtenido);
		}
		@Test
		void testMedia2() {
		 
			double obtenido=misArrays.mediaNotas(notas2);
			double esperado=5;
			
			assertEquals(esperado, obtenido);
		}
		
		@Test
		void testMedia3() {
			Exception e = assertThrows(IllegalArgumentException.class,
					() -> misArrays.mediaNotas(notas3));
			
			String esperado = "Uno de los numeros no esta entre 0 y 10.";
			String obtenido = e.getMessage();
			assertEquals(esperado, obtenido);
		}

	}
