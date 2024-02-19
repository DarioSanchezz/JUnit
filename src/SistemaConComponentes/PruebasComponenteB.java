package SistemaConComponentes;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteB")
public class PruebasComponenteB {

    @Test
    void pruebaOperacionB() {
        ComponenteB componenteB = new ComponenteB();
        int resultado = componenteB.operacionB();
        assertEquals(42, resultado);
    }
}

