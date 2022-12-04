package EstructurasDeDatos;

public class PilaExtras_Vehiculo {

    private NodePila_Extras cima;
    private int largo;

    public PilaExtras_Vehiculo() {
        this.cima = cima;
        this.largo = largo;
    }

    public boolean Vacia() {
        return cima == null;
    }

    public int tamanio() {
        return this.largo;
    }

    public void push(String extra) {
        NodePila_Extras newNode = new NodePila_Extras();
        newNode.setExtra(extra);

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
        NodePila_Extras aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference.equals(aux.getExtra())) {
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
    
        public void popModificado(String reference){
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            NodePila_Extras cimaPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(!reference.equals(cima.getExtra())){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                NodePila_Extras temp = new NodePila_Extras();
                // Ingresa el value al node temporal.
                temp.setExtra(cima.getExtra());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimaPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimaPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setSiguiente(cimaPilaAux);
                    cimaPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimaPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimaPilaAux.getExtra());
                // Avansa al siguiente node de la pila auxiliar.
                cimaPilaAux = cimaPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimaPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    }
  
        
    public String listar() {
        String stringConTodalaInfodelaPila = "";
        NodePila_Extras aux = cima;
        while (aux != null) {

            stringConTodalaInfodelaPila = stringConTodalaInfodelaPila
                    + aux.getExtra().toString() + " --- ";
            aux = aux.getSiguiente();
        }

        return stringConTodalaInfodelaPila;
    }
//    
//    
}
