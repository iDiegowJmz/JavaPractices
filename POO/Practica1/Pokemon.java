import java.util.Random;
import java.util.Scanner;


public class Pokemon{

  Random aleatorio = new Random();// Inicializamos random
  Scanner sc = new Scanner(System.in);// Inicializamos Scanner

  //Espacio para los atributos
  String nombre, tipo;
  boolean confundido;
  int velocidad, energiaV, monedas;


  public Pokemon(String nombre, String tipo, boolean confundido,
                int velocidad, int energiaV) {
      this.nombre = nombre;
      this.tipo = tipo;
      this.confundido = confundido;
      this.velocidad = velocidad;
      this.energiaV = energiaV;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getTipo() {
      return tipo;
  }

  public void setTipo(String tipo) {
      this.tipo = tipo;
  }

  public boolean isConfundido() {
      return confundido;
  }

  public void setConfundido(boolean confundido) {
      this.confundido = confundido;
  }

  public int getVelocidad() {
      return velocidad;
  }

  public void setVelocidad(int velocidad) {
      this.velocidad = velocidad;
  }

  public int getEnergiaV() {
      return energiaV;
  }

  public void setEnergiaV(int energiaV) {
      this.energiaV = energiaV;
  }

  public boolean confundidoPk(){

    int pConfusion = aleatorio.nextInt(60)+1;
    int pFallar = aleatorio.nextInt(80)+1;

    if(pConfusion>0 && pConfusion<61)
      if(pFallar>0 && pFallar<81){
        System.out.println("El pokemon contrario esta confundido debido al ataque");
        boolean confundido = true;
    }

    else{
      boolean confundido = false;
    }

    return confundido;

  }

  public void menuKyogre(){

    System.out.println("Turno de Kyogre");
    System.out.println("1.- Ventisca, 70 pts");
    System.out.println("2.- Trueno, 45 pts");
    System.out.println("3.- Hidrobomba, 35 pts");
    System.out.println("4.- Surf, 35 pts");
    System.out.println("5.- Para usar algun item de la mochila");

  }

  public void menuPalkia(){

    System.out.println("Turno de Palkia");
    System.out.println("1.- Llamarada, 70 pts");
    System.out.println("2.- Hidrobomba, 45 pts");
    System.out.println("3.- Cometa Draco, 35 pts");
    System.out.println("4.- Acua cola, 25 pts");
    System.out.println("5.- Para usar algun item de la mochila");

  }

  @Override
  public String toString() {
      return "Pokemon: " + nombre + " de tipo: " +
      tipo +" con velocidad de: "  + velocidad;
  }
}
