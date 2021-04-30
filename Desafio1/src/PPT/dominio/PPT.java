package PPT.dominio;

public class PPT {
    public static int ganadasJugador = 0;
    public static int ganadasCumputador = 0;
    public static int jugadaInt = 0;

    public static String resultadoParcial(int randomPc, int jugadaPersona){
        String resultado = null;
        if (randomPc == jugadaPersona){
            resultado = "Has empatado";
        }
        if (randomPc == 0 & jugadaPersona == 1){
            resultado = "Ganaste!";
            ganadasJugador++;
        }
        if (randomPc == 0 & jugadaPersona == 2){
            resultado = "Gana el computador :(";
            ganadasCumputador++;
        }
        if (randomPc == 1 & jugadaPersona == 0){
            resultado = "Gana el computador :(";
            ganadasCumputador++;
        }
        if (randomPc == 1 & jugadaPersona == 2){
            resultado = "Ganaste!";
            ganadasJugador++;
        }
        if (randomPc == 2 & jugadaPersona == 0){
            resultado = "Ganaste!";
            ganadasJugador++;
        }
        if (randomPc == 2 & jugadaPersona == 1){
            resultado = "Gana el computador :(";
            ganadasCumputador++;
        }

        return resultado;
    }
    public static int correccionString(String jugada){
        if (jugada.equalsIgnoreCase("piedra")){
            jugadaInt = 0;
        }
        if (jugada.equalsIgnoreCase("papel")){
            jugadaInt = 1;
        }
        if (jugada.equalsIgnoreCase("tijera")){
            jugadaInt = 2;
        }
    return jugadaInt;
    }
    public static String resultadoFinal(){
        String resultF  = null;
        if (ganadasCumputador > ganadasJugador){
            resultF = "Ha ganado el computador \n" + ganadasCumputador +" puntos";
        }
        if (ganadasCumputador < ganadasJugador){
            resultF = "Has ganado con \n" + ganadasJugador +" puntos";
        }
        if (ganadasCumputador == ganadasJugador){
            resultF = "Han empatado con \n" + ganadasJugador + " puntos cada uno" ;
        }
    return resultF;
    }

}
