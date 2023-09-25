package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//API Stream
		//Funcionalidad a partir de java 8
		//que nos va apermitir hacer un mejor uso de los datos en una coleccion
		//Estos datos los vamos a tener en un flujo continuo para ir solicitandolos
		//de acuerdo a mejor nos convenga
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("Andre");
		nombres.add("Celso");
		nombres.add("Cesar");
		nombres.add("Emmanuel");
		nombres.add("Oswaldo");
		//Intentando imprimir a los elementos filtrados 
		//Como estos estan en un flujo (Stream) no es posible a menos
		//que estos elementos se vuelven una coleccion
		//System.out.println(nombres.stream().filter(a -> a.contains(a)));
		
		List<String> contieneA = new ArrayList<String>();
		
		contieneA = nombres.stream()
				.filter(a -> a.contains("a"))
				.collect(Collectors.toList());
		//Una vez que regresamos el strem de la lista nombres y filtramos 
		//los elementos que contiene la letra "a" los coleccionamos
		//A la lista "contieneA"
//		System.out.println(contieneA);
		
		
		//Originalmente un strem parte de esto es un flujo de tipos de dato
		Stream<String> names = Stream.of("Andre", "Celso", "Cesar", "Emmanuel", "Oswaldo")
		.filter(a -> a
		.contains("a"));
		//Una vez filtremos de este flujo de elementos, los solicitamos 
		//con el criterio (Los que contienen la letra a) los tenemos que llevar a
		//una coleccion para poder acceder a dichos datos
		
		List<String> lista = names.collect(Collectors.toList());
//		System.out.println(lista);
		
		
		
		//Crear una lista para guardar elementos Persona en ella
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//Agregar personas directamente en la lista que estamos creando
		listaPersonas.add(new Persona("Andre", 25, "Masculino"));
		listaPersonas.add(new Persona("Celso", 23, "Masculino"));
		listaPersonas.add(new Persona("Cesar", 25, "Masculino"));
		listaPersonas.add(new Persona("Emmanuel", 26, "Masculino"));
		listaPersonas.add(new Persona("Eliazar", 37, "Masculino"));
		listaPersonas.add(new Persona("oswaldo", 25, "Masculino"));
		listaPersonas.add(new Persona("Andrea", 22, "Masculino"));
		listaPersonas.add(new Persona("Isis", 29, "Femenino"));
		listaPersonas.add(new Persona("Paola", 27, "Femenino"));
		listaPersonas.add(new Persona("Fernanda", 21, "Femenino"));
		
		//Imprimir los datos de la lista pero solo como elemento listaPersonas
		System.out.println(listaPersonas);
		
		//Imprimir un solo dato de una persona
		System.out.println(listaPersonas.get(9));
		
		//Ciclo for convencional para imprimir a cada elemento
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i));
			
		}
		//Ciclo forEach
//		for(Persona i:listaPersonas) {
//		System.out.println(i);
//		}
		
		//Ciclo foreach /Para cada elemento
//		listaPersonas.forEach(a -> System.out.println(a));
		
//		listaPersonas.forEach (System.out::println);
		
		//Convencionalmente, si necesitara filtrar a las Personas de genero
		//masculino con un ciclo hariamos lo siguiente
		List<Persona> listaMasculinos = new ArrayList<Persona>();
		
		for(Persona i: listaPersonas) {
		   if(i.getGenero().equals("Masculino")){
			   listaMasculinos.add(i);
			   System.out.println(i);
		   }
			
		}
		
		//Filtrar a los elementos del genero Femenino con el API Stream
		List<Persona> listaFemeninos = new ArrayList<Persona>();
		
		listaFemeninos = listaPersonas.stream()
				.filter(i -> i.getGenero()
			    .equals("Femenino"))
				.collect(Collectors.toList());
		
//		listaFemeninos.forEach(System.out::println);
		
		
		//Ordenar a las peronas por edad ascendente
		List<Persona> edadAsc = new ArrayList<Persona>();
		
		edadAsc = listaPersonas.stream()
				.sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
//		edadAsc.forEach(System.out::println);
		
		//Ordenar por Persona por edad descendente
		edadAsc = listaPersonas.stream()
				.sorted(Comparator.comparing(Persona::getEdad).reversed())
				.collect(Collectors.toList());
		edadAsc.forEach(System.out::println);
		edadAsc.forEach(System.out::println);
		
		
		
		//Hay otras funciones que nos permite devolver valores booleanos
		//si alguno cumple alguna condicion
		//.allMatch() en vcaso de que todos cumplan una condicion
		//.anyMatch()  alguno cumpla una condicion
		
		//Retornar un valor con la clase Optional
		//La clase oprional nos permite manejar valores que puedan no existir
		//es decir valores nulos y asi evitar un nullpointer Exception

	
		Optional<Persona> menorEdad = listaPersonas.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		

	}
	

}
