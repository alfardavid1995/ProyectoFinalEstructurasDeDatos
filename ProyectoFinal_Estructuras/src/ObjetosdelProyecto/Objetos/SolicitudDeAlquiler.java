package ObjetosdelProyecto.Objetos;


import java.time.LocalDate;
import java.time.LocalTime;

public class SolicitudDeAlquiler {

    private String estadoDeSolicitud;//Registrada, procesada, finalizada, rechazada
    private int idSolicitud;
    private static int IDSolicitudActual = 1;
    private int cantidadDeDiasSolicitud;
    private Cliente usuarioSolicitud;
    private Vehiculo vehiculoSoli;
    private int pasajeros;
    private String marca;
    private int anio;
    private String modelo;
    private String extra;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private LocalDate fechaCreacion;
    private LocalTime horaCreacion;
    private double montoAlquiler;

    public SolicitudDeAlquiler() {
    }

    public SolicitudDeAlquiler(String estadoDeSolicitud, int cantidadDeDiasSolicitud,
            Cliente usuarioSolicitud, int pasajeros, String marca, int anio, String modelo,
            String extra, LocalDate fechaInicial, LocalDate fechaFinal, double montoAlquiler) {
        this.estadoDeSolicitud = estadoDeSolicitud;
        this.idSolicitud = IDSolicitudActual;
        this.cantidadDeDiasSolicitud = cantidadDeDiasSolicitud;
        this.usuarioSolicitud = usuarioSolicitud;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.extra = extra;
        this.fechaFinal = fechaFinal;
        this.fechaInicial = fechaInicial;
        this.montoAlquiler = montoAlquiler;
        LocalTime localTime = LocalTime.now();
        this.horaCreacion = localTime;
        LocalDate localDate = LocalDate.now();
        this.fechaCreacion = localDate;
        IDSolicitudActual++;
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

    public static int getIDSolicitudActual() {
        return IDSolicitudActual;
    }

    public static void setIDSolicitudActual(int IDSolicitudActual) {
        SolicitudDeAlquiler.IDSolicitudActual = IDSolicitudActual;
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

    public Vehiculo getVehiculoSoli() {
        return vehiculoSoli;
    }

    public void setVehiculoSoli(Vehiculo vehiculoSoli) {
        this.vehiculoSoli = vehiculoSoli;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    public LocalTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
    
    public double calcularMonto(double precioVehiculo, int dias) {
        montoAlquiler = precioVehiculo * dias;
        double iva = montoAlquiler * 0.13;
        montoAlquiler = montoAlquiler + iva;
        return montoAlquiler;
    }

    @Override
    public String toString() {
        return "\n-----------------------Solicitud------------------ " + "\n"
                + "Id Solicitud: " + idSolicitud + "\t\t"
                + "Estado: " + estadoDeSolicitud + "\t\t"
                + "Fecha: " + fechaCreacion + "\n"
                + "Hora: "+ horaCreacion + "\t\t"
                + "Monto: "+montoAlquiler + " \n"
                + usuarioSolicitud.listar2() + "\n";
    }

    public String toString2() {

        return "\n-----------------------------Solicitud-----------------------------" + "\n"
                + "Id Solicitud: " + idSolicitud + "\t\t"
                + "Estado: " + estadoDeSolicitud + "\t\t"
                + "Fecha: " + fechaCreacion + "\n"
                + "Cantidad de dias: " + cantidadDeDiasSolicitud + "\t"
                + "Hora: "+ horaCreacion + "\n"
                + "Inicia: "+ fechaInicial + "\t\t"
                + "Termina: "+ fechaFinal + "\n"
                + usuarioSolicitud.listar3() + "\n"
                + vehiculoSoli.listar4()+"\n"
                + "Monto: "+montoAlquiler;
    }

}
