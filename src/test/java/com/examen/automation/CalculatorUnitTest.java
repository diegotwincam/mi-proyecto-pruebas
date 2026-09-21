package com.examen.automation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorUnitTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Prueba Unitaria: Suma correcta de dos números")
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Prueba Unitaria: Resta correcta de dos números")
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    @DisplayName("Prueba Unitaria: Excepción al dividir por cero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}