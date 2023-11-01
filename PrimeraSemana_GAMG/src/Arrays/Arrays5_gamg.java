package Arrays;

import java.util.Scanner;

public class Arrays5_gamg {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
		// Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.

		//Declaro arreglos
		String[] producto = {"lapiz","borrador","lapicero", "calculadora", "libreta"};  
	
		double[] Precios = new double [5];
		
		Precios[0]= 6.2;
		Precios[1]= 12.5;
		Precios[2]= 20.35; 
		Precios[3]= 319.20;
		Precios[4]= 30.00;
			
		for (int i=0;i<producto.length;i++) {
			System.out.println("Producto: " +producto[i]+ ".  $" +Precios[i]);
			
		}
	}

}
// 		Si lo quiero ingresando datos por teclado:
//      int numero;
//      String[] producto; 
//		double[] Precios; 
//		Scanner entrada = new Scanner(System.in);
//
//		do {
//		System.out.println("Indique cuantos productos quiere ingresar, minimo 5:");
//		numero=entrada.nextInt();
//		}while (numero<5);
//		
//      producto= new String[numero];
//		Precios = new double[numero];
//
//		for(int i=0;i<numero;i++) {
//		System.out.println("Ingrese producto");
//		producto[i]= entrada.next();
//		}
//		for(int i=0; i<numero;i++) {	
//		System.out.println("Ingrese precio del producto");
//		Precios[i]=entrada.nextFloat();
//		}
//		
//		for (int i=0;i<producto.length;i++) {
//		System.out.println("Producto: " +producto[i]+ ".  $" +Precios[i]);
