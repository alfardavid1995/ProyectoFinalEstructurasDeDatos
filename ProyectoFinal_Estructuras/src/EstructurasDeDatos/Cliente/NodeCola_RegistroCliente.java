package EstructurasDeDatos.Cliente;

import ObjetosdelProyecto.Objetos.Cliente;

public class NodeCola_RegistroCliente {
    private Cliente clienteNodo;
    private String dato;
    private NodeCola_RegistroCliente atras;

    public NodeCola_RegistroCliente() {
    }

    public NodeCola_RegistroCliente(Cliente clienteNodo, String dato, 
            NodeCola_RegistroCliente atras) {
        this.clienteNodo = null;
        this.dato = null;
        this.atras = null;
    }

    public Cliente getClienteNodo() {
        return clienteNodo;
    }

    public void setClienteNodo(Cliente clienteNodo) {
        this.clienteNodo = clienteNodo;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodeCola_RegistroCliente getAtras() {
        return atras;
    }

    public void setAtras(NodeCola_RegistroCliente atras) {
        this.atras = atras;
    }
    
}
