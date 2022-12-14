package EstructurasDeDatos.Alquiler;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class NodoListaDobleEnlazadaSolicitudesAlquiler {

    private SolicitudDeAlquiler dato;
    private NodoListaDobleEnlazadaSolicitudesAlquiler next;
    private NodoListaDobleEnlazadaSolicitudesAlquiler back;

    public NodoListaDobleEnlazadaSolicitudesAlquiler(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    public SolicitudDeAlquiler getDato() {
        return dato;
    }

    public void setDato(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaSolicitudesAlquiler getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaSolicitudesAlquiler next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaSolicitudesAlquiler getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaSolicitudesAlquiler back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return dato.toString();
    }

    public String toString2() {
        return dato.toString();
    }
}
