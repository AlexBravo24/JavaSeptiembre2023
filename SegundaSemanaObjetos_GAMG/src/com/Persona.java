package com;

public class Persona {
	
	//En la POO, una clase es una plantilla que 
	//contendrá los atributos y comportamientos 
	//de los objetos que queremos crear
	//a partir de ella.
	
	//Para modelar a este objeto, necesitamos 
	//la ABSTRACCIÓN, que no es otra cosa que
	//la idea de cómo es un objeto en la vida real
	//y cómo podemos traerlo aquí de acuerdo a lo
	//que necesitemos
	
	
	//Definimos primero los atributos en las variables 
	//respectivas y tipos de datos
	
	//La ENCAPSULACIÓN es otro de los pilares de la POO
	//que nos permite proteger el accesso a los atributos de nuestro objeto
	//Existen los modificadores private, protected, public y default.
	
	private String nombre;
	private int edad; 
	private String genero; 
	private String email;
	private String ciudad;
	
	//Métodos constructores
	//Son métodos que nos van a permitir crear a nuestro objeto 
	//con los diferentes atributos o parámetros que este cuenta
	
	//Podemos crear inicialmente un constructor vacío
	//el cual nos va a servir como un comodín o dummie para 
	//crear un objeto sin valores de sus atributos asignados
	
	public Persona() {
		
	}  //Esto es un constructor vacío

	//Método constructor con todos los parámetros
	//Este método nos permite generar o construir a nuestro objeto con
	//todos sus argumentos o atributos
	public Persona(String nombre, int edad, String genero, String email, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.email = email;
		this.ciudad = ciudad;
	}

	//Creando un método constructor con solo 2 parámetos
	//Puedo crear tantos constructores sean necesarios, con un solo parametro, 2, o 3, etc
	//pero los más usados son siempre el constructor vacío y el constructor con
	//todos los parámetros
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//Métodos Getters y Setters
	//Estos son métodos que nos permiten acceder a los atributos privados de un objeto
	//con el fin de establecerle valores (setters) o devolver un valor (getters)

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
		//Para poder visualizar los tipos de datos de los objetos creados, contamos con un
		//método llamado toString, que actúa como una "radiografía" que nos muestra
		//todos los valores (atributos) de nuestro objeto en cuestión
	
	//Podemos brindar o sobreescribir el formato del método toString() según como necesitemos
	//mostrar la información
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", email=" + email + ", ciudad="
				+ ciudad + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
