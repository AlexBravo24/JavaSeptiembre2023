package ciclos;

public class Ciclo7_VMGH {

	public static void main(String[] args) {
//		// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
//		mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su 
//		dinero?
		
		byte mes = 0;
		float inicial = 700;
		final float finnal = 1500;
		
		while (inicial <= finnal) {
			inicial += (inicial * 0.02f);
			mes++;
			System.out.println("La inversi�n el " + mes + " es de " + inicial + ".");
		}
		System.out.println("El objetivo se cumpli� en " + mes + " meses.");
		

	}

}
