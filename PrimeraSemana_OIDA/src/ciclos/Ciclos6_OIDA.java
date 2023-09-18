package ciclos;

public class Ciclos6_OIDA {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
//		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
//		todo el dinero lo reinvierte?
		int inversion = 10000;
		int interesgenerado;
		int mes=0;
		for (int i=0; i<12; i++) {
			interesgenerado= ((inversion*2)/100);
			inversion=interesgenerado+inversion;
			mes++;
			System.out.println("Se generaron " + inversion + " en este mes " + mes);
			
		}
		
	}

}
