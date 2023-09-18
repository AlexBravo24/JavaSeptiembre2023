package condicionales;

import java.util.Scanner;

public class Condicionales13_OBRO {

	public static void main(String[] args) {
		/* Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		y el resto se invierte en la bolsa.
		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		niños y el resto se invierte en la bolsa.
		La institución desea saber cuánto de dinero destinará a cada rubro anualmente
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
