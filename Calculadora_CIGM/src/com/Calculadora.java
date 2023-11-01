package com;

public class Calculadora {
	
	    private String marca;
	    private String color;
	    private String modelo;

	    public Calculadora(String marca, String color, String modelo) {
	        this.marca = marca;
	        this.color = color;
	        this.modelo = modelo;
	    }

	    // Getters y Setters
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    @Override
	    public String toString() {
	        return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	    }

	    // Métodos de operación
	    public double sumar(double a, double b) {
	        return a + b;
	    }
	    
	    // public abstract int sumar (int a, int b);

	    public double restar(double a, double b) {
	        return a - b;
	    }
	    // public abstract void restar (int a, int b);

	    public double multiplicar(double a, double b) {
	        return a * b;
	    }
	    // public abstract double multiplicar (int a, int b);

	    public double dividir(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: División por cero.");
	            return 0;
	        }
	        return a / b;
	    }}
