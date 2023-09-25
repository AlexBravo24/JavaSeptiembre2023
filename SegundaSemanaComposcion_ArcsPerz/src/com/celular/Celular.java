package com.celular;


import com.laptop.Procesador;

public class Celular {
private  String marca;
private String  modelo_;
private double precio;
private Pantalla pantalla;
private Cargador cargador; 
private Camara camara;
public Celular(String marca, String modelo_, double precio, Pantalla pantalla, Cargador cargador, Camara camara) {
	super();
	this.marca = marca;
	this.modelo_ = modelo_;
	this.precio = precio;
	this.pantalla = pantalla;
	this.cargador = cargador;
	this.camara = camara;
}

public Celular() {
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo_() {
	return modelo_;
}

public void setModelo_(String modelo_) {
	this.modelo_ = modelo_;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public Pantalla getPantalla() {
	return pantalla;
}

public void setPantalla(Pantalla pantalla) {
	this.pantalla = pantalla;
}

public Cargador getCargador() {
	return cargador;
}

public void setCargador(Cargador cargador) {
	this.cargador = cargador;
}

public Camara getCamara() {
	return camara;
}

public void setCamara(Camara camara) {
	this.camara = camara;
}

@Override
public String toString() {
	return "Celular [marca=" + marca + ", modelo_=" + modelo_ + ", precio=" + precio + ", pantalla=" + pantalla
			+ ", cargador=" + cargador + ", camara=" + camara + "]";
}

}
