package ciclos;

public class Ciclos1_AMCP {

	public static void main(String[] args) {
		
		
		// Programa un algoritmo que realice la tabla de multiplicar del 12
		
		int multiplicando = 12;
		int multiplicador = 1;
		
		do {
			System.out.println(multiplicando + "x" + multiplicador + "=" + multiplicando*multiplicador );
			multiplicador += 1;
			
		} while (multiplicador <= 10);

	}

}
