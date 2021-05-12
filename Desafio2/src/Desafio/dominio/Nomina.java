package Desafio.dominio;

import java.util.List;

public class Nomina{
    private List<Empleado> empleados;

    public Nomina(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void calcularNomina(){
        empleados.forEach(empleado -> {
            System.out.println("El salario de " + empleado.getNombre() + " es: " + empleado.calcularSalario());
        });

    }
    public void listarDirectos(){
        empleados.forEach(empleado -> {
            if(empleado instanceof Directo){
            System.out.println(empleado.getNombre() + " es empleado Directo");
            }
        });
    }
    public void listarFreelancers(){
        empleados.forEach(empleado -> {
            if(empleado instanceof Freelance){
                System.out.println(empleado.getNombre()+ " es empleado Freelance");
            }
        });
    }
    public void listarPromotores(){
        empleados.forEach(empleado -> {
            if(empleado instanceof Promotor){
                System.out.println(empleado.getNombre()+ " es empleado Promotor");
            }
        });
    }
}
