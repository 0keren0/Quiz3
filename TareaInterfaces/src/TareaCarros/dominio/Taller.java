package TareaCarros.dominio;

import java.util.List;


public class Taller {

    private List<Vehiculo> vehiculos;

    public Taller(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void repararVehiculo(Vehiculo vehiculo) {
            if (vehiculo instanceof Reparable) {
                vehiculo.setMotorBueno(true);
            }
    }

    public boolean ingresar(Vehiculo vehiculo) {
        return !vehiculo.isMotorBueno();
    }

    public boolean retirar(Vehiculo vehiculo) {
        return vehiculo.isMotorBueno();
    }

    //Duda con el tipo de Retorno
    public void listarVehiculos(){
        vehiculos.forEach(lista -> {
            if (lista.ingresar() == true) {
                System.out.println(lista.getNombre() + " está en el taller");
            } else {
                System.out.println(lista.getNombre() + " no está en el taller");
            }
        });
    }
}
