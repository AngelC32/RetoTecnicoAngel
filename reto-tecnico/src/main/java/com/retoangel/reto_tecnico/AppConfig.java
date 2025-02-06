package com.retoangel.reto_tecnico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    List<String> tipos(){
        ArrayList<String> listadoTipos = new ArrayList<>();

        listadoTipos.add("Terrestre");
        listadoTipos.add("Acuatico");
        listadoTipos.add("Volador");

        return listadoTipos;
    }
}
