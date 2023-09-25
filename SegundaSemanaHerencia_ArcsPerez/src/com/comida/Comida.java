package com.comida;

public class Comida {
	private String tipo_;
	private String ingrediente_;
	private double precio_;

	public Comida() {

	}

	public Comida(String tipo_, String ingrediente_, double precio_) {
		super();
		this.tipo_ = tipo_;
		this.ingrediente_ = ingrediente_;
		this.precio_ = precio_;
	}

	public String getTipo_() {
		return tipo_;
	}

	public void setTipo_(String tipo_) {
		this.tipo_ = tipo_;
	}

	public String getIngrediente_() {
		return ingrediente_;
	}

	public void setIngrediente_(String ingrediente_) {
		this.ingrediente_ = ingrediente_;
	}

	public double getPrecio_() {
		return precio_;
	}

	public void setPrecio_(double precio_) {
		this.precio_ = precio_;
	}

	@Override
	public String toString() {
		return "Comida [tipo =" + tipo_ + ", ingrediente =" + ingrediente_ + ", precio =" + precio_ + "]";
	}

}
