package Biblioteca;

import java.util.Arrays;

public class Encuadernación extends Libro {
	private String []encuadernacion;

	public Encuadernación(String[] encuadernacion) {
		super();
		this.encuadernacion = encuadernacion;
	}

	public Encuadernación(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Encuadernación(String string) {
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
		return "Encuadernación [encuadernacion=" + Arrays.toString(encuadernacion) + "]";
	}
	
	
	
	
	
	
	
	


	
	
	
	
	

}
