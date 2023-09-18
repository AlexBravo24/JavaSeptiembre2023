package condicionales;

import java.util.Scanner;

public class Condicionales11_MARB {

	public static void main(String[] args) {
		// Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el peso del paquete en kilogramos: ");
		double pesoPaquete = scanner.nextDouble();
		
		System.out.println("Ingrese la zona de destino del paquete (1-5): ");
		int zonaDestino = scanner.nextInt();
		
		double costoTotal;
		
		if (pesoPaquete <= 5) {
            switch (zonaDestino) {
                case 1:
                    costoTotal = pesoPaquete * 24.00;
                    break;
                case 2:
                    costoTotal = pesoPaquete * 20.00;
                    break;
                case 3:
                    costoTotal = pesoPaquete * 21.00;
                    break;
                case 4:
                    costoTotal = pesoPaquete * 10.00;
                    break;
                case 5:
                    costoTotal = pesoPaquete * 18.00;
                    break;
                default:
                    costoTotal = 0.00; 
                    break;
            }

            
            if (costoTotal == 0.00) {
                System.out.println("ERROR: zona de destino incorrecta");
            } else {
                System.out.println("Cobro por la entrega del paquete: " + costoTotal + " euros");
            }
        } else {
            System.out.println("El paquete no puede ser transportado debido a su peso");
        }
		

	}

}
