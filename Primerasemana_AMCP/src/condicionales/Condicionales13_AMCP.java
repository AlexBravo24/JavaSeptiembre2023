package condicionales;

import java.util.Scanner;

public class Condicionales13_AMCP {

	public static void main(String[] args) {
		
		
		//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 
		//50% al comedor de niños 
		//y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 
		//60% al comedor de niños y el resto se invierte en la bolsa.
		//institución desea saber cuánto de dinero destinará a cada rubro anualmente
		
		Scanner scanner = new Scanner (System.in);
		
		//Inicio del programa y declaración de variables
		int donación;
		int salud;
		int comedor;
		int bolsa;
		
		//Solicitud de datos al usuario
		System.out.println("Introduzca cantidad de donación");
		donación = scanner.nextInt();
		
		//Realizamos los calculos
		if (donación > = 10000) {
			salud = 0.30*donación
					comedor = 0.50*donación
					bolsa =0.20*donación
		}else {
			salud = 0.25*donación
					comedor = 0.60*donación
					bolsa = 0.15*donación
		}
		System.out.println();
		
		
		

	}

}
