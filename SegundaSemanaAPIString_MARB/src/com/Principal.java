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
		//Funcionalidad a partir de Java 8 
		//que nos va a permitir hacer un mejor uso de los 
		//datos de una coleccion.
		//Estos datos los vamos a tener en un flujo 
		//continuo para ir solicitandolos 
		//de acuerdo a como mejor nos convenga 
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("Andre");
		nombres.add("Celso");
		nombres.add("Cesar");
		nombres.add("Emmanuel");
		nombres.add("Oswaldo");
		
		//Intentando imprimir a los elementos filtrados 
		//Como estos estan en un flujo (strem), no es posible, a menos 
		//que estos elementos e vuelvan una coleccion
//		System.out.println(nombres.stream().filter(a -> a.contains("a")));
		
		List<String> contieneA = new ArrayList<String>();
		
		contieneA = nombres.stream().filter(a -> a.contains("a")).collect(Collectors.toList());
		
		//Una vez que regresamos el stream de la lista nombres y filtramos 
		//los elementos que contienen la letra "a", los coleccionamos 
		//a la lista "contieneA"
//		System.out.println(contieneA);
		
		//Originalmente un Stream parte de esto, es un flujo de datos 
		
		Stream<String> names = Stream.of("Andre","Celso","Emmanuel","Oswaldo").filter(a ->a.contains("a"));
		
		//Una vez filtremos de este flujo de elementos, los qe solicitamos
		//con el criterio (Los que contienen la letra "a"), los tenemos que llevar a 
		//una coleccion, para poder acceder a dichos datos. 
		
		
		List<String> lista = names.collect(Collectors.toList());
		//System.out.println(lista);
		
		
		//Crear una lista para guardar personas en ella 
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//Agregar personas directamente en la lista que estamos creando 
		listaPersonas.add(new Persona("André", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Celso", 23, "MASCULINO"));
		listaPersonas.add(new Persona("César", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Emmanuel", 26, "MASCULINO"));
		listaPersonas.add(new Persona("Eliazar", 37, "MASCULINO"));
		listaPersonas.add(new Persona("Oswaldo", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Andrea", 22, "FEMENINO"));
		listaPersonas.add(new Persona("Isis", 29, "FEMENINO"));
		listaPersonas.add(new Persona("Paola", 27, "FEMENINO"));
		listaPersonas.add(new Persona("Fernanda", 21, "FEMENINO"));
		
		
		//Imprimir los datos de la lista, pero solo como elemento listapersonas
//		System.out.println(listaPersonas);
		
		//Imprimir un solo dato de una persona 
//		System.out.println(listaPersonas.get(9));
		
//		//Ciclo for convencional para imprimir a cada elemento 
//		for (int i = 0; i < listaPersonas.size(); i++) {
//			System.out.println(listaPersonas.get(i));
//		
//		}
//		//Ciclo forEach
//		for(Persona i:listaPersonas) {
//			System.out.println(i);
//		}
		
		//Cilo forEach en una sola linea 
//		listaPersonas.forEach(a -> System.out.println(a));
		
//		listaPersonas.forEach(System.out::println);
		
		//Convencionalmente si necesitara foltrar a las personas de genero masculino,
		//con un ciclo hariamos lo siguiente 
		
//		List<Persona> listaMasculinos = new ArrayList<Persona>();
//		
//		for(Persona i: listaPersonas) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaMasculinos.add(i);
//				System.out.println(i);
//				
//			}
//		}
		
		//Filtrar a los elementos de genero femeninos con el API Stream 
		
		List<Persona> listaFemeninos = new ArrayList<Persona>() ;
		
		listaFemeninos = listaPersonas.stream().filter(i -> i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		listaFemeninos.forEach(System.out::println);
		
		
		//Ordenar a las personas por edad ascedente 
		
		List<Persona> edadAsc = new ArrayList<Persona>() ;
		
		edadAsc = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
//		edadAsc.forEach(System.out::println);
		
		//Ordenas a las personas por edad descendente 
		//se agrega el (reversed)
   
		edadAsc = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
		
//		edadAsc.forEach(System.out::println);
		
		//Hay otras funciones que nos permiten devolver valores booleanos 
		//si algunos cumplen alguna condicion 
		//.allMach() en caso de que todos cumplan una condicion 
		//.anyMach() alguno cumpla uan condicion 
		
		//Retornar un valor con la clase Opcional 
		//La clase Opctional nos permite manejar valores que pueden no existir
		//o valores duplicados y asi evitar un error 
		// es decir, valores nulos y asi enviar un NullPointerExceotion
		
		
		Optional<Persona> menorEdad = listaPersonas.stream().min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
		
	}

}
