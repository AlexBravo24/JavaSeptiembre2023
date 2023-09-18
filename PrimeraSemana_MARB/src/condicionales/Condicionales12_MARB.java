package condicionales;

import java.util.Scanner;

public class Condicionales12_MARB {

	public static void main(String[] args) {
		// Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		// [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        String estado;
        
        if (imc < 16) {
            estado = "Criterio de ingreso en hospital";
        } else if (imc < 17) {
            estado = "Infrapeso";
        } else if (imc < 18) {
            estado = "Bajo peso";
        } else if (imc < 25) {
            estado = "Peso normal (saludable)";
        } else if (imc < 30) {
            estado = "Sobrepeso (obesidad de grado 1)";
        } else if (imc < 35) {
            estado = "Sobrepeso crónico (obesidad de grado 2)";
        } else if (imc < 40) {
            estado = "Obesidad premórbida (obesidad de grado 3)";
        } else {
            estado = "Obesidad mórbida (obesidad de grado 4)";
        }
        System.out.println("IMC: " + imc);
        System.out.println("Estado: " + estado);
        

	}

}
