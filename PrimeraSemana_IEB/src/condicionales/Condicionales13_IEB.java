package condicionales;

import java.util.Scanner;

public class Condicionales13_IEB {
	public static void main(String[] args) {
		/*
		13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
		y el resto se invierte en la bolsa.
		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		niños y el resto se invierte en la bolsa.
		La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la donación anual: $");
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

        System.out.println("Distribución de la donación anual:");
        System.out.println("Centro de Salud: $" + centroSalud);
        System.out.println("Comedor de Niños: $" + comedorNinos);
        System.out.println("Inversión en la Bolsa: $" + inversionBolsa);

        scanner.close();
	}
}
