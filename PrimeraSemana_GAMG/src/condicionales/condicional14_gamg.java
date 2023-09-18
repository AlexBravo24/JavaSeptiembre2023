package condicionales;

import java.util.Scanner;

public class condicional14_gamg {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		// Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja mas de 40 horas se le paga
		// $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		
		int horastrab;
		double Salariototal=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique numero de horas trabajadas: ");
		horastrab=entrada.nextInt();
		
		if (horastrab<=40) {
			Salariototal = horastrab*16; 
		} else {
			Salariototal = 40*16 + (horastrab-40)*20; 
		}
		System.out.println("El salario total a pagar es: " +Salariototal);

	}

}
