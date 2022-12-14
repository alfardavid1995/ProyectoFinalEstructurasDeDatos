package EstructurasDeDatos.Cliente;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;

public class ListaDobleEnlazadaAlquileres_Cliente {

    private NodoListaDobleEnlazadaAlquileres_Cliente cabeza;
    private NodoListaDobleEnlazadaAlquileres_Cliente ultimo;
    private int largo;

    public ListaDobleEnlazadaAlquileres_Cliente() {
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
    
     //si funciona
    public void agregarAlquiler(SolicitudDeAlquiler solicitud) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaAlquileres_Cliente(solicitud);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else if (solicitud.getFechaCreacion().isAfter
                                     (cabeza.getDato().getFechaCreacion())
                                     || solicitud.getHoraCreacion().isAfter
                                    (cabeza.getDato().getHoraCreacion())) {
                    //es caso de que el numero sea a la izquierda de la cabeza

            //creamos el nodo que se llame aux
            NodoListaDobleEnlazadaAlquileres_Cliente aux = new 
            NodoListaDobleEnlazadaAlquileres_Cliente(solicitud);
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
        } else if (solicitud.getFechaCreacion().isBefore
                                     (cabeza.getDato().getFechaCreacion())
                                     || solicitud.getHoraCreacion().isBefore
                                    (cabeza.getDato().getHoraCreacion())) {

            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaAlquileres_Cliente aux = new 
            NodoListaDobleEnlazadaAlquileres_Cliente(solicitud);
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
            NodoListaDobleEnlazadaAlquileres_Cliente nuevoNodo = new 
            NodoListaDobleEnlazadaAlquileres_Cliente(solicitud);
//            nodo aux es cabeza
            NodoListaDobleEnlazadaAlquileres_Cliente aux = cabeza;
            
    
            
            
            while (aux.getDato().getFechaCreacion().isBefore(nuevoNodo.getDato().getFechaCreacion())){
                aux = aux.getNext();
            }
            //usamos el back de aux como referencia
            NodoListaDobleEnlazadaAlquileres_Cliente auxAnterior = aux.getBack();
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
    

    public SolicitudDeAlquiler traerSoli(int idSoli) {
        NodoListaDobleEnlazadaAlquileres_Cliente aux = cabeza;
        SolicitudDeAlquiler soli = new SolicitudDeAlquiler();
        boolean exist = false;
        int cont = 0;
        while (!exist && cont != tamanio()) {
            if (aux.getDato().getIdSolicitud() == idSoli) {
                soli = aux.getDato();
                exist = true;
            } else {
                if (aux.getNext() == ultimo) {
                    if (aux.getNext().getDato().getIdSolicitud() == idSoli) {
                        soli = aux.getNext().getDato();
                        exist = true;
                    }
                }
                aux = aux.getNext();
                cont += 1;
            }
        }
        return soli;
    }

   
    @Override
    public String toString() {
        NodoListaDobleEnlazadaAlquileres_Cliente aux = cabeza;

        String s = "\n";
        if (aux != null) {
//            s += "back: " + aux.getBack() + ",\n";
            s += aux.toString2() + ",\n ";
//            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

//                s += "back: " + aux.getBack() + ",\n";
                s += aux.toString2() + ",\n ";
//                s += "Next: " + aux.getNext() + ",\n";
                s += "--------------------------\n";
                aux = aux.getNext();
            }
        } else {
            s += "No tiene alquileres";
        }
        return s;
    }

    public String toString2() {
        NodoListaDobleEnlazadaAlquileres_Cliente aux = cabeza;

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
        NodoListaDobleEnlazadaAlquileres_Cliente aux = cabeza;
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
