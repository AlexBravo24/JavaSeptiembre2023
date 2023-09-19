package condicionales;

import java.util.Scanner;

public class Condicionales6_EHG {

	public static void main(String[] args) {
		/*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		   es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		   entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		   es de tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		   tamaño 2.
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
		System.out.print("Tipos de uva \"1\" ó \"2\": ");
		tamanos = entrada.nextInt();
		entrada.close();
		
		//SE REALIZA EL CALCULO
		if (!((tipos.toUpperCase().equals("A") || tipos.toUpperCase().equals("B")) &&
		        (tamanos == 1 || tamanos == 2))) {
		      System.out.println("Tipos o tamaño incorrecto, vuelva a introducir los valores.");
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
