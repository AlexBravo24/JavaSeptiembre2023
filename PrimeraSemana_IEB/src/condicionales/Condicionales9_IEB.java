package condicionales;

import java.util.Scanner;

public class Condicionales9_IEB {
	public static void main(String[] args) {
		/*
		9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
		introducimos otro n�mero nos da un error.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un n�mero del 1 al 7: ");
        int numeroDia = scanner.nextInt();
        String diaSemana = "";

        switch (numeroDia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Mi�rcoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "S�bado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("ERROR: N�mero incorrecto. Debe ser del 1 al 7.");
                scanner.close();
                return;
        }

        System.out.println("El d�a correspondiente al n�mero " + numeroDia + " es: " + diaSemana);

        scanner.close();
	}
}
