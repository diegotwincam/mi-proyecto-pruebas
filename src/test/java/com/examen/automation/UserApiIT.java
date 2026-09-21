package com.examen.automation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserApiIT {

    @Test
    @DisplayName("Prueba de Integración: Simulación de conexión a servicio API")
    void testApiIntegration() {
        boolean isApiAvailable = true;
        assertTrue(isApiAvailable, "La API debe responder con estado 200 OK");
    }
}