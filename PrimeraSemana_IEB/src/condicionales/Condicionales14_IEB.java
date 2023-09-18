package condicionales;

import java.util.Scanner;

public class Condicionales14_IEB {
	public static void main(String[] args) {
		/*
		14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
		primeras 40 horas y $20 por cada hora extra.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        double salarioSemanal = 0;

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 16.0;
        } else {
            salarioSemanal = 40 * 16.0 + (horasTrabajadas - 40) * 20.0;
        }

        System.out.println("El salario semanal del obrero es: $" + salarioSemanal);

        scanner.close();
	}
}
