package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cientifica cientifica1= new Cientifica();
		//cientifica1
		
		
		//Si yo quqiero crear un objeto de la clase calculadora 
		//no voy a poder realizarlo porque Calculadora e un 
		//clase abstracta 
		
		//Las clases abstractas no pueden ser instanciadas 
		//Calculadora casio = new Calculadora ();
		
		
		//Pero si puedo crear instancias u objetos de la clase 
		
		cientifica1.Suma(3, 6);
		
		cientifica1.tomarTemperatura();
		
				

	}

}
