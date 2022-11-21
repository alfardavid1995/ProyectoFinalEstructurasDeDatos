package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;



public class NodoListaDobleEnlazadaFiltro {
    private Vehiculo dato;
    private NodoListaDobleEnlazadaFiltro next;
    private NodoListaDobleEnlazadaFiltro back;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoListaDobleEnlazadaFiltro(Vehiculo dato){
        this.dato=dato;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaFiltro getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaFiltro next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaFiltro getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaFiltro back) {
        this.back = back;
    }
}
