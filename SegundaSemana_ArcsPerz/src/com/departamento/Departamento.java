package com.departamento;

public class Departamento {
	private int area_string;
	private int puertas;
	private int codigo_postal;
	private String addres_string;
	private String propietario_string;

	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public Departamento(int area_string, int puertas, int codigo_postal, String addres_string,
			String propietario_string) {
		super();
		this.area_string = area_string;
		this.puertas = puertas;
		this.codigo_postal = codigo_postal;
		this.addres_string = addres_string;
		this.propietario_string = propietario_string;
	}

	public int getArea_string() {
		return area_string;
	}

	public void setArea_string(int area_string) {
		this.area_string = area_string;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getAddres_string() {
		return addres_string;
	}

	public void setAddres_string(String addres_string) {
		this.addres_string = addres_string;
	}

	public String getPropietario_string() {
		return propietario_string;
	}

	public void setPropietario_string(String propietario_string) {
		this.propietario_string = propietario_string;
	}

	@Override
	public String toString() {
		return "Informacion del Departamento [área= " + area_string + " m2 con " + puertas+" puertas" + ", codigo_postal " + codigo_postal
				+ " con dirección " + addres_string + " y nombre del propietario de " + propietario_string + "]";
	}

}
