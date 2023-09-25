package com;

public class Supervisor {
	
	private String nombre;
	private  int numEmpl;
	private String funciones;
	
	
	public Supervisor () {
		
	}


	public Supervisor(String nombre, int numEmpl, String funciones) {
		super();
		this.nombre = nombre;
		this.numEmpl = numEmpl;
		this.funciones = funciones;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumEmpl() {
		return numEmpl;
	}


	public void setNumEmpl(int numEmpl) {
		this.numEmpl = numEmpl;
	}


	public String getFunciones() {
		return funciones;
	}


	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}


	@Override
	public String toString() {
		return " Supervisor nombre= " + nombre + ", numEmpl= " + numEmpl + ", funciones= " + funciones + " ";
	}
	
	
	

}
