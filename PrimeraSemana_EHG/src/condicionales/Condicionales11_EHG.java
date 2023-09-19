package condicionales;

import java.util.Scanner;

public class Condicionales11_EHG {

	public static void main(String[] args) {
		//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		//PRIMER SE DECLARARIA LA VARIABLE
		int peso;
		int zona;
		Scanner entrada = new Scanner (System.in);
		//SE REALIZA TABLA PARA QUE EL USUARIO TENGA VISUALIZACION
		System.out.println("=====ZONAS DE ENVIO======");
		System.out.println("1.- America del Norte");
		System.out.println("2.- America  Central");
		System.out.println("3.- America del Sur");
		System.out.println("4.- Europa");
		System.out.println("5.- Asia");
		System.out.println("INTRODUCE NUMERO DE ZONA");
		zona = entrada.nextInt();
		//SE PEDIRA AL USUARIO QUE INGRESE PRIMERO EL PESO
		System.out.println("INTRODUCE PESO DEL PAQUETE");
		peso = entrada.nextInt();
		entrada.close();
		
		if (peso>5) {
			System.out.println("Su paquete no es admitido por cuestiones de seguridad");
		}else if(peso < 1) {
			System.out.println("El peso del paquete debe ser entero positivo");
			
		}else {
			switch (zona) {
			case 1:
				System.out.println("El paquete de " + peso +" kg es enviado a America del Norte el precio es " + (peso*24) + " euros. ");
				break;
			case 2:
				System.out.println("El paquete de " + peso +" kg es enviado a America del Norte el precio es " + (peso*20) + " euros. ");
				break;
			case 3:
				System.out.println("El paquete de " + peso +" kg es enviado a America del Norte el precio es " + (peso*21) + " euros. ");
				break;
			case 4:
				System.out.println("El paquete de " + peso +" kg es enviado a America del Norte el precio es " + (peso*10) + " euros. ");
				break;
			case 5:
				System.out.println("El paquete de " + peso +" kg es enviado a America del Norte el precio es " + (peso*18) + " euros. ");
				break;

			default:
				System.out.println("ERROR, NO EXISTE ESTA ZONA");
				break;
				
			}
		}
		
		
		
		

		
		


	}

}
