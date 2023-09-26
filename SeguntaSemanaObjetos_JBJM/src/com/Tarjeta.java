package com;

public class Tarjeta {
	
	private  String Entidad_Emisora;
	private int Numero;
	private String Titular;
	
	public Tarjeta () {}

	public Tarjeta(String entidad_Emisora, int numero, String titular) {
		super();
		Entidad_Emisora = entidad_Emisora;
		Numero = numero;
		Titular = titular;
	}

	public String getEntidad_Emisora() {
		return Entidad_Emisora;
	}

	public void setEntidad_Emisora(String entidad_Emisora) {
		Entidad_Emisora = entidad_Emisora;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	@Override
	public String toString() {
		return "Tarjeta [\n Entidad_Emisora=" + Entidad_Emisora + ",\n  Numero=" + Numero + ", \n Titular=" + Titular + "]";
	}
	
	
	

}
