package condicionales;

import java.util.Scanner;

public class Condicionales14_VMGH {

	public static void main(String[] args) {
//		// 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra.
		
		byte horas;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de indicar cuantas horas laboradas tiene a la semana: ");
		horas = entrada.nextByte();
		
		if (horas >= 40) {
			int extra = horas - 40;
			int pago = (horas * 16) + (extra * 20);
			System.out.println("El trabajador recibirá un pago de: " + pago + " semanalmente.");
	
		}else if (horas < 40) {
			int pago1 = horas * 16;
			System.out.println("El trabajador recibirá un pago de: " + pago1 + " semanalmente");
			
		}else {
			System.out.println("Ingresar horas semanales válidas");
		}
		
		entrada.close();

	}

}
