import java.util.Random;

public class Automovil{

  Random aleatorio = new Random();// Inicializamos random

  String compania, marca, color;
  double totalTan;
  double actualTan;
  boolean encendido;

    //Espacio para mis metodos, uno vacio, uno que solo de la marca y color, y
    //uno que de todos los atributos.
    public Automovil(){

    }

    public Automovil (String marca, String color){
      this.color = color;
      this.marca = marca;
    }

    public Automovil(String compania, String marca, String color, double totalTan,
            double actualTan, boolean encendido) {
        this.compania = compania;
        this.marca = marca;
        this.color = color;
        this.totalTan = totalTan;
        this.actualTan = actualTan;
        this.encendido = encendido;
    }

    //Espacio para getter y setters
    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTotalTan() {
        return totalTan;
    }

    public void setTotalTan(double totalTan) {
        this.totalTan = totalTan;
    }

    public double getActualTan() {
        return actualTan;
    }

    public void setActualTan(double actualTan) {
        this.actualTan = actualTan;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    //Metodo para enceder auto
    public void encenderAuto(){
      this.setEncendido(true);
      System.out.println("El " + this.getCompania() + " " + this.getMarca() + " se ha encendido");
    }

    //Metodo para apagar auto
    public void apagarAuto(){
      this.setEncendido(false);
      System.out.println("El "+ this.getCompania() + " " + this.getMarca() + " se ha apagado");
    }

    //Metodo avanzar
    public void avanzar(int kilometros){
      for (int i = 1; i <= kilometros ; i++ ) {

        setActualTan(this.getActualTan()- 0.3);
        System.out.println("Vamos en el kilometro: " + i);
        System.out.println("Tu tanque actual es: "+ getActualTan());

        if(this.getActualTan()<=0){
          System.out.println("Nos quedamos en el kilometro: " + i);
          apagarAuto();
          break;
        }

      }

    }

    //Metodo cargarGasolina
    public void cargarGasolina(double dinero){

      double litros = dinero/19.8;
      double cambio = (dinero - (litros * 19.8));

      setActualTan(this.getActualTan() + litros);

      System.out.println("Tienes: "+ getActualTan() + " lts");

      if(cambio>0){
        System.out.println("\nTu cambio es: " + cambio + "$");

      }

    }

    //Metodo cargarTodoElTanque
    public void cargarTodoElTanque(){

      System.out.println("Le hacen falta: " + (getTotalTan() - getActualTan()) +
                        "lts. Es un total de: " + ((getTotalTan() - getActualTan()) * 19.8) + "$");

    }

    //Metodo carreritas
    public void carreritas (Automovil a1, Automovil a2){

      int contadorUno = 0;
      int contadorDos = 0;

      do{

        //Automovil 1
        int tipoS1 = aleatorio.nextInt(100)+1;
        if(tipoS1<=25){
          if(tipoS1<=15){
            System.out.print("\nAl " + a1.getMarca() + a1.getColor() + " se le atraveso un perrito y se retrasa");
          }
          else{
            System.out.print("\nEl " + a1.getMarca() + " " + a1.getColor() + " se confundio de camino y se retrasa");
          }
        }
        else{
          System.out.print("\nEl " + a1.getMarca() + " " + a1.getColor() + " ha completado " + contadorUno + " vueltas");
          contadorUno++;
        }

        //Automovil2
        int tipoS2 = aleatorio.nextInt(100)+1;
        if(tipoS2<=25){
          if(tipoS2<=15){
            System.out.print("\nAl " + a2.getMarca() + " " + a2.getColor() + " se le atraveso un perrito y se retrasa");
          }
          else{
            System.out.print("\nEl " + a2.getMarca() + " " + a2.getColor() + " se confundio de camino y se retrasa");
          }
        }
        else{
          System.out.print("\nEl " + a2.getMarca() + " " + a2.getColor() + " ha completado " + contadorDos + " vueltas");
          contadorDos++;
        }

        System.out.print("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

        if((contadorDos==11) || (contadorUno == 11))
        break;
      }while ((contadorUno != 10) || (contadorDos != 10));

      //Condiciones para escoger un ganador
      if(contadorUno > contadorDos){
        System.out.print("\nEl ganador es el: " + a1.getMarca() + " " +a1.getColor());
      }
      else if(contadorDos > contadorUno){
        System.out.print("\nEl ganador es el: " + a2.getMarca() + " " + a2.getColor());
      }
      else{
        System.out.print("\nEs empate");
      }

    }

    //String toString
    @Override
    public String toString() {
        return "\nTu auto es " + compania + " " + marca +
                " de color " + color + " y con la capacidad de tanque total de: "+ totalTan
                + " con una capacidad actual de: " + actualTan + "\n";
    }

}
