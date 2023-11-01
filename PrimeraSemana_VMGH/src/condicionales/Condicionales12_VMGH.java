package condicionales;

import java.util.Scanner;

public class Condicionales12_VMGH {

	public static void main(String[] args) {
//		// 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//		[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC
		
		float peso, altura;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de anotar tu altura en m2: ");
		altura = entrada.nextFloat();
		System.out.println("Favor de anotar tu peso en kg: ");
		peso = entrada.nextFloat();
		float imc = peso / (altura * altura);
		
		if (imc < 16) {
			System.out.println("Criterio de ingreso en el hospital por un imc de: " + imc);
		}else if (imc >= 16 && imc < 17) {
			System.out.println("Infrapeso que es de un imc de: " + imc);
		}else if (imc >= 17 && imc < 18) {
			System.out.println("Bajo peso con un imc de: " + imc);
		}else if (imc >= 18 && imc < 25) {
			System.out.println("Peso normal (saludable) con un imc de: " + imc);
		}else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso (obesidad grado I) con un imc de: " + imc);
		}else if (imc >= 30 && imc < 35) {
			System.out.println("Sobrepeso crónico (obesidad grado II) con un imc de: " + imc);
		}else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidad premórbida (obesidad de grado III) con un imc de: " + imc);
		}else if (imc >= 40) {
			System.out.println("Obesidad mórbida (obesidad de grado IV) con un imc de: " + imc);
		}else {
			System.out.println("Valor de imc incorrecto");
		}
		
		entrada.close();
		
	}

}
