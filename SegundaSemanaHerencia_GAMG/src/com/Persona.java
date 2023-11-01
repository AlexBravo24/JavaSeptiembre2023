package com;

import java.util.Scanner;

//La clase abstracta es aquella que por lo menos contiene
//un método abstracto
//Al hacer esto, no podemos crear instancias de esta clase
//Pero al hacer esto, estamos "protegiendo" la clase
//lo cual nos permitirá únicamente heredarla a otras clases
public abstract class Persona {
	
	//Clase Padre
	
	private String nombre;
	private int edad; 
	private String genero; 
	private String email;
	private String ciudad;
	
	public Persona() {}

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
	
	
	//Una clase puede contar con métodos propios
	//También los vamos a conocer como comportamientos 
	//de nuestra clase
	//Esto es que cada clase u objeto que 
	//vayamos a crear  tiene o puede ejecutar
	//diferentes acciones
	
	//Acciones que puede tener una persona
	
	//Método con retorno 

	//Declaro un método que se llama comer
	//Lo declaro con un tipo de dato String
	public String comer() {
		// String comer = "Estoy comiendo...";
		return "Estoy comiendo..."; //Aquí debe retornar sí o sí un String
		
		}
	
	//Métodos sin retorno
	//Llevan el modificador void
	//Lo cual nos va a indicar que estamos creando un método
	//que no necesita regresar el valor de algún tipo de dato
	
	public void dormir() {
		//Este método no tiene que regresar un valor de un tipo de dato
		//pero no quiere decir que no haga nada, es decir, puede englobar 
		//lógica o acciones por realizar y mandar a llamarlas mediante
		//el objeto
		System.out.println("Voy a dormir...");
	}
	
	//Puedo brindarle a mi método que me solicite argumentos
	//estos van dentro de los paréntesis
	public void contarOvejas(int a, int b, int c) {
		System.out.println("Contando oveja número" + a + " + numero: " + b + " + numero: " + c );
	}
	
	//Método que se llame calcularGastos
		
		public void calcularGastos() {
			int ingresos;
			int gastos;
			int resultado;
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el valor de tus ingresos");
			ingresos = entrada.nextInt();
			System.out.println("Introduce el valor de tus gastos");
			gastos = entrada.nextInt();
			
			resultado = ingresos-gastos;
			entrada.close();
			System.out.println("Al dia de hoy cuentas con: " + resultado);
			
		}
		
		//Representando un método Polimórfico
		//POLIMORFISMO = Es la habilidad de un método de poseer varias formas
		//a través de la sobrecarga de argumentos y realizando acciones diferentes
		//o similares
		//El polimorfismo va de la mano con la Sobrecarga de argumentos
		//y la sobreescritura de métodos
		public void calcularGastos(int ingresos, int gastos) {
			System.out.println("Al día de hoy cuentas con: "+ (ingresos-gastos));
		}
		
		//Creando un método abstracto
		//Al crear un método abstracto, comenzaremos la creación
		//de una clase Abstracta
		
		//El método abstracto únicamente nos dice qué se va a hacer 
		//pero no cómo se va a hacer
		
		public abstract void caminar();
		
	}
	

