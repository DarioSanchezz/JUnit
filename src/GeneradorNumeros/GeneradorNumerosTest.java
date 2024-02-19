package GeneradorNumeros;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorNumerosTest {

    private final GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    void generarNumeroAleatorioEnRango_GeneraNumerosEnRangoCorrecto() {
        int min = -100;
        int max = 100;
        for (int i = 0; i < 1000; i++) {
            int numero = generador.generarNumeroAleatorioEnRango(min, max);
            assertTrue(numero >= min && numero <= max);
        }
    }

    @Test
    void esPar_NumeroPar_RetornaTrue() {
        assertTrue(generador.esPar(0));
        assertTrue(generador.esPar(2));
        assertTrue(generador.esPar(4));
        assertTrue(generador.esPar(6));
    }

    @Test
    void esPar_NumeroImpar_RetornaFalse() {
        assertFalse(generador.esPar(1));
        assertFalse(generador.esPar(3));
        assertFalse(generador.esPar(5));
        assertFalse(generador.esPar(7));
    }

    @Test
    void esPar_NumeroAleatorio_RetornaResultadoCorrecto() {
        for (int i = 0; i < 1000; i++) {
            int numero = generador.generarNumeroAleatorioEnRango(-1000, 1000);
            assertEquals(numero % 2 == 0, generador.esPar(numero));
        }
    }
}

