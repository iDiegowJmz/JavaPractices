public class Barco extends Vehiculo{

  public Barco(int ns, int np){
    super(ns, np, Vehiculo.Tipo.valueOf("MARITIMO"));
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
        System.out.println("Estas avanzando en barco");
        System.out.println("Y su velocidad se mide en nudos");
    }


}
