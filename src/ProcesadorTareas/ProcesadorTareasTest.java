package ProcesadorTareas;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasTest {

    private final ProcesadorTareas procesador = new ProcesadorTareas();

    @Test
    void testEjecutarTareaLarga() throws InterruptedException {
        // Definir el tiempo máximo de espera en milisegundos
        int tiempoMaximoEspera = 500;

        // Ejecutar la tarea larga y verificar que no tarda más de lo esperado
        assertTimeoutPreemptively(Duration.ofMillis(tiempoMaximoEspera), () -> {
            procesador.ejecutarTareaLarga(300); // Tiempo esperado menor al tiempo máximo
        });

        // Esta llamada fallará porque la tarea tardará más tiempo del permitido
        assertTimeoutPreemptively(Duration.ofMillis(tiempoMaximoEspera), () -> {
            procesador.ejecutarTareaLarga(1000); // Tiempo esperado mayor al tiempo máximo
        });
    }
}

