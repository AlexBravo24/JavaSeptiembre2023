package condicionales;

import java.util.Scanner;

public class Condicionales13_VMGH {

	public static void main(String[] args) {
//		// 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			ni�os y el resto se invierte en la bolsa.
//			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		
		float donacion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de indicar el monto total de donaciones recibido: ");
		donacion = entrada.nextFloat();
		
		if (donacion >= 10000) {
			float salud = donacion * 0.3f;
			System.out.println("El monto destinado al centro de salud es de: " + salud + " euros.");
			float ninhos = donacion * 0.5f;
			System.out.println("El monto destinado al comedor de ni�os es de: " + ninhos + " euros.");
			float bolsa = donacion * 0.2f;
			System.out.println("El monto destinado para invertir en la bolsa es de: " + bolsa + " euros.");
			
		}else if (donacion < 10000) {
			float salud1 = donacion * 0.25f;
			System.out.println("El monto destinado al centro de salud es de: " + salud1 + " euros.");
			float ninhos1 = donacion * 0.6f;
			System.out.println("El monto destinado al comedor de ni�os es de: " + ninhos1 + " euros.");
			float bolsa1 = donacion * 0.15f;
			System.out.println("El monto destinado para invertir en la bolsa es de: " + bolsa1 + " euros.");
		}else {
			System.out.println("El monto de la donaci�n no es v�lido");
		}
		
		entrada.close();
	}

}
