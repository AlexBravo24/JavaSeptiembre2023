package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo existe una clase principal 
		// que contiene al método main
		
		//Aqui puedo crear los objetos de las plantillas 
		//o clases que estamos definiendo
		
		//Persona = clase o plantilla - persona1=objeto o instancia
		Persona persona1 = new Persona();
		
		// persona1.nombre="Miguel"; //incorrecto
		
		//Creando una persona con el constructor con todos los argumentos
		Persona persona2 = new Persona("Alberto", 31, "Masculino", "alberto@prueba.com", "CDMX");
		
		//Crear una persona con el constructor de 2 parámetros (nombre y edad)
		Persona persona3 = new Persona("Alex", 37);
		
		//Asignando el valor de un email a mi persona3
		persona3.setEmail("alex@prueba.com");
		
		String nombre="Jorge Alejandro";
		
		//Darle salida en consola a la variable nombre
		System.out.println(nombre);
		
		//Imprimir en consola los datos de mi objeto persona3
		//persona3 ya es un objeto, es decir, esta conformado por varios tipos de datos
		//[nombre, edad, ...] 
		System.out.println(persona3);
		
		
		//Puedo mandar a imprimir solo un valor con un método get
		System.out.println(persona3.getNombre());//Syso("Alex");
		
		//Imprimir a persona2 que tiene todos sus argumentos
		System.out.println(persona2);
		
		
		//Imprimir a persona1
		System.out.println(persona1);
		
		//Asignando valores al objeto persona1 con los métodos Setters
		persona1.setNombre ("André");
		persona1.setGenero("Masculino");
		persona1.setEdad(25);
		persona1.setEmail("andre@prueba.com");
		persona1.setCiudad("Durango");
		System.out.println(persona1);
		
		
		//Van a modelar 5 objetos, los que ustedes gusten
		//Van a crear entonces 5 clases
		//Crean sus atributos (mínimo 3 por cada uno)
		//Métodos constructores (vacío y con todos los parámetros)
		//Getters y Setters
		//toString()
		
		//Y los van a instanciar aquí. Uno vacío y uno con todos 
		//los argumentos
		//Y los imprimen en consola
		
		Guitarras guitarra1= new Guitarras();
		Empleados empleado1= new Empleados();
		Alumno alumno1=new Alumno();
		Ingrediente ingrediente1=new Ingrediente();
		Vehiculo vehiculo1=new Vehiculo();
		
		System.out.println(guitarra1);
		System.out.println(empleado1);
		System.out.println(alumno1);
		System.out.println(ingrediente1);
		System.out.println(vehiculo1);
		
		
		
				
		

	}

}
