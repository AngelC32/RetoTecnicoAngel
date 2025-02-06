package com.retoangel.reto_tecnico.models;


public class Animal extends SerVivo{
    private String tipo;
    private String onomatopeya;

    public Animal(){}
    public Animal(String nombre) {
        super(nombre);
    }

    public Animal(String nombre,String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public Animal(String nombre,String tipo, String onomatopeya) {
        super(nombre);
        this.tipo = tipo;
        this.onomatopeya= onomatopeya;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public void setOnomatopeya(String onomatopeya) {
        this.onomatopeya = onomatopeya;
    }
    
}
