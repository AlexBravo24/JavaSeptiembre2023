package condicionales;

import java.util.Scanner;

public class Condicionales13_OBRO {

	public static void main(String[] args) {
		/* Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		y el resto se invierte en la bolsa.
		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		ni�os y el resto se invierte en la bolsa.
		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
*/
		
		double monto, salud, comedor, inversion;
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduca la cantidad de donacion: ");
		monto=entrada.nextInt();
		
		if (monto>=10000) {
			salud = 0.30*monto;
			comedor = 0.50*monto;
			inversion = 0.20*monto;
			
			System.out.println("El dinero se repartira asi: Salud $" + salud + " Comedor $" + comedor + " Inversion $" + inversion);
			
		}else {
			salud = 0.25*monto;
			comedor = 0.60*monto;
			inversion = 0.15*monto;
			
			System.out.println("El dinero se repartira asi: Salud $" + salud + " Comedor $" + comedor + " Inversion $" + inversion);

		}


		
		
		
		
		
		
		
	}

}
