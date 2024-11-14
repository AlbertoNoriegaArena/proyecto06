package es.santander.ascender.proyecto06;

public class Perro {

    private double peso;

    public Perro(double peso) {
        this.peso = peso;
    }

    public void comer(double pesoComida){
            peso += pesoComida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

}
