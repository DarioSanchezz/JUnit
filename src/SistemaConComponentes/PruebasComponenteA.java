package SistemaConComponentes;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteA")
public class PruebasComponenteA {

    @Test
    void pruebaOperacionA() {
        ComponenteA componenteA = new ComponenteA();
        String resultado = componenteA.operacionA();
        assertEquals("Resultado de operación A", resultado);
    }
}

