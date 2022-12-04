package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class NodoListaDobleEnlazadaTopVehiculos {

    private SolicitudDeAlquiler dato;
    private NodoListaDobleEnlazadaTopVehiculos next;
    private NodoListaDobleEnlazadaTopVehiculos back;

    public NodoListaDobleEnlazadaTopVehiculos(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    

    public SolicitudDeAlquiler getDato() {
        return dato;
    }

    public void setDato(SolicitudDeAlquiler dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaTopVehiculos getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaTopVehiculos next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaTopVehiculos getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaTopVehiculos back) {
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
