package arrays;

public class Arrays2_IEB {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de números de 100 posiciones, que contendrá los números del
		 * 1 al 100. Obtén la suma de todos ellos y la media.
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

		System.out.println("Suma de los números: " + suma);
		System.out.println("Media de los números: " + media);

	}

}
