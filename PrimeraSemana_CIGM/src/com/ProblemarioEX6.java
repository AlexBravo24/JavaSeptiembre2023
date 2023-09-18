package com;

import java.util.Scanner;

public class ProblemarioEX6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = scanner.next().charAt(0);

        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        int tamanoUva = scanner.nextInt();

        double precioFinal = 0.0;

        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                precioFinal = precioInicial + 0.20;
            } else if (tamanoUva == 2) {
                precioFinal = precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                precioFinal = precioInicial - 0.30;
            } else if (tamanoUva == 2) {
                precioFinal = precioInicial - 0.50;
            }
        }

        System.out.println("El productor recibirá " + precioFinal + " céntimos por kilo de uva.");

        scanner.close();
    }
}
