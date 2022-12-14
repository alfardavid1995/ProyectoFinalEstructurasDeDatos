package EstructurasDeDatos.Alquiler;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class ListaDobleEnlazadaAlquileresConsultar {

    private NodoListaDobleEnlazadaAlquileresConsultar cabeza;
    private NodoListaDobleEnlazadaAlquileresConsultar ultimo;
    private int largo;

    //este metodo agrega una solicitud
    public void agregarSolicitud(SolicitudDeAlquiler solicitud) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaAlquileresConsultar(solicitud);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else {
            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaAlquileresConsultar aux = new 
        NodoListaDobleEnlazadaAlquileresConsultar(solicitud);
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

    public void eliminarDeLaLista(int idSoli) {
        if (cabeza != null) {
            if (cabeza.getDato() == ultimo.getDato()) {
                //si unicamente hay un vehiculo en la lista
                cabeza = null;
                ultimo = null;

            } else {
                if (cabeza.getDato().getIdSolicitud() == idSoli) {
                    // si hay mas de 1 pero se elimina el primero
                    cabeza = cabeza.getNext();
                    cabeza.setBack(ultimo);
                    ultimo.setNext(cabeza);

                } else if (ultimo.getDato().getIdSolicitud() == idSoli) {
                    //si hay mas de 1 pero se elimina el ultimo

                    ultimo = ultimo.getBack();
                    ultimo.setNext(cabeza);
                    ultimo.setBack(cabeza);

                } else {

                    NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
                    while (aux.getNext() != cabeza && aux.getNext().getDato().
                            getIdSolicitud() != idSoli) {
                        aux = aux.getNext();
                    }
                    if (aux.getNext().getDato().getIdSolicitud() == idSoli) {
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().setBack(aux);
                    }

                }

            }
            this.largo--;
        }

    }

    public boolean buscarXPlaca(String placa) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getVehiculoSoli() != null
                    && aux.getDato().getVehiculoSoli().getNumPlacadeVehiculo().
                            equals(placa)) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXPlaca(String placa) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
        while (cont != tamanioAntes) {

            if (aux.getDato().getVehiculoSoli() == null || !aux.getDato().
             getVehiculoSoli().getNumPlacadeVehiculo().equals(placa)) {
                eliminarDeLaLista(aux.getDato().getIdSolicitud());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    public boolean buscarXCedula(int cedula) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getUsuarioSolicitud().getCedula() == cedula) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXCedula(int cedula) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
        while (cont != tamanioAntes) {

            if (aux.getDato().getUsuarioSolicitud().getCedula() != cedula) {
                eliminarDeLaLista(aux.getDato().getIdSolicitud());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    public boolean buscarXEstado(String estado) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getEstadoDeSolicitud().equals(estado)) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXEstado(String estado) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
        while (cont != tamanioAntes) {

            if (!aux.getDato().getEstadoDeSolicitud().equals(estado)) {
                eliminarDeLaLista(aux.getDato().getIdSolicitud());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    @Override
    public String toString() {
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;

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
            s += "No hay  consultas de solicitudes";
        }
        return s;
    }

    public String toString2() {
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;

        String s = "\n";
        if (aux != null) {

            s += "" + aux.toString2() + "\n ";

            s += "------------------------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

                s += "" + aux.toString2() + ",\n ";

                s += "------------------------------------------\n";
                aux = aux.getNext();
            }
        }
        return s;
    }

    public String toStringcopia() {
        NodoListaDobleEnlazadaAlquileresConsultar aux = cabeza;
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
