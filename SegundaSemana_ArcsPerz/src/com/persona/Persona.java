package com.persona;

public class Persona {
//En la poo, una clase es un plantilla
	// que contiene los atributos y comportamiento
	// de los que queremos crear
	// a partir de ella

	/**
	 * @context para modelar a este objeto, necesitamos la abstraccion que no es
	 *          otra cosa que la idea de como es un objeto de la vida real y como
	 *          podemos traerlo aqui de acuerdo a lo que necesitamos
	 **/
	/**
	 * @descrip Definimos primero los atributos en la variables respectivas y tipos
	 *          de datos
	 */
	// Encapsulamiento es uno de los pilares de la poo
	// que nos permite proteger el acceso a los atributos
	// de nuestro objeto Esixte los modificado
	// private protectec, public y default

	private String nombre_string;
	private int edad_int;
	private String genero_string;
	private String email_string;
	private String ciudad_string;

	/**
	 * @context constructor son metodo que nos van a permitir a crear a nuestro
	 *          objeto con los diferentes atributos o parametros a esta cuenta
	 * 
	 */
	public Persona() {

	}

	/**
	 * 
	 * @param Este metodo nos permite generar o contruir a nuestros objetos con
	 *             todos sus argumentos o atributos
	 */
	public Persona(String nombre_string, int edad_int, String genero_string, String email_string,
			String ciudad_string) {
		super();
		this.nombre_string = nombre_string;
		this.edad_int = edad_int;
		this.genero_string = genero_string;
		this.email_string = email_string;
		this.ciudad_string = ciudad_string;
	}
	/*
	 * @Creando un metodo constructor con solo 2 parametros
	 * puede crear tantos contruir sea necesario don un paramtro 1,2
	 * pero los mas usados son siempre contructor vacioy todos los parametros
	 */
	public Persona(String nombre_string, int edad_int) {
		super();
		this.nombre_string = nombre_string;
		this.edad_int = edad_int;
	}
	/**
	 * @return metodos para acceder a los atributos privados de un objeto
	 * con el fin de establecer valor set y get traer
	 */
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
	//nuestros objetos creados ahora se compone de varios time de datos
	//para poder vidualizar los datos de los objetos creados sontamos con un
	//metodo llamdo to string, que actua con un "radigrafia " que nos muestra todos
	//los valore (atributos) de nuesto de nuestro en cuestion

	@Override
	public String toString() {
		return "Persona [nombre_string=" + nombre_string + ", edad_int=" + edad_int + ", genero_string=" + genero_string
				+ ", email_string=" + email_string + ", ciudad_string=" + ciudad_string + "]";
	}
	
}
