import java.util.Random;

public class Autobus extends Vehiculo{

  int numeroRuedas;
  public Autobus(int ns, int np, int nr){
    super(ns, np, Vehiculo.Tipo.valueOf("TERRESTRE"));
    numeroRuedas = nr;
  }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

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

    @Override
    public void avanzar() {
        super.avanzar();
        System.out.println("Estas avanzando en autobus");
        System.out.println("Y su velocidad se mide en kilometros");
    }

    public void bajarPasajeros(){
        Random aleatorios = new Random();

        int estacion = aleatorios.nextInt(25)+1;

        System.out.println("Los pasajeros bajan en la estacion: " + estacion);

    }


}   
