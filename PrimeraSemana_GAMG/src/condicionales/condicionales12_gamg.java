package condicionales;

import java.util.Scanner;

public class condicionales12_gamg {

	public static void main(String[] args) {
		// Construir un programa que calcule el indice de masa corporal de una persona (IMC=peso[kg]/altura2[m]
		// e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		// Nota1: se recomienda el empleo de sentencias if-else anidadas. 
		// Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.

		double peso, altura, IMC; 
		String Diagnostico = null;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca peso y altura");
		peso = entrada.nextDouble();
		altura = entrada.nextDouble();
		
		IMC = peso/(altura*altura); 
		
		if (IMC<16) {
			Diagnostico = "Criterio de ingreso en hospital";
		} else if(IMC>=16 && IMC<17) {
			Diagnostico = "Infrapeso";
		}  else if(IMC>=17 && IMC<18) {
			Diagnostico = "Bajo peso";
		} else if (IMC>=18 && IMC<25) {
			Diagnostico = "Peso normal (saludable)";
		} else if (IMC>=25 && IMC<30) {
			Diagnostico = "Sobrepeso (obesidad grado I)";
		} else if (IMC>=30 && IMC<35) {
			Diagnostico = "Sobrepeso crónico (obesidad grado II";
		} else if (IMC>=35 && IMC<=40) {
			Diagnostico = "Obesidad premórbida (obesidad grado III";
		} else if (IMC>40) {
			Diagnostico = "Obesidad mórbida (obesidad grado IV)";
		}
		
		System.out.println("El indice de masa corporal es: " +IMC + " y el diagnóstico es: " +Diagnostico);
	}

}
