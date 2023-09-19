package condicionales;

import java.util.Scanner;

public class Condicionales14_EHG {

	public static void main(String[] args) {
		/*  Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
            horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
            primeras 40 horas y $20 por cada hora extra
		 */
		
		//DECLARACION DE VARIABLES
		int maxHoras = 40, pagoHora = 16;
		int pagoExtra = 20, hsTrabajadas = 0, sueldo = 0;
		
		
		
		System.out.println("INGRESA HORAS TRABAJADAS");
		Scanner entrada = new Scanner (System.in);
		hsTrabajadas = entrada.nextInt();
		
		if(hsTrabajadas <= 40) {
			sueldo = hsTrabajadas * pagoHora;
		}else {
			sueldo = (hsTrabajadas-maxHoras) * pagoExtra + maxHoras * pagoHora;
		}
		System.out.println("El salario total es $"+ sueldo);
		
		
		
		
		
		

	}

}
