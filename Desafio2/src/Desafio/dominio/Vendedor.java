package Desafio.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;
    private long comision;



    //CONSTRUCTOR
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }


    //METODOS

    public double calcularSalario(){
        salario = (long) ((pagoFijo - calcularSalud() - calcularPension()) + calcularComision());
        return salario;
    }
    public long calcularComision() {
        if (pagoFijo < 999999){
            return (ventasDelMes * 5/100);
        }else {
            return (long) (ventasDelMes * 4.5/100);
        }
    }


    //GETTERS AND SETTERS
    public double getVentasDelMes() {
        return ventasDelMes;
    }

    public double getComision() {
        return comision;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }


}
