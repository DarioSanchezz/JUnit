package CalculadoraFinanciera;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFinancieraTest {

    private final CalculadoraFinanciera calculadora = new CalculadoraFinanciera();


    @Test
    void calcularInteresCompuesto_PruebaBasica_ResultadoCorrecto() {
        double resultado = calculadora.calcularInteresCompuesto(1000, 0.05, 1, 1);
        assertEquals(1050, resultado);
    }

    @Test
    void calcularInteresCompuesto_TasaInteresCero_ResultadoCorrecto() {
        double resultado = calculadora.calcularInteresCompuesto(1000, 0, 12, 5);
        assertEquals(1000, resultado);
    }

    @Test
    void calcularInteresCompuesto_PrincipalCero_ResultadoCorrecto() {
        double resultado = calculadora.calcularInteresCompuesto(0, 0.1, 4, 3);
        assertEquals(0, resultado);
    }

    @Test
    void calcularInteresCompuesto_TasaInteresNegativa_Excepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularInteresCompuesto(500, -0.05, 2, 2);
        });
    }


    @Test
    void calcularVPN_PruebaBasica_ResultadoCorrecto() {
        double[] flujosCaja = { -1000, 300, 400, 500, 200 };
        double resultado = calculadora.calcularVPN(0.1, flujosCaja);
        assertEquals(334.71, resultado, 0.01);
    }

    @Test
    void calcularVPN_TasaDescuentoNegativa_Excepcion() {
        double[] flujosCaja = { -2000, 500, 600, 800 };
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularVPN(-0.05, flujosCaja);
        });
    }

    @Test
    void calcularVPN_FlujoCajaInicialCero_ResultadoCorrecto() {
        double[] flujosCaja = { 0, 300, 400, 500 };
        double resultado = calculadora.calcularVPN(0.08, flujosCaja);
        assertEquals(1035.19, resultado, 0.01);
    }

    @Test
    void calcularVPN_FlujoCajaVacio_ResultadoCero() {
        double[] flujosCaja = {};
        double resultado = calculadora.calcularVPN(0.05, flujosCaja);
        assertEquals(0, resultado);
    }
}

