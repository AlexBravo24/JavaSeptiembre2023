package Biblioteca;

import java.util.Arrays;

public class Encuadernaci�n extends Libro {
	private String []encuadernacion;

	public Encuadernaci�n(String[] encuadernacion) {
		super();
		this.encuadernacion = encuadernacion;
	}

	public Encuadernaci�n(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Encuadernaci�n(String string) {
		// TODO Auto-generated constructor stub
	}

	public String[] getEncuadernacion() {
		return encuadernacion;
	}

	public void setEncuadernacion(String[] encuadernacion) {
		this.encuadernacion = encuadernacion;
	}

	@Override
	public String toString() {
		return "Encuadernaci�n [encuadernacion=" + Arrays.toString(encuadernacion) + "]";
	}
	
	
	
	
	
	
	
	


	
	
	
	
	

}
