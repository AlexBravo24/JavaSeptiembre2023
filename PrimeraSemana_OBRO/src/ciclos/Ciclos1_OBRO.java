package ciclos;

public class Ciclos1_OBRO {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar del 12
		
		int tabla=12;
		System.out.println("Tabla de multiplicar del 12:");
		
		for (int i = 1; i <= 10; i++) {
			String formato = "%dx%d=%d";
			String linea = String.format(formato, tabla, i, tabla * i);
			System.out.println(linea);
			
		}

	}

}
