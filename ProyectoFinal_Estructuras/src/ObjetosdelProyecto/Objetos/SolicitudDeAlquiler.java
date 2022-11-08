/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosdelProyecto.Objetos;
import EstructurasDeDatos.*;

/**
 *
 * @author css124646
 */
public class SolicitudDeAlquiler {
    private String estadoDeSolicitud;//Registrada, procesada, finalizada, rechazada
    private int idSolicitud;
    private int cantidadDeDiasSolicitud;
    private Cliente usuarioSolicitud;
    private int cantidadMinimaPasajerosSolicitud;
    private String marcaVehiculoSolicitud;
    private String modelovehiculoSolicitud;
    private int anioVehiculoEnLaSolicitud;
    private String extrasVehiculoSolicitud;
    private double montoSolicitud;
    private Vehiculo vehiculoSolicitud;
    private ListaDeVehiculosDisponiblesParaAlquilar_SolicitudDeAlquiler listaDeVehiculos;

    public SolicitudDeAlquiler(String estadoDeSolicitud, int idSolicitud, int cantidadDeDiasSolicitud, Cliente usuarioSolicitud,  Vehiculo vehiculoSolicitud) {
        this.estadoDeSolicitud = estadoDeSolicitud;
        this.idSolicitud = idSolicitud;
        this.cantidadDeDiasSolicitud = cantidadDeDiasSolicitud;
        this.montoSolicitud = montoSolicitud;
        this.vehiculoSolicitud = vehiculoSolicitud;
    }

    public String getEstadoDeSolicitud() {
        return estadoDeSolicitud;
    }

    public void setEstadoDeSolicitud(String estadoDeSolicitud) {
        this.estadoDeSolicitud = estadoDeSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getCantidadDeDiasSolicitud() {
        return cantidadDeDiasSolicitud;
    }

    public void setCantidadDeDiasSolicitud(int cantidadDeDiasSolicitud) {
        this.cantidadDeDiasSolicitud = cantidadDeDiasSolicitud;
    }

    public Cliente getUsuarioSolicitud() {
        return usuarioSolicitud;
    }

    public void setUsuarioSolicitud(Cliente usuarioSolicitud) {
        this.usuarioSolicitud = usuarioSolicitud;
    }

    public int getCantidadMinimaPasajerosSolicitud() {
        return cantidadMinimaPasajerosSolicitud;
    }

    public void setCantidadMinimaPasajerosSolicitud(int cantidadMinimaPasajerosSolicitud) {
        this.cantidadMinimaPasajerosSolicitud = cantidadMinimaPasajerosSolicitud;
    }

    public String getMarcaVehiculoSolicitud() {
        return marcaVehiculoSolicitud;
    }

    public void setMarcaVehiculoSolicitud(String marcaVehiculoSolicitud) {
        this.marcaVehiculoSolicitud = marcaVehiculoSolicitud;
    }

    public String getModelovehiculoSolicitud() {
        return modelovehiculoSolicitud;
    }

    public void setModelovehiculoSolicitud(String modelovehiculoSolicitud) {
        this.modelovehiculoSolicitud = modelovehiculoSolicitud;
    }

    public int getAnioVehiculoEnLaSolicitud() {
        return anioVehiculoEnLaSolicitud;
    }

    public void setAnioVehiculoEnLaSolicitud(int anioVehiculoEnLaSolicitud) {
        this.anioVehiculoEnLaSolicitud = anioVehiculoEnLaSolicitud;
    }

    public String getExtrasVehiculoSolicitud() {
        return extrasVehiculoSolicitud;
    }

    public void setExtrasVehiculoSolicitud(String extrasVehiculoSolicitud) {
        this.extrasVehiculoSolicitud = extrasVehiculoSolicitud;
    }

    public double getMontoSolicitud() {
        return montoSolicitud;
    }

    public void setMontoSolicitud(double montoSolicitud) {
        this.montoSolicitud = montoSolicitud;
    }

    public Vehiculo getVehiculoSolicitud() {
        return vehiculoSolicitud;
    }

    public void setVehiculoSolicitud(Vehiculo vehiculoSolicitud) {
        this.vehiculoSolicitud = vehiculoSolicitud;
    }

    public ListaDeVehiculosDisponiblesParaAlquilar_SolicitudDeAlquiler getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(ListaDeVehiculosDisponiblesParaAlquilar_SolicitudDeAlquiler listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }
    
    
    
    
}
