package Desafio.dominio;

public abstract class Empleado {
    private String nombre;

    //CONSTRUCTOR
    public Empleado(String nombre) {
        this.nombre = nombre;
    }


    //METODOS
    public abstract double calcularSalario();


    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

}
