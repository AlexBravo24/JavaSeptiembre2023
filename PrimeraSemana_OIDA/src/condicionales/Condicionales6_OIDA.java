package condicionales;

import java.util.Scanner;

public class Condicionales6_OIDA {

	public static void main(String[] args) {
		/* Ejercicio 6 La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		 	* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
		es de tama�o 2.
		 	* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
		tama�o 2.
		Precio inicial se recibe desde teclado
		 	*/
		char tipo;
		int tama�o;
		double Precio;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio inicial");
		Precio = entrada.nextDouble();
		System.out.println("Introduce el tipo: A � B");
		tipo = entrada.next().charAt(0);
		if (tipo == 'A') {
			System.out.println("Introduce el tama�o: 1 � 2");
			tama�o = entrada.nextInt();
			if(tama�o == 1) {
				System.out.println(Precio + .20);
			}else if (tama�o == 2) {
				System.out.println(tama�o + .30);
			}
		}else if (tipo == 'B') {
			System.out.println("Introduce el tama�o: 1 � 2");
			tama�o = entrada.nextInt();
			if(tama�o == 1) {
				System.out.println(Precio + .30);
			}else if (tama�o == 2) {
				System.out.println(tama�o + .50);
			}
		}
		entrada.close();
		
		
	}

}
