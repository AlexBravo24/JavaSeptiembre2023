package condicionales;

import java.util.Scanner;

public class Condicionales11_IEB {
	public static void main(String[] args) {
		/*
		11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
		Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		ZONA UBICACIÓN COSTO/KILOGRAMO
		1 América del Norte 24,00 euros
		2 América Central 20, 00 euros
		3 América del Sur 21,00 euros
		4 Europa 10,00 euros
		5 Asia 18,00 euros
		Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
		cuestiones de logística y seguridad.
		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
		de la entrega.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la zona de destino (1-5): ");
        int zona = scanner.nextInt();

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        double peso = scanner.nextDouble();

        double costoPorKilogramo = 0;
        double costoTotal = 0;

        switch (zona) {
            case 1:
                costoPorKilogramo = 24.00;
                break;
            case 2:
                costoPorKilogramo = 20.00;
                break;
            case 3:
                costoPorKilogramo = 21.00;
                break;
            case 4:
                costoPorKilogramo = 10.00;
                break;
            case 5:
                costoPorKilogramo = 18.00;
                break;
            default:
                System.out.println("Zona no válida.");
                scanner.close();
                return;
        }

        if (peso <= 5) {
            costoTotal = peso * costoPorKilogramo;
            System.out.println("El costo de entrega es de " + costoTotal + " euros.");
        } else {
            System.out.println("El paquete no puede ser transportado debido a su peso superior a 5 kg.");
        }

        scanner.close();
	}
}
