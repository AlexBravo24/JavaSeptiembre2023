package condicionales;

import java.util.Scanner;

public class Condicionales6_OIDA {

	public static void main(String[] args) {
		/* Ejercicio 6 La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		 	* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		es de tamaño 2.
		 	* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
		tamaño 2.
		Precio inicial se recibe desde teclado
		 	*/
		char tipo;
		int tamaño;
		double Precio;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio inicial");
		Precio = entrada.nextDouble();
		System.out.println("Introduce el tipo: A ó B");
		tipo = entrada.next().charAt(0);
		if (tipo == 'A') {
			System.out.println("Introduce el tamaño: 1 ó 2");
			tamaño = entrada.nextInt();
			if(tamaño == 1) {
				System.out.println(Precio + .20);
			}else if (tamaño == 2) {
				System.out.println(tamaño + .30);
			}
		}else if (tipo == 'B') {
			System.out.println("Introduce el tamaño: 1 ó 2");
			tamaño = entrada.nextInt();
			if(tamaño == 1) {
				System.out.println(Precio + .30);
			}else if (tamaño == 2) {
				System.out.println(tamaño + .50);
			}
		}
		entrada.close();
		
		
	}

}
