package com.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class ProblemarioIfElse {
	Scanner entrada_scanner = new Scanner(System.in);

	/**
	 * @param 1.Realiza un programa que reciba dos números por teclado e indique
	 *                  cuál es mayor o si son iguales.
	 */
	public void CompararNumeros() {
		System.out.println(" Ingresa un valor entero ");
		int value = entrada_scanner.nextInt();
		System.out.println("Ingresa el segiundo valor ");
		int value_1 = entrada_scanner.nextInt();
		if (value > value_1) {
			System.out.println("El valor " + value + " es mayor que " + value_1);

		} else if (value == value_1) {

			System.out.println(" Los Números son iguales ");
		} else {

			System.out.println("El valor " + value + " es menor  que " + value_1);
		}

	}

	/**
	 * @param 2.- Un programa que pida un número por teclado y nos indique si es par
	 *            o impar.
	 */
	public void NumeroParImpar() {

		System.out.println(" Ingresa un valor entero ");
		int value = entrada_scanner.nextInt();
		if (value % 2 == 0) {
			System.out.println("El número " + value + " es par");

		} else {

			System.out.println("El número " + value + " es impar");
		}
	}

	/**
	 * @param 3.Crea un programa que pida al usuario dos números y muestre el
	 *               resultado de su división. Si el segundo número es 0, debe
	 *               mostrar un mensaje de error.
	 **/
	public void OperationDivision() {
		System.out.println(" Ingresa un valor entero ");
		int value = entrada_scanner.nextInt();
		System.out.println("Ingresa el segiundo valor ");
		int value_1 = entrada_scanner.nextInt();
		if (value_1 != 0) {
			int Result = value / value_1;
			System.out.print("Resultado de la operacion: " + Result);
		} else {
			System.err.println("El segundo valor no puede ser " + value_1);
		}
		// String reString = value_1 == 0 ? ""
	}

	/**
	 * @param 4. Realiza un programa que lea una cadena por teclado y compruebe si
	 *           es una letra mayúscula.
	 **/
	public void PalabrasMayusculas() {
		System.out.println("* compruebar si es una letra mayúscula *");
		System.out.println(" Ingresa unas palabras ");
		String value = entrada_scanner.nextLine();

		System.out.println(value.toLowerCase() + " Resultado de la operacion: " + value.toLowerCase() == value);
		if (value.toLowerCase() == value) {
			System.out.println(" La palabra " + value + " es minuscula");
		} else {
			System.out.println(" La palabra " + value + " contiene o es mayuscula");
		}
	}

	/**
	 * @param 5. Realiza un programa que calcule la aceptación de una solicitud en
	 *           base a los siguientesparámetros: edad, nota y sexo Mínimo: Nota
	 *           (5), edad (18), sexo M -> POSIBLE Mínimo: Nota (5), edad (18), sexo
	 *           F -> ACEPTADA Otros casos -> NO ACEPTADA
	 **/
	public void AceptacionSolicitud() {

		System.out.println("Ingresar edad:");
		int edad = entrada_scanner.nextInt();

		System.out.println("Ingresar nota:");
		double nota = entrada_scanner.nextDouble();

		System.out.println("Ingrese el sexo del solicitante (M/F):");
		char sexo = entrada_scanner.next().charAt(0);

		if (nota >= 5 && edad >= 18) {
			if (sexo == 'M') {
				System.out.println("La solicitud es POSIBLE");
			} else if (sexo == 'F') {
				System.out.println("La solicitud es ACEPTADA");
			} else {
				System.out.println("Sexo no válido. La solicitud es NO ACEPTADA");
			}
		} else {
			System.out.println("La solicitud es NO ACEPTADA");
		}

	}

	/**
	 * @param 6. La asociación de vinicultores tiene como política fijar un precio
	 *           inicial al kilo de uva, la cual se clasifica en tipos (A y B), y
	 *           además en tamaños (1 y 2). Cuando se realiza la venta del producto,
	 *           ésta es de un sólo tipo y tamaño, se requiere determinar cuánto
	 *           recibirá un productor por la uva que entrega en un embarque
	 *           considerando lo siguiente: Si es de tipo A, se le cargan 20
	 *           céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
	 *           es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es
	 *           de tamaño 1, y 50 céntimos cuando es de tamaño 2.Precio inicial se
	 *           recibe desde teclado base a los siguientesparámetros: edad, nota y
	 *           sexo
	 **/
	public void AsocionVinculacio() {
		double final_mont = 0;

		System.out.println(" Ingresar el precio del kilo ");
		double intial_mont = entrada_scanner.nextDouble();

		System.out.println(" Tipos de tipo de uva (A/B)");
		char type_ = entrada_scanner.next().charAt(0);

		System.out.println(" Tipos de tipo de uva (1/2)");
		char size_ = entrada_scanner.next().charAt(0);
		final_mont = intial_mont;
		if (type_ == 'A') {
			if (size_ == '1') {
				final_mont += 0.20;
			} else if (size_ == '2') {
				final_mont += 0.20;
			}
		} else if (type_ == 'B') {
			if (size_ == '1') {
				final_mont -= 0.30;
			} else if (size_ == '2') {
				final_mont -= .50;
			}
		} else {
			System.err.println("La opcion no existe");
		}
		System.out.println("El productor recibirá " + final_mont + " euros por kilo de uva.");

	}

	/**
	 * @param 7.- El director de una escuela está organizando un viaje de estudios y
	 *            requiere determinar cuánto debe cobrar a cada alumno y cuánto debe
	 *            pagar a la compañía de viajes por el servicio. La forma de cobrar
	 *            es la siguiente: Si son 100 alumnos o más, el costo por cada
	 *            alumno es de 65 euros. De 50 a 99 alumnos, el costo es de 70
	 *            euros. De 30 a 49 alumnos, el costo es de 95 euros. Menos de 30
	 *            alumnos, el costo de la renta del autobús es de 4000 euros, sin
	 *            importar el número de alumnos.Realiza un algoritmo que permita
	 *            determinar el pago a la compañía de autobuses y lo que debe pagar
	 *            cada alumno por el viaje.
	 */
	public void ViajeDeEstudio() {
		System.out.println(" Ingresa la cantidad de alumno");
		int total_studen = entrada_scanner.nextInt();
		// int res =
		if (total_studen >= 100) {
			System.out.println("El pago a la compañía de autobuses es : " + (total_studen *= 65));
		} else if (total_studen >= 50 && total_studen <= 90) {

			System.out.println("El pago a la compañía de autobuses es : " + (total_studen *= 70));

		} else if (total_studen >= 30 && total_studen <= 49) {

			System.out.println("El pago a la compañía de autobuses es : " + (total_studen *= 95));
		} else if (total_studen < 30) {
			System.out.println(" El pago a la compañía de autobuses es : " + (total_studen *= 400));
		}
	}

	/**
	 * @return 8. Realiza un programa que pida por teclado el resultado (dato
	 *         entero) obtenido al lanzar un dado de seis caras y muestre por
	 *         pantalla el número en letras (dato cadena) de la cara opuesta al
	 *         resultado obtenido. Nota 1: En las caras opuestas de un dado de seis
	 *         caras están los números: 1-6, 2-5 y 3-4. Nota 2: Si el número del
	 *         dado introducido es menor que 1 o mayor que 6, se mostrará el
	 *         mensaje:“ERROR: número incorrecto”.
	 */
	public void CarasDeDados() {

	}

	/**
	 * @return 9.Realiza un programa que pida el día de la semana (del 1 al 7) y
	 *         escriba el día correspondiente. Si introducimos otro número nos da un
	 *         error.
	 */
	public void DiasSemana() {
		System.out.println(" Ingresar el día de la semana (del 1 al 7)");
		int day_ = entrada_scanner.nextInt();
		switch (day_) {
		case 1: {
			System.out.println("Lunes");
			break;
		}
		case 2: {
			System.out.println("Martes");
			break;
		}
		case 3: {
			System.out.println("Miercoles");
			break;
		}
		case 4: {
			System.out.println("Jueves");
			break;
		}
		case 5: {
			System.out.println("Viernes");
			break;
		}
		case 6: {
			System.out.println("Sabado");
			break;
		}
		case 7: {
			System.out.println("Domingo");
			break;
		}
		default:
			System.err.println("Solo debe seleccionar de (1-7)");

		}
	}

	/**
	 * @return 10.Realiza un programa que pida un número entero entre uno y doce e
	 *         imprima el número de días que tiene el mes correspondiente
	 */
	public void NumeroMese() {
		System.out.println(" Ingresar un numero entero de ( 1 al 12)");
		int day_ = entrada_scanner.nextInt();
		if (day_ == 1) {
			System.out.println("Mes de Enero 31");
		} else if (day_ == 2) {
			System.out.println("Mes de Febrero 28");
		} else if (day_ == 3) {
			System.out.println("Mes de Marzo 31");
		} else if (day_ == 4) {
			System.out.println("Mes de Abril 30");
		} else if (day_ == 5) {
			System.out.println("Mes de Mayo 31");
		} else if (day_ == 6) {
			System.out.println("Mes de Junio 30");
		} else if (day_ == 7) {
			System.out.println("Mes de Julio 31");
		} else if (day_ == 8) {
			System.out.println("Mes de Agosto 31");
		} else if (day_ == 9) {
			System.out.println("Mes de Septiembre 30");
		} else if (day_ == 10) {
			System.out.println("Mes de Octubre 30");
		} else if (day_ == 11) {
			System.out.println("Mes de NoViembre 30");
		} else if (day_ == 12) {
			System.out.println("Mes de Diciembre 31");
			System.err.println("¡Fiesta, Fiesta, Fiest! pluma pluma..");
		} else {
			System.err.println("El Número de meses no existe");
		}
	}

	/**
	 * @return 11.-Una compañía de transporte internacional tiene servicio en
	 *         algunos países de América del Norte, América Central, América del
	 *         Sur, Europa y Asia. El costo por servicio de transporte se basa en el
	 *         peso del paquete y la zona a la que va dirigida. Lo anterior se
	 *         muestra en la siguiente tabla:
	 */
	public void CompaniaTransporte() {
		System.out.println(" Ingresar el kiloGramo del paqueta");
		float pack_kg = entrada_scanner.nextFloat();
		if (pack_kg < 5) {
			System.out.println("***********************************************");
			System.out.println("*              Menu de opción                 *");
			System.out.println("* 1 América del Norte |  precio : 24,00 euros *");
			System.out.println("* 2 América Central   |  precio : 20,00 euros *");
			System.out.println("* 3 América del Sur   |  precio : 21,00 euros *");
			System.out.println("* 4 Europa            |  precio : 10,00 euros *");
			System.out.println("* 5 Asia              |  precio : 18,00 euros *");
			System.out.println("***********************************************");
			System.out.println(" Selecciona el destino del paquete");
			int pack_desti = entrada_scanner.nextInt();
			switch (pack_desti) {
			case 1:
				System.out.println("Seleccionaste América del Norte  el pakete pesa: " + pack_kg + " kg");
				System.out.println("Precio total = Є " + (2400 * pack_kg));
				break;
			case 2:
				System.out.println("Seleccionaste América Central el pakete pesa: " + pack_kg + " kg");
				System.out.println("Precio total = Є " + (2000 * pack_kg));
				break;
			case 3:
				System.out.println("Seleccionaste América del Sur  el pakete pesa: " + pack_kg + " kg");
				System.out.println("Precio total = Є " + (2100 * pack_kg));
				break;
			case 4:
				System.out.println("Seleccionaste Europa el pakete pesa: " + pack_kg + " kg");
				System.out.println("Precio total = Є " + (1000 * pack_kg));
				break;
			case 5:
				System.out.println("Seleccionaste Asia el pakete pesa: " + pack_kg + " kg");
				System.out.println("Precio total = Є " + (1800 * pack_kg));
				break;
			default:
				throw new IllegalArgumentException("Selecciona una opcion valida");
			}

		} else {
			System.err.println(" Parte de su política implica que los paquetes con un peso superior"
					+ " a 5kg no son transportados, por\r\n" + "cuestiones de logística y seguridad.");
		}
	}

	/**
	 * @return .Construir un programa que calcule el índice de masa corporal de una
	 *         persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que
	 *         se encuentra esa persona en función del valor de IMC:
	 */
	public void CalculIndiceMasa() {
		float peso_ = 0f;
		float altura_ = 0f;
		float imc = 0;
		System.out.println("Ingresar peso en kg");
		peso_ = entrada_scanner.nextFloat();
		System.out.println("Ingresar Estatura en metros");
		altura_ = entrada_scanner.nextFloat();
		imc = peso_ / (altura_ * altura_);
		System.out.println(" " + imc);
		if (imc < 16) {
			System.out.println(" Criterio de ingreso en hospital ");
		} else if (imc >= 16 && imc <= 17) {
			System.out.println(" Infrapeso ");
		} else if (imc > 17 && imc <= 18) {
			System.out.println(" Bajo Peso ");
		} else if (imc > 18 && imc <= 25) {
			System.out.println("Peso normal (Saludable) ");
		} else if (imc > 25 && imc <= 30) {
			System.out.println(" Sobrepero (obesidad de grado I)");
		} else if (imc > 30 && imc <= 35) {
			System.out.println(" Sobrepero crónico (obesidad de grado II)");
		} else if (imc > 35 && imc <= 40) {
			System.out.println(" Sobrepero premórbida (obesidad de grado III)");
		} else if (imc > 40) {
			System.out.println(" Sobrepero mórbido (obesidad de grado IV)");
		}
	}

	/**
	 * @return 13 Una institución benéfica recibe anualmente una donación
	 *         proveniente de Europa y lo reparte entre un centro de salud, un
	 *         comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo
	 *         siguiente
	 */
	public void IntitucionBenefica() {
		double centro_salud;
		double comedor_ninos;
		double inversion_bolsa;
		System.out.print("Ingrese el monto de la donación anual: $");
		double montoDonacion = entrada_scanner.nextDouble();

		// Calcular la distribución de acuerdo al monto de la donación
		if (montoDonacion >= 10000) {
			centro_salud = 0.30 * montoDonacion;
			comedor_ninos = 0.50 * montoDonacion;
			inversion_bolsa = 0.20 * montoDonacion; // El 20% restante se invierte en bolsa
			System.out.println("Distribución de la donación anual:");
			System.out.println("Centro de Salud: $" + centro_salud);
			System.out.println("Comedor de Niños: $" + comedor_ninos);
			System.out.println("Inversión en Bolsa: $" + inversion_bolsa);
		} else {
			centro_salud = 0.25 * montoDonacion;
			comedor_ninos = 0.60 * montoDonacion;
			inversion_bolsa = 0.15 * montoDonacion; // El 15% restante se invierte en bolsa
			System.out.println("Distribución de la donación anual:");
			System.out.println("Centro de Salud: $" + centro_salud);
			System.out.println("Comedor de Niños: $" + comedor_ninos);
			System.out.println("Inversión en Bolsa: $" + inversion_bolsa);
		}


	}
	/**
	 * @return 14. Un obrero necesita calcular su salario semanal, el cual se obtiene
	 *  de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. 
	 *  Si trabaja más de 40 horas se le paga $16 por cada una de las
	 *  primeras 40 horas y $20 por cada hora extra.
	 */
	public void SalarioObrero() {
 		double salario_semanal =0;
		System.out.print("Ingrese la cantidad de horas trabajadas :");
		int hor_works = entrada_scanner.nextInt();
		if (hor_works <= 40) {
			 salario_semanal = 16 * hor_works;
		}
		else {
			int horas_extr = hor_works - 40;
			//System.out.println(horas_extr);
			salario_semanal = (16 * 40) +(horas_extr *20);
		//	System.out.println(salario_semanal);
		}
		 System.out.println("El salario semanal es: $" + salario_semanal);

	}

}
