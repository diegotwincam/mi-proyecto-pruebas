# Proyecto de Automatización de Pruebas - Examen Final

## Descripción del Proyecto
Proyecto de automatización de pruebas de software desarrollado en Java con Maven y JUnit 5, integrado con un pipeline de CI/CD en GitHub Actions para ejecución continua de pruebas y despliegue automatizado.

## Estrategia de Ramas
Se implementó la estrategia **GitFlow**:
- `main`: Código en producción y releases estables.
- `develop`: Rama principal de integración para el desarrollo continúo.

## Estrategia de Pruebas Implementada
1. **Pruebas Unitarias (`CalculatorUnitTest.java`):** Cobertura de la lógica matemática interna mediante JUnit 5.
2. **Pruebas de Integración (`UserApiIT.java`):** Validación de comunicación y respuestas de endpoints/servicios.
3. **Pruebas de Aceptación (`SystemAcceptanceTest.java`):** Validación de criterios de aceptación previa al despliegue.

## Ejecución Local
Para ejecutar el proyecto en tu máquina local:
```bash
# Compilar proyecto
mvn clean compile

# Ejecutar pruebas unitarias
mvn test -Dtest=CalculatorUnitTest

# Ejecutar pruebas de integración
mvn verify