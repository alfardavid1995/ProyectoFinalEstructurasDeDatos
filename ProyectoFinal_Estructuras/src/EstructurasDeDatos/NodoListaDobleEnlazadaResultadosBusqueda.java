package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;



public class NodoListaDobleEnlazadaResultadosBusqueda {
    private Vehiculo dato;
    private NodoListaDobleEnlazadaResultadosBusqueda next;
    private NodoListaDobleEnlazadaResultadosBusqueda back;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoListaDobleEnlazadaResultadosBusqueda(Vehiculo dato){
        this.dato=dato;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaResultadosBusqueda getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaResultadosBusqueda next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaResultadosBusqueda getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaResultadosBusqueda back) {
        this.back = back;
    }
}
