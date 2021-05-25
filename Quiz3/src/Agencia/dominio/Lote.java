package Agencia.dominio;

public class Lote extends Inmueble{

    //Constructor
    public Lote(String direccion, long valorVenta) {
        super(direccion, valorVenta);
    }

    //Método Sobreescrito
    @Override
    public String toString() {
        return "Este inmueble es un Lote con dirección: " + getDireccion() + "\n Y Valor de Venta: " + getValorVenta() + "\n";
    }
}
