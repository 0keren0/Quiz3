package Desafio.dominio;

public class Directo extends Empleado{
    public long salario;
    public long pagoFijo;
    public static final double SALUD = 7.0/100;
    public static final double PENSION = 6.5/100;

    //CONSTRUCTOR
    public Directo(String nombre, long pagoFijo) {
        super(nombre);
        this.pagoFijo = pagoFijo;
    }


    //MÉTODOS
    public double calcularSalario(){
        salario = (long) (pagoFijo- calcularSalud() - calcularPension());
        return salario;
    }

    public double calcularSalud(){
        return pagoFijo*SALUD;
    }
    public double calcularPension(){
        return pagoFijo*PENSION;
    }


    //GETTERS AND SETTERS
    public long getSalario() {
        return salario;
    }

    public double getPagoFijo() {
        return pagoFijo;
    }

    public void setPagoFijo(long pagoFijo) {
        this.pagoFijo = pagoFijo;
    }
}
