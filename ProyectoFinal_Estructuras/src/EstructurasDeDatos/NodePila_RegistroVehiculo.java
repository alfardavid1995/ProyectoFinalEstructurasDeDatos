
package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;

public class NodePila_RegistroVehiculo {
    private Vehiculo vehiculoNodo;
    private NodePila_RegistroVehiculo siguiente;
    
    //constructor para inicializar

    public NodePila_RegistroVehiculo() {
        this.vehiculoNodo = null;
        this.siguiente = null;
    }

    public Vehiculo getVehiculoNodo() {
        return vehiculoNodo;
    }

    public void setVehiculoNodo(Vehiculo vehiculoNodo) {
        this.vehiculoNodo = vehiculoNodo;
    }

    public NodePila_RegistroVehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodePila_RegistroVehiculo siguiente) {
        this.siguiente = siguiente;
    }

   
}
