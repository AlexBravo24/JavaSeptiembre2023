package game;

public class Estadisticas extends Jugador {
	private int salud;
    private int mana;
    
    public Estadisticas(String nombre, int nivel, int salud, int mana) {
        super(nombre, nivel);
        this.salud = salud;
        this.mana = mana;
    }

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "Estadisticas [salud=" + salud + ", mana=" + mana + "]";
	}
    
}
