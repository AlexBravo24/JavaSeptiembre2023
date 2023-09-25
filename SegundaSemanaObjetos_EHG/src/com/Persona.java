package com;

public class Persona {
	
	//En la POO una clase es una plantilla que contendra los atributos y comportamiento y objetos
	//que queremos crear a partir de ella
	
	//Para modelar a este objeto necesitamos la ABSTRACCION que no es otra cosa que no es un objeto 
	//en la vida real y como podemos traerlo aqui de acuerdo a lo que necesitamos
	
	//Definimos los atributos en las variables respectivas y tipos de datos
	
	
	//La ENCAPSULACION es otro de los pilares de la POO que nos permite proteger el acceso a los atributos
	//de nuestro objeto
	//Existen los modificadores private, protected, public y default
	
	private String nombre;
	private int edad;
	private String genero;
	private String email; 
	private String ciudad;
	
	//Metodos constructores = Son metodos que nos vana permitir crear con nuestro objeto
	//con los diferentes atributos o parametros que este cuenta
	
	
	//Podemos crear inicialmente un constructor vacio que nos va a servir como un comodin o dummie para 
	//crear un objeto sin valores de sus atributos asignados
	
	public Persona() {
		
	}
    //Metodo constructor con todos los parametros
	//este metodo nos permite generar o construir a nuestro objeto con todos sus argumentos o atributos
	public Persona(String nombre, int edad, String genero, String email, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.email = email;
		this.ciudad = ciudad;
	}
	//Creando un metodo constructor con solo 2 parametros
	//puedo crear tantos constructores sean necesarios, con un solo parametro, 2 o 3 etc.
	//pero los mas usados son siempre el constructor vacio y el constructor con
	//todos los parametros
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	    //Metodos  Getters y Setters
		//Estos son metodos que nos permiten acceder a los atributos privados de un objeto
		//con el fin de establecerles valores (setters) o devolver un valor (getters)
		
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
		//Para poder visualizar los datos de los objetos creados, contamos con un
		//metodo llamado toString, que actua como una ""radiografia" que nos muestra
		//Todos los valores (atributos) de nuestro objeto en cuestion
	
	@Override
	public String toString() {
		return "La persona tiene los siguientes valores: \n[nombre=" + nombre + ", \nedad=" + edad + ",\n genero=" + genero + ",\n email=" + email + ", \nciudad="
				+ ciudad + "]";
		
	}
	
	
	
	
	
	
	
	
	
	

}
