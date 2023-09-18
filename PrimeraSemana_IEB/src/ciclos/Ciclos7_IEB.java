package ciclos;

public class Ciclos7_IEB {
	public static void main(String[] args) {
		/*
		 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de
		 * inter�s mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada
		 * mes todo su dinero?
		 */

		double inversionInicial = 700.00;
        double tasaInteresMensual = 0.02;
        double montoDeseado = 1500.00;
        
        int meses = 0;
        double saldo = inversionInicial;
        
        while (saldo < montoDeseado) {
            saldo += saldo * tasaInteresMensual;
            meses++;
        }
        
        System.out.println("La persona tendr� m�s de $" + montoDeseado + " despu�s de " + meses + " meses.");
	}
}
