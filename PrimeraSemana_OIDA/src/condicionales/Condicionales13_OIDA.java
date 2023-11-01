package condicionales;

import java.util.Scanner;

public class Condicionales13_OIDA {

	public static void main(String[] args) {
		// Ejercicio 13 Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
//			y el resto se invierte en la bolsa.
//			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
//			niños y el resto se invierte en la bolsa.
//			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
//
		double anualmente;
		double salud;
		double comedor;
		double bolsa;
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuanto se recibio anualmente?");
		anualmente= entrada.nextDouble();
		entrada.close();
		if (anualmente >= 10000) {
			salud= ((anualmente*30)/100);
			comedor= ((anualmente*50)/100);
			bolsa = ((anualmente*20)/100);
			System.out.println((salud) + " se destina al centro de salud, " + (comedor)+ " se detina al comedor de niños, y " + (bolsa) + " se invierte en bolsa");
		}else {
			salud= ((anualmente*25)/100);
			comedor= ((anualmente*60)/100);
			bolsa = ((anualmente*15)/100);
			System.out.println((salud) + " se destina al centro de salud, " + (comedor)+ " se detina al comedor de niños, y " + (bolsa) + " se invierte en bolsa");
			
		}
	}

}
