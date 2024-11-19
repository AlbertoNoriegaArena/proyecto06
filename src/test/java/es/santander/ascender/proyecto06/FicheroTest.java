package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FicheroTest {

    private Fichero cut;

    // @BeforeAll => Lo hace una sola vez y hace los test
    // IMPORTANTE: Si queremos usar BeforeAll el metodo setUp tiene que ser static para que no de error
    @BeforeAll
    public static void setUpAll(){

    }

    // @FeforeEach => Lo hace una antes de cada test
    // Es el que vamos a usar
    // Con beforeEach el metodo setUp NO puede ser static
    @BeforeEach
    public void setUp() {

        
        // Opción 1: Crear una instancia de la subclase FicheroTesting, que extiende de Fichero
        cut = new FicheroTesting();

        // Opción 2: Crear una instancia anónima de Fichero sobre la marcha
        // Generamos una clase sobre la marcha para crear el objeto. Una vez creado el objeto, la clase se pierde
        Fichero instanciaAnonima = new Fichero() {
            @Override
            public void hacerElLunes() {
                // Implementación vacía del método abstracto
                throw new UnsupportedOperationException("Unimplemented method 'hacerElLunes'");
            }
        };
    }
    
    @Test
    void testEscribir() throws IOException {
        // Crear un fichero temporal que se guarda en "/tmp" 
        File ficheroTemporalACrear = File.createTempFile("hola", ".juan");
        String ruta = ficheroTemporalACrear.getAbsolutePath();
        // Una vez creado, le borramos
        ficheroTemporalACrear.delete();

        byte [] datosAEscribir = new byte[5478]; // Creamos un array de bytes con ceros

        assertFalse(ficheroTemporalACrear.exists(), "El fichero existe");

        cut.escribir(ruta, datosAEscribir);

        assertTrue(ficheroTemporalACrear.exists(), "El fichero existe");

        assertEquals(5478, ficheroTemporalACrear.length());
    }

    @Test
    void testLeerEnBloques() {
        // Fichero de recursos
    }

    // Creamos una clase inner (en el mismo fichero del test) para poder instanciar objetos ya que Fichero es una clase abstracta
    public class FicheroTesting extends Fichero {

        // Como la clase es abstracta hay que hacer override del metodo abstracto del padre
        @Override
        public void hacerElLunes() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hacerElLunes'");
        }}
}
