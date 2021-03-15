package DispensadoraMecato.dominio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Dispensadora {
    private List<Producto> productos;

    public Dispensadora() {
        this.productos = new ArrayList<Producto>();
    }

    public String consultarCantidadDeProducto() {
        String cantidadDeProducto = "";
        for (Producto produc : productos) {
            cantidadDeProducto = "Del producto con nombre:" + produc.getNombre() + ", hay" + produc.getCantidad() + "cantidad.";

        }
        return cantidadDeProducto;
    }

    public String consultarProductoAgotado() {
        String productoAgotado = "";
        for (Producto produc : productos) {
            if (produc.getCantidad() == 0) {
                productoAgotado = "El producto: " + produc.getNombre() + " está agotado";
            }
        }
        return productoAgotado;
    }

    public String consultaCantidadDeCadaProducto() {
        String cantidadDeCadaProducto = "";
        for (Producto product : productos) {
            cantidadDeCadaProducto = "El producto:" + product.getNombre() + ", tiene" + product.getCantidad() + "cantidades disponibles para la venta";
        }
        return cantidadDeCadaProducto;
    }

    public void aumentarCantidadDeUnProducto() {
        int entradaCantidades = 0;
        System.out.println("Ingrese el nombre del producto: ");
        Scanner nombreSuministrado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que agregará: ");
        Scanner cantidadSuministrada = new Scanner(System.in);
        for (Producto producto : productos) {
            if (nombreSuministrado.next() == producto.getNombre()) {
                System.out.println("La cantidad actual del producto" + producto.getNombre() + "es:" + producto.getCantidad());
                producto.setCantidad(cantidadSuministrada.nextInt() + producto.getCantidad());
                System.out.println("La nueva cantidad del producto" + producto.getNombre() + "es:" + producto.getCantidad());
            }
        }
    }

    public void sacarUnidadDeUnProducto() {
        String sacarUnidad = "";
        System.out.println("Ingrese el nombre del producto que desea comprar: ");
        Scanner nombreProductoAComprar = new Scanner(System.in);
        for (Producto productoVenta : productos) {
            if (productoVenta.getNombre().equalsIgnoreCase(nombreProductoAComprar.nextLine())) {
                if (productoVenta.getCantidad() == 0) {
                    System.out.println("No hay la suficiente cantidad");
                }
                else {
                    productoVenta.setCantidad(productoVenta.getCantidad() - 1);
                    System.out.println("El producto: "+ productoVenta.getNombre() + " ha sido vendido con éxito" );
                }
            } else {
                System.out.println("El producto que indicaste, no está a la venta :(");
            }
            //nombreProductoAComprar.nextLine() == productoVenta.getNombre()
        }

    }
    public String cantidadMaxima(){
        String cantidadMax = "";
        for (Producto productoss:productos) {
            if (productoss.getCantidad() > 8){
                cantidadMax = "Cantidad máxima alcanzada";
            }
        }
        return cantidadMax;
    }
    public List<Producto> getProductos() {
        return productos;
    }
}

