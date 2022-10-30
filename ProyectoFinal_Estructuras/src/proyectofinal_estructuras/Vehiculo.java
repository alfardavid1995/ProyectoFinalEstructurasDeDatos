package proyectofinal_estructuras;

public class Vehiculo {
    private String numPlacadeVehiculo;
    private String marcaDeVehiculo;
    private String modeloVehiculo;
    private int aniodeVehiculo;
    private String colorDeVehiculo;
    private int cilindradaDeVehiculo;
    private String tipoCombustibleDeVehiculo;
    private int cantPasajerosdeVehiculo;
    private double precioAlquilerXDiaDeVehiculo;
    private String estadoParaSerAlquilado; // libre o alquilado
    private int cantidadDeVecesAlquilado;
    //private pilaExtrasVehuculo extras ;

    public Vehiculo(String numPlacadeVehiculo, String marcaDeVehiculo, String modeloVehiculo, int aniodeVehiculo, String colorDeVehiculo, int cilindradaDeVehiculo, String tipoCombustibleDeVehiculo, int cantPasajerosdeVehiculo, double precioAlquilerXDiaDeVehiculo, String estadoParaSerAlquilado) {
        this.numPlacadeVehiculo = numPlacadeVehiculo;
        this.marcaDeVehiculo = marcaDeVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.aniodeVehiculo = aniodeVehiculo;
        this.colorDeVehiculo = colorDeVehiculo;
        this.cilindradaDeVehiculo = cilindradaDeVehiculo;
        this.tipoCombustibleDeVehiculo = tipoCombustibleDeVehiculo;
        this.cantPasajerosdeVehiculo = cantPasajerosdeVehiculo;
        this.precioAlquilerXDiaDeVehiculo = precioAlquilerXDiaDeVehiculo;
        this.estadoParaSerAlquilado = estadoParaSerAlquilado;
    }
    
    

    public String getNumPlacadeVehiculo() {
        return numPlacadeVehiculo;
    }

    public void setNumPlacadeVehiculo(String numPlacadeVehiculo) {
        this.numPlacadeVehiculo = numPlacadeVehiculo;
    }

    public String getMarcaDeVehiculo() {
        return marcaDeVehiculo;
    }

    public void setMarcaDeVehiculo(String marcaDeVehiculo) {
        this.marcaDeVehiculo = marcaDeVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getAniodeVehiculo() {
        return aniodeVehiculo;
    }

    public void setAniodeVehiculo(int aniodeVehiculo) {
        this.aniodeVehiculo = aniodeVehiculo;
    }

    public String getColorDeVehiculo() {
        return colorDeVehiculo;
    }

    public void setColorDeVehiculo(String colorDeVehiculo) {
        this.colorDeVehiculo = colorDeVehiculo;
    }

    public int getCilindradaDeVehiculo() {
        return cilindradaDeVehiculo;
    }

    public void setCilindradaDeVehiculo(int cilindradaDeVehiculo) {
        this.cilindradaDeVehiculo = cilindradaDeVehiculo;
    }

    public String getTipoCombustibleDeVehiculo() {
        return tipoCombustibleDeVehiculo;
    }

    public void setTipoCombustibleDeVehiculo(String tipoCombustibleDeVehiculo) {
        this.tipoCombustibleDeVehiculo = tipoCombustibleDeVehiculo;
    }

    public int getCantPasajerosdeVehiculo() {
        return cantPasajerosdeVehiculo;
    }

    public void setCantPasajerosdeVehiculo(int cantPasajerosdeVehiculo) {
        this.cantPasajerosdeVehiculo = cantPasajerosdeVehiculo;
    }

    public double getPrecioAlquilerXDiaDeVehiculo() {
        return precioAlquilerXDiaDeVehiculo;
    }

    public void setPrecioAlquilerXDiaDeVehiculo(double precioAlquilerXDiaDeVehiculo) {
        this.precioAlquilerXDiaDeVehiculo = precioAlquilerXDiaDeVehiculo;
    }

    public String getEstadoParaSerAlquilado() {
        return estadoParaSerAlquilado;
    }

    public void setEstadoParaSerAlquilado(String estadoParaSerAlquilado) {
        this.estadoParaSerAlquilado = estadoParaSerAlquilado;
    }

    public int getCantidadDeVecesAlquilado() {
        return cantidadDeVecesAlquilado;
    }

    public void setCantidadDeVecesAlquilado(int cantidadDeVecesAlquilado) {
        this.cantidadDeVecesAlquilado = cantidadDeVecesAlquilado;
    }
    


    
}
