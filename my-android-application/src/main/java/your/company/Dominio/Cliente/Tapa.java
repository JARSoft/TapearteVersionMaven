package your.company.Dominio.Cliente;

public class Tapa {

	private String nombreTapa;
	private int idTapa;
	private int idBar;
	private String descripcion;
	private float overall;
	private int codigo;

	public Tapa(String nombreTapa, int idTapa, int idBar, String descripcion, float overall, int codigo) {
		this.nombreTapa = nombreTapa;
		this.idTapa = idTapa;
		this.idBar = idBar;
		this.descripcion = descripcion;
		this.overall = overall;
		this.codigo = codigo;
	}

	public int getIdTapa() {
		return this.idTapa;
	}

	public int getIdBar() {
		return this.idBar;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public float getOverall() {
		return this.overall;
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

	public String getNombreTapa() {
		return nombreTapa;
	}

	public void setNombreTapa(String nombreTapa) {
		this.nombreTapa = nombreTapa;
	}

	public void setOverall(float overall) {
		this.overall = overall;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}