package snippet;

import com.comida.Comida;
import com.comida.Pastel;
import com.persona.Empleado;
import com.persona.Gerente;
import com.persona.Personas;

public class Main {
	public static void main(String[] args) {
	/*	Personas persona1 = new Personas();
		persona1.setNombre_string("Emmanuel");
		persona1.setEdad_int(26);
		persona1.setGenero_string("Masculino");
		persona1.setEmail_string("emmanuel_arcos@gmail.com");
		persona1.setCiudad_string("mexico");
*/
		Empleado empedado1 = new Empleado();
		empedado1.setNombre_string("Daro");
		empedado1.setCiudad_string("Palenque chiapas");
		empedado1.setCargo_("Desarrollador");
		empedado1.setEdad_int(27);
		empedado1.setGenero_string("masculino");
		empedado1.setEmail_string("daro@gmail.com");
		empedado1.setRfc_("001sdr5as1as");
		empedado1.setSalario(35000);
		System.out.println(empedado1);
		/**
		 * @descrip Ejercicio 1 Realizar dos clases una clase padre y una clase hija
		 */
		Comida comida_1 = new Comida();
		comida_1.setTipo_("Ensalada");
		comida_1.setPrecio_(80);
		comida_1.setIngrediente_("Tomate, cebolla, lechuga, chile y limon al gusto");
		System.err.println(comida_1);

		Pastel pastel_1 = new Pastel();
		pastel_1.setTipo_("Tres leche");
		pastel_1.setPrecio_(150.62);
		pastel_1.setIngrediente_(" 3/4 De taza de aceite de maíz\r\n"
				+ "1 Cucharadita de esencia de vainilla ,5 Huevos, 1 Taza de Leche Evaporada CARNATION® CLAVEL®, 1/2 Taza de azúcar");
		pastel_1.setReceta_("\n 1/2 tazas de harina para repostería\n 1 pizca de sal\n "+
				" 1 cucharadita de polvo de hornear \n"
				+ "1 taza de azúcar \n"
				+ "1 cucharadita de extracto de vainilla \n"
				+ "5 huevos grandes");
		pastel_1.setNivel(3);
		pastel_1.setTipo_masa("Aceite");
		System.out.println(pastel_1);
		System.out.println(" ********************************************************* ");
		//probando los metodo propios o acciones de una persona
	/*	System.out.println(persona1.comerPersona());
		persona1.dormirPersona();
		persona1.contarObeja(3);
		persona1.calculaGastos();
		persona1.calculaGastos(560, 45);
		//comprobamos que empleado tambien ya esta herencia
		//los comportamiento de persona*/
		empedado1.calculaGastos();
		empedado1.caminarc();
		Gerente gerente1= new Gerente();
		gerente1.caminarc();
	}
}
