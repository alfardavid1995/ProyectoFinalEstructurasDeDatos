package EstructurasDeDatos.Alquiler;

import ObjetosdelProyecto.Objetos.SolicitudDeAlquiler;
import ObjetosdelProyecto.Objetos.Vehiculo;

public class ListaDobleEnlazadaSolicitudesAlquiler {

    private NodoListaDobleEnlazadaSolicitudesAlquiler cabeza;
    private NodoListaDobleEnlazadaSolicitudesAlquiler ultimo;
    private int largo;
    private int cantidadSolicitudesProcesadasZafiro = 0;
    private int cantidadSolicitudesProcesadasOro = 0;
    private int cantidadSolicitudesProcesadasPlata = 0;
    private int cantidadSolicitudesProcesadasBronce = 0;
    private int cantidadSolicitudesProcesadasSinCategoria = 0;

    private double totalSolicitudesProcesadasZafiro = 0;
    private double totalSolicitudesProcesadasOro = 0;
    private double totaldSolicitudesProcesadasPlata = 0;
    private double totalSolicitudesProcesadasBronce = 0;
    private double totalSolicitudesProcesadasSinCategoria = 0;

    public void agregarSolicitud(SolicitudDeAlquiler solicitud) {
        if (cabeza == null) {
            cabeza = new NodoListaDobleEnlazadaSolicitudesAlquiler(solicitud);
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
            NodoListaDobleEnlazadaSolicitudesAlquiler aux = new 
               NodoListaDobleEnlazadaSolicitudesAlquiler(solicitud);
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

    public SolicitudDeAlquiler retornaSoli(int saltos) {
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        SolicitudDeAlquiler soli = new SolicitudDeAlquiler();
        if (saltos == 0) {
            soli = aux.getDato();
        } else {
            int contador = 0;
            while (contador != saltos) {
                aux = aux.getNext();
                contador += 1;
            }
            soli = aux.getDato();
        }
        return soli;
    }

    public int existZafiro() {
        int cont = 0;
        int exist = 0;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (exist == 0 && cont != tamanio()) {

            if (aux.getDato().getUsuarioSolicitud().getCategoria().
                                            equals("Zafiro")
                    && aux.getDato().getEstadoDeSolicitud().
                                            equals("Registrada")) {
                exist = aux.getDato().getIdSolicitud();
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public int existOro() {
        int cont = 0;
        int exist = 0;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (exist == 0 && cont != tamanio()) {

            if (aux.getDato().getUsuarioSolicitud().getCategoria().
                                                equals("Oro")
                    && aux.getDato().getEstadoDeSolicitud().
                                                equals("Registrada")) {
                exist = aux.getDato().getIdSolicitud();
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public int existPlata() {
        int cont = 0;
        int exist = 0;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (exist == 0 && cont != tamanio()) {

            if (aux.getDato().getUsuarioSolicitud().getCategoria().
                                                        equals("Plata")
                    && aux.getDato().getEstadoDeSolicitud().
                                                 equals("Registrada")) {
                exist = aux.getDato().getIdSolicitud();
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public int existBronce() {
        int cont = 0;
        int exist = 0;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (exist == 0 && cont != tamanio()) {

            if (aux.getDato().getUsuarioSolicitud().getCategoria().
                                                        equals("Bronce")
                    && aux.getDato().getEstadoDeSolicitud().
                                                equals("Registrada")) {
                exist = aux.getDato().getIdSolicitud();
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public int existSinCategoria() {
        int cont = 0;
        int exist = 0;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (exist == 0 && cont != tamanio()) {

            if (aux.getDato().getUsuarioSolicitud().getCategoria().
                                                            equals("")
                    && aux.getDato().getEstadoDeSolicitud().
                                                equals("Registrada")) {
                exist = aux.getDato().getIdSolicitud();
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public boolean existSoliRegistrada() {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getEstadoDeSolicitud().
                    equals("Registrada")) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public boolean existVehiculoSoli(String placa) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getEstadoDeSolicitud().equals("Procesada")
                    && aux.getDato().getVehiculoSoli().
                                getNumPlacadeVehiculo().equals(placa)) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public SolicitudDeAlquiler traerSoliVehiculo(String placa) {
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        SolicitudDeAlquiler soli = new SolicitudDeAlquiler();
        boolean exist = false;
        int cont = 0;
        while (!exist && cont != tamanio()) {
            if (aux.getDato().getVehiculoSoli().
                            getNumPlacadeVehiculo().equals(placa)) {
                soli = aux.getDato();
                exist = true;
            } else {
                if (aux.getNext() == ultimo) {
                    if (aux.getDato().getVehiculoSoli().
                                getNumPlacadeVehiculo().equals(placa)) {
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

    public boolean buscarVehiculo(Vehiculo vehiculo) {
        int cont = 0;
        boolean exist = false;
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;
        while (!exist && cont != tamanio()) {

            if (aux.getDato().getVehiculoSoli() == vehiculo) {
                exist = true;
            }
            aux = aux.getNext();
            cont += 1;

        }

        return exist;
    }

    public int getCantidadSolicitudesProcesadasZafiro() {
        return cantidadSolicitudesProcesadasZafiro;
    }

    public void setCantidadSolicitudesProcesadasZafiro
                                    (int cantidadSolicitudesProcesadasZafiro) {
        this.cantidadSolicitudesProcesadasZafiro = 
                                            cantidadSolicitudesProcesadasZafiro;
    }

    public int getCantidadSolicitudesProcesadasOro() {
        return cantidadSolicitudesProcesadasOro;
    }

    public void setCantidadSolicitudesProcesadasOro
        (int cantidadSolicitudesProcesadasOro) {
        this.cantidadSolicitudesProcesadasOro = cantidadSolicitudesProcesadasOro;
    }

    public int getCantidadSolicitudesProcesadasPlata() {
        return cantidadSolicitudesProcesadasPlata;
    }

    public void setCantidadSolicitudesProcesadasPlata
        (int cantidadSolicitudesProcesadasPlata) {
        this.cantidadSolicitudesProcesadasPlata = cantidadSolicitudesProcesadasPlata;
    }

    public int getCantidadSolicitudesProcesadasBronce() {
        return cantidadSolicitudesProcesadasBronce;
    }

    public void setCantidadSolicitudesProcesadasBronce
        (int cantidadSolicitudesProcesadasBronce) {
        this.cantidadSolicitudesProcesadasBronce =
                cantidadSolicitudesProcesadasBronce;
    }

    public int getCantidadSolicitudesProcesadasSinCategoria() {
        return cantidadSolicitudesProcesadasSinCategoria;
    }

    public void setCantidadSolicitudesProcesadasSinCategoria
        (int cantidadSolicitudesProcesadasSinCategoria) {
        this.cantidadSolicitudesProcesadasSinCategoria = 
                cantidadSolicitudesProcesadasSinCategoria;
    }

    public double getTotalSolicitudesProcesadasZafiro() {
        return totalSolicitudesProcesadasZafiro;
    }

    public void setTotalSolicitudesProcesadasZafiro
        (double totalSolicitudesProcesadasZafiro) {
        this.totalSolicitudesProcesadasZafiro = totalSolicitudesProcesadasZafiro;
    }

    public double getTotalSolicitudesProcesadasOro() {
        return totalSolicitudesProcesadasOro;
    }

    public void setTotalSolicitudesProcesadasOro
        (double totalSolicitudesProcesadasOro) {
        this.totalSolicitudesProcesadasOro = totalSolicitudesProcesadasOro;
    }

    public double getTotaldSolicitudesProcesadasPlata() {
        return totaldSolicitudesProcesadasPlata;
    }

    public void setTotaldSolicitudesProcesadasPlata
        (double totaldSolicitudesProcesadasPlata) {
        this.totaldSolicitudesProcesadasPlata = totaldSolicitudesProcesadasPlata;
    }

    public double getTotalSolicitudesProcesadasBronce() {
        return totalSolicitudesProcesadasBronce;
    }

    public void setTotalSolicitudesProcesadasBronce
        (double totalSolicitudesProcesadasBronce) {
        this.totalSolicitudesProcesadasBronce = totalSolicitudesProcesadasBronce;
    }

    public double getTotalSolicitudesProcesadasSinCategoria() {
        return totalSolicitudesProcesadasSinCategoria;
    }

    public void setTotalSolicitudesProcesadasSinCategoria
        (double totalSolicitudesProcesadasSinCategoria) {
        this.totalSolicitudesProcesadasSinCategoria = 
                totalSolicitudesProcesadasSinCategoria;
    }

    @Override
    public String toString() {
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;

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
        NodoListaDobleEnlazadaSolicitudesAlquiler aux = cabeza;

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
