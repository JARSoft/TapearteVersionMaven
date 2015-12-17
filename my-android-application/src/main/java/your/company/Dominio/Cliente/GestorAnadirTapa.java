package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

public class GestorAnadirTapa {
    private static int STATIC_TAPA_ADDER = 2;
    /**
     *
     * @param t
     */
    public boolean anadirTapa(Tapa t) {
        // TODO - implement GestorAnadirTapa.anadirTapa
        return (Boolean)SocketMovil.realizarPeticion(t, STATIC_TAPA_ADDER);
    }

}