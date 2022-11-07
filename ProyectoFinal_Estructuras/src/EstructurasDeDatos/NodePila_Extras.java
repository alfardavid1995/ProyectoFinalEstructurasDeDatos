
package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;


public class NodePila_Extras {
     private String extra;
    private NodePila_Extras siguiente;

    public NodePila_Extras() {
        this.extra = null;
        this.siguiente = null;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public NodePila_Extras getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodePila_Extras siguiente) {
        this.siguiente = siguiente;
    }

   
    
    
}
