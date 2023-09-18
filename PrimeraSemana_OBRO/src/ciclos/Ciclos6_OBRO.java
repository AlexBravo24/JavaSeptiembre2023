package ciclos;

public class Ciclos6_OBRO {

	public static void main(String[] args) {
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		//todo el dinero lo reinvierte?

		double inversion = 1000.00;
        double intereses = .02;
        double meses;
        
        for (int i=1; i<=12; i++) {
        	meses = (inversion*intereses);
        	inversion = inversion + meses;
        	System.out.println("El rendimiento del mes " + i + " es: " + meses);
        }
        System.out.println("El saldo final es: " + inversion);
        
    }

}