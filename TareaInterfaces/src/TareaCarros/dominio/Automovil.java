package TareaCarros.dominio;

public class Automovil extends Vehiculo implements Reparable{


    public Automovil(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }

    @Override
    public void reparar() {
        System.out.println("Automóvil en reparación");
    }
    @Override
    public String toString(){
        return "Este vehículo es una Automóvil con placa " + getPlaca();
    }
}
