package ObjetosdelProyecto.Objetos;

import EstructurasDeDatos.Cliente.ListaDobleEnlazadaAlquileres_Cliente;
import java.util.Calendar;
import EstructurasDeDatos.*;

public class Cliente {

    private int cedula;
    private String nombreCompleto;
    private String fechaNacimiento;
    private String correoElectronico;
    private String categoria;//Bronce, Plata, Oro, Zafiro 
    private ListaDobleEnlazadaAlquileres_Cliente listaAlquilerdeCliente = new ListaDobleEnlazadaAlquileres_Cliente();
    private int cantidadDeAlquileresProcesados;
    private boolean alquilando ;

    public Cliente() {
    }

    public Cliente(int cedula, String nombreCompleto, String fechaNacimiento, String correoElectronico, String categoria, int cantidadDeAlquileresProcesados, boolean alquilando) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.categoria = categoria;
        this.cantidadDeAlquileresProcesados = cantidadDeAlquileresProcesados;
        this.alquilando = alquilando;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ListaDobleEnlazadaAlquileres_Cliente getListaAlquilerdeCliente() {
        return listaAlquilerdeCliente;
    }

    public void setListaAlquilerdeCliente(ListaDobleEnlazadaAlquileres_Cliente listaAlquilerdeCliente) {
        this.listaAlquilerdeCliente = listaAlquilerdeCliente;
    }

    public int getCantidadDeAlquileresProcesados() {
        return cantidadDeAlquileresProcesados;
    }

    public void setCantidadDeAlquileresProcesados(int cantidadDeAlquileresProcesados) {
        this.cantidadDeAlquileresProcesados = cantidadDeAlquileresProcesados;
    }

    public boolean isAlquilando() {
        return alquilando;
    }

    public void setAlquilando(boolean alquilando) {
        this.alquilando = alquilando;
    }

    public String listar() {
        String s = "";
        if (alquilando == true) {
            s = "Si";
        } else {
            s = "No";
        }
        return "\n -------------------------- Cliente ------------------------- \n"
                + "\n Nombre: " + nombreCompleto
                + "\n Cédula: " + cedula
                + "\n Fecha de Nacimiento: " + fechaNacimiento
                + "\n Correo: " + correoElectronico
                + "\n Categoría: " + categoria
                + "\n Cantidad de Alquileres: " + cantidadDeAlquileresProcesados
                + "\n Alquilando: " + s
                + "\n Alquileres: " + listaAlquilerdeCliente;
    }

    public String listar2() {
        return "\n -------------------------- Cliente ------------------------- \n"
                + "\n Nombre: " + nombreCompleto
                + "\n Cédula: " + cedula
                + "\n Categoría: " + categoria;
    }

    public String listar3() {
        return "\n --------------- Cliente --------------- \n"
                + "\n Nombre: " + nombreCompleto;
    }
    
      public String listar4() {
        return "\n -------------------------- Cliente ------------------------- \n"
                + "\n Nombre: " + nombreCompleto
                + "\n Cédula: " + cedula
                + "\n Cantidad de Alquileres: " + cantidadDeAlquileresProcesados
                + "\n Categoría: " + categoria;
    }
}
