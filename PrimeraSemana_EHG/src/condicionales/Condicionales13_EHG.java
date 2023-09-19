package condicionales;

import java.util.Scanner;

public class Condicionales13_EHG {

	public static void main(String[] args) {
		/*Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
          centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
          Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
          y el resto se invierte en la bolsa.
          Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
          niños y el resto se invierte en la bolsa.
          La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		 */
		 //DECLARACION DE VARIABLES
		double donacion, centroSalud, comedorNiños, bolsa;
		
		Scanner entrada = new Scanner (System.in);
		donacion = entrada.nextDouble();
		entrada.close();
		
		
		if  (donacion >= 10000) {
			
		    centroSalud = 0.30 * donacion;
		    comedorNiños = 0.50 * donacion;
		    bolsa = 0.20 * donacion;
		    System.out.println(comedorNiños + centroSalud + bolsa);
			
		}else {
			 centroSalud = 0.25 * donacion;
			    comedorNiños = 0.60 * donacion;
			    bolsa = 0.15 * donacion;
		}
		

	}

}
