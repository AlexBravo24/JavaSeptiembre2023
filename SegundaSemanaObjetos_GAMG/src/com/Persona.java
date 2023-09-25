package com;

public class Persona {
	
	//En la POO, una clase es una plantilla que 
	//contendr� los atributos y comportamientos 
	//de los objetos que queremos crear
	//a partir de ella.
	
	//Para modelar a este objeto, necesitamos 
	//la ABSTRACCI�N, que no es otra cosa que
	//la idea de c�mo es un objeto en la vida real
	//y c�mo podemos traerlo aqu� de acuerdo a lo
	//que necesitemos
	
	
	//Definimos primero los atributos en las variables 
	//respectivas y tipos de datos
	
	//La ENCAPSULACI�N es otro de los pilares de la POO
	//que nos permite proteger el accesso a los atributos de nuestro objeto
	//Existen los modificadores private, protected, public y default.
	
	private String nombre;
	private int edad; 
	private String genero; 
	private String email;
	private String ciudad;
	
	//M�todos constructores
	//Son m�todos que nos van a permitir crear a nuestro objeto 
	//con los diferentes atributos o par�metros que este cuenta
	
	//Podemos crear inicialmente un constructor vac�o
	//el cual nos va a servir como un comod�n o dummie para 
	//crear un objeto sin valores de sus atributos asignados
	
	public Persona() {
		
	}  //Esto es un constructor vac�o

	//M�todo constructor con todos los par�metros
	//Este m�todo nos permite generar o construir a nuestro objeto con
	//todos sus argumentos o atributos
	public Persona(String nombre, int edad, String genero, String email, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.email = email;
		this.ciudad = ciudad;
	}

	//Creando un m�todo constructor con solo 2 par�metos
	//Puedo crear tantos constructores sean necesarios, con un solo parametro, 2, o 3, etc
	//pero los m�s usados son siempre el constructor vac�o y el constructor con
	//todos los par�metros
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//M�todos Getters y Setters
	//Estos son m�todos que nos permiten acceder a los atributos privados de un objeto
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
		//m�todo llamado toString, que act�a como una "radiograf�a" que nos muestra
		//todos los valores (atributos) de nuestro objeto en cuesti�n
	
	//Podemos brindar o sobreescribir el formato del m�todo toString() seg�n como necesitemos
	//mostrar la informaci�n
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", email=" + email + ", ciudad="
				+ ciudad + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
