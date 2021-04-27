package CalculadoraPOO.app;

import CalculadoraPOO.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static final int SEGUIR = -1;
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;


    public static void main(String[] args) {



        //Variables
        int operacionElegida;
        double agregar = 0;
        boolean seguirEjecutando = true;
        boolean seguir = true;

        //CheckBox
        JCheckBox checkbox = new JCheckBox("Redondear");
        boolean redondear = checkbox.isSelected();

        //Array de Opciones
        List<Object> operacion = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", checkbox);

        //Array de numeros
        List<Double> numerosAñadidos = Arrays.asList();
        numerosAñadidos = new ArrayList<>(numerosAñadidos);

        //Repetir indefinidamente
        while(seguirEjecutando) {
            //Petición por pantalla
            operacionElegida = JOptionPane.showOptionDialog(null, "Elija la operación que desea realizar:", "Calculadora POO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, operacion.toArray(), null);

            if (operacionElegida == DIVIDIR) {
                mostrarMensaje("Recuerda que al escoger esta operación no puedes dividir por 0, es un error matemático.");
            }
            if (operacionElegida == MULTIPLICAR) {
                mostrarMensaje("Recuerda que al escoger esta operación no tiene sentido multiplicar por 0, tu resultado será siempre 0");
            }

            //Ciclo n números
            while (operacionElegida != -1) {
                while (agregar == 0) {
                    agregar = JOptionPane.showOptionDialog(null, "¿Quieres agregar un nuevo número?", "Números a operar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (agregar == 0) {
                        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el numero para operar"));
                        numerosAñadidos.add(numero);
                    } else
                        mostrarMensaje("Operación Terminada");
                    if (agregar == -1){
                        seguirEjecutando = false;
                    }
                }


                switch (operacionElegida) {

                        case SUMAR: {
                            double suma = Calculadora.sumar(numerosAñadidos);
                            double resultado = suma;
                                while (seguir == true) {
                                    if (checkbox.isSelected() == true) {
                                        mostrarMensaje("El resultado es: " + Math.round(resultado));
                                    } else {
                                        mostrarMensaje("El resultado es: " + resultado);
                                    }
                                    seguir = false;
                                }
                            break;
                        }
                        case RESTAR: {
                            double resta = Calculadora.restar(numerosAñadidos);
                            double resultado = resta;
                            while (seguir == true) {
                                if (checkbox.isSelected() == true) {
                                    mostrarMensaje("El resultado es: " + Math.round(resultado));
                                } else {
                                    mostrarMensaje("El resultado es: " + resultado);
                                }
                                seguir = false;
                            }
                            break;

                        }
                        case MULTIPLICAR: {
                            double multiplicacion = Calculadora.multiplicar(numerosAñadidos);
                            double resultado = multiplicacion;
                            while (seguir == true) {
                                if (checkbox.isSelected() == true) {
                                    mostrarMensaje("El resultado es: " + Math.round(resultado));
                                } else {
                                    mostrarMensaje("El resultado es: " + resultado);
                                }
                                seguir = false;
                            }
                            break;
                        }
                        case DIVIDIR: {

                            double division = Calculadora.dividir(numerosAñadidos);
                            double resultado = division;
                            if (numerosAñadidos.contains(0)) {
                                mostrarMensaje("Error en los numeros agregados, posiblemente un cero");
                                break;
                            }
                            while (seguir == true) {
                                if (checkbox.isSelected() == true) {
                                    mostrarMensaje("El resultado es: " + Math.round(resultado));
                                } else {
                                    mostrarMensaje("El resultado es: " + resultado);
                                }
                                seguir = false;
                            }
                            break;

                        }
                    case SEGUIR:
                            while (seguir == true) {
                                mostrarMensaje("No has seleccionado ninguna operación :(");
                                seguir = false;
                            }
                            seguirEjecutando = false;

                }
            }
        }
    }
    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Calculadora POO", JOptionPane.INFORMATION_MESSAGE);
    }
}

