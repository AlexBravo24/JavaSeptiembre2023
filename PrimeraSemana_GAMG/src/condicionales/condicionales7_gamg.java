package condicionales;

import java.util.Scanner;

public class condicionales7_gamg {

	public static void main(String[] args) {
		//El director de una escuela est� organizando un viaje de estudios y
		//requiere determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar
		//a la compa�ia de viajes por el servicio. La forma de cobrar es la siguiente:
		// Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		// De 50 a 99 alumnos, el costo es de 70 euros.
		// De 30 a 49 alumnos, el costo es de 95 euros.
		// Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, 
		// sin imporar el n�mero de alumnos.
		// Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses
		// y lo que debe pagar cada alumno por el viaje. 
		
		int numAlum;
		double PagoAlum, CostoBus = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indique el n�mero de alumnos: ");
		numAlum = entrada.nextInt();
		
		
		if (numAlum==100) {
			CostoBus = numAlum * 65 ;
		} else if (numAlum<100 && numAlum>=50) {
			CostoBus = numAlum * 70 ;
	    	} else if (numAlum<50 && numAlum>=30) {
	    		CostoBus = numAlum * 95; 
	    	} else if(numAlum<30){
	    		CostoBus = 4000;
	    		} else {
	    			System.out.println("La cantidad de alumnos debe ser entre 0 y 100");
	    		}
	    PagoAlum = CostoBus/numAlum; 
		System.out.println("El costo del autob�s es: " +CostoBus);   	
		System.out.println("El costo por alumno es: " +PagoAlum);
		 
		
			}

}
