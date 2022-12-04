package EstructurasDeDatos;

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
        nodito.setClienteNodo(clientito);
        if (frente == null) {  // significa que la cola esta vacia
            frente = nodito;
            ultimo = nodito;
        } else {
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
        this.largo++;
    }

    public NodeCola_RegistroCliente elimina() {
        NodeCola_RegistroCliente aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        this.largo--;
        return aux;
    }

    public boolean search(int reference) {
        // Crea una copia de la cola.
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
        if (search(reference)) {
            NodeCola_RegistroCliente colaCopia = null;
            NodeCola_RegistroCliente aux = frente;
            if (reference == frente.getClienteNodo().getCedula()) {
                elimina();
            } else {
                while (aux.getAtras().getClienteNodo().getCedula() != reference) {
                    aux = aux.getAtras();
                }
                aux.setAtras(aux.getAtras().getAtras());

            }
        } else {
            JOptionPane.showMessageDialog(null, "EL cliente no existe");
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

    public Cliente retornaCliente(int saltos) {
        NodeCola_RegistroCliente aux = frente;
        Cliente cliente = new Cliente();
        if (saltos == 0) {

            cliente = aux.getClienteNodo();

        } else {
            int contador = 0;
            while (contador != saltos) {
                aux = aux.getAtras();
                contador += 1;
            }
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
