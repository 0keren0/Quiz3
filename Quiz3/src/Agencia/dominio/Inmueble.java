package Agencia.dominio;

public abstract class Inmueble {
    //Atributos
    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;

    //Constructor
    public Inmueble(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
        this.arrendado = arrendado;
    }

    //Constructor no arrendables
    public Inmueble(String direccion, long valorVenta) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
    }

    //Getters & Setters
    public String getDireccion() {
        return direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}
