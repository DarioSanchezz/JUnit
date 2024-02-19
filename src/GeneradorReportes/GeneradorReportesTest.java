package GeneradorReportes;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneradorReportesTest {

    private final GeneradorReportes generador = new GeneradorReportes();

    @TestFactory
    Collection<DynamicTest> testGenerarReporte() {
        List<String> datos1 = Arrays.asList("Dato 1", "Dato 2", "Dato 3");
        List<String> datos2 = Arrays.asList("A", "B", "C");
        List<String> datos3 = Arrays.asList("Este es un dato", "Otro dato", "Último dato");

        // Crear casos de prueba dinámicamente
        return Arrays.asList(
                dynamicTest("Prueba con datos 1", () -> {
                    String resultado = generador.generarReporte(datos1);
                    assertEquals("Reporte:\n- Dato 1\n- Dato 2\n- Dato 3\n", resultado);
                }),
                dynamicTest("Prueba con datos 2", () -> {
                    String resultado = generador.generarReporte(datos2);
                    assertEquals("Reporte:\n- A\n- B\n- C\n", resultado);
                }),
                dynamicTest("Prueba con datos 3", () -> {
                    String resultado = generador.generarReporte(datos3);
                    assertEquals("Reporte:\n- Este es un dato\n- Otro dato\n- Último dato\n", resultado);
                })
        );
    }

    // Método auxiliar para crear pruebas dinámicas
    private DynamicTest dynamicTest(String nombre, Executable ejecutable) {
        return DynamicTest.dynamicTest(nombre, ejecutable);
    }
}

