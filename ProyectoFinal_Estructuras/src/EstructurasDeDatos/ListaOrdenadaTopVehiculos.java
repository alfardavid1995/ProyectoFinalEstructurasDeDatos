package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;
import ObjetosdelProyecto.Objetos.Vehiculo;

public class ListaOrdenadaTopVehiculos {

    private NodoListaOrdenadaTopVehiculos cabeza;
    private int largo;

    public ListaOrdenadaTopVehiculos() {
        this.cabeza = cabeza;
        this.largo = largo;
    }

    public int tamanio() {
        return this.largo;
    }

    public void limpiarLista() {
        cabeza = null;
        
    }

    public boolean Vacia() {
        return cabeza == null;
    }
    
   public void calculaMejorVehiculo(Pila_RegistroVehiculo pilaRegistroVehiculo){//en este caso lo que se ahce es agarrar una copia de la pila 
       if(!pilaRegistroVehiculo.Vacia()){//si la pila tiene algo proceselos
           while (pilaRegistroVehiculo.Vacia()){//mientras la pila tenga algo siga insertando
              inserta(pilaRegistroVehiculo.pop().getVehiculoNodo()); //aca se inserta de forma ordenada
           }    
       }
   } 
   
   public void inserta(Vehiculo p){// este metodo los ordena a como vienen los objetos segun su cantidad de alquileres
        if(cabeza==null){
            cabeza = new NodoListaOrdenadaTopVehiculos(p);
        }else if(p.getCantidadDeVecesAlquilado()>cabeza.getVehiculo().getCantidadDeVecesAlquilado()){
            NodoListaOrdenadaTopVehiculos aux = new NodoListaOrdenadaTopVehiculos(p);
            aux.setNodoSiguiente(cabeza);
            cabeza=aux;
        }else if(p.getCantidadDeVecesAlquilado()<=cabeza.getVehiculo().getCantidadDeVecesAlquilado()){
            NodoListaOrdenadaTopVehiculos aux;
            NodoListaOrdenadaTopVehiculos temp = new NodoListaOrdenadaTopVehiculos(p);
            NodoListaOrdenadaTopVehiculos aux2;
            aux = cabeza;
            while(p.getCantidadDeVecesAlquilado()<=aux.getVehiculo().getCantidadDeVecesAlquilado() && aux.getNodoSiguiente()!=null){
                aux = aux.getNodoSiguiente();   
            }
            aux2=aux.getNodoSiguiente();
            aux.setNodoSiguiente(temp);
            temp.setNodoSiguiente(aux2);
        }
        largo ++;
   }
   
   

    //si funciona


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

    public String toStringModificado(){
        String s = "";
        NodoListaOrdenadaTopVehiculos aux;
        aux = cabeza;
        int counter = 0;
        if (!Vacia()){
            while(aux.getNodoSiguiente()!=null|| counter <5){
                s = s + aux.getVehiculo().toString()+"\n";
                counter++;
            }
        }
        return s;
    }
}
