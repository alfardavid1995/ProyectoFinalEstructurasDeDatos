package EstructurasDeDatos.Vehiculo;

import EstructurasDeDatos.Vehiculo.NodoListaDobleEnlazadaTopVehiculos;
import ObjetosdelProyecto.Objetos.Vehiculo;

public class ListaDobleEnlazadaTopVehiculos {

    private NodoListaDobleEnlazadaTopVehiculos cabeza;
    private NodoListaDobleEnlazadaTopVehiculos ultimo;
    private int largo;

    public ListaDobleEnlazadaTopVehiculos() {
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

    public void agregarVehiculoTop(Vehiculo vehiculo) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaTopVehiculos(vehiculo);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else if (vehiculo.getCantidadDeVecesAlquilado() > cabeza.getDato().getCantidadDeVecesAlquilado()) {//es caso de que el numero sea a la izquierda de la cabeza

            //creamos el nodo que se llame aux
            NodoListaDobleEnlazadaTopVehiculos aux = new NodoListaDobleEnlazadaTopVehiculos(vehiculo);
            //le ponemos que el next de aux sea la cabaza
            aux.setNext(cabeza);
            //le especificamos que el back de aux que sea el ultimo
            aux.setBack(ultimo);
            //tenmos que hacer que cabeza back apunte a aux 
            cabeza.setBack(aux);
            //tenemos que hacer que el ultimo next apunte a aux
            ultimo.setNext(aux);
            //hacemos que aux sea nueva cabeza
            cabeza = aux;
        }  else if (vehiculo.getCantidadDeVecesAlquilado() <= ultimo.getDato().getCantidadDeVecesAlquilado()) {

            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaTopVehiculos aux = new NodoListaDobleEnlazadaTopVehiculos(vehiculo);
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

        } else {//en caso de en medio

//            en caso de insertar en medio
            NodoListaDobleEnlazadaTopVehiculos nuevoNodo = new NodoListaDobleEnlazadaTopVehiculos(vehiculo);
//            nodo aux es cabeza
            NodoListaDobleEnlazadaTopVehiculos aux = cabeza;
            while (aux.getDato().getCantidadDeVecesAlquilado() >= nuevoNodo.getDato().getCantidadDeVecesAlquilado()) {
                aux = aux.getNext();
            }
            //usamos el back de aux como referencia
            NodoListaDobleEnlazadaTopVehiculos auxAnterior = aux.getBack();
            //unimos el next de auxAterior de referencia con el nuevo nodo
            auxAnterior.setNext(nuevoNodo);
            //unimos el back de nuevoNodo con el auxAnterior de referencia
            nuevoNodo.setBack(auxAnterior);
            //unimos el next de nuevoNodo con el aux 
            nuevoNodo.setNext(aux);
            //unimos el back de aux con el nuevoNodo
            aux.setBack(nuevoNodo);
        }
        this.largo++;
    }

   
   @Override
    public String toString() {
        NodoListaDobleEnlazadaTopVehiculos aux = cabeza;

        String s = "\n";
        if (aux != null) {
//            s += "back: " + aux.getBack() + ",\n";
            s += aux.toString2() + ",\n ";
//            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            int contador = 0 ;
            while (aux != cabeza && contador != 4) {
                
//                s += "back: " + aux.getBack() + ",\n";
                s += aux.toString2() + ",\n ";
//                s += "Next: " + aux.getNext() + ",\n";
                s += "--------------------------\n";
                aux = aux.getNext();
                contador +=1;
            }
        } else {
            s += "No hay  vehiculos ";
        }
        return s;
    }

    public String toString2() {
        NodoListaDobleEnlazadaTopVehiculos aux = cabeza;

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
        NodoListaDobleEnlazadaTopVehiculos aux = cabeza;
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
