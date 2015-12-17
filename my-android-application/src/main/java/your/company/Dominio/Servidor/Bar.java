package your.company.Dominio.Servidor;

import java.util.ArrayList;

public class Bar {

	private int idBar;
	private double x;
	private double y;
	private ArrayList<Tapa> tapas;
	private String descripcion;

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
		// TODO - implement Bar.getTapas
		throw new UnsupportedOperationException();
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

}