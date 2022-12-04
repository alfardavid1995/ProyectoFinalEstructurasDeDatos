package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Devolucion;


public class NodoListaDobleEnlazadaDevolucion {

    private Devolucion dato;
    private NodoListaDobleEnlazadaDevolucion next;
    private NodoListaDobleEnlazadaDevolucion back;

    public NodoListaDobleEnlazadaDevolucion(Devolucion dato) {
        this.dato = dato;
    }

    

    public Devolucion getDato() {
        return dato;
    }

    public void setDato(Devolucion dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaDevolucion getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaDevolucion next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaDevolucion getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaDevolucion back) {
        this.back = back;
    }

   

    @Override
    public String toString() {
        return dato.toString();
    }

    
}
