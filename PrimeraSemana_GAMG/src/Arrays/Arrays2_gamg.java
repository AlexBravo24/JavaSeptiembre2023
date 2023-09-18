package Arrays;

public class Arrays2_gamg {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá 
		// los números del 1 al 100. Obtén la suma de todos ellos y la media.

		int numeros[] = new int [100];
		double media, suma=0, conteonum=0; 
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=i+1;
			System.out.println(numeros[i]);
			suma = suma+numeros[i];
			conteonum++;
		}
		media = suma/conteonum;
		
		System.out.println("La suma del 1 al 100 es: " + suma);
		System.out.println("La media es: " +media);
	}

}
