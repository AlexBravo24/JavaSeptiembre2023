package condicionales;

import java.util.Scanner;

public class Condicional10_OIDA {

	public static void main(String[] args) {
		// Ejercicio 10 Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
		//mes correspondiente.
		int mes;
		Scanner entrada= new Scanner(System.in);
		System.out.println("introduce el numero del mes, entre 1 y 12");
		mes= entrada.nextInt();
			if (mes == 1) {
				System.out.println("Mes Enero");
			}else if(mes == 2) {
				System.out.println("Mes Febrero");
			}else if (mes == 3) {
				System.out.println("Mes Marzo");
			}else if(mes == 4) {
				System.out.println("Mes Abril");
			}else if(mes == 5) {
				System.out.println("Mes Mayo");
			}else if(mes == 6) {
				System.out.println("Mes Junio");
			}else if (mes == 7) {
				System.out.println("Mes Julio");
			}else if (mes == 8) {
				System.out.println("Mes Agosto");
			}else if (mes == 9) {
				System.out.println("Mes Septiembre");
			}else if (mes == 10) {
				System.out.println("Mes Octubre");
			}else if (mes == 11) {
				System.out.println("Mes Noviembre");
			}else if (mes == 12) {
				System.out.println("Mes Diciembre");
			}
		
	}

}
