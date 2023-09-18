package condicionales;

public class Condicionales14_AMCP {

	public static void main(String[] args) {
		
		
		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
		//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
		//primeras 40 horas y $20 por cada hora extra
		
		Proceso SalarioSemanalDeUnObrero
	    Escribir Sin Saltar "Ingresa el valor de horas trabajadas:";
	    Leer horas_trabajadas;
	    salario <- horas_trabajadas*16;
	    Si horas_trabajadas>40 Entonces
	        salario <- salario+(horas_trabajadas-40)*20;
	    FinSi
	    Escribir "Valor de salario: ", salario;
	FinProceso
		

	}

}
