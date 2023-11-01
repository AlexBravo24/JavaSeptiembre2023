package com;

import java.util.Scanner;

//la clase abstracta es aquella que por lo menos contiene un metodo abstracto
//Probar a instanciar a obketos empleados y persona
//al hacer esto , no podemos crear instancias de esta clase
//pero al hacer esto, estamos "protegiendo" la clase 
//la cual nos permitirá unicamente heredarla a otras clases 

public abstract class Persona {

	private String nombre; 
	private int edad;
	private String genero;
	private String email;
	private String ciudad;
	
	
	
	public Persona() {
		
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
	
	
	
	//una clase puede contar con metodos propios 
	//tambien los vamos a conocer como comportamientos de nuestra clase 
	//esto quiere decir que cada clase puede puede ejecutar diferentes acciones. 
	
	
	//acciones que puede tener una persona 
	
	//metodo retorno
	
	//declaro un metodo que se llama comer 
	//lo declaro con un tipo de dato que se llama String 
	
	public String comer() {
		//String comer = "Estoy comiendo";
		return "estoy comiendo";//aqui debe retornar si o si un String 
		
	}
	
	
	//metodos sin retorno 
	// llevan modificador void 
	//lo cual nos va a indicar que estamos creando un metodo 
	//que no necesita regresar el valor de algun tipo de dato 
	
	public void dormir() {
		//este metodo no tiene que regresar un valor de un tipo de dato
		//pero no quiere decir que no haga nada
		//puede englobar logica o acciones por realizar y mandar a llamarlas 
		//mediante el objeto 
		System.out.println("Voy a dormir");
	}
	//Puedo brindarle a mi metodo que solicite argumentos 
	//estos van dentro de los parentesis 
	public void contarovejas(int a, int b, int c) {
		System.out.println("contando oveja numero " + a +" oveja " + b +" oveja " +c);
	}
	public void calculargastos() {
		int ingresos;
		int gastos;
		int resultado;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el valor de tus ingresos ");
		ingresos=entrada.nextInt();
		System.out.println("Introduce el valor de tus gastos");
		gastos=entrada.nextInt();
		
		resultado=ingresos-gastos;
		System.out.println("Al dia de hoy cuentas con: " + resultado);
		
	}
	
	//representar un metodo Polimorfico
	//polimorfismo es la habilidad de un metodo de poseer varias formas a traves de la diferencia de argumentos
	//puede tener una sobrecarga de argumentos y realizando acciones diferentes o similares 
	//el polimorfismo va de la mano con la sobrecarga de argumentos 
	//y la sobreescritura de metodos
	
	public void calculargastos(int ingresos, int gastos) {
		System.out.println("Al dia de hoy cuentas con " + (ingresos-gastos));
		
	}

	//creando un metodo abstracto
	//al crear un metodo abstracto comenzaremos con una clase abstracta 
	
	//el metodo abstracto unicamente nos dice como se va a hacer pero no como se va a hacer 
	
	public abstract void caminar();
	
	
}
