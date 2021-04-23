package TareaJO.app;

import Tarea.dominio.Calculadora;

import javax.swing.*;
import java.util.List;
import java.util.Arrays;

public class AppCalculadora {
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;
    public static void main(String[] args) {
        List<String> operacion = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir");

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero para operar"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero para operar"));
        int operacionElegida = JOptionPane.showOptionDialog(null, "Elija la operación que desea realizar:", "Calculadora POO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, operacion.toArray(), null );

            switch (operacionElegida) {
                case SUMAR: {
                    double suma = Calculadora.sumar(numero1, numero2);
                    mostrarMensaje("Elegiste " + operacionElegida + ", el numero " + numero1 + ", y el numero" + numero2 + "dando igual a " + suma );
                    break;
                }
                case RESTAR: {
                    double resta = Calculadora.restar(numero1, numero2);
                    mostrarMensaje("Elegiste " + operacionElegida + ", el numero " + numero1 + ", y el numero" + numero2 + "dando igual a " + resta );
                    break;
                }
                case MULTIPLICAR: {
                    double multiplicacion = Calculadora.multiplicar(numero1, numero2);
                    mostrarMensaje("Elegiste " + operacionElegida + ", el numero " + numero1 + ", y el numero" + numero2 + "dando igual a " + multiplicacion );
                    break;
                }
                case DIVIDIR: {
                    double division = Calculadora.dividir(numero1, numero2);
                    mostrarMensaje("Elegiste " + operacionElegida + ", el numero " + numero1 + ", y el numero" + numero2 + "dando igual a " + division);
                    break;
                }
                default:
                    mostrarMensaje("No seleccionó ninguna operación :(");

            }


    }
    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Calculadora POO", JOptionPane.INFORMATION_MESSAGE);
    }
}
