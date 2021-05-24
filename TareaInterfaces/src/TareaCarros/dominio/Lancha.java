package TareaCarros.dominio;

public class Lancha extends Vehiculo implements Reparable{


    public Lancha(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }

    @Override
    public void reparar() {
        System.out.println("Lancha en reparación");
    }
    @Override
    public String toString(){
        return "Este vehículo es una Lancha con placa " + getPlaca();
    }
}
