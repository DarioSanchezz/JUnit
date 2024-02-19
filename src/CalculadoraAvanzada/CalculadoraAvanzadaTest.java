package CalculadoraAvanzada;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {

    private final CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

    @Test
    void testRaizCuadrada() {
        double resultado = calculadora.raizCuadrada(25);
        assertEquals(5, resultado);
    }

    @Test
    void testLogaritmoNatural() {
        double resultado = calculadora.logaritmoNatural(10);
        assertEquals(2.302585092994046, resultado);
    }

    @Disabled("El cálculo del factorial está pendiente de implementación")
    @Test
    void testFactorial() {
        long resultado = calculadora.factorial(5);
        assertEquals(120, resultado);
    }
}

