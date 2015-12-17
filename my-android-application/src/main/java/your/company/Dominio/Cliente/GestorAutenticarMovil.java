package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

public class GestorAutenticarMovil {

	private static int STATIC_LOGIN_PARAMETER = 0;
	/**
	 * 
	 * @param u
	 */
	public int autenticar(Usuario u) {
		return (Integer) SocketMovil.realizarPeticion(u, STATIC_LOGIN_PARAMETER);
	}

}