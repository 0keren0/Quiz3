package Agencia.dominio;

public class Apartamento extends Inmueble implements Arrendable{

    //Constructor
    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    //Métodos Sobreescritos
    @Override
    public void arrendar() {
        System.out.println("Se esta arrendando un Apartamento");
    }

    @Override
    public void devolver() {
        System.out.println("Se esta devolviendo un Apartamento");
    }
    @Override
    public String toString() {
        return "Este inmueble es un Apartamento con dirección: " + getDireccion() + "\n con Valor de Arrendamiento: " + getValorArriendo() +"\n Y Valor de Venta: " + getValorVenta() + "\n";
    }
}
