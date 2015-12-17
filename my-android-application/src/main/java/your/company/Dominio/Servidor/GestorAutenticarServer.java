package your.company.Dominio.Servidor;

public class GestorAutenticarServer {

	/**
	 * 
	 * @param u
	 */
	public boolean autenticar(Usuario u) {
        UsuarioDAO udao = new UsuarioDAO();
		return udao.autenticar(u);
	}

//	/**
//	 *
//	 * @param a
//	 */
//	public boolean autenticar(Administrador a) {
//		// TODO - implement GestorAutenticarServer.autenticar
//		throw new UnsupportedOperationException();
//	}

}