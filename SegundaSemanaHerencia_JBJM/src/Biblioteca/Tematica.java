package Biblioteca;

import java.util.Arrays;

public class Tematica extends Libro{
	private String []Tematica;

	public Tematica() {}

	public Tematica(String[] tematica) {
		super();
		Tematica = tematica;
	}

	public String[] getTematica() {
		return Tematica;
	}

	public void setTematica(String[] tematica) {
		Tematica = tematica;
	}

	@Override
	public String toString() {
		return "Tematica [Tematica=" + Arrays.toString(Tematica) + "]";
	}
	
	
	
	
}