package com;

public class Persona {

	//En la POO, una clase es una plantilla que contendrá los atributos y comportamientos 
	//de los objetos que queremos crear a partir de ella. 
	
	
	//Para modelar a este objeto necesitamos la abstraccion, que no es otra cosa que la idea
	//de como es un objeto en la vida real y como podemos traerlo aqui de acuerdo a lo que necesitemos
	
	
	
	//definimos primero los atributos en las variables respectivas y tipos de datos 
	
	//la encapsulacion es otro de los pilares de la POO que nos permite proteger el acceso a los atributos
	//de nuestro objeto 
	//existen modificadores private,default,protected,public
	
	private String nombre; 
	private int edad;
	private String genero;
	private String email;
	private String ciudad;
	
	//metodos constructores
	//son metodos que nos van a permitir crear a nuestro objeto 
	//con los diferentes atributos o parametros que este cuenta
	
	//podemos crear inicialmente un constructor vacio que nos va a servir
	//como un comodin o dummie para crear un objteto sin valores de sus atributos asignados 
	
	
	public Persona() {
	
	
}
      //Metodo constructor con todos los parametros 
	// este metodo nos permite generar o construir a nuestro objeto con todos sus argumentos o atributos

	public Persona(String nombre, int edad, String genero, String email, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.email = email;
		this.ciudad = ciudad;
	}
	
	//creando un metodo constructor con solo 2 parametros 
	//puedo crear tantos constructores como sean necesarios, con un solo parametro, 2 o 3 
	//pero los mas usados son el consturctor vacio y el constructor con todos los parametros 
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	//metodos Getters y Setters 
	//Estos son los metodos que nos permiten acceder a los atributos de un objeto
	//con el fin de establecerles valores (Setters) o devolver valores (Getters)

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

	
	
	//nuestros objetos creados ahora se componen de varios tipos de datos
	//para poder visualizar los datos de los objetos creados, contamos con un metodo llamado 
	//toString que actua como una radiografia que nos muestra todos los valores (atributos) de nuestro objeto en cuestion.
		
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", email=" + email + ", ciudad="
				+ ciudad + "]";
	}
	
	
	
	
}