package com.retoangel.reto_tecnico.services;

import com.retoangel.reto_tecnico.models.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class AnimalServiceTest {

    @InjectMocks
    private AnimalService animalService;

    @Mock
    private List<String> tipos;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAgruparPorTipo() {

        Animal perro = new Animal("Perro", "Terrestre", "Guau");
        Animal gato = new Animal("Gato", "Terrestre", "Miau");
        Animal pajaro = new Animal("Pajaro", "Volador", "Pio Pio");
        Animal abeja = new Animal("Abeja", "Volador", "bzzzz bzzz");
        Animal pez = new Animal("Pez", "Acuatico", "glu glu");

        List<Animal> animales = Arrays.asList(perro, gato, pajaro, abeja, pez);

        when(tipos.contains("Terrestre")).thenReturn(true);
        when(tipos.contains("Volador")).thenReturn(true);
        when(tipos.contains("Acuatico")).thenReturn(false);
 
        animalService.agruparPorTipo(animales);


        assertTrue(animalService.getListadoAgrupado().containsKey("Terrestre"));
        assertTrue(animalService.getListadoAgrupado().containsKey("Volador"));
        assertFalse(animalService.getListadoAgrupado().containsKey("Acuatico"));
        

        assertEquals(2, animalService.getListadoAgrupado().get("Terrestre").size()); 
        assertEquals(2, animalService.getListadoAgrupado().get("Volador").size());
    }
}
