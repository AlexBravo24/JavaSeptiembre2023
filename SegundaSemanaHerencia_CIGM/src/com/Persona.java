package com;

import java.util.Scanner;

public abstract class Persona {

	//(CLASE PADRE)
		private String nombre;
		private int edad;
		private String genero;
		private String email; 
		private String ciudad;
		
		public Persona () {
			
		}

		public Persona(String nombre, int edad, String genero, String email, String ciudad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.genero = genero;
			this.email = email;
			this.ciudad = ciudad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", email=" + email + ", ciudad="
					+ ciudad + "]";
		}
		
		
		//Una clase puede contar con metodos propios tambien los vamos a conocer con metodos propios
		//de nuestra clase Esto es que cada clase u objeto que vayamos a crear tiene o puede ejecutar
		//diferentes acciones
		
		//Acciones que puede tener una persona
		
		//Metodo con retorno
		//Declaro unm etodo que se llama comer lo declaro con un tipo de dato String
		public String comer () {
			//String comer = "Estoy comiendo";
			return "Estoy comiendo...";//Aqui debe restornar si o si un String
			
		}
		
		//Metodos sin retorno
		//llevan modificador void
		//Lo cual nos indica que estamos creando un metodo
		//que no necesita regresar el valor de algun tipo de dato
		
		public void dormir() {
			//Este metodo no tiene que regresar un valor tipo de dato
			//Pero no quiere decir que no haga nada, puede englobar logica
			//o acciones por realizar y mandar a llamarlas mediante el objeto
			System.out.println("a dormir");
			
			}
		//Puedo brindarle a mi metodo que me solicite argumentos 
				//estos van dentro de los parentesis
				
			public void contarOvejas(int a, int b, int c) {
				System.out.println("Contando oveja numero " + a + " + numero: " + b + " numero: " + c);

		}
			//metodo que se llame calcular gastos
			public void calcularGastos() {
				int ingresos;
				int gastos;
				int resultado;
				
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introduce el valor de tus ingresos");
				ingresos = entrada.nextInt();
				System.out.println("Introduce el valor de tus gastos");
				gastos = entrada.nextInt();
				
				resultado = ingresos -gastos;
				entrada.close();
				System.out.println("Al dia de hoy cuentas: " + resultado);		
				
			}
			//Representando unmmetodo polimorfico
			//polimorfismo la habilidad de un metodo de poseer de varias formas atravexz de la diferencia de argumentos y
			//realizando acciones similares Sobrecarga de argumentos
			//El polimorfismo va de la mano con la sobre carga de argumentos
			//Y la soobreescritura de metodos
			public void calcularGastos(int ingresos, int gastos) {
				System.out.println("Al dia de hoy cuentas con:" +( ingresos - gastos));
				
			}
			
			//Creando un metodo ABSTRACTO
			//al crear un metodo abstracto comenzaremos con la creacion de una clase abstracta
			//Un metodo abstracto unicamente nos dice que se va a hacer pero no como se va ahacer
			
			public abstract void caminar();
	
	
}
