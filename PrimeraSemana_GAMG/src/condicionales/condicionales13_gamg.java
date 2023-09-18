package condicionales;

import java.util.Scanner;

public class condicionales13_gamg {

	public static void main(String[] args) {
		// Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
		// centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		// Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor
		// de ni�os y el resto se invierte en la bolsa.
		// Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		// ni�os y el resto se invierte en la bolsa.
		// La instituci�n desea saber cu�nto dinero destinar� a cada rubro anualmente.
		
		
		double donacion,centro = 0, comedor = 0, bolsa = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique el monto del donativo: ");
		donacion = entrada.nextDouble();
		
		if (donacion>0 && donacion<10000) {
			centro = donacion *0.25;
			comedor = donacion *0.60;
			bolsa = donacion-centro-comedor;
		}else if(donacion>=10000) {
			centro = donacion *0.30;
			comedor = donacion *0.50;
			bolsa = donacion-centro-comedor;
		}
		
		System.out.println("Se donar� al centro de salud: " +centro);
		System.out.println("Se donar� al comedor de ni�os: " +comedor);
		System.out.println("Se invertir� en la bolsa: " +bolsa);
		
	

	}

}
