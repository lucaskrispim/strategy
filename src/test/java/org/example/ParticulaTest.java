package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticulaTest {

    @Test
    void deveCalcularVelocidadeParticula() {
        Particula particula = new Particula();
        particula.calcularVelocidade(100.0f, 2.0f);
        assertEquals(50.0f, particula.getResultado());
    }

    @Test
    void deveCalcularAceleracaoParticula() {
        Particula particula = new Particula();
        particula.calcularAceleracao(20.0f, 4.0f);
        assertEquals(5.0f, particula.getResultado());
    }

    @Test
    void deveCalcularForcaParticula() {
        Particula particula = new Particula();
        particula.calcularForca(10.0f, 9.8f);
        assertEquals(98.0f, particula.getResultado());
    }

    @Test
    void deveCalcularEnergiaCineticaParticula() {
        Particula particula = new Particula();
        particula.calcularEnergiaCinetica(2.0f, 3.0f);
        assertEquals(9.0f, particula.getResultado());
    }

    @Test
    void deveCalcularTrabalhoParticula() {
        Particula particula = new Particula();
        particula.calcularTrabalho(50.0f, 2.0f);
        assertEquals(100.0f, particula.getResultado());
    }

    @Test
    void naoDeveCalcularVelocidadeComTempoZero() {
        try {
            Particula particula = new Particula();
            particula.calcularVelocidade(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tempo não pode ser zero", e.getMessage());
        }
    }

    @Test
    void naoDeveCalcularAceleracaoComTempoZero() {
        try {
            Particula particula = new Particula();
            particula.calcularAceleracao(20.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tempo não pode ser zero", e.getMessage());
        }
    }
}