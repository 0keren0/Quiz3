package CalculadoraPOO.dominio;

import java.util.List;
public class Calculadora {

        public static double sumar(List<Double> sumados) {
            double suma = 0;
            for (Double numeroASum : sumados) {
                suma += numeroASum;
            }
            return suma;
        }
        public static double restar(List<Double> restados) {
            double resta = 0;
            for (Double numeroARes:restados) {
                resta -= numeroARes;
            }
            return resta;
        }
        public static double multiplicar(List<Double> multiplicados) {
            double multiplicar = 1;
            for (Double numeroAMulti:multiplicados
            ) {
                multiplicar *= numeroAMulti;
            }
            return multiplicar;
        }
        public static double dividir(List<Double> divididos) {
            double dividir = 0;
            for (Double numeroADividir: divididos
            ) {
                dividir /= numeroADividir;
            }
            return dividir;
        }
    }

