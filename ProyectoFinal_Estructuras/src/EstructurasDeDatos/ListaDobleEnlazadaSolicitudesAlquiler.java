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
    
    //criterios de ordenamiento para lista de solicitudes
    //1.Zafiro, 2.Oro, 3.Plata, 4.Bronce, 5 Sin categoria
    public void agregarSolicitudDependiendoDeTipoCLiente(SolicitudDeAlquiler solicitud) {
        NodoListaDobleEnlazadaSolicitudesAlquiler nuevoDatoAlquiler = new NodoListaDobleEnlazadaSolicitudesAlquiler(solicitud);
        
        if (cabeza == null) {
            cabeza = nuevoDatoAlquiler;
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        
            
        }else{
            if(existeZafiro()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==4){//si existe un zafiro y la categoria es igual a 4 mandelo al final de zafiro
                
                //lo manda al fianl de la lista de zafiros,
                if(existeOro() || existePlata() || existeBronce()){//revisa si hay oro plata o bronce para ver si tiene que enlazarlo para atras
                    NodoListaDobleEnlazadaSolicitudesAlquiler aux;
                    if(existeOro()){
                        aux=cabeza;
                        if (aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3) {
                            
                        }
                    }
                    if(existePlata()){
                        aux=cabeza;
                        if (aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3) {
                            
                        }
                    }
                    if(existeBronce()){
                        aux=cabeza;
                        if (aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3) {
                            
                        }
                    }
                }
            }else if(!existeZafiro()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==4){//si no existe un zafiro y la categoria es igual a 4 mandelo al inicio de zafiro
                //mandelo al inicio de zafiro
            }
            if(existeOro()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==3){//si hay oro en la lista y la categoria es 3 mandelo al final de la lista
                //mandelo para el final de oro
            }else if(!existeOro()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==3){//si no hay oro y la categoria del objeto a insertar es 3 mandelo al inicio de oro
                //mandelo para el inicio de oro
            }
            if(existePlata()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==2){//si hay plata y la categoria es al final de plata mandelo al final de plata
                //mandelo para el final de plata
            }else if(!existePlata()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==2){//si no hay plata y la categoria es 2 mandelo al inicio de plata
                //mandelo al inicio de plata
            }
            if(existeBronce()&&solicitud.getUsuarioSolicitud().getIndiceCategoria()==1){//si hay bronces y la categoria es 1 mandelo al final de bronce
                //mandelo para el final de bronce
            }else if(!existeBronce() && solicitud.getUsuarioSolicitud().getIndiceCategoria()==1){//si no hay bronce mandelo al inicio de bronce
                //mandelo al inicio de bronce
            }
        }
        
        
        
    }
    
    public boolean existeZafiro(){
        boolean existeZafiro =  false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux;
        aux=cabeza;
        
        if (cabeza!=null){
            if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==4){
                existeZafiro=true;
            }
            aux=aux.getNext();
            while(aux!=cabeza){
                if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==4){
                    existeZafiro=true;
                }
                aux=aux.getNext();
            }     
        }
        return existeZafiro;   
    }
    
    public boolean existeOro(){
        boolean existeOro =  false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux;
        aux=cabeza;
        
        if (cabeza!=null){
            if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3){
                existeOro=true;
            }
            aux=aux.getNext();
            while(aux!=cabeza){
                if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3){
                    existeOro=true;
                }
                aux=aux.getNext();
            }     
        }
        return existeOro;   
    }
    
    public boolean existePlata(){
        boolean existePlata =  false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux;
        aux=cabeza;
        
        if (cabeza!=null){
            if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3){
                existePlata=true;
            }
            aux=aux.getNext();
            while(aux!=cabeza){
                if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3){
                    existePlata=true;
                }
                aux=aux.getNext();
            }     
        }
        return existePlata;
    }
    
    public boolean existeBronce(){
        boolean existeBronce =  false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux;
        aux=cabeza;
        
        if (cabeza!=null){
            if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3){
                existeBronce=true;
            }
            aux=aux.getNext();
            while(aux!=cabeza){
                if(aux.getDato().getUsuarioSolicitud().getIndiceCategoria()==3){
                    existeBronce=true;
                }
                aux=aux.getNext();
            }     
        }
        return existeBronce;
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
