
package ObjetosdelProyecto.Objetos;
import EstructurasDeDatos.*;


public class SolicitudDeAlquiler {
    private String estadoDeSolicitud;//Registrada, procesada, finalizada, rechazada
    private int idSolicitud;
    private static int IDSolicitudActual = 1;
    private int cantidadDeDiasSolicitud;
    private Cliente usuarioSolicitud;
    private Vehiculo vehiculoSoli;

    public SolicitudDeAlquiler() {
    }

    public SolicitudDeAlquiler(String estadoDeSolicitud, int cantidadDeDiasSolicitud, Cliente usuarioSolicitud, Vehiculo vehiculoSoli) {
        this.estadoDeSolicitud = estadoDeSolicitud;
        this.cantidadDeDiasSolicitud = cantidadDeDiasSolicitud;
        this.usuarioSolicitud = usuarioSolicitud;
        this.vehiculoSoli = vehiculoSoli;
        this.idSolicitud = IDSolicitudActual;
        IDSolicitudActual++;
    }

    public String getEstadoDeSolicitud() {
        return estadoDeSolicitud;
    }

    public void setEstadoDeSolicitud(String estadoDeSolicitud) {
        this.estadoDeSolicitud = estadoDeSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getCantidadDeDiasSolicitud() {
        return cantidadDeDiasSolicitud;
    }

    public void setCantidadDeDiasSolicitud(int cantidadDeDiasSolicitud) {
        this.cantidadDeDiasSolicitud = cantidadDeDiasSolicitud;
    }

    public Cliente getUsuarioSolicitud() {
        return usuarioSolicitud;
    }

    public void setUsuarioSolicitud(Cliente usuarioSolicitud) {
        this.usuarioSolicitud = usuarioSolicitud;
    }

    public Vehiculo getVehiculoSoli() {
        return vehiculoSoli;
    }

    public void setVehiculoSoli(Vehiculo vehiculoSoli) {
        this.vehiculoSoli = vehiculoSoli;
    }

   
 
    
   

    @Override
    public String toString() {
        return "\n-----------------------Solicitud------------------ " + "\n"
                + "Id Solicitud: " + idSolicitud + "\t"
                + "Cantidad de dias: " + cantidadDeDiasSolicitud + "\n"
                +  usuarioSolicitud.listar2() + "\n"
                +  vehiculoSoli.listar3();
    }

    
    
    
    
    
}
