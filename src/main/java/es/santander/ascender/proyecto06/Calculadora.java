package es.santander.ascender.proyecto06;

public class Calculadora {

   /*
    * vamos a hacer dos metodos para cada una de las operaciones
    * la primera coge dos numeros y los opera
    * la segunda tiene el ultimoresultado y hace la operacion
    * propiedad => resultado con su getter no queremos su setter
    * boton C para borrar todo y ponerlo a 0
    */

   // PROPIEDADES
   private double ultimoResultado;

   // CONSTRUCTOR
   public Calculadora() {
      this.ultimoResultado = 0;
   }

   // METODOS
   public double sumar(double numero1, double numero2) {
      return numero1 + numero2;
   }

   public double sumar(double numero) {
      this.ultimoResultado += numero;
      return this.ultimoResultado;
   }

   public double restar(double numero1, double numero2) {
      return numero1 - numero2;
   }

   public double restar(double numero) {
      this.ultimoResultado -= numero;
      return this.ultimoResultado;
   }

   public double multiplicar(double numero1, double numero2) {
      return numero1 * numero2;
   }

   public double multiplicar(double numero) {
      this.ultimoResultado *= numero;
      return this.ultimoResultado;
   }

   public double dividir(double numero1, double numero2) {
      if (numero2 == 0) {
         throw new ArithmeticException("No puedes dividir por cero");
      }
      return numero1 / numero2;
   }

   public double dividir(double numero) {
      if (numero == 0) {
         throw new ArithmeticException("No puedes dividir por cero");
      }
      this.ultimoResultado /= numero;
      return this.ultimoResultado;
   }

   // Método para reiniciar el resultado acumulado a cero (Botón C calculadora)
   public void borrarResultado() {
      this.ultimoResultado = 0;
   }

   // GETTERS
   public double getUltimoResultado() {
      return ultimoResultado;
   }

}
