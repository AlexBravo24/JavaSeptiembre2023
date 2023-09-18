package ciclos;

public class Ciclos7_OIDA {

	public static void main(String[] args) {
		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
//		dinero?
		int inversion = 700;
		int interesgenerado;
		int mes=0;
		boolean parar=true;
		int limite=0;
		while (inversion<1500) {
			interesgenerado= ((inversion*2)/100);
			inversion=interesgenerado+inversion;
			mes++;
			System.out.println("Se generaron " + inversion + " en este mes " + mes);
		}
		
		
		System.out.println("Se generaron " + inversion + " en el mes " + mes + ", por lo tanto ya tienes mas de 1500");
	}

}
