package com;

public class Principal {

	public static void main(String[] args) {

	//Si yo quiero crear un objeto de la clase Calculadora
	//no voy a poder realizarlo porque Calculadora es 
	//una clase abstracta
		
	//Las clases abstractas no pueden ser instanciadas
	//Calculadora casio = new Calculadora();
		
	//Pero si puedo crear Instancias u Objetos 
	//de la clase que hereda de Calculadora
	//Puedo crear instancias de la clase Cientifica
		
    Cientifica calculadora1 = new Cientifica();
    calculadora1.setMarca("Casio");
    calculadora1.setModelo("350MS");
      
    System.out.println(calculadora1);
    
    //Probar el m�todo o acci�n sumar
    System.out.println("La sumas es: " + (calculadora1.sumar(10, 5)));
    
    //Pruebe el m�todo o acci�n restar
    //System.out.println(calculadora1.restar(10,5));
    calculadora1.restar(10, 5);
    
    calculadora1.multiplicar(10, 5);
    System.out.println("La multiplicaci�n es: " + (calculadora1.multiplicar(10, 5)));
   
    calculadora1.dividir(10, 5);
    
    calculadora1.tomarTemperatura();
    

	}

}
