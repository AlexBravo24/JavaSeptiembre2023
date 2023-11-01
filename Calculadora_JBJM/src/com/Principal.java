package com;


public class Principal {

	public static void main(String[] args) {
		
		//Si yo quiero crear un objeto de la clase Calculadora
		//No voy poder realizarlo porque calculadora es una 
		//Clase abstracta
		
		//Las clase abstractas no pueden ser instanciadas
		//Calculadora casio = new Calculadora();
		
		//Aqui puedo crear instancias u objetos de la clase 
		//que hereda de calculadora 
		//Puedo ccrear instancias de la clase cientifica 
		
		Cientifica casio = new Cientifica();
		
		//Pobrar el metodo o accion sumar()
		System.out.println(casio.sumar(5, 4));
	
		//Pruebe el metodo o accion restar()
		//System.out.println(casio.restar(190, 12));
		casio.restar(190,10);
		
		casio.multiplicar(12, 4);//48
		System.out.println(casio.multiplicar(12, 4));
		
		casio.division(15, 2);
		System.out.println(casio.division(15, 2));
		
		casio.tomarTemperatura();
	}

}
