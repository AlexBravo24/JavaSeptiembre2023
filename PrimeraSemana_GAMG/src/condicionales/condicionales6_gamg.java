package condicionales;

import java.util.Scanner;

public class condicionales6_gamg {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como politica fijar un 
		// precio inicial al kilo de uva, la cual se clasifica en tipos (A y B),
		// y además en tamaños (1 y 2). Cuando se realiza la venta del producto, 
		// ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá
		// un productor por la uva que entrega en un embarque considerando lo siguiente:
		// Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1
		// y 30 céntimos si es de tamaño 2.
		// Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 
		// céntimos cuando es de tamaño 2. 
		// Precio inicial se recibe desde teclado. 
		
		double PrecInic, Precio; 
		char tipo; 
		int tamaño;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indicar precio inicial: ");
		PrecInic = entrada.nextDouble();
		
		
		System.out.println("Indicar tipo A o B: ");
		tipo = entrada.next().charAt(0);
		if (tipo == 'A') {
			System.out.println("Indicar tamaño 1 o 2");
			tamaño = entrada.nextInt();
			
			switch(tamaño) {
			case 1: Precio = PrecInic + 0.20 ;
			System.out.println("El precio es: " +Precio);
			break;
			case 2: Precio = PrecInic + 0.30 ;
			System.out.println("El precio es: " +Precio);
			break;
			default: 
				System.out.println("Datos no válidos");
			}
		
		} else if(tipo == 'B'){
			System.out.println("Indicar tamaño 1 o 2");
			tamaño = entrada.nextInt();
			switch (tamaño) {
			case 1: Precio = PrecInic - 0.30 ;
			System.out.println("El precio es: " +Precio);
			break;
			case 2: Precio = PrecInic - 0.50 ;
			System.out.println("El precio es: " +Precio);
			break;
			default: 
				System.out.println("Datos no válidos");
			}
		} else {
			System.out.println("Datos no válidos");
		}
					
	}

}
