package ciclos;

import java.util.Scanner;

public class Ciclo11_VMGH {

	public static void main(String[] args) {
//		// .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
//		ancho y el alto. Ejemplo: 8 x 8.
		
		int lado1, lado2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digitar cuanto de alto medira tu cuadrado: ");
		lado1 = entrada.nextInt();
		System.out.println("Digitar cuanto de ancho medira tu cuadrado: ");
		lado2 = entrada.nextInt();
		
		for (int i = 1; i <= lado1; i++) {
			for (int j = 1; j <= lado2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		entrada.close();
		
	}

}
