package ConversorTemperatura;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest
    @ValueSource(doubles = {0, 10, 20, 30, 40}) // Valores de temperatura en grados Celsius
    void testCelsiusAFahrenheit(double celsius) {
        double fahrenheit = conversor.celsiusAFahrenheit(celsius);
        double expected = (celsius * 9 / 5) + 32;
        assertEquals(expected, fahrenheit, 0.001); // Comprobar que la conversión es correcta
    }

    @ParameterizedTest
    @ValueSource(doubles = {32, 40, 50, 60, 70}) // Valores de temperatura en grados Fahrenheit
    void testFahrenheitACelsius(double fahrenheit) {
        double celsius = conversor.fahrenheitACelsius(fahrenheit);
        double expected = (fahrenheit - 32) * 5 / 9;
        assertEquals(expected, celsius, 0.001); // Comprobar que la conversión es correcta
    }
}

