package condicionales;

import java.util.Scanner;

public class Condicionales13_MARB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el monto de la donaci�n: ");
        double montoDonacion = scanner.nextDouble();
        
        double montoCentroSalud;
        double montoComedor;
        double montoInversion;
        
        if (montoDonacion >= 10000) {
            montoCentroSalud = montoDonacion * 0.3;
            montoComedor = montoDonacion * 0.5;
            montoInversion = montoDonacion - montoCentroSalud - montoComedor;
        } else {
            montoCentroSalud = montoDonacion * 0.25;
            montoComedor = montoDonacion * 0.6;
            montoInversion = montoDonacion - montoCentroSalud - montoComedor;
        }
        System.out.println("Distribuci�n de la donaci�n anual:");
        System.out.println("Centro de Salud: $" + montoCentroSalud);
        System.out.println("Comedor de Ni�os: $" + montoComedor);
        System.out.println("Inversi�n en la Bolsa: $" + montoInversion);
        

	}

}
