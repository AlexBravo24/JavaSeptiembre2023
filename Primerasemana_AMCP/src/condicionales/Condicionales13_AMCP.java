package condicionales;

import java.util.Scanner;

public class Condicionales13_AMCP {

	public static void main(String[] args) {
		
		
		//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 
		//50% al comedor de ni�os 
		//y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 
		//60% al comedor de ni�os y el resto se invierte en la bolsa.
		//instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		
		Scanner scanner = new Scanner (System.in);
		
		//Inicio del programa y declaraci�n de variables
		int donaci�n;
		int salud;
		int comedor;
		int bolsa;
		
		//Solicitud de datos al usuario
		System.out.println("Introduzca cantidad de donaci�n");
		donaci�n = scanner.nextInt();
		
		//Realizamos los calculos
		if (donaci�n > = 10000) {
			salud = 0.30*donaci�n
					comedor = 0.50*donaci�n
					bolsa =0.20*donaci�n
		}else {
			salud = 0.25*donaci�n
					comedor = 0.60*donaci�n
					bolsa = 0.15*donaci�n
		}
		System.out.println();
		
		
		

	}

}
