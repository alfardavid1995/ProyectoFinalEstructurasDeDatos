package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class NodoListaDobleEnlazadaAlquileresConsultar {
    private SolicitudDeAlquiler dato;
    private NodoListaDobleEnlazadaAlquileresConsultar next;
    private NodoListaDobleEnlazadaAlquileresConsultar back;
    
    
    public NodoListaDobleEnlazadaAlquileresConsultar(SolicitudDeAlquiler dato){
        this.dato=dato;
    }

    public SolicitudDeAlquiler getDato() {
        return dato;
    }

    public void setDato(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaAlquileresConsultar getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaAlquileresConsultar next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaAlquileresConsultar getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaAlquileresConsultar back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return  dato.toString() ;
    }
    
    public String toString2() {
        return  dato.toString2() ;
    }
}
