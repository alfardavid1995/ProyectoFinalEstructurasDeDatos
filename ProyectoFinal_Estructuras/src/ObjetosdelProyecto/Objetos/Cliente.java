package ObjetosdelProyecto.Objetos;

import java.util.Calendar;
import EstructurasDeDatos.*;

public class Cliente {
    private int cedula;
    private String nombreCompleto;
    private String fechaNacimiento;   
    private String correoElectronico;
    private String categoria;//Bronce, Plata, Oro, Zafiro 
    private PilaAlquileresRealizados_Cliente pilaAlquilerdeCliente;
    private int cantidadDeAlquileresProcesados;

    public Cliente() {
    }

    public Cliente(int cedula, String nombreCompleto, String fechaNacimiento, String correoElectronico, String categoria, int cantidadDeAlquileresProcesados) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.categoria = categoria;
        this.cantidadDeAlquileresProcesados = cantidadDeAlquileresProcesados;
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

    public PilaAlquileresRealizados_Cliente getPilaAlquilerdeCliente() {
        return pilaAlquilerdeCliente;
    }

    public void setPilaAlquilerdeCliente(PilaAlquileresRealizados_Cliente pilaAlquilerdeCliente) {
        this.pilaAlquilerdeCliente = pilaAlquilerdeCliente;
    }

    public int getCantidadDeAlquileresProcesados() {
        return cantidadDeAlquileresProcesados;
    }

    public void setCantidadDeAlquileresProcesados(int cantidadDeAlquileresProcesados) {
        this.cantidadDeAlquileresProcesados = cantidadDeAlquileresProcesados;
    }
    

    public String listar() {
        return  "\n -------------------------- Cliente ------------------------- \n" +
                "\n Nombre: "  + nombreCompleto + 
                "\n Cédula: " + cedula + 
                "\n Fecha de Nacimiento: " + fechaNacimiento +
                "\n Correo: " + correoElectronico + 
                "\n Categoría: " + categoria + 
                "\n Cantidad de Alquileres: " + cantidadDeAlquileresProcesados;
    }

}
