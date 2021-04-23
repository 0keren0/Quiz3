package Tarea.dominio;

import java.util.List;

public class Calculadora {
    private String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    public static double sumar(double numero1, double numero2) {
        double suma = numero1 + numero2;
                return suma;
    }
    public static double sumar(List<Double> sumados) {
        double suma = 0;
        for (Double numeroASum:sumados) {
            suma += numeroASum;
        }
        return suma;
    }
    public static int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }
    public static double restar(double numero1, double numero2) {
        double resta = numero1 - numero2;
        return resta;
    }
    public static int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }
    public static double restar(List<Double> restados) {
        double resta = 0;
        for (Double numeroARes:restados) {
            resta -= numeroARes;
        }
        return resta;
    }
    public static double multiplicar(double numero1, double numero2) {
        double multiplicar = numero1 * numero2;
        return multiplicar;
    }
    public static int multiplicar(int numero1, int numero2) {
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }
    public static double multiplicar(List<Double> multiplicados) {
        double multiplicar = 0;
        for (Double numeroAMulti:multiplicados
             ) {
            multiplicar -= numeroAMulti;
        }
        return multiplicar;
    }
    public static double dividir(double numero1, double numero2) {
        double dividir = numero1 / numero2;
        return dividir;
    }
    public static double dividir(int numero1, int numero2) {
        double dividir = numero1 / numero2;
        return dividir;
    }
    public static double dividir(List<Double> divididos) {
        double dividir = 0;
        for (Double numeroADividir: divididos
             ) {
            dividir -= numeroADividir;
        }
        return dividir;
    }
}
