package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// Api Stream
		/*funcionalidad a partir de java 8 que nos permitira hacer un mejor
		 * uso de los datos de una coleccion.
		 * estos datos los vamos a tener en un flujo continuo 
		 * para ir solicitandolos de acuerdo a como mejor convenga
		 */
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("ANDREA");
		nombres.add("CELSO");
		nombres.add("CARLOS");
		nombres.add("MARIA");
		nombres.add("JUAN");
		nombres.add("MARCOS");
		
		//System.out.println(nombres.stream().filter(a -> a.contains("A")));
		
		List<String> contieneA = new ArrayList<String>();
		
        contieneA = nombres.stream().filter(a -> a.contains("A")).collect(Collectors.toList());
        //System.out.println (contieneA);
        
        
        //Crear una lista
        List<Persona> ListaPersonas = new ArrayList<Persona>();
        //Agregar personas directamente en la lista que estamos creando
        ListaPersonas.add(new Persona("ANDREA", 32, "Femenino"));
        ListaPersonas.add(new Persona("CELSO", 23, "Masculino"));
        ListaPersonas.add(new Persona("ARGOS", 19, "Masculino"));
        ListaPersonas.add(new Persona("MATHEW", 23, "Masculino"));
        ListaPersonas.add(new Persona("LIZ", 18, "Femenino"));
        ListaPersonas.add(new Persona("VEYDA", 27, "Femenino"));
        ListaPersonas.add(new Persona("JOSE", 30, "Masculino"));
        ListaPersonas.add(new Persona("RAMON", 26, "Masculino"));
        ListaPersonas.add(new Persona("MARISSA", 21, "Femenino"));
        
        // imprimir los datos de la lista pero solo como elemento lista persona
     //   System.out.println(ListaPersonas);
        // imprimir un solo dato de una persona
     //   System.out.println(ListaPersonas.get(5));
        // ciclo for
     //   for(int i = 0; i < ListaPersonas.size(); i++) {
     //   	System.out.println(i);
     //   }
        
        // ListaPersonas.forEach(a -> System.out.println(a));
        // ListaPersonas.forEach(System.out::println);
        
        //Convencionalmente, si se nesesitara filtrar a las personas de genero masculino con un ciclo hariamos lo siguiente
        List<Persona> ListaMasculinos = new ArrayList<Persona>();
        for(Persona i: ListaPersonas) {
        	if(i.getGenero().equals("Masculino")) {
        		ListaMasculinos.add(i);
        		System.out.println(i);
        	}
        }
        
       /*List<Persona> ListaFemeninos = new ArrayList<Persona>();
       *ListaFemeninos = ListaPersonas.stream()
        *		.filter(i -> i.getGenero()
        *        .equals("Femenino")
        *        .collect(Collectors.toList());
      * listaFemeninos.forEach(System.out: :println);
      * */
                
	}

}
