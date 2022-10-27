package proyectofinal_estructuras;

public class Vehiculo {
    private String numPlaca;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int cilindrada;
    private String tipoCombustible;
    private int cantPasajeros;
    private double precioAlquilerXDia;
    //private pilaExtrasVehuculo extras ;

    public Vehiculo(String numPlaca, String marca, String modelo, int anio, 
            String color, int cilindrada, String tipoCombustible, 
            int cantPasajeros, double precioAlquilerXDia) {
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
        this.cantPasajeros = cantPasajeros;
        this.precioAlquilerXDia = precioAlquilerXDia;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public double getPrecioAlquilerXDia() {
        return precioAlquilerXDia;
    }

    public void setPrecioAlquilerXDia(double precioAlquilerXDia) {
        this.precioAlquilerXDia = precioAlquilerXDia;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numPlaca=" + numPlaca + ", marca=" + marca 
                + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color 
                + ", cilindrada=" + cilindrada + ", tipoCombustible=" 
                + tipoCombustible + ", cantPasajeros=" + cantPasajeros 
                + ", precioAlquilerXDia=" + precioAlquilerXDia + '}';
    }
    
    
}
