package com;

public class Especie {
	
	private String Grupo;
	private double Especies_en_Mexico;
	private double Especies_en_Mundo;
	
	public Especie() {}

	public Especie(String grupo, double especies_en_Mexico, double especies_en_Mundo) {
		super();
		Grupo = grupo;
		Especies_en_Mexico = especies_en_Mexico;
		Especies_en_Mundo = especies_en_Mundo;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public double getEspecies_en_Mexico() {
		return Especies_en_Mexico;
	}

	public void setEspecies_en_Mexico(double especies_en_Mexico) {
		Especies_en_Mexico = especies_en_Mexico;
	}

	public double getEspecies_en_Mundo() {
		return Especies_en_Mundo;
	}

	public void setEspecies_en_Mundo(double especies_en_Mundo) {
		Especies_en_Mundo = especies_en_Mundo;
	}

	@Override
	public String toString() {
		return "Especie [Grupo=" + Grupo + ", Especies_en_Mexico=" + Especies_en_Mexico + ", Especies_en_Mundo="
				+ Especies_en_Mundo + "]";
	}
	
	
	

}
