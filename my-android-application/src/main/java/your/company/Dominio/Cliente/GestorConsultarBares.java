package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

import java.util.ArrayList;

/**
 * Created by user on 02/12/2015.
 */
public class GestorConsultarBares {
    private static int STATIC_BAR_CHECKER = 4;

    public ArrayList<Bar> consultarBares() {
        // TODO - implement GestorConsultarTapas.consultarTapas
        return (ArrayList<Bar>) SocketMovil.realizarPeticion(STATIC_BAR_CHECKER);
    }
}
