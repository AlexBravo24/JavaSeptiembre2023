package arrays;

public class Arrays2_MARB {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		// 1 al 100. Obt�n la suma de todos ellos y la media.
		
		int[] numeros = new int[100];
		
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
		}
		
		for (int i = 0; i <100; i++) {
			System.out.println(numeros[i] + " ");
			
		}
		System.out.println();
		
		int suma = 0; 
		for (int i = 0; i <100; i++) {
			suma += numeros[i];
		}

		int media = suma/100;
		
		System.out.println("La suma de los numeros "+ suma);
		System.out.println("Media de los numeros " + media);
		
	}

}
