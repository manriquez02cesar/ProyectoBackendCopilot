package com.academia.batch.processor;

// Processor de Spring Batch que implementa ItemProcessor<Estudiante, Estudiante>.
// En el metodo process: calcula el promedio como (nota1 + nota2 + nota3) / 3,
// asigna el promedio al estudiante con setPromedio, registra un log con SLF4J
// "Step 1 - Procesando: {estudiante}" y devuelve el estudiante.

import com.academia.batch.model.Estudiante;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class EstudianteProcessor implements ItemProcessor<Estudiante, Estudiante> {

    private static final Logger logger = LoggerFactory.getLogger(EstudianteProcessor.class);

    @Override
    public Estudiante process(Estudiante estudiante) throws Exception {
        double promedio = (estudiante.getNota1() + estudiante.getNota2() + estudiante.getNota3()) / 3;
        estudiante.setPromedio(promedio);
        logger.info("Step 1 - Procesando: {}", estudiante);
        return estudiante;
    }

}