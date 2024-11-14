package es.santander.ascender.proyecto06;

public class Calculadora {

    /* 
    vamos a hacer dos metodos para cada una de las operaciones 
    la primera coge dos numeros y los opera
    la segunda tiene el ultimoresultado y hace la operacion
    propiedad => resultado con su getter no queremos su getter
    boton C para borrar todo y ponerlo a 0
     */

     private double ultimoResultado;

    public double getUltimoResultado() {
        return ultimoResultado;
    }

     public double sumar(double numero1, double numero2){
        return numero1+numero2;
     }

     public double sumar (double numero ){
        return  numero + getUltimoResultado();
     }

     public double restar(double numero1, double numero2){
        return numero1-numero2;
     }

     public double restar (double numero ){
        return  getUltimoResultado() - numero;
     }
}
