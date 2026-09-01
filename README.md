# Proyecto de Automatización y CI/CD - Taller 2

## Descripción
Este proyecto implementa una suite de pruebas unitarias atómicas en Java utilizando JUnit 5 y Maven, integrando un flujo automatizado de Integración Continua (CI) mediante GitHub Actions.

## Estructura del Proyecto
- `src/main/java/com/ejemplo/Calculadora.java`: Lógica de negocio principal.
- `src/test/java/com/ejemplo/CalculadoraTest.java`: Pruebas unitarias atómicas de suma y resta.
- `.github/workflows/ci.yml`: Pipeline para ejecución automática de pruebas en cada push o PR.

## Instrucciones de Ejecución Local
Para ejecutar los tests en tu entorno local, utiliza el comando:
```bash
mvn clean test