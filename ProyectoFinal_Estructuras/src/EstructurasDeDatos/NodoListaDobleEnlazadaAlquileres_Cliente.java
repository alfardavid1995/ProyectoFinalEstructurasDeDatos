package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class NodoListaDobleEnlazadaAlquileres_Cliente {

    private SolicitudDeAlquiler dato;
    private NodoListaDobleEnlazadaAlquileres_Cliente next;
    private NodoListaDobleEnlazadaAlquileres_Cliente back;

    public NodoListaDobleEnlazadaAlquileres_Cliente(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    

    public SolicitudDeAlquiler getDato() {
        return dato;
    }

    public void setDato(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaAlquileres_Cliente getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaAlquileres_Cliente next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaAlquileres_Cliente getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaAlquileres_Cliente back) {
        this.back = back;
    }

   

    @Override
    public String toString() {
        return dato.toString();
    }

    public String toString2() {
        return dato.toString2();
    }
}
