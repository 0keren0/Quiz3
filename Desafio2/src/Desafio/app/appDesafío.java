package Desafio.app;

import Desafio.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appDesafío {
    public static void main(String[] args) {

        //VALORES DADOS
        Empleado juan = new Directo("Juan", 5360000);
        Empleado julian = new Vendedor("Julian", 2450000, 55510000);
        Empleado carolina = new Vendedor("Carolina", 990000, 62487000);
        Empleado johanna = new Freelance("Johanna", 76000, 85);
        Empleado pedro = new Promotor("Pedro", 1500, 250, 48);
        Empleado david = new Directo("David", 2895000);
        Empleado gustavo = new Freelance("Gustavo", 52500, 60);

        List<Empleado> empleados = new ArrayList<>(Arrays.asList(juan, julian, carolina, johanna, pedro, david, gustavo));

        //CALCULO SALARIO
        Nomina nominaFinal = new Nomina(empleados);
        System.out.println("Esta es la nomina de los empleados");
        nominaFinal.calcularNomina();

        //LISTAS
        System.out.println("Estas son las listas de empleados");
        nominaFinal.listarDirectos();
        nominaFinal.listarFreelancers();
        nominaFinal.listarPromotores();

    }
}
