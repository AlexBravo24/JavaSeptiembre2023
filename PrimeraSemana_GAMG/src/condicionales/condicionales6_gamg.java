package condicionales;

import java.util.Scanner;

public class condicionales6_gamg {

	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como politica fijar un 
		// precio inicial al kilo de uva, la cual se clasifica en tipos (A y B),
		// y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, 
		// �sta es de un solo tipo y tama�o, se requiere determinar cu�nto recibir�
		// un productor por la uva que entrega en un embarque considerando lo siguiente:
		// Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1
		// y 30 c�ntimos si es de tama�o 2.
		// Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 
		// c�ntimos cuando es de tama�o 2. 
		// Precio inicial se recibe desde teclado. 
		
		double PrecInic, Precio; 
		char tipo; 
		int tama�o;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indicar precio inicial: ");
		PrecInic = entrada.nextDouble();
		
		
		System.out.println("Indicar tipo A o B: ");
		tipo = entrada.next().charAt(0);
		if (tipo == 'A') {
			System.out.println("Indicar tama�o 1 o 2");
			tama�o = entrada.nextInt();
			
			switch(tama�o) {
			case 1: Precio = PrecInic + 0.20 ;
			System.out.println("El precio es: " +Precio);
			break;
			case 2: Precio = PrecInic + 0.30 ;
			System.out.println("El precio es: " +Precio);
			break;
			default: 
				System.out.println("Datos no v�lidos");
			}
		
		} else if(tipo == 'B'){
			System.out.println("Indicar tama�o 1 o 2");
			tama�o = entrada.nextInt();
			switch (tama�o) {
			case 1: Precio = PrecInic - 0.30 ;
			System.out.println("El precio es: " +Precio);
			break;
			case 2: Precio = PrecInic - 0.50 ;
			System.out.println("El precio es: " +Precio);
			break;
			default: 
				System.out.println("Datos no v�lidos");
			}
		} else {
			System.out.println("Datos no v�lidos");
		}
					
	}

}
