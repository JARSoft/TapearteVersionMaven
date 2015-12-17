package your.company.Dominio.Cliente;

public class Usuario {

	private String usuario;
	private String password;
	private String email;

	public Usuario(String usuario, String password, String email){
		this.usuario=usuario;
		this.password=password;
		this.email=email;
	}

    public Usuario(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }

	public String getUsuario() {
		return this.usuario;
	}

	public String getPassword() {
		return this.password;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}