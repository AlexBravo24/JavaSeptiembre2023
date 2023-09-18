package arrays;

import java.util.Scanner;

public class Arrays5_OBRO {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		
		
		
		String [] nombres = {"Huevo", "Leche", "Carne", "Tomate", "Cereal"};
		int [] precios = {60, 15, 100, 30, 45};
		
		System.out.println("Prodcutos: " + "       Precio$");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + "              $"+ precios[i]);
			
		}
		
		
		
		
		
		
		
		
	}
}
		