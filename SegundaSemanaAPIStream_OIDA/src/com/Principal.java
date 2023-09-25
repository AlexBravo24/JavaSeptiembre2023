package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// API Stream es una funcionalidad a partir de java 8 que nos va a permitir hacer un mejor 
		//uso de los datos de una coleccion.
		//Estos datos los vamos a tener en un flujo continuo para ir solicitandolos de acuerdo  
		//a como mejor nos convenga
		
		
		List<String> nombres = new ArrayList <String> ();
		
		nombres.add("André");
		nombres.add("Celso");
		nombres.add("César");
		nombres.add("Emmanuel");
		nombres.add("Oswaldo");
		
		//intentando imprimir a los elementos filtrados 
		//como estan en un flujo "Stream" no es posible, a menos que estos elementos se vuelvan una coleccion. 
		
		//System.out.println(nombres.stream().filter(a -> a.contains("a")));
		List<String> contieneA = new ArrayList <String> ();
		
		
		contieneA =  nombres.stream().filter(a -> a.contains("a")).collect(Collectors.toList());
		
		//System.out.println(contieneA);
		
		//vamos a crear una lista para guardar elementos persona en ella 
		List <Persona> listapersonas = new ArrayList <Persona>();
		
		//agregar personas directamente en la lista que estamos creando 
		listapersonas.add(new Persona("Andre", 25, "Masculino"));
		listapersonas.add(new Persona("Luis", 22, "Masculino"));
		listapersonas.add(new Persona("Omar", 24, "Masculino"));
		listapersonas.add(new Persona("Malenia", 33, "Femenino"));
		listapersonas.add(new Persona("Paola", 27, "Femenino"));
		listapersonas.add(new Persona("Godrick", 30, "Masculino"));
		listapersonas.add(new Persona("Emmanuel", 25, "Masculino"));
		listapersonas.add(new Persona("Nasus", 60, "Masculino"));
		listapersonas.add(new Persona("Samira", 50, "Femenino"));
		listapersonas.add(new Persona("Garen", 40, "Masculino"));
		
		//Imprimir los datos de la lista, pero solo como elemento listapersonas 
		System.out.println(listapersonas);
		//imprimir una sola persona de la lista
		System.out.println(listapersonas.get(3));
		
		//ciclo for convencional para imprimir a cada elemento 
		for(int i = 0; i < listapersonas.size();i++ ) {
			System.out.println(listapersonas.get(i));
			
		}
		
		//ciclo for each 
		
		for(Persona i:listapersonas) {
			System.out.println(i);
		}
		
		//ciclo for each en una sola linea 
		listapersonas.forEach(a -> System.out.println(a));
		
		listapersonas.forEach(System.out::println);
		
		
		//convencionalmente, si necesita filtrar a las personas de genero masculino, con un ciclo hariamos lo siguiente
		
		
		List <Persona> listamasculino = new ArrayList<Persona>();
		
		for (Persona i: listapersonas) {
			if(i.getGenero().equals("Masculino")) {
				listamasculino.add(i);
				System.out.println(i);
			}
		}
		
		
		//filtrar los elementos de genero con el API Stream 
		
		List <Persona> listafemenino = new ArrayList<Persona>();
		
		listafemenino = listapersonas.stream()
				.filter(i -> i.getGenero()
			    .equals("Femenino"))
				.collect(Collectors.toList());
		
		listafemenino.forEach(System.out::println);
		
		List<Persona> edadAsc = new ArrayList<Persona>();
		
		edadAsc = listapersonas.stream()
				.sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		//ordenar a las personas por edad descendente
		
		edadAsc = listapersonas.stream()
				.sorted(Comparator.comparing(Persona::getEdad).reversed())
				.collect(Collectors.toList());
		
		
		
		
		edadAsc.forEach(System.out::println);
		
		//hay otras funciones que nos permiten devolver valores booleanos 
		//si alguno cumple alguna condicion 
		
		//all match() en caso de que todos cumplan una condicion 
		//any match() alguno cumpla con una condicion 
		
		//retornar un valor con la clase Optional 
	    // la clase optional te permite manejar valores que pueden no existir, o valores duplicados
		//es decir, valores nulos y asi evitar un nullpointerexception
		
		Optional<Persona> menoredad = listapersonas.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		
		System.out.println(menoredad);
		
		
		
	}

}
