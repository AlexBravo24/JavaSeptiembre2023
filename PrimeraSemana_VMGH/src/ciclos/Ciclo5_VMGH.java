package ciclos;

public class Ciclo5_VMGH {

	public static void main(String[] args) {
//		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
//		de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		for (int hora = 0; hora <= 23; hora++) {
			for(int min = 0; min <= 59; min++) {
				for (int sec = 0; sec <= 59; sec++) {
					System.out.println("La hora es: " + hora + ":" + min + ":" + sec);
				}
			}
		}

	}

}
