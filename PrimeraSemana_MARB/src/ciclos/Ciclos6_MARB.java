package ciclos;

public class Ciclos6_MARB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double inversion = 1268.7878786262;
		//System.out.println(inversion);
		
		//Para dar un formato de salida a decimales en este caso 
		//podemos ocupar el System.out.printf
		//System.out.printf("%.3f",inversion);
		
		//ESTO ES PARA DAR FORMATO A DECIMALES 
		
		double inversion=1000;
		double interesmensual = .02,rendmensual;
		
		for (int i = 1; i < 12; i++) {
			rendmensual=(inversion*interesmensual);
			inversion = inversion + rendmensual;
			System.out.println("El rendimiento del mes " + i + "es:"+ rendmensual);
		}
		System.out.println("El saldo final es: "+ inversion);
			
		
	

	}

}
