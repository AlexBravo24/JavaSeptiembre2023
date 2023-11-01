package arrays;

public class Arrays2_VMGH {

	public static void main(String[] args) {
//		2. Crea un array de números de 100 posiciones, que contendrá los números del 
//		1 al 100. Obtén la suma de todos ellos y la media.
		
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
