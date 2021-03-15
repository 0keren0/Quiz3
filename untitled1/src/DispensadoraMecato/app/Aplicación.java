package DispensadoraMecato.app;

import DispensadoraMecato.dominio.Dispensadora;
import DispensadoraMecato.dominio.Producto;

import java.util.List;

public class Aplicación {
    public static void main(String[] arg){
        Dispensadora dispensadora1 = new Dispensadora();

        //Productos de la lista
        Producto Mani = new Producto(1000, "Mani", 5);
        dispensadora1.getProductos().add(Mani);
        Producto Doritos = new Producto(1700, "Doritos", 0);
        dispensadora1.getProductos().add(Doritos);
        Producto Cheetos = new Producto(1200, "Cheetos", 6);
        dispensadora1.getProductos().add(Cheetos);
        Producto Detodito = new Producto(2000, "Detodito", 2);
        dispensadora1.getProductos().add(Detodito);
        Producto Maizitos = new Producto(1000, "Maizitos", 7);
        dispensadora1.getProductos().add(Maizitos);
        Producto Rizadas = new Producto(1200, "Rizadas", 8);
        dispensadora1.getProductos().add(Rizadas);
        Producto Galletas = new Producto(1200, "Galletas", 9);
        dispensadora1.getProductos().add(Galletas);
        Producto Margarita = new Producto(1200, "Margarita", 1);
        dispensadora1.getProductos().add(Margarita);
        Producto Oreo = new Producto(1200, "Oreo", 3);
        dispensadora1.getProductos().add(Oreo);
        Producto Trululu = new Producto(1200, "Trululu", 4);
        dispensadora1.getProductos().add(Trululu);



        System.out.println(dispensadora1.consultarProductoAgotado());
        dispensadora1.sacarUnidadDeUnProducto();
        dispensadora1.aumentarCantidadDeUnProducto();
        System.out.println(dispensadora1.consultaCantidadDeCadaProducto());
        System.out.println(dispensadora1.consultarCantidadDeProducto());
    }
}
