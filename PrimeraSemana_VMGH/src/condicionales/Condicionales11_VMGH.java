package condicionales;

import java.util.Scanner;

public class Condicionales11_VMGH {

	public static void main(String[] args) {
//		// 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
//		Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
//		ZONA UBICACIÓN COSTO/KILOGRAMO
//		1 América del Norte 24,00 euros
//		2 América Central 20, 00 euros
//		3 América del Sur 21,00 euros
//		4 Europa 10,00 euros
//		5 Asia 18,00 euros
//		Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
//		cuestiones de logística y seguridad.
//		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
//		de la entrega.
		
		float kilos;
		byte lugar;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de indicar a que parte se va a envíar si 1, 2, 3, 4 o 5: ");
		lugar = entrada.nextByte();
		System.out.println("Favor de decir cuantos kilos pesa su paquete a transportar: ");
		kilos = entrada.nextFloat();
		
		if (kilos <= 5) {
			
			switch (lugar) {
			case 1:
				float total1 = kilos * 24;
				System.out.println("El paquete que se envíara a America del Norte con un peso de " + kilos + " kilos, tendrá un costo de: " + total1 + " euros.");
				break;
			case 2:
				float total2 = kilos * 20;
				System.out.println("El paquete que se envíara a America Central con un peso de " + kilos + " kilos, tendrá un costo de: " + total2 + " euros.");
				break;
			case 3:
				float total3 = kilos * 21;
				System.out.println("El paquete que se envíara a America del Sur con un peso de " + kilos + " kilos, tendrá un costo de: " + total3 + " euros.");
				break;
			case 4:
				float total4 = kilos * 10;
				System.out.println("El paquete que se envíara a Europa con un peso de " + kilos + " kilos, tendrá un costo de: " + total4 + " euros.");
				break;
			case 5:
				float total5 = kilos * 18;
				System.out.println("El paquete que se envíara a Asia con un peso de " + kilos + " kilos, tendrá un costo de: " + total5 + " euros.");
				break;
			default:
				System.out.println("Favor de anotar un lugar válido");
				break;
		    }

		}else {
			System.out.println("Favor de envíar un paquete menor a 5 kg");
			
		}
		
		entrada.close();
		
	}
	
}