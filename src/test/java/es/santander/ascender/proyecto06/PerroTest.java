package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class PerroTest {
    @Test
    void testComer() {

        Perro cut = new Perro(1, 22.6);

        cut.comer(2.5);

        assertEquals(25.1, cut.getPeso(), 0.000001);
    }

    @Test
    void testCompararColeccionesTrue(){

    }

    @Test
    void testCompararColeccionesFalse(){
        
    }

    public boolean comparar (List <Perro> lista1, List <Perro> lista2 ){
        if(lista1 == null && lista2== null){
            return true;
        }
        if (lista1 == null || lista2 == null) {
            return false;
        }
        if (lista1.size() != lista2.size()) {
            return false;
        }
        for (int i = 0; i < lista1.size(); i++) {
            // proteccion contra nulos
            if (! Objects.equals(lista1.get(i), lista2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
