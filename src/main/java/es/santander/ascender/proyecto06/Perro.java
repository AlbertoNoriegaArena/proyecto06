package es.santander.ascender.proyecto06;

public class Perro {

    private long id;

    private double peso;

    public Perro(int id, double peso) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    // Sobreescribir el método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perro other = (Perro) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Perro [id=" + id + ", peso=" + peso + "]";
    }
    

}
