package your.company.Dominio.Cliente;

public class Administrador {

	private String user;
	private String password;

	public String getUser() {
		return this.user;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}