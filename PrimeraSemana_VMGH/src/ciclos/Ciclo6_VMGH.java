package ciclos;

public class Ciclo6_VMGH {

	public static void main(String[] args) {
//		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
//		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
//		todo el dinero lo reinvierte?
		
		float contador = 1000;
		
		for (int i = 1; i <= 12; i++) {
			contador += (contador * 0.02f);
			System.out.println("Su cuenta tiene: " + contador + " pesos durante el mes " + i);
		}
		
		System.out.println("Al cabo de un a�o tiene ahorrado una cantidad de  " +  contador);

	}

}
