package util;

public abstract class misArrays {
	/**
	 * Metodo mediaNotas, el cual, comprueba con una excepcion IllegalArgumentException si los numeros guardados en el array estan entre 1 y 10. Si es así, guarda en sumaNotas la suma de todas los numeros que existen dentro del array y realiza un return de la media de sumaNotas.
	 * 
	 * @param 	Array de las notas.
	 * 
	 * @return 	Devuelve la media de los numeros del array pasada por parametros.
	 *
	 * @throws 	IllegalArgumentException
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

}
