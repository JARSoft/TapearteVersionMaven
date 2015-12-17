package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

public class GestorEliminarTapa {
    private static int STATIC_TAPA_REMOVER=5;

    /**
     *
     * @param t
     */
    public boolean eliminarTapa(Tapa t) {
        // TODO - implement GestorAnadirTapa.anadirTapa
        return (Boolean) SocketMovil.realizarPeticion(t, STATIC_TAPA_REMOVER);
    }

}