package Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(-2, 1));
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.restar(5, 2));
        assertEquals(-4, calculadora.restar(1, 5));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-15, calculadora.multiplicar(3, -5));
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.dividir(6, 3));
        assertEquals(-2.0, calculadora.dividir(6, -3));
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(6, 0);
        });
    }
}

