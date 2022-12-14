package EstructurasDeDatos.Cliente;

import ObjetosdelProyecto.Objetos.Cliente;

public class NodoListaDobleEnlazadaTopClientes {

    private Cliente dato;
    private NodoListaDobleEnlazadaTopClientes next;
    private NodoListaDobleEnlazadaTopClientes back;

    public NodoListaDobleEnlazadaTopClientes(Cliente dato) {
        this.dato = dato;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoListaDobleEnlazadaTopClientes getNext() {
        return next;
    }

    public void setNext(NodoListaDobleEnlazadaTopClientes next) {
        this.next = next;
    }

    public NodoListaDobleEnlazadaTopClientes getBack() {
        return back;
    }

    public void setBack(NodoListaDobleEnlazadaTopClientes back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return dato.listar4();
    }

}
