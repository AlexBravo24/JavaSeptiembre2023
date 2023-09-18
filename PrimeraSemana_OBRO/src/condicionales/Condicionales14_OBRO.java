package condicionales;

import java.util.Scanner;

public class Condicionales14_OBRO {

	public static void main(String[] args) {
		/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
primeras 40 horas y $20 por cada hora extra
*/
		
        Scanner entrada = new Scanner(System.in);
     //declaracion de variables
     int horastrabajadas,total,horasex;
     //ingreso de datos por el usuario
     System.out.println("Ingrese el número de horas trabajadas");
     horastrabajadas=entrada.nextInt();
     //proceso de condición
     if(horastrabajadas <= 40){
         total= horastrabajadas*16;
         //uestra de datos en pantalla
         System.out.println("Su sueldo es de $:"+total);
     }else{
         horasex=horastrabajadas-40;
         total=(horasex*20)+(40*16);
         System.out.println("Su sueldo es de $:"+total);
     }
         
     }
     }
