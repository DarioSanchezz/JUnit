package SistemaOperativoUtils;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class SistemaOperativoUtilsTest {

    @Test
    void testFuncionalidadEspecificaWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows(), "La prueba solo se ejecuta en Windows");

        // Aquí va la lógica de la prueba específica para Windows
    }

    @Test
    void testFuncionalidadEspecificaMacOS() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esMac(), "La prueba solo se ejecuta en MacOS");

        // Aquí va la lógica de la prueba específica para MacOS
    }

    @Test
    void testFuncionalidadEspecificaLinux() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esLinux(), "La prueba solo se ejecuta en Linux");

        // Aquí va la lógica de la prueba específica para Linux
    }
}

