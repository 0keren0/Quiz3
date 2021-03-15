package DispensadoraMecato.dominio;

public class Producto {
    private String nombre;
    private int cantidad;
    private int precio;
    public Producto(int precio, String nombre, int cantidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;

    }

    public Producto() {

    }




    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

