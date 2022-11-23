package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;
import javax.swing.JOptionPane;

public class ListaDobleEnlazadaResultadosBusqueda {

    private NodoListaDobleEnlazadaResultadosBusqueda cabeza;
    private NodoListaDobleEnlazadaResultadosBusqueda ultimo;
    private int largo;

    //si funciona
    public void agregarVehiculoFiltro(Vehiculo vehiculo) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaResultadosBusqueda(vehiculo);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else {

            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaResultadosBusqueda aux = new NodoListaDobleEnlazadaResultadosBusqueda(vehiculo);
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

    public void eliminarDeLaLista(String placa) {
        if (cabeza != null) {
            if (cabeza.getDato() == ultimo.getDato()) {
                //si unicamente hay un vehiculo en la lista
                cabeza = null;
                ultimo = null;

            } else {
                if (cabeza.getDato().getNumPlacadeVehiculo().equals(placa)) {
                    // si hay mas de 1 pero se elimina el primero
                    cabeza = cabeza.getNext();
                    cabeza.setBack(ultimo);
                    ultimo.setNext(cabeza);

                } else if (ultimo.getDato().getNumPlacadeVehiculo().equals(placa)) {
                    //si hay mas de 1 pero se elimina el ultimo

                    ultimo = ultimo.getBack();
                    ultimo.setNext(cabeza);
                    ultimo.setBack(cabeza);

                } else {

                    NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
                    while (aux.getNext() != cabeza && !aux.getNext().getDato().getNumPlacadeVehiculo().equals(placa)) {
                        aux = aux.getNext();
                    }
                    if (aux.getNext().getDato().getNumPlacadeVehiculo().equals(placa)) {
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().setBack(aux);
                    }

                }

            }
            this.largo--;
        }

    }

    public boolean buscarXMarca(String marca) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getMarcaDeVehiculo().equals(marca)) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXMarca(String marca) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (cont != tamanioAntes) {

            if (!aux.getDato().getMarcaDeVehiculo().equals(marca)) {
                eliminarDeLaLista(aux.getDato().getNumPlacadeVehiculo());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    public boolean buscarXAnio(int anio) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getAniodeVehiculo() == anio) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXAnio(int anio) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (cont != tamanioAntes) {

            if (aux.getDato().getAniodeVehiculo() != anio) {
                eliminarDeLaLista(aux.getDato().getNumPlacadeVehiculo());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    public boolean buscarXModelo(String modelo) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getModeloVehiculo().equals(modelo)) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXModelo(String modelo) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (cont != tamanioAntes) {

            if (!aux.getDato().getModeloVehiculo().equals(modelo)) {
                eliminarDeLaLista(aux.getDato().getNumPlacadeVehiculo());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    public boolean buscarXExtra(String extra) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getExtrasPila().search(extra)) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public void eliminaXExtra(String extra) {
        int tamanioAntes = tamanio();
        int cont = 0;
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
        while (cont != tamanioAntes) {

            if (!aux.getDato().getExtrasPila().search(extra)) {
                eliminarDeLaLista(aux.getDato().getNumPlacadeVehiculo());

            }
            aux = aux.getNext();
            cont += 1;
        }
    }

    public boolean comparoCantPasajeros(Vehiculo vehiculo, int cantPasajeros) {
        boolean coincidencia = false;
        if (vehiculo.getCantPasajerosdeVehiculo() == cantPasajeros) {
            coincidencia = true;
        }
        return coincidencia;
    }

    @Override
    public String toString() {
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;

        String s = "\n";
        if (aux != null) {
//            s += "back: " + aux.getBack() + ",\n";
            s += "Nodo actual: " + aux + ",\n ";
//            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

//                s += "back: " + aux.getBack() + ",\n";
                s += "Nodo actual: " + aux + ",\n ";
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
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;

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
        NodoListaDobleEnlazadaResultadosBusqueda aux = cabeza;
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
