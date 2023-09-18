package ciclos;

public class Ciclos7_OBRO {

	public static void main(String[] args) {
		//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		//dinero?
		
		 double inversion = 700.00;
		 double intereses;
		 int meses = 0;
		 while (inversion <= 700.00) {
		 meses++;
		 intereses = inversion * 0.02;
		 System.out.println("meses: " + meses + "\n"+ "intereses: " + String.format("%.2f", intereses) + "\n"+ "inversion: " + String.format("%.2f", inversion) + "\n" + "inversión al mes: " + String.format("%.2f", (inversion + intereses)) + "\n"); 
		 inversion += intereses;
		 }
	}
}

