package com;

public class Persona {
	
	
	//En la POO, Una clase es una plantilla
	//que contendra los atributos y comportamientos 
	//de los objetos que queremos crear
	//a partir de ella
	
	//Para modelar a este objeto, necesitamos 
	//la ABSTRACCION, que no es otra cosa que 
	//la idea de como es un objeto en la vida rel 
	//y como podemos traerlo aqui de acuerdo a lo 
	//que necesitamos 
	
	//Definimos primero los atributos en las variables 
	//respectivas y tipos de datos 
	
	//La ENCAPSULACION es otro de los pilares de la POO
	//Que nos permite proteger la informacion el acceso a los atributos 
	//de nuestro objeto 
	//Existen los modificador private, protected, public y default 
	
	private String nombre;
	private int edad;
	private String genero;
	private String email;
	private String ciudad;
	
	//Metodos contructores 
	//Son metodos que nos van a permitir crear a nuestro objeto
	//Con los diferentes atributos o parametros que esta cuenta 
	
	//Podemos crear inicialmente un constructor vacio 
	//el cual nos va a servir como un comodin o dummie para 
	//crear un objeto sin valores de sus atributos asignados 
	
	
	
	public Persona() {
	
	}
	
    //Metodo constructor con todos los parametros 
	//Este metodo nos permite generar o contruir a nuestro objeto con 
	//Todos sus argumentos o atriburtos
	public Persona(String nombre, int edad, String genero, String email, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.email = email;
		this.ciudad = ciudad;
	}

	//Creando un metodo constructor con solo 2 parametros
	//Puedo crear tantos constructores sean necesarios, con un solo parametro, 2, o 3, etc.
	//Pero los mas usados son siempre el contruccion vacio y el contructor con 
	//todos los parametros 
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//Metodos Getters y Setters 
		//Este son metodos que nos permiten acceder a los atributos privados de un objeto 
		//con el fin de establecerles valores (settters) o devolver un valor (getters)
		

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
	
	//Nuestros objetos creados ahora se componen de varios tipos de datos
	//Para poder visualizar los datos de los objetos creados, contamos, contodos con un 
	//Metodo llamado  toString, que actua como una "radiografia" que nos muestra
	//todos los valores (atributos) de nuestro objeto en cuestion 
		
    //Podemos brindar o sobescribir el formato del metodo toString() segun como necesitamos 
	//mostrar la informacion 
	@Override
	public String toString() {
		return "La persona tiene los Siguentes valores: \n[nombre=" + nombre + ", \n edad=" + edad + ",\n genero=" + genero + ",\n email=" + email + ",\n ciudad="
				+ ciudad + "]";
		
	}
	

}
