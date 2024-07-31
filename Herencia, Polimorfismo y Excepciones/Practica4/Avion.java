import java.util.Scanner;
import java.util.InputMismatchException;

//Autor: Diego Isaac Jimenez Baroja

public class Avion{

  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);

  int boletoIda;
  int boletoRegreso;
  String [] array;

  public Avion(){

  }

    public Avion(int boletoIda, int boletoRegreso, String[] array) {
        this.boletoIda = boletoIda;
        this.boletoRegreso = boletoRegreso;
        this.array = array;
    }

    public int getBoletoIda() {
        return boletoIda;
    }

    public void setBoletoIda(int boletoIda) {
        this.boletoIda = boletoIda;
    }

    public int getBoletoRegreso() {
        return boletoRegreso;
    }

    public void setBoletoRegreso(int boletoRegreso) {
        this.boletoRegreso = boletoRegreso;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    //Metodo que solo mostrara los boletos, ya sea que esten disponibles o no.
    public void mostrarBoletos (String [] array){
        for (int i = 0; i < array.length; i++) {
          if(array [i] == null ){
            System.out.println(i + ".- A Disponible");
          }
          else{
              System.out.println(i + ".- A Ocupado");
          }
        }
    }

    //Implementaremos la excepcion donde el indice no salga de el arreglo
    public void escogerBoletos (String [] array, int participantes) {

      int lugar = 0;

      for (int i=0 ; i< participantes ; i++) {
        System.out.print("Escoge el numero de asiento: ");
        do {
          try{
            lugar = sc.nextInt();
          }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Este asiento no exite en el avion, intentalo de nuevo: ");
            sc.nextLine();
          }catch(InputMismatchException e){
            System.out.println("No es un valor valido");
            sc.nextLine();
          }
        } while (lugar < 0 && lugar > 50);
        while(array[lugar] != null){
          System.out.println("Asiento ocupado, intenta otro: ");
          do {
            try{
              lugar = sc.nextInt();
            }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Este asiento no exite en el avion, intentalo de nuevo: ");
              sc.nextLine();
            }catch(InputMismatchException e){
              System.out.println("No es un valor valido");
              sc.nextLine();
            }
          } while (lugar < 0 && lugar > 50);
        }

        System.out.println("Se ha reservado el asiento " + lugar + " con exito.");
        array [lugar] = "Ocupado";


      }

    }


}
