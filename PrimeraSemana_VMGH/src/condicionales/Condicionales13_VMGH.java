package condicionales;

import java.util.Scanner;

public class Condicionales13_VMGH {

	public static void main(String[] args) {
//		// 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			niños y el resto se invierte en la bolsa.
//			La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		
		float donacion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de indicar el monto total de donaciones recibido: ");
		donacion = entrada.nextFloat();
		
		if (donacion >= 10000) {
			float salud = donacion * 0.3f;
			System.out.println("El monto destinado al centro de salud es de: " + salud + " euros.");
			float ninhos = donacion * 0.5f;
			System.out.println("El monto destinado al comedor de niños es de: " + ninhos + " euros.");
			float bolsa = donacion * 0.2f;
			System.out.println("El monto destinado para invertir en la bolsa es de: " + bolsa + " euros.");
			
		}else if (donacion < 10000) {
			float salud1 = donacion * 0.25f;
			System.out.println("El monto destinado al centro de salud es de: " + salud1 + " euros.");
			float ninhos1 = donacion * 0.6f;
			System.out.println("El monto destinado al comedor de niños es de: " + ninhos1 + " euros.");
			float bolsa1 = donacion * 0.15f;
			System.out.println("El monto destinado para invertir en la bolsa es de: " + bolsa1 + " euros.");
		}else {
			System.out.println("El monto de la donación no es válido");
		}
		
		entrada.close();
	}

}
