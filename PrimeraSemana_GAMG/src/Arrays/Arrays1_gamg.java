package Arrays;

import java.util.Scanner;

public class Arrays1_gamg {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado
       // Muestra por consola el �ndice y el valor que le corresponde.
		
		int [] numeros = new int [10];
		
		Scanner entrada = new Scanner(System.in);
				
//		System.out.println("Ingrese 10 n�meros");
//		numeros[0] = entrada.nextInt();
//		numeros[1] = entrada.nextInt();
//		numeros[2] = entrada.nextInt();
//		numeros[3] = entrada.nextInt();
//		numeros[4] = entrada.nextInt();
//		numeros[5] = entrada.nextInt();
//		numeros[6] = entrada.nextInt();
//		numeros[7] = entrada.nextInt();
//		numeros[8] = entrada.nextInt();
//		numeros[9] = entrada.nextInt();
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Ingrese un n�mero");
			numeros[i] = entrada.nextInt();
		}
		for(int i=0; i<numeros.length; i++) {
		System.out.println("indice "+i+ ": " + numeros[i]);
		}
		entrada.close();
		
	}

}
