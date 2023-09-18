package Ciclos;

public class ciclos7_gamg {

	public static void main(String[] args) {
		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual
		// ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero? 
		
		double inversion=700;
		int mes=1;
				
		do {
			inversion = inversion+(inversion*0.02);
			mes++;
			//System.out.println("El saldo es: " +inversion);
		} while (inversion<=1500);
		
		System.out.println("En " +(mes-1)+ " meses tendrá mas de $1500");
 			
		}
				
	}

		
