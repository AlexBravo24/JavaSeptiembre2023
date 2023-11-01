package condicionales;

import java.util.Scanner;

public class Condicionales13_IEB {
	public static void main(String[] args) {
		/*
		13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
		y el resto se invierte en la bolsa.
		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		ni�os y el resto se invierte en la bolsa.
		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la donaci�n anual: $");
        double montoDonacion = scanner.nextDouble();

        double centroSalud;
        double comedorNinos;
        double inversionBolsa;

        if (montoDonacion >= 10000) {
            centroSalud = 0.30 * montoDonacion;
            comedorNinos = 0.50 * montoDonacion;
            inversionBolsa = montoDonacion - centroSalud - comedorNinos;
        } else {
            centroSalud = 0.25 * montoDonacion;
            comedorNinos = 0.60 * montoDonacion;
            inversionBolsa = montoDonacion - centroSalud - comedorNinos;
        }

        System.out.println("Distribuci�n de la donaci�n anual:");
        System.out.println("Centro de Salud: $" + centroSalud);
        System.out.println("Comedor de Ni�os: $" + comedorNinos);
        System.out.println("Inversi�n en la Bolsa: $" + inversionBolsa);

        scanner.close();
	}
}
