package condicionales;

import java.util.Scanner;

public class Condicionales12_OIDA {

	public static void main(String[] args) {
//		// Ejercicio 12Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
//		[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
//			Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben
//			ser introducidos por teclado por el usuario.
		double peso;
		double altura;
		double alturaformula;
		double imc;
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce tu peso en Kg");
		peso = entrada.nextDouble();
		System.out.println("introduce tu altura en Metros");
		altura = entrada.nextDouble();
		entrada.close();
		alturaformula = altura*altura;
		imc = peso/alturaformula;
		System.out.println("tu indice de masa corporal es " + (imc)+ " ");
		if (imc < 16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if (imc >=16  &&  imc <= 17) {
			System.out.println("Infrapeso");
		}else if (imc >17  &&  imc <= 18) {
			System.out.println("bajo peso");
		}else if (imc >18  &&  imc <= 25) {
			System.out.println("peso normal, saludable");
		}else if (imc >25  &&  imc <= 30) {
			System.out.println("sobrepeso (obesidad grado 1)");
		}else if (imc >30  &&  imc <= 35) {
			System.out.println("sobrepeso crónico (obesidad de grado 2");
		}else if (imc >35  &&  imc <= 40) {
			System.out.println("obesidad premórbida (obesidad de grado 3");
		}else if (imc >40) {
			System.out.println("obesidad mórbida (obesidad de grado 4)");
		}
	}

}
