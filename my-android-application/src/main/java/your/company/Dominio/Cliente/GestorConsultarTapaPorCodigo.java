package your.company.Dominio.Cliente;


import your.company.Comunicacion.SocketMovil;

/**
 * Created by user on 03/12/2015.
 */
public class GestorConsultarTapaPorCodigo {

    /**
     *
     * @param codigo
     */
    private static int STATIC_TAPAS_CODE_CHECKER = 41;

    public Tapa consultarTapa(int codigo) {
        return (Tapa) SocketMovil.realizarPeticion(codigo, STATIC_TAPAS_CODE_CHECKER);
    }

}
