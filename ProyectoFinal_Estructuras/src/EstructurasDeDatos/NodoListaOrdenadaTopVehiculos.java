/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

import ObjetosdelProyecto.Objetos.Vehiculo;

/**
 *
 * @author css124646
 */
public class NodoListaOrdenadaTopVehiculos {
    private NodoListaOrdenadaTopVehiculos nodoSiguiente;
    private Vehiculo vehiculo;
    
    public NodoListaOrdenadaTopVehiculos(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public NodoListaOrdenadaTopVehiculos(NodoListaOrdenadaTopVehiculos nodoSiguiente, Vehiculo vehiculo) {
        this.nodoSiguiente = nodoSiguiente;
        this.vehiculo = vehiculo;
    }

    public NodoListaOrdenadaTopVehiculos getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoListaOrdenadaTopVehiculos nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "NodoListaOrdenadaTopVehiculos{" + "vehiculo=" + vehiculo + '}';
    }
    
    
}
