package arrays;

public class Arrays2_VMGH {

	public static void main(String[] args) {
//		2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//		1 al 100. Obt�n la suma de todos ellos y la media.
		
		int [] num = new int [100];
		int suma = 0;
		
		for (int i = 0; i < 100; i++) {
			num [i] = i + 1;
			System.out.println(num [i]);
			suma += num [i];
		}
		System.out.println("La suma total fue de " + suma);

	}

}
