package condicionales;

import java.util.Scanner;

public class Condicionales12_EHG {

	public static void main(String[] args) {
		//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
        //Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
        //ser introducidos por teclado por el usuario.
		
		
		 //Declaracion
		double imc;
		int peso;
		double altura;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("INTRODUZCA SU PESO");
		peso = entrada.nextInt();
		
		System.out.println("INTRODUZCA SU ALTURA");
		altura = entrada.nextDouble();
		
		imc = peso/(altura * altura);
		
		System.out.println("Su Indice de Masa Corporal es: " + imc);
		 System.out.println("====USTED TIENE====== ");
		
		if (peso <16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if(peso >= 16 && peso <=17) {
			System.out.println("Infrapeso");
		}else if(peso >= 17 && peso <= 18) {
			System.out.println("Bajo peso");
		}else if(peso >=18 && peso <= 25) {
			System.out.println("Peso Normal (Saludable)");
		}else if(peso >= 25 && peso <= 30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		}else if(peso >=30 && peso <= 35) {
			System.out.println("Sobrepeso cronico (Obesidad de grado II)");
		}else if(peso >= 35 && peso <= 40) {
			System.out.println("Obesidad premorbida (Obesidad de grado III)");
		}else if(peso >40) {
			System.out.println("Obesidad morbida (Obesidad de grado IV)");
		}
		
		  
		
		
	


	}

}
