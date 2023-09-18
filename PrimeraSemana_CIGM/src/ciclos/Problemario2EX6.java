package ciclos;

public class Problemario2EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1000.00; // Cantidad inicial de dinero
        double tasaInteresMensual = 2.0; // Tasa de inter�s mensual en porcentaje
        int numMeses = 12; // N�mero de meses en un a�o

        // Convertir la tasa de inter�s de porcentaje a decimal
        double tasaInteresDecimal = tasaInteresMensual / 100.0;

        // Calcular la cantidad total despu�s de un a�o utilizando la f�rmula del inter�s compuesto
        double cantidadTotal = principal * Math.pow(1 + tasaInteresDecimal, numMeses);

        // Imprimir el resultado
        System.out.printf("Despu�s de un a�o, tendr�s $%.2f\n", cantidadTotal);
	}

}
