package arrays;

public class Arrays2_IEB {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		 * 1 al 100. Obt�n la suma de todos ellos y la media.
		 */

		int[] numeros = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		double media = (double) suma / numeros.length;

		System.out.println("Suma de los n�meros: " + suma);
		System.out.println("Media de los n�meros: " + media);

	}

}
