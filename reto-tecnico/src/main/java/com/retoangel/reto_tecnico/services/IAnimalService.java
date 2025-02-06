package com.retoangel.reto_tecnico.services;

import java.util.List;
import java.util.Map;

import com.retoangel.reto_tecnico.models.Animal;

public interface IAnimalService {

    public Map<String, List<Animal>> agruparPorTipo(List<Animal> animales);
    public void imprimirAgrupacion(Map<String, List<Animal>> listadoAgrupado);
}
