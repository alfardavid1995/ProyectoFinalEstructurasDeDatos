package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;

public class ListaDobleEnlazadaFiltro {

    private NodoListaDobleEnlazadaFiltro cabeza;
    private NodoListaDobleEnlazadaFiltro ultimo;
   
   
    //si funciona
    public void agregarVehiculoFiltro(Vehiculo vehiculo) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaFiltro(vehiculo);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else {

            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
            NodoListaDobleEnlazadaFiltro aux = new NodoListaDobleEnlazadaFiltro(vehiculo);
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
    }
   public void eliminarDeLaLista(Vehiculo vehiculo){
       
       
   }
   public void recorrerLista(){
       
   }
    
   public boolean comparoCantPasajeros(Vehiculo vehiculo,int cantPasajeros){
       boolean coincidencia = false;
       if(vehiculo.getCantPasajerosdeVehiculo()==cantPasajeros){
          coincidencia = true;
       }
       return coincidencia;
   }
    

    @Override
    public String toString() {
        NodoListaDobleEnlazadaFiltro aux = cabeza;

        String s = "Lista: \n";
        if (aux != null) {
            s += "back: " + aux.getBack() + ",\n";
            s += "Nodo actual: " + aux + ",\n ";
            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

                s += "back: " + aux.getBack() + ",\n";
                s += "Nodo actual: " + aux + ",\n ";
                s += "Next: " + aux.getNext() + ",\n";
                s += "--------------------------\n";
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }

    public String toStringcopia() {
        NodoListaDobleEnlazadaFiltro aux = cabeza;
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
