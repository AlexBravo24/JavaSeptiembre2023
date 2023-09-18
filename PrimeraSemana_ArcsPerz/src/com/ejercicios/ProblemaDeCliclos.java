package com.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

import javax.xml.stream.util.EventReaderDelegate;

import org.w3c.dom.ls.LSException;

public class ProblemaDeCliclos {

	Scanner entradScanner = new Scanner(System.in);

	/**
	 * @author Emmanuel Arcos Pérez Programa un algoritmo que realice la tabla de
	 *         multiplicar del 12
	 */
	public void multiplicacion(int size, int value) {
		int operacion = 0;
		//pedimos tamaño de operacion y el multiplo
		for (int i = 0; i <= size; i++) {
			System.err.println(value + " * " + i + " = " + value * i);
		}
		System.out.println(" ");
		while (operacion < size) {
			operacion += 1;
			System.out.println(value + " * " + operacion + " = " + (value * operacion));
		}
	}

	// Ejercicios 2
	/*
	 * Programa un algoritmo que realice la tabla de multiplicar de un numero
	 * introducido desde teclado, hasta la iteración deseada por el usuario.
	 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	 */
	public void multiplicacionDeIteracion() {
		System.err.println("*** Tabla de multiplicación de iteracion que desea el usuario ***");
		Scanner entradScanner = new Scanner(System.in);
		System.out.println(" Ingresa el primer valor donde desea iniciar ");
		int value = entradScanner.nextInt();
		//pedimos el valor inicial
		System.out.println(" Ingresa el segundo valor donde desea finalizar");
		int value1 = entradScanner.nextInt();
		//pedimos valor final
		if (value1 > value) {
			for (int i = value; i <= value1; i++) {
				System.out.println(value + " * " + i + " = " + (value * i));
			}
		} else {
			System.err.println("El valor " + value1 + " tiene que ser mayor que " + value);
		}

	}

	// ejercicio3 Realiza un programa para determinar si un String es palíndromo
	public String Palindromo(String palabra) {
		String textoString = palabra.toUpperCase();
		char datCharacter;
		String acumulador = "";
		for (int i = textoString.length() - 1; i >= 0; i--) {
			datCharacter = textoString.charAt(i);
			acumulador += datCharacter;
		}
		// System.err.println(acumulador);
		// System.err.println(textoString);
		return acumulador.equals(textoString) ? "Es un palidromo" : "No es un palindromo";
	}

	/*
	 * ejercicio4 Programa que reciba una frase y una letra por teclado. Deberá
	 * retornar como resultado cuántas veces existe esa letra dentro de la frase. Si
	 * no existe, imprimir un mensaje “Carácter no encontrado”.
	 */
	public void RetornarFrase() {
		String frase_;
		char letra_buscar;
		char letras_palabra;
		int contador = 0;
		System.out.println(" ** Ingresa la frase **");
		frase_ = entradScanner.nextLine();
		// Aqui lo se cortio a mayuscula la frase
		String frase_mayuscula = frase_.toUpperCase();
		System.err.printf(" Ingresa la letra que desa buscar: ");
		letra_buscar = entradScanner.next().charAt(0);
		// De igual forma hay que convertir en mayuscula
		// Para nombre y inicar texto
		char letra_buscar_mayuscla = Character.toUpperCase(letra_buscar);
		// System.out.println(frase_.length());
		for (int i = 0; i < frase_mayuscula.length(); i++) {
			// aqui se posiciona las letras en char para poder comparar cada una
			letras_palabra = frase_mayuscula.charAt(i);
			// System.out.println(letras_palabra+" " +letra_buscar_mayuscla);
			// aqui se hace la compracio y ecuentra una coicidencia de incrementa
			// el contador
			if (letra_buscar_mayuscla == letras_palabra) {
				contador += 1;
			}
		}
		String resultado = contador > 0 ? "Cantidad de coincidencia: " + contador : " Carácter no encontrado ";
		System.out.println(resultado);
	}

	/**
	 * @param ejer5. Simular el comportamiento de un reloj digital, imprimiendo la
	 *               hora,minutos y segundos de un día desde las 00:00:00 horas
	 *               hasta las 23:59:59 horas
	 * @throws InterruptedException
	 */
	public void RelojDigital() throws InterruptedException {
		int hora = 0;
		int minutos;
		int segundo;
		// iciamos con un for que sea menosr de 24
		for (int i = 0; i < 24; i++) {
			minutos = -1;// esto nos sirve para hacer un resta de -1+1 y nos de 0
			// y resetar el valor
			for (int j = 0; j < 60; j++) {
				minutos += 1;
				segundo = -1;
				// aqui sumanos minutos y hacemos lo mismo segundo como el minuto
				for (int k = 0; k < 60; k++) {
					segundo += 1;
					System.out.println(hora + " : " + minutos + " : " + segundo);
					Thread.sleep(3); // sirve par que tarde en
					// imprimir cada linea de codigo
				}
			}
			hora += 1;
		}
	}

