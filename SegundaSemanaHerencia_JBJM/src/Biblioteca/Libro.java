package Biblioteca;

public class Libro {
	private String nombre;
	private int NumEjemplares;
	private String Autor;
	
public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(String nombre, int numEjemplares, String autor, String string) {
		super();
		this.nombre = nombre;
		NumEjemplares = numEjemplares;
		Autor = autor;
	}



	



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumEjemplares() {
		return NumEjemplares;
	}



	public void setNumEjemplares(int numEjemplares) {
		NumEjemplares = numEjemplares;
	}



	public String getAutor() {
		return Autor;
	}



	public void setAutor(String autor) {
		Autor = autor;
	}



	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", NumEjemplares=" + NumEjemplares + ", Autor=" + Autor + "]";
	}

	
}
