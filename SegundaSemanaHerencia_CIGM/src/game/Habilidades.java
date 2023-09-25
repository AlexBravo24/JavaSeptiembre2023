package game;

import java.util.Arrays;

public class Habilidades extends Jugador{
private String[] habilidades;
    
    public Habilidades(String nombre, int nivel, String[] habilidades) {
        super(nombre, nivel);
        this.habilidades = habilidades;
        
    }

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		return "Habilidades [habilidades=" + Arrays.toString(habilidades) + "]";
	}
    
    
}
