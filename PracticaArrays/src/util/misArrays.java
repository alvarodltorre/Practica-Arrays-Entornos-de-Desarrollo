package util;

import java.util.Arrays;

public abstract class misArrays {
	/**
	 * Metodo mediaNotas, el cual, comprueba con una excepcion
	 * IllegalArgumentException si los numeros guardados en el array estan entre 1 y
	 * 10. Si es así, guarda en sumaNotas la suma de todas los numeros que existen
	 * dentro del array y realiza un return de la media de sumaNotas.
	 * 
	 * @param Array de las notas.
	 * 
	 * @return Devuelve la media de los numeros del array pasada por parametro.
	 *
	 * @throws IllegalArgumentException
	 */
	public static float mediaNotas(int[] arrayNotas) {

		int sumaNotas = 0;
		float resultado;

		for (int i = 0; i < arrayNotas.length; i++) {
			if (arrayNotas[i] < 0 || arrayNotas[i] > 10) {
				throw new IllegalArgumentException("Uno de los numeros no esta entre 0 y 10.");
			}
			sumaNotas += arrayNotas[i];
		}
		resultado = sumaNotas / arrayNotas.length;
		return resultado;
	}

	/**
	 * Metodo medianaNotas, el cual, comprueba con una excepcion
	 * IllegalArgumentException si los numeros guardados en el array estan entre 1 y
	 * 10. Si es así, realiza la mediana del array pasado por parametro.
	 * 
	 * @param Array de las notas.
	 * 
	 * @return Devuelve la mediana de los numeros del array pasada por parametro.
	 *
	 * @throws IllegalArgumentException
	 */
	public static float medianaNotas(int[] arrayNotas) {

		Arrays.sort(arrayNotas);

		for (int i = 0; i < arrayNotas.length; i++) {
			if (arrayNotas[i] < 0 || arrayNotas[i] > 10) {
				throw new IllegalArgumentException("Uno de los numeros no esta entre 0 y 10.");
			}
		}

		int mediana = arrayNotas.length;

		if (mediana % 2 == 0) {

			int mediana1 = mediana / 2 - 1;

			int mediana2 = mediana / 2;

			return (arrayNotas[mediana1] + arrayNotas[mediana2]) / 2.0f;

		} else {

			return arrayNotas[mediana / 2];

		}
	}
	
	
	/**
	 * Metodo maximaNota, el cual, comprueba con una excepcion
	 * IllegalArgumentException si los numeros guardados en el array estan entre 1 y
	 * 10. Si es así, comprueba cual es el numero más grande entre todos los numeros del array pasada por parametro.
	 * 
	 * @param Array de las notas.
	 * 
	 * @return Devuelve el valor maximo de los numeros del array pasada por parametro.
	 *
	 * @throws IllegalArgumentException
	 */
	public static int maximaNota(int[] arrayNotas) {

		Arrays.sort(arrayNotas);

		for (int i = 0; i < arrayNotas.length; i++) {
			if (arrayNotas[i] < 0 || arrayNotas[i] > 10) {
				throw new IllegalArgumentException("Uno de los numeros no esta entre 0 y 10.");
			}
		}

		int valorMaximo = arrayNotas[0];

		for (int i = 0; i < arrayNotas.length; i++) {
			if (arrayNotas[i] > valorMaximo) {
				valorMaximo = arrayNotas[i];
			}
		}
		
		return valorMaximo;
	}
	
	
	/**
	 * Metodo minimaNota, el cual, comprueba con una excepcion
	 * IllegalArgumentException si los numeros guardados en el array estan entre 1 y
	 * 10. Si es así, comprueba cual es el numero más pequeño entre todos los numeros del array pasada por parametro.
	 * 
	 * @param Array de las notas.
	 * 
	 * @return Devuelve el valor mas pequeño de los numeros del array pasada por parametro.
	 *
	 * @throws IllegalArgumentException
	 */
	public static int minimaNota(int[] arrayNotas) {

		Arrays.sort(arrayNotas);

		for (int i = 0; i < arrayNotas.length; i++) {
			if (arrayNotas[i] < 0 || arrayNotas[i] > 10) {
				throw new IllegalArgumentException("Uno de los numeros no esta entre 0 y 10.");
			}
		}

		int valorMinimo = arrayNotas[0];

		for (int i = 0; i < arrayNotas.length; i++) {
			if (arrayNotas[i] < valorMinimo) {
				valorMinimo = arrayNotas[i];
			}
		}
		
		return valorMinimo;
	}

}
