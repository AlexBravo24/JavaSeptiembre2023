package com;

public class Principal {

	public static void main(String[] args) {
		//En la POO, solo existe una clase Principal que contiene al metodo main
		
		//Aqui puedo crear los objetos de las plantillas o clases que estamos definiendo
		
		//Persona = clase o plantilla - persona1 = objeto o instancia
		Persona persona1 = new Persona();
		
		//persona1.nombre="Miguel"; //Incorrecto
	
		//Creando una persona con el constructor con todos los argumentos
		Persona persona2 = new Persona("Alberto", 31, "Masculino", "alberto@prueba.com", "CDMX");
		
		//Creando una persona con el constructor de 2 parametros (nombre y edad)
		Persona persona3 = new Persona("Alex", 37);
		
		//Asignando el valor de un email a mi persona3
		persona3.setEmail("alex@prueba.com");
		
		String nombre = "Jorge Alejandro";
		
		//Darle salida en consola a la variable nombre
		System.out.println(nombre);
		
		//Imprimir en consola los datos de mi objeto persona3
		//persona3, ya es un objeto, es decir, esta conformado por variables de datos
		//[nombre, edad....]
		System.out.println(persona3);
		
		//Puedo mandar a imprimir solo un valor con un metodo get
		System.out.println(persona3.getNombre()); //Syso("Alex");
		
		//Imprimir a persona2 que tiene todos sus argumentos
		System.out.println(persona2);
		
		//Imprimir a persona1 
		System.out.println(persona1);
		
		//Asignando valores al objeto persona1 con los metodos setters
		persona1.setNombre("Andre");
//		persona1.setGenero("Masculino");
//		persona1.setEdad(25);
//		persona1.setEmail("andre@puebla.com");
//		persona1.setCiudad("Durango");
		
		System.out.println(persona1);
		
		//Van a modelar 5 objetos, los que ustedes gusten
		//Van a crear entonces 5 clases
		//Crean sus atributos (minimo 3 por cada uno)
		//Metodos constructores (vacio y con todos los parametros)
		//Getters y Setters
		//toString
		
		//Y los van a instaciar aqui. Uno vacio y uno con todos los argumentos
		//Y los imprimen en consola
		
		//Ejemplo, voy a crear un animal
		
		Animal perro = new Animal();
		Animal gato = new Animal("Kitty", "Mainecoon", 2);
		perro.setNombre("firulais");

		System.out.println(perro);
		System.out.println(gato);
		
		
		//Objeto 1. Carro
		
		Carro Nissan = new Carro ();
		Carro Toyota = new Carro("Supra", "Plata", 2023);
		Carro Jeep = new Carro("Gladiador", "Negro", 2020);
		
		Nissan.setModelo("Skyline");
		Nissan.setColor("Azul");
		Nissan.setAño(2006);
		
		System.out.println(Nissan);
		System.out.println(Toyota);
		System.out.println(Jeep);
		
	
		
		//Objeto 2. Papeleria
		
		Papeleria Lapiz = new Papeleria ();
		Lapiz.setColor("Negro");
		Lapiz.setTamaño("Lapices: 10");
		Lapiz.setPrecio(75);
		Papeleria Hojas = new Papeleria ("Hojas: 50", "Blancas", 300);
		Papeleria Folders = new Papeleria ("Folders: 100", "Beige", 780);
		
		System.out.println(Lapiz);
		System.out.println(Hojas);
		System.out.println(Folders);
		
		
		
		//Objeto 3. Tortas
		
		Tortas torta1 = new Tortas("Cubana", "Salchicha", "Quesos", 85);
		Tortas torta2 = new Tortas("Doble", "Doble jamon", "Doble queso", 30);
		Tortas torta3 = new Tortas("Chavo", "Jamon", "Lechuga", 25);
		
		System.out.println(torta1);
		System.out.println(torta2);
		System.out.println(torta3);

		
		
		//Objeto 4. Arboles
		
		Arboles fruta1 = new Arboles("Manzana", 15, 347);
		Arboles fruta2 = new Arboles("Mango", 10, 270);
		Arboles fruta3 = new Arboles();
		
		fruta3.setFruta("Naranja");
		fruta3.setCantidad(50);
		fruta3.setPrecio(850);
		
		System.out.println(fruta1);
		System.out.println(fruta2);
		System.out.println(fruta3);
		
		
		
		//Objeto 5. Ropa
		
		Ropa playera = new Ropa();
		playera.setMedida("Mediana");
		playera.setColor("Blanca");
		playera.setPrenda("Playera Polo");
		
		Ropa pantalon = new Ropa();
		pantalon.setPrenda("Pantalon Vaquero");
		pantalon.setMedida("Grande");
		pantalon.setColor("Azul");
		
		Ropa sudadera = new Ropa();
		sudadera.setPrenda("Sudadera");
		sudadera.setMedida("Extra grande");
		sudadera.setColor("Verde");
		
		System.out.println(playera);
		System.out.println(pantalon);
		System.out.println(sudadera);


		
	}
	

}
