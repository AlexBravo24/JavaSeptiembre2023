package com.main;

import com.cafetria.Cafeteria;
import com.computadora.Computadora;
import com.departamento.Departamento;
import com.persona.Persona;
import com.puerta.Puerta;
import com.telefono.Telefonos;

public class main {
	public static void main(String[] Args) {
		//solo la poo, solo existe una clase principal
		//que contiene 
		//System.out.print("Solo esta ");
		//aqui podemos crear los objetos de las plantillas
		//o clase que estamos definimos
		
		//persona  = claseo plantilla = objeto o instancia;
		Persona persona= new Persona();
		/**
		 * @coment Crerando una persona con el sonstructor
		 * son todas los argumetos
		 */
		//persona.setNombre_string("Emmanuel Arcos Pérez");
		
		System.out.println(persona.getNombre_string());
		
		/**
		 * 
		 */
		Persona persona1 = new Persona("Emmanuel arcos", 26 , " Masculino ", "Emmanuelarcos.97@gmail.com", "Chiapas");

		/**
		 * @comment Crear una persona son el onstructor de 2 parametros 
		 */
		Persona persona2 = new Persona("Ady madeline", 34);
	
		Persona persona3 = new Persona();
		persona3.setNombre_string("Ady madeline");
		persona3.setEdad_int(24);
		persona3.setEmail_string("Adymadeline@gmail.com");
		//darle salida en consola a la variable nombre
		//Puedo mandar a imprimir solo un valor co un metodo ger
		System.out.println(persona3.getNombre_string());
		System.out.println(persona3.getEdad_int());
		
		System.out.println("**************");
		System.err.println(persona3);
		System.err.println(persona1);
		System.err.println(persona2);
		persona.setNombre_string("aArcos pere carmalino");
		System.err.println(persona);
		/**
		 * @author emmanuel arcos 
		 * @descrip Ejercicio 1
		 */
		System.out.println(" *****************************************  \n");
		Departamento depa = new Departamento();
		depa.setArea_string(22);
		depa.setCodigo_postal(29688);
		depa.setAddres_string("Calle Capitan Luis vidal");
		depa.setPropietario_string("Emmanuel arcos perez");
		depa.setPuertas(5);
		System.out.println(depa);
		/**
		 * @author Emmanuel Arcos Pérez
		 * @return ejercicio 2
		 */
		System.out.println(" ***************************************** ");
		Puerta puerta = new Puerta();
		puerta.setAltura_pint(1.5);
		puerta.setAncho_pint(.50);
		puerta.setColor_pstring(" Negro");
		puerta.setMatrial_pstring(" Madera ");
		System.out.println(puerta);
		/**
		 * @author Emmanuel Arcos Pérez
		 * @return ejercicio 3
		 */
		System.out.println(" *****************************************  \n");
		Computadora comput = new Computadora();
		comput.setMarca_compu("Asus");
		comput.setModelo_comp(" FX506L");
		comput.setPrecio_compu(2500.5);
		comput.setDisco_compu(" 1 tera byte");
		System.out.println(comput);
		/**
		 * @author Emmanuel Arcos Pérez
		 * @return ejercicio 4
		 */
		System.out.println(" *****************************************  \n");
		 Cafeteria cafeteria = new Cafeteria();
		 cafeteria.setCodigo_postal(15000);
		 cafeteria.setNombre_("Monte daro");
		 cafeteria.setDireccion_("calle los mil años avenida muy lejos ");
		 cafeteria.setEstado_("Chiapas");
		System.out.println(cafeteria);
		 /**
		 * @author Emmanuel Arcos Pérez
		 * @return ejercicio 5
		 */
		System.out.println(" *****************************************  \n");
		Telefonos telefonos = new Telefonos();
		telefonos.setNume_("961-4569-767");
		telefonos.setMarcaa_("Xiaomi");
		telefonos.setCompania_("Telcel");
		telefonos.setPrecio_(5500.99);
		System.out.println(telefonos);
	}
}

