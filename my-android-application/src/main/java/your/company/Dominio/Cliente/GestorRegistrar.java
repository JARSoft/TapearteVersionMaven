package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

public class GestorRegistrar {

	/**
	 * 
	 * @param u
	 */
	private static int STATIC_USER_REGISTER = 6;

	public boolean registrar(Usuario u) {
		return (Boolean) SocketMovil.realizarPeticion(u, STATIC_USER_REGISTER);
	}

}