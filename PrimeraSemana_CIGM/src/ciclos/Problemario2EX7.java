package ciclos;

public class Problemario2EX7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double principal = 700.00; // Cantidad inicial de dinero
	        double tasaInteresMensual = 2.0; // Tasa de interés mensual en porcentaje
	        double montoDeseado = 1500.00; // Monto deseado
	        int meses = 0; // Inicializar el contador de meses

	        // Convertir la tasa de interés de porcentaje a decimal
	        double tasaInteresDecimal = tasaInteresMensual / 100.0;

	        // Calcular el número de meses necesarios para alcanzar el monto deseado
	        while (principal < montoDeseado) {
	            principal *= (1 + tasaInteresDecimal); // Aplicar el interés compuesto
	            meses++;
	        }

	        // Imprimir el resultado
	        System.out.println("La persona tendrá más de $" + montoDeseado + " en " + meses + " meses.");
	}

}
