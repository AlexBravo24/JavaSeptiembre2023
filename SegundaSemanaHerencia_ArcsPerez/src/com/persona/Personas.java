package com.persona;

import java.util.Scanner;
//la clase abstract es aquella que por lo menos contiene 
//un metodo abstract
// al hacer hacer esto no podemos crear instancias de esta clase 
//pero no al hacer esto no podemos intanciar
//por que lo estamos portegiendo
public abstract class Personas {
	private String nombre_string;
	private int edad_int;
	private String genero_string;
	private String email_string;
	private String ciudad_string;

	public Personas() {
		super();
	}

	public Personas(String nombre_string, int edad_int, String genero_string, String email_string,
			String ciudad_string) {
		super();
		this.nombre_string = nombre_string;
		this.edad_int = edad_int;
		this.genero_string = genero_string;
		this.email_string = email_string;
		this.ciudad_string = ciudad_string;
	}

	public String getNombre_string() {
		return nombre_string;
	}

	public void setNombre_string(String nombre_string) {
		this.nombre_string = nombre_string;
	}

	public int getEdad_int() {
		return edad_int;
	}

	public void setEdad_int(int edad_int) {
		this.edad_int = edad_int;
	}

	public String getGenero_string() {
		return genero_string;
	}

	public void setGenero_string(String genero_string) {
		this.genero_string = genero_string;
	}

	public String getEmail_string() {
		return email_string;
	}

	public void setEmail_string(String email_string) {
		this.email_string = email_string;
	}

	public String getCiudad_string() {
		return ciudad_string;
	}

	public void setCiudad_string(String ciudad_string) {
		this.ciudad_string = ciudad_string;
	}

	@Override
	public String toString() {
		return "Personas [nombre_string=" + nombre_string + ", edad_int=" + edad_int + ", genero_string="
				+ genero_string + ", email_string=" + email_string + ", ciudad_string=" + ciudad_string + "]";
	}

	/**
	 * una clase puede contar con metodo propios de nuestra clase Esto es que cada
	 * clase u objeto que vayamos a crear tiene o puede ejecutar diferente acciones
	 * Acciones que puede tener una persona
	 */
//metodo con retorno
	public String comerPersona() {
		// declaramos un metodo con un tipo de dato String
		/// String comer_ = "Estoy comiendo ...";

		return "Estoy comiendo ..."; // aqui debe retornar si o so un Strign
	}

	public void dormirPersona() {
		// Este metodo no tiene que regresar un valor de un tipo de dato
		// pero no quiere decir que no hagan nada es decir, puede englobar
		// la logica o acciones por realizar y mandar a llamarlas mediante el objeto
		System.out.println("Voy a dormir.. ");
	}

	public void contarObeja(int oveja) {
		int oveja_=0;
		for (int i = 0; i < oveja; i++) { 
			oveja_+=1;
			System.out.println(" contar oveja numero: " + oveja_);

		}
	}
	public void calculaGastos() {
		int ingreso ;
		int gastos;
		int resultado_;
		Scanner entrada_ = new Scanner(System.in);
		System.out.println(" introduce el valor de tus ingresos");
		ingreso = entrada_.nextInt();
		System.out.println(" introduce el valor de tus gastos");
		gastos = entrada_.nextInt();
		resultado_ = ingreso - gastos ;
		entrada_.close();
		System.out.println("al dia de hoy cuentas con: $"+ resultado_);
	}
	/**
	 * @description Representando un metodo polimorfismo
	 * no podria haber 2 metodos al mismo tiempos
	 * es una habilidad de un metodo de poseer varias
	 * formas a travez de la diferentes de argumentos
	 * sobrecarga de argumentos
	 * polimorfismo va a la mano de sobrecarga de argumetos
	 * sobre escritura de metodos
	 */
	public void calculaGastos(int ingreso, int gasto) {
		System.out.println("el dia de hoy conetas con: $" +(ingreso - gasto ));
	}
	//sobre escritura  ee el mismo metodo pero diferentes
	//acciones 
	
	//sobre carga de metodos  seria cargar varios metodos
	//que hagan varias cosas del mismo tipo 

	/**
	 * @abstraccion
	 */
	public abstract void caminarc();
	
		
}
