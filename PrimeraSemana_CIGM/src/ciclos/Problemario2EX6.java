package ciclos;

public class Problemario2EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1000.00; // Cantidad inicial de dinero
        double tasaInteresMensual = 2.0; // Tasa de interés mensual en porcentaje
        int numMeses = 12; // Número de meses en un año

        // Convertir la tasa de interés de porcentaje a decimal
        double tasaInteresDecimal = tasaInteresMensual / 100.0;

        // Calcular la cantidad total después de un año utilizando la fórmula del interés compuesto
        double cantidadTotal = principal * Math.pow(1 + tasaInteresDecimal, numMeses);

        // Imprimir el resultado
        System.out.printf("Después de un año, tendrás $%.2f\n", cantidadTotal);
	}

}
