package game;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estadisticas jugador1 = new Estadisticas("Jugador 1", 10, 100, 50);
        String[] habilidadesJugador2 = {"Ataque r�pido", "Curaci�n"};
        Habilidades jugador2 = new Habilidades("Jugador 2", 12, habilidadesJugador2);
        String[] equipoJugador3 = {"Espada m�gica", "Armadura de acero"};
        Equipamiento jugador3 = new Equipamiento("Jugador 3", 8, equipoJugador3);
        
       
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(jugador3);
       
	}

}
