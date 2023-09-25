package com;

public class CalculadoraCientifica extends Calculadora implements I_Termometro {
	public CalculadoraCientifica(String marca, String color, String modelo) {
        super(marca, color, modelo);
    }

    // Métodos adicionales para operaciones científicas
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }
  //Aqui implementamos el metodo de la interface ITermometro
  	@Override
  	public void tomarTemperatura() {
  		System.out.println("La temperatura ambiente es 30°C");
  		//¿De donde adquieren o toman comportamientos una clase?
  		//De 3 lugares
  		//1. de metodos propios
  		//2. de otras clases por herencia, incluyendo clases abstractas
  		//3.DE interfaces
  	}
}
