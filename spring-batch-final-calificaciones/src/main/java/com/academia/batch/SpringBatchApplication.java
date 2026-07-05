package com.academia.batch;

// Clase principal de Spring Boot con @SpringBootApplication y el metodo main
// que arranca la aplicacion con SpringApplication.run.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication {
    public static void main(String[] args) {
        // Arranca la aplicacion Spring Boot
        SpringApplication.run(SpringBatchApplication.class, args);
    }


}