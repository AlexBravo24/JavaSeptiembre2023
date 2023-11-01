package condicionales;

import java.util.Scanner;

public class Condicionales14_OIDA {

	public static void main(String[] args) {
		// Ejercicio 14Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
//		primeras 40 horas y $20 por cada hora extra.
		double horas;
		double horaspagadas;
		double horasextra;
		double pagaextra;
		double total;
		Scanner entrada= new Scanner(System.in);
		System.out.println("¿Cuantas horas trabajó en la semana?");
		horas = entrada.nextDouble();
		entrada.close();
		if (horas > 40) {
			horasextra= (horas-40);
			pagaextra= (horasextra*20);
			horaspagadas=640;
			total= (horaspagadas+pagaextra);
			System.out.println("Su salario es " + (total));
		}else{
			System.out.println("Su salario es " + (horas*16));
		}

}
