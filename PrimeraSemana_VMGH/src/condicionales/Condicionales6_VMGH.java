package condicionales;

import java.util.Scanner;

public class Condicionales6_VMGH {

	public static void main(String[] args) {
//		// 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2.
//		Precio inicial se recibe desde teclado
		
	    char tipo;
		byte tamahno;
		int kilo, precioKilo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Seleccionar el tipo de uva que quiere vender, si 'A' o 'B': ");
		tipo = entrada.next().charAt(0);
		System.out.println("Seleccionar el tamaño de la uva a vender si es '1' o '2': ");
		tamahno = entrada.nextByte();
		System.out.println("Digite el precio de la uva por kilo: ");
		precioKilo = entrada.nextInt();
		System.out.println("Digite cuantos kilos va a vender: ");
		kilo = entrada.nextInt();
		
		if (tipo == 'A' || tipo == 'a') {
			if (tamahno == 1) {
				double precio = (precioKilo + 0.2);
				double precioTotal = precio * kilo;
				System.out.println("El precio de esta venta será de: " + precioTotal + " pesos.");
			}else if (tamahno == 2) {
				double precio = (precioKilo + 0.3);
				double precioTotal = precio * kilo;
				System.out.println("El precio de esta venta será de: " + precioTotal + " pesos.");
			}
			
		}else if (tipo == 'B' || tipo == 'b') {
			if (tamahno == 1) {
				double precio = (precioKilo - 0.3);
				double precioTotal = precio * kilo;
				System.out.println("El precio de esta venta será de: " + precioTotal + " pesos.");
			}else if (tamahno == 2) {
				double precio = (precioKilo - 0.5);
				double precioTotal = precio * kilo;
				System.out.println("El precio de esta venta será de: " + precioTotal + " pesos.");
			}
		}else {
			System.out.println("Favor de digitar valores validos");
		}
		
		entrada.close();
	}

}
