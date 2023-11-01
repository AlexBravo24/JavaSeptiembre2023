package condicionales;

import java.util.Scanner;

public class condicionales11_gamg {

	public static void main(String[] args) {
		// Una compañia de transporte internacional tiene servicio en algunos países de América del Norte, 
		// América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en
		// en peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla: 
		// Zona                    Costo/kilogramo
		// 1 America del norte     24,00 euros
		// 2 America central       20,00 euros
		// 3 America del sur       21,00 euros
		// 4 Europa                10,00 euros
		// 5 Asia                  18,00 euros
		// Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados,
		// por cuestiones de logística y seguridad. Realiza un algoritmo para determinar el cobro por la 
		// entrega de un paquete o, en su caso, el rechazo de la entrega.
		
        int zona;
		double Costo, Peso; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el peso del paquete: ");
		Peso = entrada.nextDouble();
		
		
		if(Peso>5) {
			System.out.println("Paquete rechazado");
		}
		else {
			System.out.println("Ingrese el número de la zona de entrega");
			zona = entrada.nextInt();
		switch(zona) {
		case 1:  Costo = Peso*24;
					System.out.println("El costo es: " +Costo );
					break; 
		case 2: Costo = Peso * 20;
		            System.out.println("El costo es: " +Costo );
			        break;
		case 3: Costo = Peso*21;
					System.out.println("El costo es: " +Costo );
					break;
		case 4: Costo = Peso*10;
					System.out.println("El costo es: " +Costo );
					break;
		case 5: Costo = Peso*18;
					System.out.println("El costo es: " +Costo );
					break;
		default: System.out.println("La zona no existe");
		}

	}
	}
}
