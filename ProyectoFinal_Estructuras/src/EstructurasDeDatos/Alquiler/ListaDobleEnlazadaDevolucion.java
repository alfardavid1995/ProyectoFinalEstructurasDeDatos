package EstructurasDeDatos.Alquiler;

import ObjetosdelProyecto.Objetos.Devolucion;

public class ListaDobleEnlazadaDevolucion {

    private NodoListaDobleEnlazadaDevolucion cabeza;
    private NodoListaDobleEnlazadaDevolucion ultimo;
    private int largo;

    public ListaDobleEnlazadaDevolucion() {
        this.cabeza = cabeza;
        this.ultimo = ultimo;
        this.largo = largo;
    }

    public int tamanio() {
        return this.largo;
    }

    public void limpiarLista() {
        cabeza = null;
        ultimo = null;
    }

    public boolean Vacia() {
        return cabeza == null;
    }

   public void agregarDevolucion(Devolucion devolucion) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaDevolucion(devolucion);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else {
             //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaDevolucion aux = new
            NodoListaDobleEnlazadaDevolucion(devolucion);
            //ultimo setnext aux
            ultimo.setNext(aux);
            //aux setback ultimo
            aux.setBack(ultimo);
            //ultimo es aux
            ultimo = aux;
            //ultimo set next cabeza
            ultimo.setNext(cabeza);
            //cabeza set back ultimo
            cabeza.setBack(ultimo);
           
        }
         this.largo++;

    }


    @Override
    public String toString() {
        NodoListaDobleEnlazadaDevolucion aux = cabeza;

        String s = "\n";
        if (aux != null) {
//            s += "back: " + aux.getBack() + ",\n";
            s += aux.toString() + ",\n ";
//            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

//                s += "back: " + aux.getBack() + ",\n";
                s += aux.toString() + ",\n ";
//                s += "Next: " + aux.getNext() + ",\n";
                s += "--------------------------\n";
                aux = aux.getNext();
            }
        } else {
            s += "No hay  vehiculos con las especificaciones dadas";
        }
        return s;
    }

    public String toString2() {
        NodoListaDobleEnlazadaDevolucion aux = cabeza;

        String s = "\n";
        if (aux != null) {

            s += "" + aux + "\n ";

            s += "------------------------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

                s += "" + aux.toString() + ",\n ";

                s += "------------------------------------------\n";
                aux = aux.getNext();
            }
        }
        return s;
    }

    public String toStringcopia() {
        NodoListaDobleEnlazadaDevolucion aux = cabeza;
        String s = "Lista: ";
        if (aux != null) {
            s += aux + ", ";
            aux = aux.getNext();

            while (aux != cabeza) {
                s += aux + ", ";
                aux = aux.getNext();

            }

        } else {
            s += "vacia";

        }

        return s;
    }

}
