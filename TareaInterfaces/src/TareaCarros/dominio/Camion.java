package TareaCarros.dominio;

public class Camion extends Vehiculo implements Reparable{
    public Camion(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }

    @Override
    public void reparar() {
        System.out.println("Camión en reparación");
    }

    @Override
    public String toString(){
        return "Este vehículo es un Camión" + " con placa " + getPlaca();
    }
}
