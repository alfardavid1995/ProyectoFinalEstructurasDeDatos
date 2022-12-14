package EstructurasDeDatos.Cliente;

import ObjetosdelProyecto.Objetos.Cliente;
import javax.swing.JOptionPane;

public class Cola_RegistroCliente {

    private NodeCola_RegistroCliente frente;
    private NodeCola_RegistroCliente ultimo;
    private int largo;

    public Cola_RegistroCliente() {
    }

    public int tamanio() {
        return this.largo;
    }

    public void encola(Cliente clientito) {
        NodeCola_RegistroCliente nodito = new NodeCola_RegistroCliente();
        //al nuevo nodo le seteamos el cliente que está entrando
        nodito.setClienteNodo(clientito);
        //si la cola está vacía, define el frente y ultimo como el nuevo nodo
        if (frente == null) {
            frente = nodito;
            ultimo = nodito;
        } else {
        //sino lo manda al final de la cola
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
        //aumenta en uno el largo de la cola
        this.largo++;
    }

    public NodeCola_RegistroCliente elimina() {
        NodeCola_RegistroCliente aux = frente;
        if (frente != null) {
        //si hay algo en la cola, elimina el nodo que está en el frente
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        this.largo--;
        return aux;
    }

    public boolean search(int reference) {
        // Crea una copia de la cola.
        NodeCola_RegistroCliente aux = frente;
        // Bandera para verificar si existe el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la cola
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de referencia
            if (reference == aux.getClienteNodo().getCedula()) {
                // Cambia el valor de la bandera si lo encuentra
                exist = true;
            } else {
                // Avanza al siguiente node si no lo encuentra
                aux = aux.getAtras();
            }
        }
        // Retorna el valor de la bandera
        return exist;
    }

    public void eliminaModificado(int reference) {
        //si existe entra al if
        if (search(reference)) {
            //crea una copia de la cola y se define como nula
            NodeCola_RegistroCliente colaCopia = null;
            //crea un aux y se define como el frente
            NodeCola_RegistroCliente aux = frente;
            
            //si encuentra al cliente que se está buscando, lo elimina
            if (reference == frente.getClienteNodo().getCedula()){
                elimina();
            //sino, sigue avanzando y recorriendo la cola
            } else {
                while (aux.getAtras().getClienteNodo().getCedula() != reference) {
                    aux = aux.getAtras();
                }
                aux.setAtras(aux.getAtras().getAtras());

            }
        //en caso de que no exista, muestra el mensaje
        } else {
            JOptionPane.showMessageDialog(null, "EL cliente no existe");
        }
    }

    public Cliente traerCliente(int cedula) {
        //crea una copia de la cola
        NodeCola_RegistroCliente aux = frente;
        Cliente clientito = new Cliente();
        // Bandera para verificar si existe el elemento a search.
        boolean exist = false;
        // Recorre la cola hasta llegar encontrar el nodo o llegar al final
        // de la cola.
        while (exist != true && aux != null) {
            // Compara si el valor del node es igual que al de reference.
            if (cedula == aux.getClienteNodo().getCedula()) {
                // Cambia el value de la bandera si lo encuentra
                //agarra el nodo y se lo asigna a clientito
                clientito = aux.getClienteNodo();
                exist = true;
            } else {
                // Avanza al siguiente nodo en caso de no encontrarlo
                aux = aux.getAtras();
            }
        }
        return clientito;
    }

    public Cliente retornaCliente(int saltos) {
        //crea una copia de la cola
        NodeCola_RegistroCliente aux = frente;
        Cliente cliente = new Cliente();
        //si saltos=0, agarra el nodo y se lo asigna a cliente
        if (saltos == 0) {

            cliente = aux.getClienteNodo();
        //sino, recorre la cola mientras contador sea diferente de saltos
        } else {
            int contador = 0;
            while (contador != saltos) {
                //agarra el nodo que está atras de aux
                //contador aumenta en uno
                aux = aux.getAtras();
                contador += 1;
            }
            //cuando sale del while, agarra el nodo y se lo asigna a cliente
            cliente = aux.getClienteNodo();
        }

        return cliente;
    }

    @Override
    public String toString() {
        String s = "";
        NodeCola_RegistroCliente aux = frente;
        while (aux != null) {
            s += aux.getClienteNodo().listar() + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

    public String listar2() {
        String stringConTodalaInfodelaCola = "";
        NodeCola_RegistroCliente aux = frente;
        while (aux != null) {

            stringConTodalaInfodelaCola = stringConTodalaInfodelaCola
                    + aux.getClienteNodo().listar2() + "\n";
            aux = aux.getAtras();
        }

        return stringConTodalaInfodelaCola;
    }
}
