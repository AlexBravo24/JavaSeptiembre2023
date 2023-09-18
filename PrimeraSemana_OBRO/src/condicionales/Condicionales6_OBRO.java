package condicionales;

import java.util.Scanner;

public class Condicionales6_OBRO {

	public static void main(String[] args) {
		/*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
			es de tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
			tamaño 2.
			Precio inicial se recibe desde teclado
		*/
	Scanner scanner = new Scanner(System.in);
		int kilos, tamaño;
		double precioI;
		String tipo;
		
		System.out.print("Introduce los Kilogramos de uva: ");
	    kilos= scanner.nextInt();
	    
	    System.out.print("Precio por Kilogramo inicial: ");
	    precioI = scanner.nextDouble();
	    
	    System.out.print("Uva de valor \"A\" o \"B\": ");
	    tipo=scanner.next(); scanner.nextLine();
	    
	    System.out.print("Tipo de uva \"1\" ó \"2\": ");
	    tamaño=scanner.nextInt();
	    
	    if(!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && (tamaño == 1 || tamaño ==2))) {
	    	System.out.println("Tipo o tamaño incorrecto");
	    	
	    }else {
	    	if(tipo.toUpperCase().equals("A") && tamaño==1) {
	    		System.out.println("La ganancia fianl es de: " + ((kilos*precioI) + (kilos*0.20)));
	    		
	    	}else if(tipo.toUpperCase().equals("A") && tamaño==2) {
	    		System.out.println("La ganancua final es de: " + ((kilos*precioI) + (kilos*0.30)));
	    	
	    	}else if(tipo.toUpperCase().equals("B") && tamaño==1) {
	    		System.out.println("La ganancia final es de: " + ((kilos*precioI) + (kilos*0.30)));
	    		
	    	}else if(tipo.toUpperCase().equals("B") && tamaño==2) {
	    		System.out.println("La ganancia final es de: " + ((kilos*precioI) + (kilos*0.50)));
	    	}
	    
	    }
		
		
		
		
		
		
		
		
		
		

	}

}

