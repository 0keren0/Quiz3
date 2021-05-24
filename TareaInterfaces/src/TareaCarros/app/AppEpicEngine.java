package TareaCarros.app;

import TareaCarros.dominio.*;


import java.util.Arrays;
import java.util.List;

public class AppEpicEngine {
    public static void main(String[] args) {

        Moto moto = new Moto("12AP", false);
        Camion camion = new Camion("26AP", true);
        Lancha lancha = new Lancha("23JN", false);
        Automovil automovil = new Automovil("29NV", true);


        List<Vehiculo> vehiculos = Arrays.asList(moto, camion, lancha, automovil);
        Taller epicEngine = new Taller(vehiculos);

        epicEngine.ingresar(moto);
        epicEngine.ingresar(lancha);
        epicEngine.repararVehiculo(lancha);
        epicEngine.retirar(moto);
        epicEngine.repararVehiculo(moto);


    }
}
