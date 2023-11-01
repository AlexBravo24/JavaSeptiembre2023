package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la Programacion orienta a objetos, solo existe una clase Principal
		// que contiene al metodo main 
		
		//Aqui puedo crear los objetos de las plantillas
		//o clases que estamos difiriendo 
		
		//Persona clase o plantilla - personal=objeto o instancia 
		Persona persona1 = new Persona ();
		
		// persona1.nombre="Miguel";//incorrecto
		
		//Creando una persona con el constructor con todos los argumentos 
		Persona persona2 = new Persona("Alberto", 31, "Masculino", "alberto@prueba.com", "CDMX"  );
		
		//Crear una persona con el constructor 2 parametros (nombre y edad )
		Persona persona3 = new Persona("Alex", 37);
		
		//Asignando el valor de un email a mi personal 
		persona3.setEmail("alex@prueba.com");
		
		String nombre = "Jorge Alejandro";
		
		//Darle salida en consola a la variable nombre 
		System.out.println(nombre);
		
		//Imprimir en consola los datos de objeto persona 3 
		//persona3, ya es un objeto, es decir, esta conformado por varios tipos de datos
		//[nombre,edad......]
		System.out.println(persona3);
		
		//Puede mandar a imprimir solo un valor con un metodo get 
		System.out.println(persona3.getNombre()); //Syso("Alex);
		
		//Imprimir persona2 que tiene todos sus argumentos
		System.out.println(persona2);
		
		//Imprimir a persona1
		System.out.println(persona1);
		
		//Asiganando valores al objeto personal con los metodos setters
		persona1.setNombre("Andre");
//		persona1.setGenero("Masculino");
//		persona1.setEdad(25);
//		persona1.setEmail("andre@prueba.com");
//		persona1.setCiudad("Durango");
		
		System.out.println(persona1);
		
		
		//Van a modelar 5 objetos, los que ustedes gusten 
		//Van crear entonces 5 clases
		//Crean sus atributos (minimo 3 por cada uno )
		//Metodos constructores (vacio y con todos los parametros)
		//Getters y Setters
		//toString()
		
		//Y los van instanciar aqui. Uno vacio y uno todos 
		//los argumentos
		//Y los imprimen en consola
		
		//Ejemplo, voy a crear un Animal
		
		Animal perro = new Animal();
		Animal gato = new Animal("Kitty", "Mainecoon",2 );
		perro.setNombre("Firulais");
		
		System.out.println(perro);
		System.out.println(gato);
		
		//LIBROS
		
		Libros Dune = new Libros();
		Libros SoyLeyenda = new Libros("Dune", 2 , "Ciencia Ficcion","Richard Matheson");
		Dune.setAutor("Frank Herberr");
		
		System.out.println(Dune);
		System.out.println(SoyLeyenda);
		
		//PELICULAS
		
		Peliculas Uno = new Peliculas();
		Peliculas Dos = new Peliculas ("La Monja","Terror", 2023 ,"Michel Chavez");
		Uno.setNombre("Bird BOx");
		
		System.out.println(Uno);
		System.out.println(Dos);
		
		//LAPTOP
		Laptop Hp = new Laptop ("Laptop Pavilion", 2022,"Negro");
		Laptop Acer = new Laptop ();
		Acer.setModelo("Acer Nitro 5 AN515-58-57Y8 Gaming Laptop");
		Acer.setColor("Gris");
		
		System.out.println(Hp);
		System.out.println(Acer);
		
		//Tarjeta 
		Tarjeta Credito = new Tarjeta("Stander",1234589666, "Diego");
		Tarjeta Debito = new Tarjeta();
		Debito.setTitular("Alex");
		
		System.out.println(Credito);
		System.out.println(Debito);
		
		//Coche
		Coche Sedan = new Coche();
		Coche Deportivo = new Coche("Ferrari",110000000, "Rojo" );
		Sedan.setColor("Negro");
		
		System.out.println(Sedan);
		System.out.println(Deportivo);
		
		//Alumono 
		Alumno Jorge = new Alumno();
		Alumno Hector = new Alumno ("Alex", 123899,"Lic. Contabilidad");
		Jorge.setCarrera("Ing. Sistemas");
		
		
		System.out.println(Jorge);
		System.out.println(Hector);
		System.out.println(Jorge);
		
	}
	

}
