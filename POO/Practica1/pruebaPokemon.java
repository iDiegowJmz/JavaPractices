import java.util.Random;
import java.util.Scanner;


public class pruebaPokemon{

  public static void main(String[] args) {

    Random aleatorio = new Random();// Inicializamos random
    Scanner sc = new Scanner(System.in);// Inicializamos Scanner


    int cMonedas1 = aleatorio.nextInt(400)+1;
    int cMonedas2 = aleatorio.nextInt(400)+1;

    int orangeB = 1;
    int elixir = 1;

    int vidapk1 = 500;
    int vidapk2 = 500;

    Mochila moch1 = new Mochila(orangeB, elixir, cMonedas1);
    Mochila moch2 = new Mochila(orangeB, elixir, cMonedas2);


    Pokemon poke1 = new Pokemon("Palkia","Agua y Dragon", false, 30, vidapk1);
    Pokemon poke2 = new Pokemon("Kyogre","Agua", false, 10, vidapk2);

    System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

    System.out.println(poke1);
    System.out.println(moch1);
    System.out.println(poke2);
    System.out.println(moch2);

    System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

    System.out.println("Como Palkia tiene mayor velocidad que Kyogre, los turnos ");
    System.out.println("los empieza Palkia, ademas como ambos son de tipo agua, no tienen ninguna debilidad ");
    System.out.println("entre ellos.");

    System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

    System.out.println("Se te mostrara un menu donde escogeras el ataque de tu pokemon, cada ataque");
    System.out.println("se podra ocupar 7 veces, cuando un ataque llegue a 0, podras seguir");
    System.out.println("escogiendo ese ataque, pero ya no afectara la energia vital del contrincante");

    int contAtaque1pk1 = 7;
    int contAtaque2pk1 = 7;
    int contAtaque3pk1 = 7;
    int contAtaque4pk1 = 7;

    int contAtaque1pk2 = 7;
    int contAtaque2pk2 = 7;
    int contAtaque3pk2 = 7;
    int contAtaque4pk2 = 7;

    int i = 1;
    while((poke1.getEnergiaV()>0) || (poke2.getEnergiaV()>0)) {

      if( i%2 == 0){

        System.out.println("");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("");

        poke1.menuKyogre();

        System.out.print("Escoge un ataque del menu: ");
        int op = sc.nextInt();

        if(op == 1){

          if(contAtaque1pk2 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");


          }

          else{

            poke1.setEnergiaV(poke1.getEnergiaV() - 70);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");

            contAtaque1pk2--;

            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            System.out.println("El numero de ataques Ventisca restantes es de: " + contAtaque1pk2);

            if( poke2.confundidoPk() == true) {
            }

          }

        }

        else if(op == 2){

          if(contAtaque2pk2 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

          }
          else{
            poke1.setEnergiaV(poke1.getEnergiaV() - 45);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");

            contAtaque2pk2--;

            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            System.out.println("El numero de ataques Trueno restantes es de: " + contAtaque2pk2);

            if( poke2.confundidoPk() == true) {
            }

          }

        }

        else if(op == 3){

          if(contAtaque3pk2 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

          }

          else{

            poke1.setEnergiaV(poke1.getEnergiaV() - 35);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");

            contAtaque3pk2--;

            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            System.out.println("El numero de ataques Hidrobomba restantes es de: " + contAtaque3pk2);

          }

        }

        else if(op == 4){

          if(contAtaque4pk2 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          }

          else{
            poke1.setEnergiaV(poke1.getEnergiaV() - 25);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");

            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            contAtaque4pk2--;

            System.out.println("El numero de ataques Surf restantes es de: " + contAtaque4pk2);
          }

        }

        else{

          moch2.usoMochila();

          System.out.print("¿Que quieres ocupar? ");
            int opM = sc.nextInt();

          if(opM == 1){
            moch2.usoOrangeB(poke2);
          }
          else if(opM == 2){
            //moch2.usoElixir();

            if(moch2.getElixir()==0){
              System.out.print("Ya no puedes ocupar el elixir");
            }

            else{
              moch2.setElixir(0);

              contAtaque1pk2 = 7;
              contAtaque2pk2 = 7;
              contAtaque3pk2 = 7;
              contAtaque4pk2 = 7;

              System.out.println("Se uso elixir");
            }

          }

        }


      }//Fin de pares

      if(poke1.getEnergiaV() < 1){
        break;
      }

      else if (i%2 != 0){

        System.out.println("");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("");

        poke1.menuPalkia();

        System.out.print("Escoge un ataque del menu: ");
        int op = sc.nextInt();

        if(op == 1){

          if(contAtaque1pk1 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
          }

          else{
            poke2.setEnergiaV(poke2.getEnergiaV() - 70);
            System.out.println(poke2.getEnergiaV() + " de energia de Kyogre");

            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            contAtaque1pk1--;

            System.out.println("El numero de ataques  Llamarada restantes es de: " + contAtaque1pk1);

            if( poke1.confundidoPk()) {
            }

          }

        }

        else if(op == 2){

          if(contAtaque2pk1 <= 0){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
          }

          else{
            poke2.setEnergiaV(poke2.getEnergiaV() - 45);
            System.out.println(poke2.getEnergiaV() + " de energia de Kyogre");

            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            contAtaque2pk1--;

            System.out.println("El numero de ataques Hidrobomba restantes es de: " + contAtaque2pk1);

            if( poke1.confundidoPk() == true) {
            }

          }

        }

        else if(op == 3){

          if(contAtaque3pk1 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
          }

          else{
            poke2.setEnergiaV(poke2.getEnergiaV() - 35);
            System.out.println(poke2.getEnergiaV() + " de energia de Kyogre");

            contAtaque3pk1--;

            System.out.println("El numero de ataques Cometa Draco restantes es de: " + contAtaque3pk1);
          }

        }

        else if(op == 4){

          if(contAtaque4pk1 < 1){
            poke1.setEnergiaV(poke1.getEnergiaV() - 0);
            System.out.println(poke1.getEnergiaV() + " de energia de Palkia");
          }

          else{
            poke2.setEnergiaV(poke2.getEnergiaV() - 25);
            System.out.println(poke2.getEnergiaV() + " de energia de Kyogre");

            contAtaque4pk1--;

            System.out.println("El numero de ataques Acua cola restantes es de: " + contAtaque4pk1);
          }

        }

        else{
          moch1.usoMochila();

          System.out.print("¿Que quieres ocupar? ");
            int opM = sc.nextInt();

          if(opM == 1){
            moch1.usoOrangeB(poke1);
          }
          else if(opM == 2){
            if(moch1.getElixir()==0){
              System.out.print("Ya no puedes ocupar el elixir");
            }

            else{
              moch1.setElixir(0);

              contAtaque1pk1 = 7;
              contAtaque2pk1 = 7;
              contAtaque3pk1 = 7;
              contAtaque4pk1 = 7;

              System.out.println("Se uso elixir");
            }

          }
        }
      }//Fin de numero nones

      if(poke2.getEnergiaV() < 1){
        break;
      }

            i++;

    }//Fin del ciclo while

    //Ver quien ganada

    if(poke1.getEnergiaV() < poke2.getEnergiaV()){
      moch1.ganaKyogre(moch1,moch2);
    }//Fin de condicion
    else{
      moch2.ganaPalkia(moch1,moch2);
    }//Fin de segunda condicion

  }//Fin de main

}//Fin de clase
