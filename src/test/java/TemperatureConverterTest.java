import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
   TemperatureConverter converter = new TemperatureConverter();
    @Test
    void fahrenheitToCelsius() {
        assertEquals(10,converter.fahrenheitToCelsius(50),0.01);
        assertEquals(20,converter.fahrenheitToCelsius(68),0.01);
        assertEquals(25,converter.fahrenheitToCelsius(77),0.01);

    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(212,converter.celsiusToFahrenheit(100),0.01);
        assertEquals(122,converter.celsiusToFahrenheit(50),0.01);
        assertEquals(86,converter.celsiusToFahrenheit(30),0.01);
    }


    @Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertTrue(converter.isExtremeTemperature(60));
        assertFalse(converter.isExtremeTemperature(0));
        assertFalse(converter.isExtremeTemperature(30));
    }

 }
