package Excepciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    public void testValidarTexto() {
        Validador validador = new Validador();

        // Prueba con texto válido
        assertDoesNotThrow(() -> {
            validador.validarTexto("Texto válido");
        });

        // Prueba con texto nulo
        assertThrows(TextoInvalidoException.class, () -> {
            validador.validarTexto(null);
        });

        // Prueba con texto vacío
        assertThrows(TextoInvalidoException.class, () -> {
            validador.validarTexto("");
        });
    }
}

