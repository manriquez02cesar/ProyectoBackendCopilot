package com.academia.batch.processor;

import com.academia.batch.model.Estudiante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProcessorTest {

    @Test
    void computesAverageForTypicalScores() throws Exception {
        Estudiante estudiante = new Estudiante();
        estudiante.setNota1(80);
        estudiante.setNota2(90);
        estudiante.setNota3(100);

        Estudiante resultado = new EstudianteProcessor().process(estudiante);

        assertEquals(90.0, resultado.getPromedio(), 0.0001);
    }

    @Test
    void computesAverageWhenAllScoresAreZero() throws Exception {
        Estudiante estudiante = new Estudiante();
        estudiante.setNota1(0);
        estudiante.setNota2(0);
        estudiante.setNota3(0);

        Estudiante resultado = new EstudianteProcessor().process(estudiante);

        assertEquals(0.0, resultado.getPromedio(), 0.0001);
    }

    @Test
    void computesAverageForDecimalScores() throws Exception {
        Estudiante estudiante = new Estudiante();
        estudiante.setNota1(70.5);
        estudiante.setNota2(80.25);
        estudiante.setNota3(90.75);

        Estudiante resultado = new EstudianteProcessor().process(estudiante);

        assertEquals(80.5, resultado.getPromedio(), 0.0001);
    }

    @Test
    void throwsExceptionWhenStudentIsNull() {
        assertThrows(NullPointerException.class, () -> new EstudianteProcessor().process(null));
    }
}