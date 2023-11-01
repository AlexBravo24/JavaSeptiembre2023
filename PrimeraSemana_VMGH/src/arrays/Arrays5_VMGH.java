package arrays;

import java.util.Scanner;

public class Arrays5_VMGH {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos 
//		precios. Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos
		
		String [] prod = {"jabon", "detergente", "cloro", "shampo", "limpiador"};
		float [] prec = new float [5];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducir los precios de los productos: ");
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println("Introduce el precio del producto " + (i + 1) + ": ");
			prec [i] = entrada.nextFloat();
		}
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("El precio del " + prod [i] + " es de " + prec [i] );
		}
		
		entrada.close();
	}
}
