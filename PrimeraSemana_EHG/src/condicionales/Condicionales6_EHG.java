package condicionales;

import java.util.Scanner;

public class Condicionales6_EHG {

	public static void main(String[] args) {
		/*La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
		   es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
		   entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
		   es de tama�o 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		   tama�o 2.
		   Precio inicial se recibe desde teclado
		 */
		
		
		double precioInicial;
		String tipos;
		int tamanos;
		int kilos;
		
		//SE PIDEN DATOS 
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introdusca los kilos de uva ");
		kilos = entrada.nextInt();
		System.out.println("Introdusca el precio por kilo ");
		precioInicial = entrada.nextDouble();
		System.out.println("Introdusca el valor de la uva \"A\" o \"B\":  ");
		tipos = entrada.next(); entrada.nextLine();
		System.out.print("Tipos de uva \"1\" � \"2\": ");
		tamanos = entrada.nextInt();
		entrada.close();
		
		//SE REALIZA EL CALCULO
		if (!((tipos.toUpperCase().equals("A") || tipos.toUpperCase().equals("B")) &&
		        (tamanos == 1 || tamanos == 2))) {
		      System.out.println("Tipos o tama�o incorrecto, vuelva a introducir los valores.");
		    } else {
		      if (tipos.toUpperCase().equals("A") && tamanos == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipos.toUpperCase().equals("A") && tamanos == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipos.toUpperCase().equals("B") && tamanos == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipos.toUpperCase().equals("B") && tamanos == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }

	}

}
