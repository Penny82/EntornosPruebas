import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void prueba1suma() {
        assertEquals(4, Calculadora.sumar(2, 2)); // esto es un caso de prueba
    }

    @Test
    void prueba2suma() {
        assertEquals(0, Calculadora.sumar(2, -2));
    }

    @Test
    void pruebaresta1() {
        assertEquals(-14000, Calculadora.restar(1000, 15000));
    }
    @Test
    void pruebaresta2() {
        assertEquals(-33, Calculadora.restar(-3, 30));
    }
    @Test
    void pruebamultiplicar() {
        assertEquals(0, Calculadora.multiplicar(0, 5));
    }
    @Test
    void pruebamultiplicar2() {
        assertEquals(1000, Calculadora.multiplicar(1000, 1));

    }
    @Test
    void pruebadividir() {
        assertEquals(0, Calculadora.dividir(0, 5));
    }

    @Test
    void pruebadividir2() {
        assertEquals(0.1, Calculadora.dividir(1, 10));
    }
}