package com;

import java.util.Scanner;

//La clase abstracta es aquella que por lo menos contiene un metodo abstracto
//Al hacer esto, no podemos crear instancias de esta clase
//Pero al hacer esto, estamos "protgiendo" la clase, lo cual nos permitira unicamente
//heredarla a otras clases
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
	
	
	//Definir una clase puede contar con metodos propios
	//Tambien los vamos a conocer como comportamientos de nuestra clase
	//Esto es que cada clase u objeto que vayamos a crear tiene o puede ejecutar diferentes
	//acciones
	
	//Acciones que puede tener una persona
	
	//Metodo con retorno
	
	//Declaro un metodo que se llama comer, lo declaro con un tipo de dato String
	public String comer() {
		//String comer = "Estoy comiendo...";
		
		
		return "Esty comiendo..."; //Aqui debe retornar si o si un string
		
	}
	
	//Metodos sin retornos
	//Llevan el modificador void, lo cual nos va a indicar que estamos creando un metodo
	//que no necesita regresar el valor de algun tipo de dato
	
	public void dormir() {
		//Este metodo no tiene que regresar un valor de un tipo de dato pero no quiere decir
		//que no haga nada, es decir, puede englobar logica o acciones por realizar
		//y mandar a llamarlas mediante el objeto
		System.out.println("Voy a dormir...");
	}
	
	//Puedo brindarle a mi metodo que me solicite argumentos, estos van dentro de los parentesis
	public void contarOvejas(int a, int b, int c) {
		System.out.println("Contando oveja numero " + a + " + numero: " + b + " numero: " + c);
		
	}
	
	
	//Metodo que se llame calcularGastos
	
	public void calcularGastos() {
		int ingresos;
		int gastos;
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el valor de tus ingresos;");
		ingresos = entrada.nextInt();
		System.out.println("Introduce el valor de tus gastos;");
		gastos = entrada.nextInt();
		
		resultado = ingresos-gastos;
		entrada.close();
		System.out.println("Al dia de hoy cuentas con: " + resultado);
		
		
	}
	
	//Representando un Metodo Polimorfico
	//POLIMORFISMO - Es la habilidad de un metodo de poseer varias formas a traves de la  
	//sobrecarga de argumentos y realizando acciones diferentes o similares
	//El Polimorfismo va de la mano con la Sobrecarga de argumentos
	//y la sobreescritura de metodos
	public void calcularGastos(int ingresos, int gastos) {
		System.out.println("Al dia de hoy cuentas con:" + (ingresos-gastos));
		
		
	}
	
	//Creando un metodo abstracto
	//Al crear un metodo abstracto comenzaremos con la creacion de una clase Abstracta
	
	//El metodo abstracto unicamente nos dice que se va a hacer, pero no como se va a hacer
	
	public abstract void caminar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
