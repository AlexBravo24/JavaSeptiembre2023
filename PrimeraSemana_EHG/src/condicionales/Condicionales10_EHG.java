package condicionales;

import java.util.Scanner;

public class Condicionales10_EHG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		// mes correspondiente.
		
		//SE DECLARA LA VARIABLE
		int mes;
		//SE PIDE DATOS
		System.out.println("INTRODUCE EL NUMERO DE MES");
		Scanner entrada = new Scanner (System.in);
		mes = entrada.nextInt();
		entrada.close();
		
		//PRIMERO REALIZAMOS CONTEO DE LOS MESES QUE TENGAN 31 DIAS
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes seleccionado tiene 31 dias");
		//FEBRERO SOLO TIENE 28 DIAS	
		}else if (mes == 2) {
			System.out.println("Mes Febrero tiene 28 dias");
		//REALIZAMOS CONTEO DE MESES QUE TIENE SOLO 30 DIAS	
		}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("El mes seleccioinado tiene 30 dias");
		}else {
			System.out.println("ERROR, Debes elegir el mes 1 - 12. ");
		}

	}

}
