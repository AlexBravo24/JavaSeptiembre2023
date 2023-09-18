package ciclos;

public class Ciclos5_OIDA {

	public static void main(String[] args) {
		// Ejercicio 5
		for (int hora = 0; hora <=23; hora++) {
            for (int minuto = 0; minuto <=59; minuto++) {
                for (int segundo = 0; segundo <=59; segundo++) {
                    System.out.println(hora +"h"+ minuto +"m"+  segundo +"s");
                }
            }
        }
	}

}
