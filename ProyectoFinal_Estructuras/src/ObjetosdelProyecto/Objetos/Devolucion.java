
package ObjetosdelProyecto.Objetos;

public class Devolucion {
    private SolicitudDeAlquiler soli;
    private String condicionesVehiculo;

    public Devolucion() {
    }

    public Devolucion(SolicitudDeAlquiler soli, String condicionesVehiculo) {
        this.soli = soli;
      
        this.condicionesVehiculo = condicionesVehiculo;
    }

    public SolicitudDeAlquiler getSoli() {
        return soli;
    }

    public void setSoli(SolicitudDeAlquiler soli) {
        this.soli = soli;
    }

    public String getCondicionesVehiculo() {
        return condicionesVehiculo;
    }

    public void setCondicionesVehiculo(String condicionesVehiculo) {
        this.condicionesVehiculo = condicionesVehiculo;
    }

    @Override
    public String toString() {
        return "\n-------------------------Devolucion ------------------------- " + "\n"
                + soli.toString() + "\n"
                + "Condiciones del Vehiculo: " + condicionesVehiculo;
    }
    
    
}
