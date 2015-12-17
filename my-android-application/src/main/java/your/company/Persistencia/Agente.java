package your.company.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agente {

    private static String url = "agenda.db";    //debera ser otra
    private static Connection connect;
    private static Agente agente = null;

    public Agente(Agente agente) {
        this.agente = agente;
    }

	public void connect() {
		// TODO - implement Agente.connect
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect!=null) {
                System.out.println("Conectado");
            }
        }catch (Exception ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
	}

	public void disconnect() {
		// TODO - implement Agente.disconnect
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	/**
	 * 
	 * @param SQL
	 */
	public int update(String SQL) {
		// TODO - implement Agente.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public int delete(String SQL) {
		// TODO - implement Agente.delete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public int insert(String SQL) {
		// TODO - implement Agente.insert
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public ArrayList select(String SQL) {
		// TODO - implement Agente.Select
		throw new UnsupportedOperationException();
	}
}