package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// API Stream
		/*Funcionalidad a partir de java 8 que nos va a permitir hacer un mejor uso
		 * de los datos de una coleccion
		 * Estos datos los vamos a tener en un flujo continuo para ir solicitandolos 
		 * de acuerdo a como mejor nos convenga
		 * 
		 */

		List<String> nombres = new ArrayList<String>();
		
		nombres.add("Andre");
		nombres.add("Celso");
		nombres.add("Cesar");
		nombres.add("Emmanuel");
		nombres.add("Oswaldo");
		
		//Intentando imprimir a los elementos filtrados
		//Como estos estan en un flujo(Stream), no es posible, a menos que estos elementos
		//se vuelvan una coleccion
		//System.out.println(nombres.stream().filter(a -> a.contains("a")));
		
		List<String> contieneA = new ArrayList<String>();
		
		contieneA = nombres.stream().filter(a -> a.contains("a")).collect(Collectors.toList());
		
		//Una vez que regresamos el stream de la lista nombres y filtramos los elementos que 
		//contienen la letra "a", los coleccionamos a la lista "contieneA"
		//System.out.println(contieneA);
		
		//Originalmente un stream parte de esto, es un flujo de tipos de dato
		Stream<String> names = Stream.of("Andre","Celso","Emmanuel","Oswaldo").filter(a -> a.contains("a"));
		
		//Una vez filtremos de este flujo de elementos, los que solicitamos con el criterio
		//(los que contienen la letra "a"), los que tenemos que llevar a una coleccion, para poder
		//acceder a dichos datos
		
		List<String> lista = names.collect(Collectors.toList());
		//System.out.println(lista);
		
		
		//Crear una lista para guardar elementos Persona en ella
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//Podemos agregar personas directamente en la lista que estamos creando 
		listaPersonas.add(new Persona("Andre", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Celso", 23, "MASCULINO"));
		listaPersonas.add(new Persona("Cesar", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Emmanuel", 26, "MASCULINO"));
		listaPersonas.add(new Persona("Eliazar", 37, "MASCULINO"));
		listaPersonas.add(new Persona("Oswaldo", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Andrea", 21, "FEMENINO"));
		listaPersonas.add(new Persona("Isis", 29, "FEMENINO"));
		listaPersonas.add(new Persona("Paola", 27, "FEMENINO"));
		listaPersonas.add(new Persona("Fernanda", 21, "FEMENINO"));

		//Imprimir los datos de la lista, pero solo como elemento listaPersonas
		//System.out.println(listaPersonas+"\n");
		
		//Imprimir una solo dato de una persona
		//System.out.println(listaPersonas.get(9)+"\n");
		
		//Ciclo for convencionql para imprimir a cada elemento
//		for (int i = 0; i < listaPersonas.size(); i++) {
//			System.out.println(listaPersonas.get(i));
//
//			
//		}
//		
//		//Ciclo forEach
//		for (Persona i : listaPersonas) {
//			System.out.println(i+"\n");
//			
//		}
		
		
		//Cicloforeach con lambda
		//listaPersonas.forEach(a -> System.out.println(a));
		
		//listaPersonas.forEach(System.out::println);
		
		
		//Convencionalmente, si necesitara filtrar a las personas de genero masculino
		//con un ciclo hariamos lo siguiente
		List<Persona> listaMasculinos = new ArrayList<Persona>();
		
		for (Persona i: listaPersonas) {
			if(i.getGenero().equals("MASCULINO")) {
				listaMasculinos.add(i);
				//System.out.println(i);
			}
		}

		
		//Filtrar a los elementos del genero Femenino con el API Stream
		List<Persona> listaFemeninos = new ArrayList<Persona>();
		
		listaFemeninos = listaPersonas.stream().filter(i -> 
			i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
		
		//listaFemeninos.forEach(System.out::println);
		
		//Ordenar a las personas por edad ascendente
		List<Persona> edadAsc = new ArrayList<Persona>();
		
		edadAsc = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		//Ordenar a las personas por edad descendente
		edadAsc = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
				.collect(Collectors.toList());
		
		//edadAsc.forEach(System.out::println);
		
		
		//Hay otras funciones que nos permiten devolver valores booleanos
		//si alguno cumple algunas condiciones
		//.allMatch() en caso de que todos cumplan una condicion
		//.anyMatch() en caso de que alguno cumpla una condicion
		
		//Retornar un valor con la clase Optional
		//La clase Optional nos permite manejar valores que pueden no existir
		//o valores duplicados y asi evitar un error
		//es decir, valores nulos y asi evitar un NullPointerException
		
		Optional<Persona> menorEdad = listaPersonas.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
		
		
		
		
		
		
	}

}
