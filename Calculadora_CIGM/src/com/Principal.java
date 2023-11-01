package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		 System.out.println("Seleccione el tipo de calculadora:");
	        System.out.println("1. Calculadora b�sica");
	        System.out.println("2. Calculadora cient�fica");
	        int opcion = scanner.nextInt();
	        scanner.nextLine(); 

	        Calculadora calculadora;
	       

	        if (opcion == 1) {
	            calculadora = new Calculadora("Casio", "Negra", "Modelo123");
	        } else if (opcion == 2) {
	            calculadora = new CalculadoraCientifica("Casio", "Negra", "Modelo123");
	        } else {
	            System.out.println("Opci�n no v�lida. Se usar� una Calculadora b�sica por defecto.");
	            calculadora = new Calculadora("Casio", "Negra", "Modelo123");
	        }

	       
	        System.out.println("Seleccione la operaci�n:");
	        System.out.println("1. Suma");
	        System.out.println("2. Resta");
	        System.out.println("3. Multiplicaci�n");
	        System.out.println("4. Divisi�n");
	        
	        if (calculadora instanceof CalculadoraCientifica) {
	            System.out.println("5. Ra�z Cuadrada");
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
	                System.out.println("Operaci�n no v�lida.");
	                break;
	            case 5:
	                if (calculadora instanceof CalculadoraCientifica) {
	                    resultado = ((CalculadoraCientifica) calculadora).raizCuadrada(valor1);
	                } else {
	                    System.out.println("Operaci�n no v�lida para una Calculadora b�sica.");
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
