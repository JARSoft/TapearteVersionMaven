package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

public class GestorVotar {

	private static int STATIC_PUNTUAR_TAPA = 7;
	/**
	 * 
	 * @param t
	 * @param puntuacion
	 */
	public boolean votar(Tapa t, float puntuacion) {
		// TODO - implement GestorVotar.votar
		return (Boolean) SocketMovil.realizarPeticion(t, puntuacion, STATIC_PUNTUAR_TAPA);
	}

}