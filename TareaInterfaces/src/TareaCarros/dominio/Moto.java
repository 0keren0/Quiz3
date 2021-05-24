package TareaCarros.dominio;

public class Moto extends Vehiculo implements Reparable{

    public Moto(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }

    @Override
    public void reparar() {
        System.out.println("Moto en reparación");
    }
    @Override
    public String toString(){
        return "Este vehículo es una Moto " + "con placa " + getPlaca();
    }
}
