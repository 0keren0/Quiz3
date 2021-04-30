package PPT.app;

import CalculadoraPOO.dominio.Calculadora;
import PPT.dominio.PPT;

import javax.swing.*;

import java.util.Arrays;
import java.util.List;

public class AppPPT {
    public static final int INSTRUCCIONES = 0;
    public static final int JUGAR = 1;
    public static final int RESULTADO = 2;
    public static boolean seguirEjecutando = true;

    public static void main(String[] args) {

        List<String> opcionesJuego = Arrays.asList("Ver Instrucciones", "Jugar", "Resultados");
        List<String> opcionJugada = Arrays.asList("Piedra", "Papel", "Tijera");
        while (seguirEjecutando == true) {
            int opcionInicio = JOptionPane.showOptionDialog(null, "Bienvenido, ¿qué quieres hacer?", "Piedra, Papel ó Tijera", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesJuego.toArray(), null);
            int opcionPC = (int) (Math.random() * 3);
            String resultadoPC = null;
            if (opcionPC == 0) {
                resultadoPC = "Piedra";
            }
            if (opcionPC == 1) {
                resultadoPC = "Papel";
            }
            if (opcionPC == 2) {
                resultadoPC = "Tijera";
            }


            switch (opcionInicio) {
                case INSTRUCCIONES: {
                    JOptionPane.showMessageDialog(null, "El objetivo es vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n" +
                            "La piedra aplasta la tijera. ...\n" +
                            "La tijera corta el papel. ...\n" +
                            "El papel envuelve la piedra. ...");
                    break;
                }
                case JUGAR: {
                    String jugadaElegida = String.valueOf(JOptionPane.showInputDialog(null, "Elige tu jugada", "Tu turno", JOptionPane.QUESTION_MESSAGE, null, opcionJugada.toArray(), null));
                    int jugadaInt = PPT.correccionString(jugadaElegida);
                    String resultado = PPT.resultadoParcial(opcionPC, jugadaInt);
                    mostrarMensaje("El computador eligió: " + resultadoPC + "\n Tú elegiste: " + jugadaElegida + "\n Según sus jugadas: " + resultado);
                    break;
                }
                case RESULTADO: {
                    String resultadoFinal = PPT.resultadoFinal();
                    mostrarMensaje(resultadoFinal);
                    seguirEjecutando = false;
                    break;
                }
                default:
                    mostrarMensaje("No seleccionó ninguna opción :(");
                    seguirEjecutando = false;
            }
        }
    }
    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Calculadora POO", JOptionPane.INFORMATION_MESSAGE);
    }
}
