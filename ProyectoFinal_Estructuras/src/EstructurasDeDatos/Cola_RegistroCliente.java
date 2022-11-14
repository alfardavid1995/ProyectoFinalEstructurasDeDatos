package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Cliente;

public class Cola_RegistroCliente {
    private NodeCola_RegistroCliente frente;
    private NodeCola_RegistroCliente ultimo;
    private int largo;

    public Cola_RegistroCliente() {
    }
    
    public void encola(Cliente clientito){
        NodeCola_RegistroCliente nodito = new NodeCola_RegistroCliente();
        nodito.setClienteNodo(clientito);
        if(frente == null){  // significa que la cola esta vacia
            frente = nodito;
            ultimo = nodito;
        } else{
            ultimo.setAtras(nodito);
            ultimo=nodito;
        }
    }
    
    public NodeCola_RegistroCliente elimina(){
        NodeCola_RegistroCliente aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    public boolean search(int reference) {
        // Crea una copia de la pila.
        NodeCola_RegistroCliente aux = frente;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference == aux.getClienteNodo().getCedula()) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getAtras();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    
    public void eliminaModificado(int reference) {
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            NodeCola_RegistroCliente frenteColaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while (reference != frente.getClienteNodo().getCedula()) {
                //!reference.equals(cima.getVehiculoNodo().getNumPlacadeVehiculo())
                // Crea un node temporal para agregarlos a la pila auxiliar.
                NodeCola_RegistroCliente temp = new NodeCola_RegistroCliente();
                // Ingresa el value al node temporal.
                temp.setClienteNodo(frente.getClienteNodo());
                // Consulta si la pila auxiliar no a sido inicializada.
                if (frenteColaAux == null) {
                    // Inicializa la pila auxiliar.
                    frenteColaAux = temp;
                } // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else {
                    temp.setAtras(frenteColaAux);
                    frenteColaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                elimina();
            }
            // Elimina el node que coincide con el de reference.
            elimina();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while (frenteColaAux != null) {
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                encola(frenteColaAux.getClienteNodo());
                // Avansa al siguiente node de la pila auxiliar.
                frenteColaAux = frenteColaAux.getAtras();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            frenteColaAux = null;
        } else {
            System.out.println("El nodo indicado no existe");
        }
    }
    
    public Cliente traerCliente(int cedula) {
        NodeCola_RegistroCliente aux = frente;
        Cliente clientito = new Cliente();
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la cola hasta llegar encontrar el node o llegar al final
        // de la cola.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (cedula == aux.getClienteNodo().getCedula()) {
                // Cambia el value de la bandera.
                clientito = aux.getClienteNodo();
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getAtras();
            }
        }
        return clientito;
    }
    
    @Override
    public String toString(){
        String s="";
        NodeCola_RegistroCliente aux=frente;
        while(aux!=null){
            s+=aux.getClienteNodo().listar()+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
    
    public String listar2(){
        String stringConTodalaInfodelaCola = "";
        NodeCola_RegistroCliente aux = frente;
        while (aux != null) {

            stringConTodalaInfodelaCola = stringConTodalaInfodelaCola
                    + aux.getClienteNodo().listar2()+ "\n";
            aux = aux.getAtras();
        }

        return stringConTodalaInfodelaCola;
    }
}