package es.santander.ascender.proyecto06;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fichero {

    // Método en el que doy el nombre de un fichero y devuelvo el contenido del
    // mismo en memoria
    public byte[] leer(String nombreFichero) throws IOException {
        int valor;

        FileInputStream fis = new FileInputStream(nombreFichero);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Se compara con -1 porque los bits van de 0 a 255 asi que cuando ya no tiene
        // más byte en -1 sale del bucle
        while ((valor = fis.read()) != -1) {
            baos.write(valor);
        }
        return baos.toByteArray();
    }

    // Pequeña mejora respecto al anterior
    public byte[] leerEnBloques(String nombreFichero) throws IOException {
        int cuantos;
        byte[] valores = new byte[4096];

        FileInputStream fis = new FileInputStream(nombreFichero);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((cuantos = fis.read(valores)) != -1) {
            baos.write(valores, 0, cuantos);
        }
        return baos.toByteArray();
    }

    // necesito que pase el tamaño a escribir y el nombre de fichero
    public void escribir( String nombreFichero, byte [] datos) throws IOException{
        FileOutputStream fos = new FileOutputStream(nombreFichero);
        fos.write(datos);
    }

}
