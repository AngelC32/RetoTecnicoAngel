package com.retoangel.reto_tecnico.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.retoangel.reto_tecnico.models.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements IAnimalService {

    public AnimalService(){}

    @Autowired
    private List <String> tipos;

    private Map<String, List<Animal>> listadoAgrupado = new HashMap<>();

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    public Map<String, List<Animal>> getListadoAgrupado() {
        return listadoAgrupado;
    }

    public void setListadoAgrupado(Map<String, List<Animal>> listadoAgrupado) {
        this.listadoAgrupado = listadoAgrupado;
    }

    public Map<String, List<Animal>> agruparPorTipo(List<Animal> animales) {
        animales.forEach(
            animal->{
                if(tipos.contains(animal.getTipo())){
                    if (!listadoAgrupado.containsKey(animal.getTipo())) {
                        listadoAgrupado.put(animal.getTipo(), new ArrayList<>());
                    }
                    listadoAgrupado.get(animal.getTipo()).add(animal);
                }
                
            }
        );

        return listadoAgrupado;
        
    }

    public void imprimirAgrupacion(Map<String, List<Animal>> listadoAgrupado){
        listadoAgrupado.forEach(
            (tipo,listado)->{
                System.out.println("\n"+tipo+":");
                listado.forEach(animal-> System.out.println(animal.getNombre()));
            }
        );
        
    }

}
