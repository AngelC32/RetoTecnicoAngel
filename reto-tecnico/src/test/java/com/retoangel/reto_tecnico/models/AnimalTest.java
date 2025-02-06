package com.retoangel.reto_tecnico.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal("Perro", "Terrestre", "Guau");
    }

    @Test
    void testConstructorSinParametros() {
        Animal animal = new Animal();
        assertNotNull(animal);
        assertNull(animal.getNombre());
        assertNull(animal.getTipo());
        assertNull(animal.getOnomatopeya());
    }

    @Test
    void testConstructorConNombre() {
        Animal animal = new Animal("Perro");
        assertEquals("Perro", animal.getNombre());
        assertNull(animal.getTipo());
        assertNull(animal.getOnomatopeya());
    }

    @Test
    void testConstructorConNombreYTipo() {
        Animal animal = new Animal("Pajaro", "Volador");
        assertEquals("Pajaro", animal.getNombre());
        assertEquals("Volador", animal.getTipo());
        assertNull(animal.getOnomatopeya());
    }

    @Test
    void testConstructorConNombreTipoYOnomatopeya() {
        Animal animal = new Animal("Abeja", "Volador", "bzzzz bzzz");
        assertEquals("Abeja", animal.getNombre());
        assertEquals("Volador", animal.getTipo());
        assertEquals("bzzzz bzzz", animal.getOnomatopeya());
    }

    @Test
    void testSettersYGetters() {
        animal.setNombre("Pez");
        animal.setTipo("Acuatico");
        animal.setOnomatopeya("Glu Glu");

        assertEquals("Pez", animal.getNombre());
        assertEquals("Acuatico", animal.getTipo());
        assertEquals("Glu Glu", animal.getOnomatopeya());
    }

    @Test
    void testSetNombre() {
        animal.setNombre("Pez");
        assertEquals("Pez", animal.getNombre());
    }

    @Test
    void testSetTipo() {
        animal.setTipo("Acuatico");
        assertEquals("Acuatico", animal.getTipo());
    }

    @Test
    void testSetOnomatopeya() {
        animal.setOnomatopeya("Glu Glu");
        assertEquals("Glu Glu", animal.getOnomatopeya());
    }

    @Test
    void testGetNombre() {
        assertEquals("Perro", animal.getNombre());
    }

    @Test
    void testGetTipo() {
        assertEquals("Terrestre", animal.getTipo());
    }

    @Test
    void testGetOnomatopeya() {
        assertEquals("Guau", animal.getOnomatopeya());
    }
}
