package Desafio.dominio;

public class Freelance extends Empleado {
    private long valorHora;
    private int horasTrabajadas;

    //CONSTRUCTOR
    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    //METODOS
    public double calcularSalario(){
        return valorHora*horasTrabajadas;
    }



    //GETTERS AND SETTERS
    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
