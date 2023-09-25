package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		 System.out.println("Seleccione el tipo de calculadora:");
	        System.out.println("1. Calculadora básica");
	        System.out.println("2. Calculadora científica");
	        int opcion = scanner.nextInt();
	        scanner.nextLine(); 

	        Calculadora calculadora;
	       

	        if (opcion == 1) {
	            calculadora = new Calculadora("Casio", "Negra", "Modelo123");
	        } else if (opcion == 2) {
	            calculadora = new CalculadoraCientifica("Casio", "Negra", "Modelo123");
	        } else {
	            System.out.println("Opción no válida. Se usará una Calculadora básica por defecto.");
	            calculadora = new Calculadora("Casio", "Negra", "Modelo123");
	        }

	       
	        System.out.println("Seleccione la operación:");
	        System.out.println("1. Suma");
	        System.out.println("2. Resta");
	        System.out.println("3. Multiplicación");
	        System.out.println("4. División");
	        
	        if (calculadora instanceof CalculadoraCientifica) {
	            System.out.println("5. Raíz Cuadrada");
	            System.out.println("6. temperatura");
	        }
	        
	        
	        int operacion = scanner.nextInt();
	        scanner.nextLine();
         
	        
	        System.out.print("Ingrese el primer valor: ");
	        double valor1 = scanner.nextDouble();
	        scanner.nextLine(); 

	        System.out.print("Ingrese el segundo valor: ");
	        double valor2 = scanner.nextDouble();
	        scanner.nextLine(); 

	        
	        double resultado = 0.0;
	        
          
	        
	        
	        switch (operacion) {
	            case 1:
	                resultado = calculadora.sumar(valor1, valor2);
	                break;
	            case 2:
	                resultado = calculadora.restar(valor1, valor2);
	                break;
	            case 3:
	                resultado = calculadora.multiplicar(valor1, valor2);
	                break;
	            case 4:
	                resultado = calculadora.dividir(valor1, valor2);
	                break;
	            default:
	                System.out.println("Operación no válida.");
	                break;
	            case 5:
	                if (calculadora instanceof CalculadoraCientifica) {
	                    resultado = ((CalculadoraCientifica) calculadora).raizCuadrada(valor1);
	                } else {
	                    System.out.println("Operación no válida para una Calculadora básica.");
	                }
	                break;
	            case 6:
	                if (calculadora instanceof CalculadoraCientifica) {
	                   ((CalculadoraCientifica) calculadora).tomarTemperatura();
	                }
	                break;
	        }

	        
	        System.out.println("Resultado: " + resultado);
	        
	        scanner.close();
    
	}

}
