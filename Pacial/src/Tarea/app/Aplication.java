package Tarea.app;

import Tarea.dominio.Calculadora;

public class Aplication {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora("Casio");
        double resultado = Calculadora.multiplicar(3, 5);
        System.out.println(resultado + "  este es un resultado");
    }
}
