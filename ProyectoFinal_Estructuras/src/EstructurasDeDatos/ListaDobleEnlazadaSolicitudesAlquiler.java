package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class ListaDobleEnlazadaSolicitudesAlquiler {

    private NodoListaDobleEnlazadaSolicitudesAlquiler cabeza;
    private NodoListaDobleEnlazadaSolicitudesAlquiler ultimo;
    private int largo;

    //si funciona
    public void agregarSolicitud(SolicitudDeAlquiler solicitud) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaSolicitudesAlquiler(solicitud);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else {

            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaSolicitudesAlquiler aux = new NodoListaDobleEnlazadaSolicitudesAlquiler(solicitud);
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

    public SolicitudDeAlquiler traerSoli(int idSoli) {
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        SolicitudDeAlquiler soli = new SolicitudDeAlquiler();
        boolean exist = false;
        int cont =0;
        while (!exist && cont != tamanio()) {
            if (aux.getDato().getIdSolicitud() == idSoli) {
                soli = aux.getDato();
                exist = true;
            } else {
                if (aux.getNext() == ultimo) {
                    if (aux.getNext().getDato().getIdSolicitud() == idSoli) {
                        soli = aux.getDato();
                        exist = true;
                    }
                }
                aux.getNext();
                cont+=1;
            }
        }
        return soli;
    }

   
  
  
    
//
//    public void eliminarDeLaLista(String placa) {
//        if (cabeza != null) {
//            if (cabeza.getDato() == ultimo.getDato()) {
//                //si unicamente hay un vehiculo en la lista
//                cabeza = null;
//                ultimo = null;
//
//            } else {
//                if (cabeza.getDato().getNumPlacadeVehiculo().equals(placa)) {
//                    // si hay mas de 1 pero se elimina el primero
//                    cabeza = cabeza.getNext();
//                    cabeza.setBack(ultimo);
//                    ultimo.setNext(cabeza);
//
//                } else if (ultimo.getDato().getNumPlacadeVehiculo().equals(placa)) {
//                    //si hay mas de 1 pero se elimina el ultimo
//
//                    ultimo = ultimo.getBack();
//                    ultimo.setNext(cabeza);
//                    ultimo.setBack(cabeza);
//
//                } else {
//
//                    NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
//                    while (aux.getNext() != cabeza && !aux.getNext().getDato().getNumPlacadeVehiculo().equals(placa)) {
//                        aux = aux.getNext();
//                    }
//                    if (aux.getNext().getDato().getNumPlacadeVehiculo().equals(placa)) {
//                        aux.setNext(aux.getNext().getNext());
//                        aux.getNext().setBack(aux);
//                    }
//
//                }
//
//            }
//            this.largo--;
//        }
//
//    }
//
    @Override
    public String toString() {
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;

        String s = "\n";
        if (aux != null) {
//            s += "back: " + aux.getBack() + ",\n";
            s += aux + ",\n ";
//            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

//                s += "back: " + aux.getBack() + ",\n";
                s += aux + ",\n ";
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
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;

        String s = "\n";
        if (aux != null) {
//            s += "back: " + aux.getBack() + ",\n";
            s += "Tu busqueda: " + aux + "\n ";
//            s += "Next: " + aux.getNext() + ",\n";
            s += "------------------------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

//                s += "back: " + aux.getBack() + ",\n";
                s += "Tu busqueda: " + aux.toString() + ",\n ";
//                s += "Next: " + aux.getNext() + ",\n";
                s += "------------------------------------------\n";
                aux = aux.getNext();
            }
        }
        return s;
    }

    public String toStringcopia() {
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
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
