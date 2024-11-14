package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private static final double DELTA = 0.01;
    Calculadora calculadora = new Calculadora();

    @Test
    public void testSumarDosNumeros() {

        double resultado = calculadora.sumar(5.3, 1.4);
        assertEquals(6.7, resultado, DELTA, "La suma debe ser 6.7");
    }

    @Test
    public void testRestarDosNumeros() {
        double resultado = calculadora.restar(20.6, 5.2);
        assertEquals(15.4, resultado, DELTA, "La resta debe ser 15.4");
    }

    @Test
    public void testMultiplicarDosNumeros() {
        double resultado = calculadora.multiplicar(5.5, 3.7);
        assertEquals(20.35, resultado, DELTA, "La multiplicación debe ser 20.35");
    }

    @Test
    public void testDividirDosNumeros() {
        double resultado = calculadora.dividir(10.6, 8.2);
        assertEquals(1.29, resultado, DELTA, "La división debe ser 1.29");
    }

    @Test
    public void testDividirPorCero() {
        // Probar la división por cero (debe lanzar una excepción)
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0), "No se puede dividir por cero");
    }

    @Test
    public void testSumarUnNumero() {
        // Hacemos una suma primero para que ultimoResultado tenga un valor diferente a
        // 0
        calculadora.sumar(1.1); // ultimoResultado vale 1.1
        calculadora.sumar(3.3); // ultimoResultado ahora vale 4.4
        assertEquals(4.4, calculadora.getUltimoResultado(), DELTA, "El resultado debe ser 4.4");
    }

    @Test
    public void testRestarUnNumero() {
        calculadora.sumar(10);
        calculadora.restar(3.5);
        assertEquals(6.5, calculadora.getUltimoResultado(), DELTA, "El resultado debe ser 6.5");
    }

    @Test
    public void testMultiplicarUnNumero() {
        calculadora.sumar(3.3);
        calculadora.multiplicar(9.6);
        assertEquals(31.68, calculadora.getUltimoResultado(), DELTA, "El resultado debe ser 31.68");
    }

    @Test
    public void testDividirUnNumero() {
        calculadora.sumar(12.6);
        calculadora.dividir(5.3);
        assertEquals(2.37, calculadora.getUltimoResultado(), DELTA, "El resultado debe ser 2.37");
    }

    @Test
    public void testBorrarResultado() {
        calculadora.sumar(10);
        calculadora.borrarResultado();
        assertEquals(0.0, calculadora.getUltimoResultado(), "El resultado debe ser 0 después de reiniciar");
    }
}
