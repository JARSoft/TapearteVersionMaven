package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

import java.util.ArrayList;

public class GestorConsultarTapas {

	/**
	 * 
	 * @param b
	 */
	private static int STATIC_TAPAS_POR_BAR_CHECKER = 4;

	public ArrayList<Tapa> consultarTapas(Bar b) {
		return (ArrayList<Tapa>) SocketMovil.realizarPeticion(b, STATIC_TAPAS_POR_BAR_CHECKER);
	}
}