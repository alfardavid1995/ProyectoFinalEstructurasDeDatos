package EstructurasDeDatos.Vehiculo;

import ObjetosdelProyecto.Objetos.Vehiculo;

public class NodoListaDobleEnlazadaTopVehiculos {

    private Vehiculo dato;
    private NodoListaDobleEnlazadaTopVehiculos next;
    private NodoListaDobleEnlazadaTopVehiculos back;

    public NodoListaDobleEnlazadaTopVehiculos(Vehiculo dato) {
        this.dato = dato;
    }

    

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
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
        return dato.listar5();
    }
}
