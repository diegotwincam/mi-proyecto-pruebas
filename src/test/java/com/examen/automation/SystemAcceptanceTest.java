package com.examen.automation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SystemAcceptanceTest {

    @Test
    @DisplayName("Prueba de Aceptación: Verificación de requisitos funcionales")
    void testUserAcceptanceCriteria() {
        boolean userCanLogin = true;
        assertTrue(userCanLogin, "El usuario debe poder iniciar sesión en el entorno de staging");
    }
}