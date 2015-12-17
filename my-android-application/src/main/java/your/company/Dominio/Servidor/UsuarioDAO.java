package your.company.Dominio.Servidor;


import your.company.Persistencia.Agente;

public class UsuarioDAO {

	private static String sql = "";
	private Agente agente;

	/**
	 * 
	 * @param u
	 */
	public boolean autenticar(Usuario u) {
		// TODO - implement UsuarioDAO.autenticar
		sql = "SELECT email FROM USUARIOS WHERE email = " + u.getEmail() + ";";
		agente.select(sql);
		return true;
	}

	/**
	 * 
	 * @param u
	 */
	public boolean registrar(Usuario u) {
		// TODO - implement UsuarioDAO.registrar
		throw new UnsupportedOperationException();
	}

}