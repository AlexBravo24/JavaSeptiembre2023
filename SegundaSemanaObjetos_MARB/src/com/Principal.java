package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO, solo existe una clase principal 
		//que contiene al metodo main
		
		//aqui puedo crear los objetos de las plantillas 
		//o clases que estamos definiendo 
		
		//Persona=clase o plantilla  - persona1=objeto o instancia 
		Persona persona1 = new Persona();
		
		//persona1.nombre="Miguel"; // incorrecto 
		
		//Creando una persona con el constructor con todos los argmentos 
		
		Persona persona2 = new Persona("Alberto", 31, "Masculino", "alberto@prueba.com", "CDMX");
		
		//rear una persona con el construcctor de dos parametros 
		
		Persona persona3 = new Persona("Alex", 37);
		
		//Asignando un valor de un email a mi persona 3 
		persona3.setEmail("Alex@prueba.com");
		
		
		String nombre= "Jorge Alejandro";
		
		//Darle salida en consola a la variable nombre
		System.out.println(nombre);
		
		//Imprimir en consola los datos de mi objeto persona 3 
		//persona3, ya es un objeto, es decir, esta conformado por varios tipos de datos 
		//^[nombre, edad....]
		
		//System.out.println(persona3);
		
		System.out.println(persona3.getNombre()); //Seria como Syso("Alex")
		
		System.out.println(persona3);
		
		//imprimir a persona 2 ue tiene todos sus argumentos 
		System.out.println(persona2);
		
		//imprimir a persona 1 
		System.out.println(persona1);
		
		//Asignando valores al objeto persona1 con los metodos setters 
		persona1.setNombre("Andre");
		persona1.setGenero("Masculino");
		persona1.setEdad(25);
		persona1.setEmail("andre@prueba.com");
		persona1.setCiudad("Durango");
		
		System.out.println(persona1);
		
		
		//van a modelar 5 objetos, los que ustedes gusten 
		//van a crear entonces 5 clases 
		//crean sus atributos (minimo 3 por cada uno )
		//metodos constructores (vacio y con todos los argumentos)
		//getters y setters 
		//toString
		
		// y lo van a instanciar aqui. Uno vacio y uno con todo 
		//los argumentos 
		//y los imprimen en consola 
		
		//Ejemplo de creacion un Animal 
		
		
		Animal perro = new Animal();
		Animal gato = new Animal("Kitty", "mainnecon", 2);
		perro.setNombre("Firulais");
		
		System.out.println(perro);
		System.out.println(gato);
		
		Vehiculos coche = new Vehiculos();
		Vehiculos avion = new Vehiculos("aereo", "Aeropuestos", "Turbocina", "Requiere de examen");
		coche.setCombustible("Gasolina");
		
		System.out.println(avion);
		System.out.println(coche);
		
		
		Carro camioneta = new Carro();
		Carro hachBack  = new Carro("dos", "pavimento", "gasolina", "negro", "piel");
		camioneta.setMotor("electrico");
		
		System.out.println(hachBack);
		System.out.println(camioneta);
		
		
		LineaBlanca lavadora = new LineaBlanca();
		LineaBlanca secadora = new LineaBlanca("mabe", 14, "gris", "Gas");
		lavadora.setRecursoConsumible("electricidad");
		
		System.out.println(secadora);
		System.out.println(lavadora);
		
		
		Perros perro1 = new Perros();
		Perros perro2 = new Perros("chihuahua", "chico", 3, "mochi");
		perro1.setNombre("Fluke");
		
		System.out.println(perro2);
		System.out.println(perro1);
		
		
		
		

		
		

	}

}
