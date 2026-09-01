package com.ejemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Debe sumar dos números enteros correctamente")
    void testSumar() {
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "5 + 3 debería ser igual a 8");
    }

    @Test
    @DisplayName("Debe restar dos números enteros correctamente")
    void testRestar() {
        int resultado = calculadora.restar(10, 4);
        assertEquals(6, resultado, "10 - 4 debería ser igual a 6");
    }
}