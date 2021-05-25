package Agencia.app;

import Agencia.dominio.*;

import java.util.Arrays;
import java.util.List;

public class AppAgencia {
    public static void main(String[] args) {


        Inmueble apartamento1 = new Apartamento("Cra48", 50000000, 300000, false);
        Inmueble casa1 = new Casa("Nro50", 80000000, 450000, false);
        Inmueble lote1 = new Lote("A16", 45000000);
        Inmueble apartamento2 = new Apartamento("Int", 54670000, 350000, false);
        Inmueble casa2 = new Casa("502", 88900000, 550000, false);
        Inmueble lote2 = new Lote("2021", 55800000);

        List<Inmueble> inmuebles = Arrays.asList(apartamento1, apartamento2, casa1, casa2, lote1, lote2);
        Agencia agencia = new Agencia("Soluciones Inmobiliarias", inmuebles);


        agencia.agregarInmueble(apartamento1);
        agencia.agregarInmueble(apartamento2);
        agencia.agregarInmueble(casa1);
        agencia.agregarInmueble(casa2);
        agencia.agregarInmueble(lote1);
        agencia.agregarInmueble(lote2);

        agencia.arrendar(apartamento1);
        agencia.arrendar(casa2);


        System.out.println("\n A continuación podrá usted ver los inmuebles arrendados con sus especificaciones: \n\n" + agencia.getArrendados());
        System.out.println("\n\n\n\n Ahora podrá ver los inmuebles disponibles para arrendar: \n\n" + agencia.getArrendablesDisponibles());

        System.out.println("Por último podrá ver usted todos los inmuebles de " + agencia.getNombre() +":\n\n"+ agencia.getInmuebles());

        agencia.devolver(apartamento1);

        System.out.println("\n\n\n\nAhora puedes ver los inmuebles arrendados después de una entrega: \n\n" + agencia.getArrendados() );

        agencia.vender(lote1);
        agencia.vender(lote2);


        System.out.println("A continuación podrás ver los inmuebles disponibles después de vender los lotes: \n\n" + agencia.getInmuebles());

    }
}
