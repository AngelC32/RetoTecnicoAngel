package com.retoangel.reto_tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.retoangel.reto_tecnico.models.Animal;
import com.retoangel.reto_tecnico.services.AnimalService;

@SpringBootApplication
public class RetoTecnicoApplication implements CommandLineRunner {

    @Autowired
    private AnimalService animalService;

    public static void main(String[] args) {
        SpringApplication.run(RetoTecnicoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Animal> animales = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
 
            System.out.println("\nIngrese listado de animales: ");
            

            String cadenas = scanner.nextLine();
            

            String[] animalesEntradas = cadenas.split(",");
            

            for (String animalEntrada : animalesEntradas) {

                String[] partes = animalEntrada.trim().split("\\|");

                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String tipo = partes[1].trim();
                    String onomatopeya = partes[2].trim();


                    Animal animal = new Animal(nombre, tipo, onomatopeya);
                    animales.add(animal);
                }
            }

            Map<String, List<Animal>> listado = animalService.agruparPorTipo(animales);

            animalService.imprimirAgrupacion(listado);


            System.out.println("\nEnter para terminar...");
            scanner.nextLine(); 
        }
    }
}
