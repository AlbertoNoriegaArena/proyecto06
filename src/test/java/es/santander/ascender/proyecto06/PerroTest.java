package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerroTest {
    @Test
    void testComer() {

        Perro cut = new Perro(22.6);

        cut.comer(2.5);

        assertEquals(25.1, cut.getPeso(), 0.000001);
    }
}