	/**
	 * @param 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga
	 *            un 2% de interés mensual. ¿Cuál será la cantidad de dinero que
	 *            esta persona tendrá al cabo de un año si todo el dinero lo
	 *            reinvierte?
	 */
	public void CalcularInversion(int month) {
		int inversion = 1000;
		float porcent_invercion = 2 / 100f;
		float porcent_month = 0f;
		float sum_invertion = 0f;
		int sum_month = 0;
		if (month >= 12) {
			// System.out.println("ok" + ' ' + month + "sum mont" + sum_month);
			while (month > sum_month) {
				sum_month += 1; // esto son los meses nos sirve
				// para terminar nuestro ciclo while
				porcent_month = inversion * porcent_invercion;
				// System.out.println("ok " + porcent_month);
				// se calcula el porcentaje de ganancia de cada mes
				sum_invertion += porcent_month;
				// y se acumula las ganancias de cada mes
			}
			System.out.println("Toltal de inversion en 1 año = " + (sum_invertion + inversion));
		} else {
			System.err.println("La inversion debe ser manyor de 12 meses");
		}
	}

//interes por compuestos
	public void Intestoercompuest(int month) {
		double invercion = 1000d;
		double porcet_invercion = 0;
		for (int i = 0; i < month; i++) {
			// System.err.println(invercion);
			porcet_invercion = invercion * 0.02d;
			invercion = porcet_invercion + invercion;
		}
		System.out.println("Toltal de inversion en 1 año = " + invercion);
	}

	/**
	 * @author Emmananuel Arcos Pérez
	 * @param 7- Una persona desea invertir $700.00 en un banco, el cual le otorga
	 *           un 2% de interés mensual. ¿En cuántos meses tendrá más de $1500, si
	 *           reinvierte cada mes todo su dinero?
	 */
	public void BankInvertion() {
		double total_invertion = 700;
		double objetivo = 1500;
		int i = 0;

		while (total_invertion < objetivo) {
			double ganancia = total_invertion * 0.02;
			total_invertion += ganancia;
			i++;
			// System.out.println(total_invertion + " -- " + i);
		}
		// System.err.println(1500 > (int)total_invertion);
		if (1500 < (int) total_invertion) {
			System.out.println(" A los : " + i + " acumula " + total_invertion);
		}

		// Tardarás 39 meses en alcanzar o superar los $1500.
	}

	/**
	 * @author Emmananuel Arcos Pérez
	 * @param 8. Programa Java que lea dos números y muestre los números desde el
	 *           menor hasta el mayor
	 */
	public void NumeroMayorMenor() {

		System.out.print("Ingrese el primer número: ");
		int num_menor = entradScanner.nextInt();

		System.out.print("Ingrese el segundo número: ");
		int num_mayor = entradScanner.nextInt();
		if (num_menor < num_mayor) {
			for (int i = num_menor; i <= num_mayor; i++) {
				System.out.println(i);
			}
		} else if (num_menor > num_mayor) {
			for (int i = num_mayor; i <= num_menor; i++) {
				System.out.println(i);
			}
		}

	}

	/**
	 * @author Emmananuel Arcos Pérez
	 * @param 9. Programa Java que lea dos números y muestre los números pares entre
	 *           ellos
	 */
	public void NumerosPares() {
		System.out.print("Ingrese el primer número: ");
		int num_menor = entradScanner.nextInt();

		System.out.print("Ingrese el segundo número: ");
		int num_mayor = entradScanner.nextInt();
		if (num_menor < num_mayor) {
			for (int i = num_menor; i <= num_mayor; i++) {
				// System.out.println(i%2);
				if (i % 2 == 0) {
					System.out.println(" Números pares " + i);
				}
			}
		} else if (num_menor > num_mayor) {
			for (int i = num_mayor; i <= num_menor; i++) {
				if (i % 2 == 0) {
					System.out.println(" Números pares " + i);
				}
			}
		}

	}

	/**
	 * @author Emmananuel Arcos Pérez
	 * @param 10. Programa que lea 20 números e indique si son positivos o negativos
	 *            y pares o impares y además muestre la sumatoria de los positivos y
	 *            sumatoria de los impares
	 */
	public void PositivoNegativo() {
		int num_=0;
		int sum_pos=0;
		int sum_impar=0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingesar valores negativo o postivo");
			num_ = entradScanner.nextInt();
			if(num_<0) {
				System.out.println("El número" +num_+" es negativo  ");
			}
			else if(num_>0) {
				System.out.println("El numero "+num_+" es positivo " );
				sum_pos +=num_; 
				//System.out.println(" suma de cada "+ sum_pos);
				if (num_ % 2 == 0) {
					System.out.println(" Número "+num_+" es par ");
				}else if (num_%2!=0) {
					System.out.println(" Número "+num_+" es impar ");
					sum_impar +=num_;
				//	System.out.println("suma de impar: "+sum_impar);
				}
			}
		}
				System.out.println("*** La suma de los Positivos  = "+ sum_pos +" **");

				System.out.println("*** La suma de los impares = "+ sum_impar+ " **");
	}

	/**
	 * @author Emmananuel Arcos Pérez
	 * @param Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
	 *               teclado el ancho y el alto. Ejemplo: 8 x 8 un triangulo va
	 *               dismunulledo i
	 */
	public void Cuadrado(int value) {
		/**
		 * @param para un triangulo for (int i = 0; i < value; i++) { for (int j = 0; j
		 *             < i; j++) { System.err.print("*"); } System.err.println(""); }
		 */

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				System.err.print("*");
			}
			System.err.println("");
		}
	}

	/**
	 * @author Emmananuel Arcos Pérez
	 * @param 12.Se ingresan un conjunto de n edades de personas por teclado. El
	 *              programa finalizara cuando el promedio de las edades sea
	 *              superior a 25
	 */
	public void ConjuntoEdad() {
		System.out.println("** Calcular promedio ** ");
		boolean exit_ = false;
		int option;
		int promedio=0, amount=0;
		int sum = 0;
		while (!exit_) {
			System.out.print("para salir presiona \'1' para salir en caso cntrario \'0' ");
			option = entradScanner.nextInt();
			amount+=1;//se acumula la Número de edades
		    sum+= option;
		  System.out.println(option+" "+sum);
		   	promedio = sum/amount;
		   	System.err.println(promedio);
			
			if (promedio  <= 25) {
				exit_= true;
			}

		}
	}

}
