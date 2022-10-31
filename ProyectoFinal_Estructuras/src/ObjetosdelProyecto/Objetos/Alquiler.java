package ObjetosdelProyecto.Objetos;

import java.util.Calendar;

public class Alquiler {
    private Calendar fechaInicial;
    private Calendar fechaFinal;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(Calendar fechaInicial, Calendar fechaFinal, 
            Cliente cliente, Vehiculo vehiculo) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Calendar getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Calendar fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "fechaInicial=" + fechaInicial 
                + ", fechaFinal=" + fechaFinal + ", cliente=" + cliente 
                + ", vehiculo=" + vehiculo + '}';
    }
    
}
