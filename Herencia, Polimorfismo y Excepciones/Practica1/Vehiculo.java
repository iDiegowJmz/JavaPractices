public class Vehiculo{

    void bajarPasajero() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

  // tipo de dato nuevo enum
  public static enum Tipo {TERRESTRE, MARITIMO, AEREO, ANFIBIO};

  int numeroPasajeros;
  final int numSerie; //CONSTANTE
  Tipo transporte;
 //Metodo contructor
    public Vehiculo(int numSerie, int numeroPasajeros, Tipo transporte){
      this.numSerie = numSerie;
      this.numeroPasajeros = numeroPasajeros;
      this.transporte = transporte;
    }

    //Getter y Setters
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Tipo getTransporte() {
        return transporte;
    }

    public void setTransporte(Tipo transporte) {
        this.transporte = transporte;
    }


    public void resumenInfo(){
    System.out.println("El numero de Series: " + numSerie);
    System.out.println("El numero de Pasajeros: " + numeroPasajeros);
    System.out.println("El tipo de transporte es: " + transporte);
    }

    public void avanzar () {
        System.out.println("Es de tipo " + transporte);
    }
}
