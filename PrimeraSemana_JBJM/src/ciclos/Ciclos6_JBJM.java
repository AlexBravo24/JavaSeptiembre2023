package ciclos;

public class Ciclos6_JBJM {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		// mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		// todo el dinero lo reinvierte?
		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 1.02;
		mes++;
		}
		System.out.println(dinero);
		}

}
