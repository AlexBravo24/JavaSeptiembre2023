package ciclos;

public class Ciclos6_IEB {
	public static void main(String[] args) {
		/*
		 * 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		 * de interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá
		 * al cabo de un año si todo el dinero lo reinvierte?
		 */

		double principal = 1000.00;
        double tasaInteresMensual = 0.02;
        
        double cantidadFinal = principal;

        for (int mes = 0; mes < 12; mes++) {
            cantidadFinal += cantidadFinal * tasaInteresMensual;
        }
        
        System.out.println("La cantidad de dinero al cabo de un año será: $" + cantidadFinal);
	}
}
