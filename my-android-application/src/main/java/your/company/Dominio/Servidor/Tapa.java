package your.company.Dominio.Servidor;

public class Tapa {

	private int idTapa;
	private int idBar;
	private String descripcion;

	public int getIdTapa() {
		return this.idTapa;
	}

	public int getIdBar() {
		return this.idBar;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param id
	 */
	public void setIdTapa(int id) {
		this.idTapa = id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setIdBar(int id) {
		this.idBar = id;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}