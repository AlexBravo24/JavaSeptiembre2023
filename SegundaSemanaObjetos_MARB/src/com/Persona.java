package com;

public class Persona {
	
	//en la POO, una clase es una plantilla
	//que contendra los atributos y comportamientos
	//de los objetos que queremos crear 
	//a partir de ella 
	
	//para modelar este objeto, necesitamos 
	//la ABSTRACCION, que no es otra cosa que 
	//la idea de como es un objeto en la vida real 
	//y como podemos traerlo aqui de acuerdo a lo 
	//que necesitemos 
	
	//La ENCAPSULACION es otro de los pilares de la POO 
	//Que nos permite proteger el acceso a los atributos 
	//de nuestro objeto 
	//Exsiten los modificadores private, protected, public, y default
	
	private String nombre;
	private int edad;
    private String genero;
	private String email;
	private String ciudad;
	
	//Metodos constructores 
	//Son metodos que nos van a permitir crear a nuestro objeto 
	//con los diferentes atributos o parametros que este cuenta 
	
	//Podemos crear inicialmente un constructor vacio 
	//el cual nos va a servir como un comodin o dummie para 
	//crear un objeto sin valores de sus atributos asignados 
	
	public Persona () {
		
	}
	
	//Metodo constructor con todos los parametros 
	//Este metodo nos permite generar o construir a nuestro objeto
	//con todos sus argumentos o atributos 

	public Persona(String nombre, int edad, String genero, String email, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.email = email;
		this.ciudad = ciudad;
	}
	
	//Creando un metodo constructor con solo dos parametros 
	//puedo crear tantos constructores sean necesarios, con un solo parametro, 2 o 3, etc. 
	//Pero los mas usados son siempre el constructor vacio y el constructor con
	//todos los parametros 


	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Metodos Getters y Setters 
	//Estos son meteodos que nos permiten acceder a los atributos privados de un objeto 
	//con el fin de establecer valores (setters) o devolver un valor (getters)
		

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
	//Para poder visualizar los datos de los objetos creados contamos con 
	// un metodo llamado toString, que actua omo un aradiografia que nos muestra 
	//todos los valores de los atributos de nuestro objeto en cuestion
	
	//Podemos brindar o sobreescribir el formato del metodo toString() de acuerdo a lo ue 
	//necesitemos 
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", email=" + email + ", ciudad="
				+ ciudad + "]";
	}
	
	
	

	
	
	
	

}
