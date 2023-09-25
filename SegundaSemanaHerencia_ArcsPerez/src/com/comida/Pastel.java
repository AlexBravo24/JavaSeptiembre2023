package com.comida;

public class Pastel extends Comida {
	private String receta_;
	private int nivel;
	private String tipo_masa;// Agua o aceite

	public Pastel() {

	}

	public Pastel(String tipo_, String ingrediente_, double precio_, String receta_, int nivel, String tipo_masa,
			String nombre_) {
		super(tipo_, ingrediente_, precio_);
		this.receta_ = receta_;
		this.nivel = nivel;
		this.tipo_masa = tipo_masa;
	}

	public String getReceta_() {
		return receta_;
	}

	public void setReceta_(String receta_) {
		this.receta_ = receta_;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getTipo_masa() {
		return tipo_masa;
	}

	public void setTipo_masa(String tipo_masa) {
		this.tipo_masa = tipo_masa;
	}

	@Override
	public String toString() {
		return "Pastel [receta_=" + receta_ + ", nivel=" + nivel + ", tipo_masa=" + tipo_masa + ", toString()="
				+ super.toString() + "]";
	}

}
