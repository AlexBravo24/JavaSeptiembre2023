package arrays;

import java.util.Scanner;

public class Arrays5_OIDA {

	public static void main(String[] args) {
		// Ejercicio 5 Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//		respectivos precios. Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.
		int cantidad;
		System.out.println("¿Cuantos productos quieres ingresar?");
		Scanner entrada = new Scanner(System.in);
		cantidad = entrada.nextInt();
	    int [] precios = new int [cantidad];
	    String[] Productos = new String[cantidad];
	    for (int i = 0; i<cantidad; i++) { //aqui asignamos los nombres de los productos y sus precios
			System.out.println("Ingresa el producto");
			Productos [i]= entrada.nextLine(); //la diferencia de usar next y nextLine hace que nuestro programa funcione diferente 
			System.out.println("Ingresa el precio");
			precios [i] = entrada.nextInt();	}
//	    for (int i = 0; i<cantidad; i++) {
//	    	System.out.println("Ingresa el precio");
//			precios [i] = entrada.nextInt();
//	    }
	    for (int i = 0; i < cantidad; i++) {
            System.out.println(" Productos " + Productos[i] + " con precio " + precios[i]);
        }
	    entrada.close();
	}
}
