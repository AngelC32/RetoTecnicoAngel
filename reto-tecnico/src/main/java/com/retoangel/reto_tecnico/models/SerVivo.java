package com.retoangel.reto_tecnico.models;

public abstract class SerVivo {
    private String nombre;

    public SerVivo(){}
    public SerVivo(String nombre){
        this.nombre= nombre;
    }
    public void respirar() {
        System.out.println("Este ser vivo respira.");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
