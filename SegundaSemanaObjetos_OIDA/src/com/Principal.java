package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo existe una clase principal que contiene el metodo main
		
		
		//Aqui puedo crear los objetos de las plantillas o clases que estamos definiendo 
		
		//persona = clase o plantilla     persona1= onjeto o instancia 
		
		Persona persona1 = new Persona(); //persona1 es el nombre de la variable, la persona es el objeto 
		
		//persona1.nombre="Omar"; //incorrecto
		//creando una persona con el constructor con todos los argumentos 
		
		Persona persona2 = new Persona("Omar", 24, "Masculino", "omar_aguilar@prueba.com", "Xalapa");
		
		//creando una persona con el constructor de 2 parametros (nombre, edad)
		Persona persona3 = new Persona("Mike", 30);
		
		
		Vehiculos carro1 = new Vehiculos();
		Vehiculos carro2 = new Vehiculos("Corvette", 2, "En V", "rojo");
		Computadoras pc1 = new Computadoras();
		Computadoras pc2 = new Computadoras("Ryzen", "RTX 4070", 32, 32);
		Platillos comida1 = new Platillos();
		Platillos comida2 = new Platillos("Tacos", "Si", 3);
		Videojuegos juego1 = new Videojuegos();
		Videojuegos juego2 = new Videojuegos("The last of us", 120, "Terror", 1);
		Musica cancion1 = new Musica();
		Musica cancion2 = new Musica("El duelo", 3, "lofi", "Spotify");
		
		
		//le asigno el valor de un email a mi persona 3
		persona3.setEmail("Mike@prueba.com");
		
		String nombre = "Jorge Alejando";
		
		//darle salida en consola a la variable nombre 
		System.out.println(nombre);
		
		
		//imprimir en consola los datos de mi objeto persona3
		//persona3 ya es un objeto, es decir está conformado por varios tipos de datos 
		//nombre, edad, etc
		System.out.println(persona3.toString()); //este metodo convierte todos los valores del objeto a valores string 
		System.out.println(persona3);// aqui debe imprimir igual que .toString
		//puedo imprimir solo un valor con el metodo get 
		
		System.out.println(persona3.getNombre());
		
		//imprimir a persona2 que tiene todos sus argumentos 
		
		System.out.println(persona2);
		System.out.println(persona1);
		
		
		//asignando valores al objeto persona1 con los metodos setters
		persona1.setNombre("Andree");
		persona1.setGenero("Masculino");
		persona1.setEdad(25);
		persona1.setEmail("correo");
		persona1.setCiudad("Durango");
		
		System.out.println(persona1);
		
		//modelar 5 objetos 
		//crear entonces 5 clases 
		//creamos atributos (minimo 3 por cada uno)
		// metodos constructores (vacio, todos los parametros)
		//Getters y Setters 
		//metodo toString 
		
		// instanciar aqui, uno vacio y uno con todos los argumentos 
		//imprimirlos en consola 
		
		//damos valores a los objetos que no cuentan con ellos inicialmente 
		carro1.setNombre("GT3 991");
		carro1.setColor("Azul");
		carro1.setAsientos(4);
		carro1.setMotor("Boxer");
		
		pc1.setGrafica("RX 580");
		pc1.setRam(16);
		pc1.setTamañopantalla(20);
		pc1.setProcesador("Intel i5");
		
		comida1.setLimones(1);
		comida1.setNombre("Tamal");
		comida1.setPicante("no");
		
		juego1.setGenero("RPG");
		juego1.setTamañogb(50);
		juego1.setJugadores(1);
		juego1.setTitulo("Elden Ring");
		
		cancion1.setGenero("Salsa");
		cancion1.setPlataforma("Youtube");
		cancion1.setTitulo("Tu con el");
		cancion1.setMinutos(5);
			
		//imprimir todos los objetos 
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(pc1);
		System.out.println(pc2);
		System.out.println(comida1);
		System.out.println(comida2);
		System.out.println(juego1);
		System.out.println(juego2);
		System.out.println(cancion1);
		System.out.println(cancion2);

	}

}
