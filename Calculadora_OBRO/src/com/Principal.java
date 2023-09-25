package com;

public class Principal {

	public static void main(String[] args) {
		

		Cientifica cientifica = new Cientifica();
		cientifica.setColor("Negra");
		cientifica.setMarca("CASIO");
		cientifica.setModelo("Cientifica");
		cientifica.setOperaciones("Suma, resta, multiplicacion y division");
		
		System.out.println(cientifica);
		
//		cientifica.Suma();
//		cientifica.Resta();
//		cientifica.Multiplicacion();
//		cientifica.Division();
		
		
		////////METODO DEL PROFESOR
		//SUMA
		System.out.println (cientifica.sumar(25, 40));
		
		//RESTA
		cientifica.restar(10, 3);
		
		//MULTIPLICACION
		System.out.println(cientifica.multiplicar(5, 11));
		
		cientifica.tomarTemperatura();
		
	}

	
	

}
