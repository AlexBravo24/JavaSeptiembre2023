package condicionales;

import java.util.Scanner;

public class Condicionales13_EHG {

	public static void main(String[] args) {
		/*Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
          centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
          Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
          y el resto se invierte en la bolsa.
          Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
          ni�os y el resto se invierte en la bolsa.
          La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		 */
		 //DECLARACION DE VARIABLES
		double donacion, centroSalud, comedorNi�os, bolsa;
		
		Scanner entrada = new Scanner (System.in);
		donacion = entrada.nextDouble();
		entrada.close();
		
		
		if  (donacion >= 10000) {
			
		    centroSalud = 0.30 * donacion;
		    comedorNi�os = 0.50 * donacion;
		    bolsa = 0.20 * donacion;
		    System.out.println(comedorNi�os + centroSalud + bolsa);
			
		}else {
			 centroSalud = 0.25 * donacion;
			    comedorNi�os = 0.60 * donacion;
			    bolsa = 0.15 * donacion;
		}
		

	}

}
