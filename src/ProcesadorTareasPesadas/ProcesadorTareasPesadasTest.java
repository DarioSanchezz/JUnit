package ProcesadorTareasPesadas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcesadorTareasPesadasTest {

    @Test
    void realizarOperacionIntensiva_DeberiaEjecutarEnTiempoRazonable() {
        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

        // Establecemos un límite de tiempo en milisegundos
        long limiteTiempo = 5000; // 5 segundos

        // Obtenemos el tiempo inicial
        long tiempoInicial = System.currentTimeMillis();

        // Ejecutamos la operación intensiva
        procesador.realizarOperacionIntensiva();

        // Obtenemos el tiempo final
        long tiempoFinal = System.currentTimeMillis();

        // Calculamos el tiempo de ejecución
        long tiempoEjecucion = tiempoFinal - tiempoInicial;

        // Verificamos que el tiempo de ejecución esté dentro del límite aceptable
        assertTrue(tiempoEjecucion < limiteTiempo, "El tiempo de ejecución excede el límite aceptable");
    }
}

