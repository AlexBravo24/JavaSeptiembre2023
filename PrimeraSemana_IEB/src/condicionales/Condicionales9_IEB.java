package condicionales;

import java.util.Scanner;

public class Condicionales9_IEB {
	public static void main(String[] args) {
		/*
		9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		introducimos otro número nos da un error.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
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
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("ERROR: Número incorrecto. Debe ser del 1 al 7.");
                scanner.close();
                return;
        }

        System.out.println("El día correspondiente al número " + numeroDia + " es: " + diaSemana);

        scanner.close();
	}
}
