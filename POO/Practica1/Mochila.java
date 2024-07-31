import java.util.Random;
import java.util.Scanner;

public class Mochila {

  Random aleatorio = new Random();// Inicializamos random
  Scanner sc = new Scanner(System.in);// Inicializamos Scanner

  //Atributos
  int orangeBerry, elixir, monedas;

  public Mochila (int orangeBerry, int elixir, int monedas){
    this.orangeBerry = orangeBerry;
    this.elixir = elixir;
    this.monedas = monedas;
  }

  public int getOrangeBerry() {
      return orangeBerry;
  }

  public void setOrangeBerry(int orangeBerry) {
    this.orangeBerry = orangeBerry;
  }

  public int getElixir() {
      return elixir;
  }

  public void setElixir(int elixir) {
    this.elixir = elixir;
  }

  public int getMonedas() {
      return monedas;
  }

  public void setMonedas(int monedas) {
    this.monedas = monedas;
  }

  public void usoOrangeB (Pokemon poke){
    if(getOrangeBerry()==0){
      System.out.print("Ya no puedes ocupar la Orange berry");
    }
    else{
      setOrangeBerry(0);

      if(poke.getEnergiaV()>300){
        poke.setEnergiaV(500);
        System.out.println("Tu energia vital actual es de: " + poke.getEnergiaV() );
      }
      else{
        poke.setEnergiaV(poke.getEnergiaV() + 200);
        System.out.println("Tu energia vital actual es de: " + poke.getEnergiaV() );
      }
    }
  }

  public void usoMochila (){
    System.out.println("1.- Orange berry");
    System.out.println("2.- Elixir");
  }

  public void ganaKyogre(Mochila moch1, Mochila moch2){

      System.out.print("El ganador es Kyogre" +
                        " y se le suman " + moch1.getMonedas() +
                        " a su mochila, ");
      moch2.setMonedas(moch1.getMonedas() + moch2.getMonedas());
      System.out.println("teniendo un total de " + moch2.getMonedas()
                         + " moendas.");

  }

  public void ganaPalkia(Mochila moch1, Mochila moch2){
    System.out.print("El ganador es Palkia " +
                      " y se le suman " + moch2.getMonedas() +
                      " a su mochila, ");
    moch1.setMonedas(moch1.getMonedas() + moch2.getMonedas());
    System.out.println("teniendo un total de " + moch1.getMonedas()
                       + " moendas.");
  }

  @Override
  public String toString(){
    return "Tienes " + orangeBerry +  " orange berry, " +
    elixir +" elixir y la cantidad de monedas de :" + monedas + " en tu mochila";
  }
}
