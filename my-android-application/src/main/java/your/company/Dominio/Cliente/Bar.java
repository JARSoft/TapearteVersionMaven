package your.company.Dominio.Cliente;

import java.util.ArrayList;

public class Bar {

	private String nombreBar;
	private int idBar;
	private double x;
	private double y;
	private ArrayList<Tapa> tapas;
	private String descripcion;

    public Bar(String nombreBar, int idBar, double x, double y, ArrayList<Tapa> tapas, String descripcion) {
        this.nombreBar = nombreBar;
        this.idBar = idBar;
        this.x = x;
        this.y = y;
        this.tapas = tapas;
        this.descripcion = descripcion;
    }

    public int getIdBar() {
		return this.idBar;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public ArrayList<Tapa> getTapas() {
		return this.tapas;
	}

	public String getDescripcion() {
		return this.descripcion;
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
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * 
	 * @param y
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * 
	 * @param t
	 */
	public void setTapas(Tapa t) {
		// TODO - implement Bar.setTapas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreBar() {
		return nombreBar;
	}

	public void setNombreBar(String nombreBar) {
		this.nombreBar = nombreBar;
	}
}