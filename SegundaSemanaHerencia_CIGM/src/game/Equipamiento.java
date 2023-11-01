package game;

import java.util.Arrays;

public class Equipamiento extends Jugador {
private String[] equipo;
    
    public Equipamiento(String nombre, int nivel, String[] equipo) {
        super(nombre, nivel);
        this.equipo = equipo;
    }

	public String[] getEquipo() {
		return equipo;
	}

	public void setEquipo(String[] equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Equipamiento [equipo=" + Arrays.toString(equipo) + "]";
	}
    
    
}
