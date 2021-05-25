package Agencia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    //Atributos
    private String nombre;
    private List<Inmueble> inmuebles;

    //Listas Auxiliares
    private List<Inmueble> inmuebleArrendado;
    private List<Inmueble> inmueblesNoArrendado;

    //Constructor
    public Agencia(String nombre, List<Inmueble> inmuebles) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<Inmueble>();
        this.inmuebleArrendado = new ArrayList<Inmueble>();
        this.inmueblesNoArrendado = new ArrayList<Inmueble>();
    }

    //Métodos
    public void agregarInmueble(Inmueble inmueble){
        this.inmuebles.add(inmueble);
    }

    public boolean arrendar(Inmueble inmueble){
       if (inmueble instanceof Arrendable && inmueble.isArrendado() == false){
            inmueble.setArrendado(true);
            inmuebleArrendado.add(inmueble);
            return true;
       }return false;
    }

    public boolean devolver(Inmueble inmueble){
        if(inmueble.isArrendado() == true && inmueble instanceof Arrendable){
           inmueble.setArrendado(false);
           inmuebleArrendado.remove(inmueble);
           return true;
        }
        return false;
    }

    public boolean vender(Inmueble inmueble){
        if (inmueble.isArrendado() == true) {
            return false;
        }else
            this.inmuebles.remove(inmueble);
            return true;
    }
    public List<Inmueble> getArrendablesDisponibles(){
        for (Inmueble inmuebleDisponible: inmuebles) {
            if (inmuebleDisponible.isArrendado() == false && inmuebleDisponible instanceof Arrendable){
                inmueblesNoArrendado.add(inmuebleDisponible);
            }
        }
        return inmueblesNoArrendado;
    }

    public List<Inmueble> getArrendados(){
        return inmuebleArrendado;
    }



    //Getters
    public String getNombre() {
        return nombre;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }
}
