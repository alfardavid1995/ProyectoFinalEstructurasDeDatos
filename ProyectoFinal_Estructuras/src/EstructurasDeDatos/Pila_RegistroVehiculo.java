package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;

public class Pila_RegistroVehiculo {
     
    ListaDobleEnlazadaFiltro listaFiltro = new ListaDobleEnlazadaFiltro();
    private NodePila_RegistroVehiculo cima;
    private int largo;

    public Pila_RegistroVehiculo() {
        this.cima = null;
        this.largo = 0;
    }

    public boolean Vacia() {
        return cima == null;
    }

    public int tamanio() {
        return this.largo;
    }

    public void push(Vehiculo vehiculito) {
        NodePila_RegistroVehiculo newNode = new NodePila_RegistroVehiculo();
        newNode.setVehiculoNodo(vehiculito);

        if (this.Vacia()) {
            this.cima = newNode;
        } else {
            newNode.setSiguiente(this.cima);
            this.cima = newNode;

        }
        this.largo++;
    }

    public void pop() {
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

    public boolean search(String reference) {
        // Crea una copia de la pila.
        NodePila_RegistroVehiculo aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference.equals(aux.getVehiculoNodo().getNumPlacadeVehiculo())) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    
    

    public void popModificado(String reference) {
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            NodePila_RegistroVehiculo cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while (!reference.equals(cima.getVehiculoNodo().getNumPlacadeVehiculo())) {
                // Crea un node temporal para agregarlos a la pila auxiliar.
                NodePila_RegistroVehiculo temp = new NodePila_RegistroVehiculo();
                // Ingresa el value al node temporal.
                temp.setVehiculoNodo(cima.getVehiculoNodo());
                // Consulta si la pila auxiliar no a sido inicializada.
                if (cimapPilaAux == null) {
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                } // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else {
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while (cimapPilaAux != null) {
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getVehiculoNodo());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        } else {
            System.out.println("El nodo indicado no existe");
        }
    }

    public Vehiculo traerVehiculo(String placa) {
        NodePila_RegistroVehiculo aux = cima;
        Vehiculo vehiculo = new Vehiculo();
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (placa.equals(aux.getVehiculoNodo().getNumPlacadeVehiculo())) {
                // Cambia el value de la bandera.
                vehiculo = aux.getVehiculoNodo();
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        return vehiculo;
    }

     public void traerVehiculoCantPasajeros(int reference) {
        NodePila_RegistroVehiculo aux = cima;
        Vehiculo vehiculo = new Vehiculo();
       
       
        // Recorre la pila hasta llegar al final
        // de la pila.
        while ( aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference == aux.getVehiculoNodo().getCantPasajerosdeVehiculo()) {
                // Cambia el value de la bandera.
                vehiculo = aux.getVehiculoNodo();
               listaFiltro.listaDobleEnlazadaFiltro(vehiculo);
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
       
    }
    
    public String listar() {
        String stringConTodalaInfodelaPila = "";
        NodePila_RegistroVehiculo aux = cima;
        while (aux != null) {

            stringConTodalaInfodelaPila = stringConTodalaInfodelaPila
                    + aux.getVehiculoNodo().toString() + "\n";
            aux = aux.getSiguiente();
        }

        return stringConTodalaInfodelaPila;
    }

    public String listar2() {
        String stringConTodalaInfodelaPila = "";
        NodePila_RegistroVehiculo aux = cima;
        while (aux != null) {

            stringConTodalaInfodelaPila = stringConTodalaInfodelaPila
                    + aux.getVehiculoNodo().listar2() + "\n";
            aux = aux.getSiguiente();
        }

        return stringConTodalaInfodelaPila;
    }

}
