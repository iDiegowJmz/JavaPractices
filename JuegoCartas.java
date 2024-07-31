import java.util.Random;
import java.util.Scanner;

/*
  El siguiente programa que realizaremos, haremos uso de el método contains () es
  un método Java para verificar si String contiene otra subcadena o no.
  Devuelve un valor booleano.

  Crearemos contadores para ver la cantidad de palos que tiene la mano1 y la mano2, al igual
  que contadores para ver los valores de cada carta, esto para poder clasificar
  el tipo de mazo.

  Despues de clasificar cada mazo, usaremos condiciones y equals, para ver quien es el ganador1

  Nota: Mi programa tambien genera los mazos aletoriamente, por si quieren probarlo de ese modo,
  solo es cuestion de quitar los los comentarios en esas posociones y ponerlos en los print donde pide
  las cartas para ambos jugadores.
*/
public class JuegoCartas{
  public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner sc = new Scanner (System.in);

    System.out.print("Escoge el nombre del primer jugador: ");
      String jugador1 = sc.next();
    System.out.print("\nEscoge el nombre del segundo jugador: ");
      String jugador2 = sc.next();
    System.out.print("\nEscoge las cartas para el jugador 1: ");
      String mano = sc.next();
    System.out.print("\nEscoge las cartas para el jugador 2: ");
      String mano2 = sc.next();


    String cartas = "A234567890JQK";
    String palo = "DPTC";
    //String mano = "", mano2 = "";
    //String C1 = "", C2 = "", C3 = "", C4 = "", C5 = "", C6 = "", C7 = "", C8 = "", C9 = "", C10 = "";
    String tipoM = "";
    String tipoM2 = "";

    int totalC = 0, totalD = 0, totalT = 0, totalP = 0;
    int totalC2 = 0, totalD2 = 0, totalT2 = 0, totalP2 = 0;
    int totalNum1 = 0, totalNum2 = 0, totalNum3 = 0, totalNum4 = 0, totalNum5 = 0;
    int total2Num1 = 0, total2Num2 = 0, total2Num3 = 0, total2Num4 = 0, total2Num5 = 0;

    char carPalo, carNum;
    char carPalo2, carNum2;

    /*
    //Mano1
    char cartaNumC1 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC1 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C1 = C1 + cartaNumC1 + cartaPalC1;

    char cartaNumC2 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC2 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C2 = C2 + cartaNumC2 + cartaPalC2;

    char cartaNumC3 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC3 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C3 = C3 + cartaNumC3 + cartaPalC3;

    char cartaNumC4 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC4 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C4 = C4 + cartaNumC4 + cartaPalC4;

    char cartaNumC5 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC5 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C5 = C5 + cartaNumC5 + cartaPalC5;

    //Mano2
    char cartaNumC6 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC6 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C6 = C6 + cartaNumC6 + cartaPalC6;

    char cartaNumC7 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC7 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C7 = C7 + cartaNumC7 + cartaPalC7;

    char cartaNumC8 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC8 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C8 = C8 + cartaNumC8 + cartaPalC8;

    char cartaNumC9 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC9 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C9 = C9 + cartaNumC9 + cartaPalC9;

    char cartaNumC10 = ((cartas.charAt(aleatorio.nextInt(cartas.length()))));
    char cartaPalC10 = ((palo.charAt(aleatorio.nextInt(palo.length()))));
    C10 = C10 + cartaNumC10 + cartaPalC10;

    mano = C1+C2+C3+C4+C5;
    mano2 = C6+C7+C8+C9+C10;
    */

    System.out.println("La mano del jugador " + jugador1 + " es: " + mano);
    System.out.println("La mano del jugador " + jugador2 + " es: " + mano2);

    //Calcular la cantidad de palo para la mano1
    for (int i = 0; i < mano.length(); i++) {

        carPalo = mano.charAt(i);

        if (carPalo == 'T')
          totalT++;

    }

    for (int i = 0; i < mano.length(); i++) {

        carPalo = mano.charAt(i);

        if (carPalo == 'P')
        totalP++;
    }

    for (int i = 0; i < mano.length(); i++) {

        carPalo = mano.charAt(i);

        if (carPalo == 'D')
          totalD++;

    }

    for (int i = 0; i < mano.length(); i++) {

        carPalo = mano.charAt(i);

        if (carPalo == 'C')
        totalC++;
    }
    //
    //* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //Calcular la cantidad de numero para la Mano1
    for (int i = 0; i < mano.length(); i++) {

        carNum = mano.charAt(i);

        if (carNum == mano.charAt(0))
          totalNum1++;

    }

    for (int i = 0; i < mano.length(); i++) {

        carNum = mano.charAt(i);

        if (carNum == mano.charAt(2))
        totalNum2++;
    }

    for (int i = 0; i < mano.length(); i++) {

        carNum = mano.charAt(i);

        if (carNum == mano.charAt(4))
          totalNum3++;

    }

    for (int i = 0; i < mano.length(); i++) {

        carNum = mano.charAt(i);

        if (carNum == mano.charAt(6))
        totalNum4++;
    }

    for (int i = 0; i < mano.length(); i++) {

        carNum = mano.charAt(i);

        if (carNum == mano.charAt(8))
        totalNum5++;
    }

    //Verificamos si el primer caracter se repite
    if( mano.charAt(0) == mano.charAt(2) ){
      totalNum2=0;
    }
    if( mano.charAt(0) == mano.charAt(4) ){
      totalNum3=0;
    }
    if( mano.charAt(0) == mano.charAt(6) ){
      totalNum4=0;
    }
    if( mano.charAt(0) == mano.charAt(8) ){
      totalNum5=0;
    }

    //Verificamos si el segundo caracter se repite
    if( mano.charAt(2) == mano.charAt(4) ){
      totalNum3=0;
    }
    if( mano.charAt(2) == mano.charAt(6) ){
      totalNum4=0;
    }
    if( mano.charAt(2) == mano.charAt(8) ){
      totalNum5=0;
    }

    //Verificamos si el tercer caracter se repite
    if( mano.charAt(4) == mano.charAt(6) ){
      totalNum4=0;
    }
    if( mano.charAt(4) == mano.charAt(8) ){
      totalNum5=0;
    }

    //Verificamos si el cuarto caracter se repite
    if( mano.charAt(6) == mano.charAt(8) ){
      totalNum5=0;
    }

    //Cuando no tiene nada especeial o escalera
    if((totalNum1 == 1) || (totalNum2 == 1) || (totalNum3 == 1) || (totalNum4 == 1) || (totalNum5 == 1)){

      if((totalNum1 == 1) && (totalNum2 == 1) && (totalNum3 == 1) && (totalNum4 == 1) && (totalNum5 == 1)){
        //Primera escalera
        boolean e1 = mano.contains("9");
        boolean e2 = mano.contains("0");
        boolean e3 = mano.contains("J");
        boolean e4 = mano.contains("Q");
        boolean e5 = mano.contains("K");
        //Segunda escalera
        boolean a1 = mano.contains("8");
        boolean a2 = mano.contains("9");
        boolean a3 = mano.contains("0");
        boolean a4 = mano.contains("J");
        boolean a5 = mano.contains("Q");
        //Tercera escalera
        boolean b1 = mano.contains("7");
        boolean b2 = mano.contains("8");
        boolean b3 = mano.contains("9");
        boolean b4 = mano.contains("0");
        boolean b5 = mano.contains("J");
        //Cuarta escalera
        boolean d1 = mano.contains("6");
        boolean d2 = mano.contains("7");
        boolean d3 = mano.contains("8");
        boolean d4 = mano.contains("9");
        boolean d5 = mano.contains("0");
        //Quinta Condicion
        boolean f1 = mano.contains("5");
        boolean f2 = mano.contains("6");
        boolean f3 = mano.contains("7");
        boolean f4 = mano.contains("9");
        boolean f5 = mano.contains("J");
        //Sexta condicon
        boolean g1 = mano.contains("4");
        boolean g2 = mano.contains("5");
        boolean g3 = mano.contains("6");
        boolean g4 = mano.contains("7");
        boolean g5 = mano.contains("8");
        //Septima escalera
        boolean j1 = mano.contains("3");
        boolean j2 = mano.contains("4");
        boolean j3 = mano.contains("5");
        boolean j4 = mano.contains("6");
        boolean j5 = mano.contains("7");
        //Octava escalera
        boolean h1 = mano.contains("2");
        boolean h2 = mano.contains("3");
        boolean h3 = mano.contains("4");
        boolean h4 = mano.contains("5");
        boolean h5 = mano.contains("6");
        //Novena Condicion
        boolean i1 = mano.contains("A");
        boolean i2 = mano.contains("2");
        boolean i3 = mano.contains("3");
        boolean i4 = mano.contains("4");
        boolean i5 = mano.contains("5");

        //Carta Alta
        if(mano.contains("A")){
          tipoM = "Carta Alta";
        }
        //Primera condicion
        else if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
          tipoM = "Escalera";
        }
        //Segunda condicion
        else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
          tipoM = "Escalera";
        }
        //tercera condicion
        else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
          tipoM = "Escalera";
        }
        //Cuarta condicion
        else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
          tipoM = "Escalera";
        }
        //quinta condicion
        else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
          tipoM = "Escalera";
        }
        //Sexta condicion
        else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
          tipoM = "Escalera";
        }
        //Septima condicion
        else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
          tipoM = "Escalera";
        }
        //Octava condicion
        else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
          tipoM = "Escalera";
        }
        //Novena condicion
        else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
          tipoM = "Escalera";
        }
        else{
        tipoM = "No tiene ningun combo";
        }

      }

    }

    //DOBLE PAREJA y PAREJA
    //NUM1
    if( (totalNum1 == 2) || (totalNum2 == 2) || (totalNum3 == 2) || (totalNum4 == 2) || (totalNum5 == 2) ){
      if(totalNum1 == 2){
        if(totalNum2 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum3 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum4 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum5 == 2){
          tipoM = "Doble Pareja";
        }
        else{
          tipoM = "Pareja";
        }
      }

      //NUM2
      if(totalNum2 == 2){
        if(totalNum1 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum3 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum4 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum5 == 2){
          tipoM = "Doble Pareja";
        }
        else{
          tipoM = "Pareja";
        }
      }

      //NUM3
      if(totalNum3 == 2){
        if(totalNum1 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum2 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum4 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum5 == 2){
          tipoM = "Doble Pareja";
        }
        else{
          tipoM = "Pareja";
        }
      }

      //NUM4
      if(totalNum4 == 2){
        if(totalNum1 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum2 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum3 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum5 == 2){
          tipoM = "Doble Pareja";
        }
        else{
          tipoM = "Pareja";
        }
      }

      //Num5
      if(totalNum5 == 2){
        if(totalNum1 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum2 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum3 == 2){
          tipoM = "Doble Pareja";
        }
        else if(totalNum4 == 2){
          tipoM = "Doble Pareja";
        }
        else{
          tipoM = "Pareja";
        }
      }
    }

    //FULL o TRIO
    if( (totalNum1 == 3) || (totalNum2 == 3) || (totalNum3 == 3) || (totalNum4 == 3) || (totalNum5 == 3) ){
      //Num1
      if(totalNum1 == 3) {
        if(totalNum2 == 2){
          tipoM = "Full";
        }
        else if(totalNum3 == 2){
          tipoM = "Full";
        }
        else if(totalNum4 == 2){
          tipoM = "Full";
        }
        else if(totalNum5 == 2){
          tipoM = "Full";
        }
        //TRIO
        else{
          tipoM = "Trio";
        }
      }

      //Num2
      else if(totalNum2 == 3) {
        if(totalNum1 == 2){
          tipoM = "Full";
        }
        else if(totalNum3 == 2){
          tipoM = "Full";
        }
        else if(totalNum4 == 2){
          tipoM = "Full";
        }
        else if(totalNum5 == 2){
          tipoM = "Full";
        }
        //TRIO
        else{
          tipoM = "Trio";
        }

      }

      //Num3
      else if(totalNum3 == 3) {
        if(totalNum1 == 2){
          tipoM = "Full";
        }
        else if(totalNum2 == 2){
          tipoM = "Full";
        }
        else if(totalNum4 == 2){
          tipoM = "Full";
        }
        else if(totalNum5 == 2){
          tipoM = "Full";
        }
        //TRIO
        else{
          tipoM = "Trio";
        }

      }

      //Num4
      else if(totalNum4 == 3) {
        if(totalNum1 == 2){
          tipoM = "Full";
        }
        else if(totalNum2 == 2){
          tipoM = "Full";
        }
        else if(totalNum3 == 2){
          tipoM = "Full";
        }
        else if(totalNum5 == 2){
          tipoM = "Full";
        }
        //TRIO
        else{
          tipoM = "Trio";
        }

      }

      //Num5
      else if(totalNum5 == 3) {
        if(totalNum1 == 2){
          tipoM = "Full";
        }
        else if(totalNum2 == 2){
          tipoM = "Full";
        }
        else if(totalNum3 == 2){
          tipoM = "Full";
        }
        else if(totalNum4 == 2){
          tipoM = "Full";
        }
        //TRIO
        else{
          tipoM = "Trio";
        }

      }

    }

    //POKER
    if( (totalNum1 == 4) || (totalNum2 == 4) || (totalNum3 == 4) || (totalNum4 == 4) || (totalNum5 == 4) ){
      //Num1
      if(totalNum1 == 4){
        tipoM = "Poker";
      }
      //Num2
      else if(totalNum2 == 4){
        tipoM = "Poker";
      }
      //Num3
      else if(totalNum3 == 4){
        tipoM = "Poker";
      }
      //Num4
      else if(totalNum4 == 4){
        tipoM = "Poker";
      }
      else{
        tipoM = "Poker";
      }
    }

    //Para el caso donde sea del mismo palo (Escalera real, escalera de color y color)
    //Para Corazones

    if( (totalC == 5) || (totalT == 5) || (totalD == 5) || (totalP == 5) ){
      if(totalC == 5){
        boolean cA = mano.contains("A");
        boolean cK = mano.contains("K");
        boolean cQ = mano.contains("Q");
        boolean cJ = mano.contains("J");
        boolean c0 = mano.contains("0");
        if((cA == true) && (cK == true) && (cQ == true) && (cJ == true) && (c0 == true)){
          tipoM = "Escalera Real";
        }
        else if((totalNum1 == 1) && (totalNum2 == 1) && (totalNum3 == 1) && (totalNum4 == 1) && (totalNum5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano.contains("9");
           boolean e2 = mano.contains("0");
           boolean e3 = mano.contains("J");
           boolean e4 = mano.contains("Q");
           boolean e5 = mano.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano.contains("8");
           boolean a2 = mano.contains("9");
           boolean a3 = mano.contains("0");
           boolean a4 = mano.contains("J");
           boolean a5 = mano.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano.contains("7");
           boolean b2 = mano.contains("8");
           boolean b3 = mano.contains("9");
           boolean b4 = mano.contains("0");
           boolean b5 = mano.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano.contains("6");
           boolean d2 = mano.contains("7");
           boolean d3 = mano.contains("8");
           boolean d4 = mano.contains("9");
           boolean d5 = mano.contains("0");
           //Quinta Condicion
           boolean f1 = mano.contains("5");
           boolean f2 = mano.contains("6");
           boolean f3 = mano.contains("7");
           boolean f4 = mano.contains("9");
           boolean f5 = mano.contains("J");
           //Sexta condicon
           boolean g1 = mano.contains("4");
           boolean g2 = mano.contains("5");
           boolean g3 = mano.contains("6");
           boolean g4 = mano.contains("7");
           boolean g5 = mano.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano.contains("3");
           boolean j2 = mano.contains("4");
           boolean j3 = mano.contains("5");
           boolean j4 = mano.contains("6");
           boolean j5 = mano.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano.contains("2");
           boolean h2 = mano.contains("3");
           boolean h3 = mano.contains("4");
           boolean h4 = mano.contains("5");
           boolean h5 = mano.contains("6");
           //Novena Condicion
           boolean i1 = mano.contains("A");
           boolean i2 = mano.contains("2");
           boolean i3 = mano.contains("3");
           boolean i4 = mano.contains("4");
           boolean i5 = mano.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM = "Escalera de Color";
           }
           else{
           tipoM = "Color";
           }

        }

      }

      //Para Trebol
      else if(totalT == 5){
        boolean tA = mano.contains("A");
        boolean tK = mano.contains("K");
        boolean tQ = mano.contains("Q");
        boolean tJ = mano.contains("J");
        boolean t0 = mano.contains("0");
        if((tA == true) && (tK == true) && (tQ == true) && (tJ == true) && (t0 == true)){
          tipoM = "Escalera Real";
        }
        else if((totalNum1 == 1) && (totalNum2 == 1) && (totalNum3 == 1) && (totalNum4 == 1) && (totalNum5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano.contains("9");
           boolean e2 = mano.contains("0");
           boolean e3 = mano.contains("J");
           boolean e4 = mano.contains("Q");
           boolean e5 = mano.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano.contains("8");
           boolean a2 = mano.contains("9");
           boolean a3 = mano.contains("0");
           boolean a4 = mano.contains("J");
           boolean a5 = mano.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano.contains("7");
           boolean b2 = mano.contains("8");
           boolean b3 = mano.contains("9");
           boolean b4 = mano.contains("0");
           boolean b5 = mano.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano.contains("6");
           boolean d2 = mano.contains("7");
           boolean d3 = mano.contains("8");
           boolean d4 = mano.contains("9");
           boolean d5 = mano.contains("0");
           //Quinta Condicion
           boolean f1 = mano.contains("5");
           boolean f2 = mano.contains("6");
           boolean f3 = mano.contains("7");
           boolean f4 = mano.contains("9");
           boolean f5 = mano.contains("J");
           //Sexta condicon
           boolean g1 = mano.contains("4");
           boolean g2 = mano.contains("5");
           boolean g3 = mano.contains("6");
           boolean g4 = mano.contains("7");
           boolean g5 = mano.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano.contains("3");
           boolean j2 = mano.contains("4");
           boolean j3 = mano.contains("5");
           boolean j4 = mano.contains("6");
           boolean j5 = mano.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano.contains("2");
           boolean h2 = mano.contains("3");
           boolean h3 = mano.contains("4");
           boolean h4 = mano.contains("5");
           boolean h5 = mano.contains("6");
           //Novena Condicion
           boolean i1 = mano.contains("A");
           boolean i2 = mano.contains("2");
           boolean i3 = mano.contains("3");
           boolean i4 = mano.contains("4");
           boolean i5 = mano.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM = "Escalera de Color";
           }
           else{
             tipoM = "Color";
           }

        }

      }

      //Para Diamante
      else if(totalD == 5){
        boolean dA = mano.contains("A");
        boolean dK = mano.contains("K");
        boolean dQ = mano.contains("Q");
        boolean dJ = mano.contains("J");
        boolean d0 = mano.contains("0");
        if((dA == true) && (dK == true) && (dQ == true) && (dJ == true) && (d0 == true)){
          tipoM = "Escalera Real";
        }
        else if((totalNum1 == 1) && (totalNum2 == 1) && (totalNum3 == 1) && (totalNum4 == 1) && (totalNum5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano.contains("9");
           boolean e2 = mano.contains("0");
           boolean e3 = mano.contains("J");
           boolean e4 = mano.contains("Q");
           boolean e5 = mano.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano.contains("8");
           boolean a2 = mano.contains("9");
           boolean a3 = mano.contains("0");
           boolean a4 = mano.contains("J");
           boolean a5 = mano.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano.contains("7");
           boolean b2 = mano.contains("8");
           boolean b3 = mano.contains("9");
           boolean b4 = mano.contains("0");
           boolean b5 = mano.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano.contains("6");
           boolean d2 = mano.contains("7");
           boolean d3 = mano.contains("8");
           boolean d4 = mano.contains("9");
           boolean d5 = mano.contains("0");
           //Quinta Condicion
           boolean f1 = mano.contains("5");
           boolean f2 = mano.contains("6");
           boolean f3 = mano.contains("7");
           boolean f4 = mano.contains("9");
           boolean f5 = mano.contains("J");
           //Sexta condicon
           boolean g1 = mano.contains("4");
           boolean g2 = mano.contains("5");
           boolean g3 = mano.contains("6");
           boolean g4 = mano.contains("7");
           boolean g5 = mano.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano.contains("3");
           boolean j2 = mano.contains("4");
           boolean j3 = mano.contains("5");
           boolean j4 = mano.contains("6");
           boolean j5 = mano.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano.contains("2");
           boolean h2 = mano.contains("3");
           boolean h3 = mano.contains("4");
           boolean h4 = mano.contains("5");
           boolean h5 = mano.contains("6");
           //Novena Condicion
           boolean i1 = mano.contains("A");
           boolean i2 = mano.contains("2");
           boolean i3 = mano.contains("3");
           boolean i4 = mano.contains("4");
           boolean i5 = mano.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM = "Escalera de Color";
           }
           else{
             tipoM = "Color";
           }

        }

      }

      //Para pica
      else{
        boolean pA = mano.contains("A");
        boolean pK = mano.contains("K");
        boolean pQ = mano.contains("Q");
        boolean pJ = mano.contains("J");
        boolean p0 = mano.contains("0");
        if((pA == true) && (pK == true) && (pQ == true) && (pJ == true) && (p0 == true)){
          tipoM = "Escalera Real";

        }
        else if((totalNum1 == 1) && (totalNum2 == 1) && (totalNum3 == 1) && (totalNum4 == 1) && (totalNum5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano.contains("9");
           boolean e2 = mano.contains("0");
           boolean e3 = mano.contains("J");
           boolean e4 = mano.contains("Q");
           boolean e5 = mano.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano.contains("8");
           boolean a2 = mano.contains("9");
           boolean a3 = mano.contains("0");
           boolean a4 = mano.contains("J");
           boolean a5 = mano.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano.contains("7");
           boolean b2 = mano.contains("8");
           boolean b3 = mano.contains("9");
           boolean b4 = mano.contains("0");
           boolean b5 = mano.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano.contains("6");
           boolean d2 = mano.contains("7");
           boolean d3 = mano.contains("8");
           boolean d4 = mano.contains("9");
           boolean d5 = mano.contains("0");
           //Quinta Condicion
           boolean f1 = mano.contains("5");
           boolean f2 = mano.contains("6");
           boolean f3 = mano.contains("7");
           boolean f4 = mano.contains("9");
           boolean f5 = mano.contains("J");
           //Sexta condicon
           boolean g1 = mano.contains("4");
           boolean g2 = mano.contains("5");
           boolean g3 = mano.contains("6");
           boolean g4 = mano.contains("7");
           boolean g5 = mano.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano.contains("3");
           boolean j2 = mano.contains("4");
           boolean j3 = mano.contains("5");
           boolean j4 = mano.contains("6");
           boolean j5 = mano.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano.contains("2");
           boolean h2 = mano.contains("3");
           boolean h3 = mano.contains("4");
           boolean h4 = mano.contains("5");
           boolean h5 = mano.contains("6");
           //Novena Condicion
           boolean i1 = mano.contains("A");
           boolean i2 = mano.contains("2");
           boolean i3 = mano.contains("3");
           boolean i4 = mano.contains("4");
           boolean i5 = mano.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM = "Escalera de Color";
           }
           else{
             tipoM = "Color";
           }

        }

      }

    }


    if(tipoM.equals("No tiene ningun combo")){
      System.out.println("\nEl jugador " +jugador1 +  ": " + tipoM);
    }
    else{
      System.out.println("\nEl jugador " +jugador1 + " tiene: " + tipoM);
    }

    /*
    *
    *
    MANO2
    *
    *
    */

    //Calcular la cantidad de palo para la mano2
    for (int i = 0; i < mano2.length(); i++) {

        carPalo2 = mano2.charAt(i);

        if (carPalo2 == 'T')
          totalT2++;

    }

    for (int i = 0; i < mano2.length(); i++) {

        carPalo2 = mano2.charAt(i);

        if (carPalo2 == 'P')
        totalP2++;
    }

    for (int i = 0; i < mano2.length(); i++) {

        carPalo2 = mano2.charAt(i);

        if (carPalo2 == 'D')
          totalD2++;

    }

    for (int i = 0; i < mano2.length(); i++) {

        carPalo2 = mano2.charAt(i);

        if (carPalo2 == 'C')
        totalC2++;
    }
    //
    //* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //Calcular la cantidad de numero para la mano2
    for (int i = 0; i < mano2.length(); i++) {

        carNum2 = mano2.charAt(i);

        if (carNum2 == mano2.charAt(0))
          total2Num1++;

    }

    for (int i = 0; i < mano2.length(); i++) {

        carNum2 = mano2.charAt(i);

        if (carNum2 == mano2.charAt(2))
        total2Num2++;
    }

    for (int i = 0; i < mano2.length(); i++) {

        carNum2 = mano2.charAt(i);

        if (carNum2 == mano2.charAt(4))
          total2Num3++;

    }

    for (int i = 0; i < mano2.length(); i++) {

        carNum2 = mano2.charAt(i);

        if (carNum2 == mano2.charAt(6))
        total2Num4++;
    }

    for (int i = 0; i < mano2.length(); i++) {

        carNum2 = mano2.charAt(i);

        if (carNum2 == mano2.charAt(8))
        total2Num5++;
    }

    //Verificamos si el primer caracter se repite
    if( mano2.charAt(0) == mano2.charAt(2) ){
      total2Num2=0;
    }
    if( mano2.charAt(0) == mano2.charAt(4) ){
      total2Num3=0;
    }
    if( mano2.charAt(0) == mano2.charAt(6) ){
      total2Num4=0;
    }
    if( mano2.charAt(0) == mano2.charAt(8) ){
      total2Num5=0;
    }

    //Verificamos si el segundo caracter se repite
    if( mano2.charAt(2) == mano2.charAt(4) ){
      total2Num3=0;
    }
    if( mano2.charAt(2) == mano2.charAt(6) ){
      total2Num4=0;
    }
    if( mano2.charAt(2) == mano2.charAt(8) ){
      total2Num5=0;
    }

    //Verificamos si el tercer caracter se repite
    if( mano2.charAt(4) == mano2.charAt(6) ){
      total2Num4=0;
    }
    if( mano2.charAt(4) == mano2.charAt(8) ){
      total2Num5=0;
    }

    //Verificamos si el cuarto caracter se repite
    if( mano2.charAt(6) == mano2.charAt(8) ){
      total2Num5=0;
    }

    //Cuando no tiene nada especeial, tiene carta Alta o escalera
    if((total2Num1 == 1) || (total2Num2 == 1) || (total2Num3 == 1) || (total2Num4 == 1) || (total2Num5 == 1)){
      //Carta Alta

      if((total2Num1 == 1) && (total2Num2 == 1) && (total2Num3 == 1) && (total2Num4 == 1) && (total2Num5 == 1)){
        //Primera escalera
        boolean e1 = mano2.contains("9");
        boolean e2 = mano2.contains("0");
        boolean e3 = mano2.contains("J");
        boolean e4 = mano2.contains("Q");
        boolean e5 = mano2.contains("K");
        //Segunda escalera
        boolean a1 = mano2.contains("8");
        boolean a2 = mano2.contains("9");
        boolean a3 = mano2.contains("0");
        boolean a4 = mano2.contains("J");
        boolean a5 = mano2.contains("Q");
        //Tercera escalera
        boolean b1 = mano2.contains("7");
        boolean b2 = mano2.contains("8");
        boolean b3 = mano2.contains("9");
        boolean b4 = mano2.contains("0");
        boolean b5 = mano2.contains("J");
        //Cuarta escalera
        boolean d1 = mano2.contains("6");
        boolean d2 = mano2.contains("7");
        boolean d3 = mano2.contains("8");
        boolean d4 = mano2.contains("9");
        boolean d5 = mano2.contains("0");
        //Quinta Condicion
        boolean f1 = mano2.contains("5");
        boolean f2 = mano2.contains("6");
        boolean f3 = mano2.contains("7");
        boolean f4 = mano2.contains("9");
        boolean f5 = mano2.contains("J");
        //Sexta condicon
        boolean g1 = mano2.contains("4");
        boolean g2 = mano2.contains("5");
        boolean g3 = mano2.contains("6");
        boolean g4 = mano2.contains("7");
        boolean g5 = mano2.contains("8");
        //Septima escalera
        boolean j1 = mano2.contains("3");
        boolean j2 = mano2.contains("4");
        boolean j3 = mano2.contains("5");
        boolean j4 = mano2.contains("6");
        boolean j5 = mano2.contains("7");
        //Octava escalera
        boolean h1 = mano2.contains("2");
        boolean h2 = mano2.contains("3");
        boolean h3 = mano2.contains("4");
        boolean h4 = mano2.contains("5");
        boolean h5 = mano2.contains("6");
        //Novena Condicion
        boolean i1 = mano2.contains("A");
        boolean i2 = mano2.contains("2");
        boolean i3 = mano2.contains("3");
        boolean i4 = mano2.contains("4");
        boolean i5 = mano2.contains("5");

        //Carta Alta
        if(mano2.contains("A")){
          tipoM2 = "Carta Alta";
        }

        // Primera condicion
        else if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
          tipoM2 = "Escalera";
        }
        //Segunda condicion
        else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
          tipoM2 = "Escalera";
        }
        //tercera condicion
        else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
          tipoM2 = "Escalera";
        }
        //Cuarta condicion
        else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
          tipoM2 = "Escalera";
        }
        //quinta condicion
        else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
          tipoM2 = "Escalera";
        }
        //Sexta condicion
        else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
          tipoM2 = "Escalera";
        }
        //Septima condicion
        else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
          tipoM2 = "Escalera";
        }
        //Octava condicion
        else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
          tipoM2 = "Escalera";
        }
        //Novena condicion
        else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
          tipoM2 = "Escalera";
        }
        else{
        tipoM2 = "No tiene ningun combo";
        }

      }

    }

    //DOBLE PAREJA y PAREJA
    //NUM1
    if( (total2Num1 == 2) || (total2Num2 == 2) || (total2Num3 == 2) || (total2Num4 == 2) || (total2Num5 == 2) ){
      if(total2Num1 == 2){
        if(total2Num2 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Doble Pareja";
        }
        else{
          tipoM2 = "Pareja";
        }
      }

      //NUM2
      if(total2Num2 == 2){
        if(total2Num1 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Doble Pareja";
        }
        else{
          tipoM2 = "Pareja";
        }
      }

      //NUM3
      if(total2Num3 == 2){
        if(total2Num1 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num2 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Doble Pareja";
        }
        else{
          tipoM2 = "Pareja";
        }
      }

      //NUM4
      if(total2Num4 == 2){
        if(total2Num1 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num2 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Doble Pareja";
        }
        else{
          tipoM2 = "Pareja";
        }
      }

      //Num5
      if(total2Num5 == 2){
        if(total2Num1 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num2 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Doble Pareja";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Doble Pareja";
        }
        else{
          tipoM2 = "Pareja";
        }
      }
    }

    //FULL o TRIO
    if( (total2Num1 == 3) || (total2Num2 == 3) || (total2Num3 == 3) || (total2Num4 == 3) || (total2Num5 == 3) ){
      //Num1
      if(total2Num1 == 3) {
        if(total2Num2 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Full";
        }
        //TRIO
        else{
          tipoM2 = "Trio";
        }
      }

      //Num2
      else if(total2Num2 == 3) {
        if(total2Num1 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Full";
        }
        //TRIO
        else{
          tipoM2 = "Trio";
        }

      }

      //Num3
      else if(total2Num3 == 3) {
        if(total2Num1 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num2 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Full";
        }
        //TRIO
        else{
          tipoM2 = "Trio";
        }

      }

      //Num4
      else if(total2Num4 == 3) {
        if(total2Num1 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num2 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num5 == 2){
          tipoM2 = "Full";
        }
        //TRIO
        else{
          tipoM2 = "Trio";
        }

      }

      //Num5
      else if(total2Num5 == 3) {
        if(total2Num1 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num2 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num3 == 2){
          tipoM2 = "Full";
        }
        else if(total2Num4 == 2){
          tipoM2 = "Full";
        }
        //TRIO
        else{
          tipoM2 = "Trio";
        }

      }

    }

    //POKER
    if( (total2Num1 == 4) || (total2Num2 == 4) || (total2Num3 == 4) || (total2Num4 == 4) || (total2Num5 == 4) ){
      //Num1
      if(total2Num1 == 4){
        tipoM2 = "Poker";
      }
      //Num2
      else if(total2Num2 == 4){
        tipoM2 = "Poker";
      }
      //Num3
      else if(total2Num3 == 4){
        tipoM2 = "Poker";
      }
      //Num4
      else if(total2Num4 == 4){
        tipoM2 = "Poker";
      }
      else{
        tipoM2 = "Poker";
      }
    }

    //Para el caso donde sea del mismo palo (Escalera real, escalera de color y color)
    //Para Corazones

    if( (totalC2 == 5) || (totalT2 == 5) || (totalD2 == 5) || (totalP2 == 5) ){
      if(totalC2 == 5){
        boolean cA = mano2.contains("A");
        boolean cK = mano2.contains("K");
        boolean cQ = mano2.contains("Q");
        boolean cJ = mano2.contains("J");
        boolean c0 = mano2.contains("0");
        if((cA == true) && (cK == true) && (cQ == true) && (cJ == true) && (c0 == true)){
          tipoM2 = "Escalera Real";
        }
        else if((total2Num1 == 1) && (total2Num2 == 1) && (total2Num3 == 1) && (total2Num4 == 1) && (total2Num5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano2.contains("9");
           boolean e2 = mano2.contains("0");
           boolean e3 = mano2.contains("J");
           boolean e4 = mano2.contains("Q");
           boolean e5 = mano2.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano2.contains("8");
           boolean a2 = mano2.contains("9");
           boolean a3 = mano2.contains("0");
           boolean a4 = mano2.contains("J");
           boolean a5 = mano2.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano2.contains("7");
           boolean b2 = mano2.contains("8");
           boolean b3 = mano2.contains("9");
           boolean b4 = mano2.contains("0");
           boolean b5 = mano2.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano2.contains("6");
           boolean d2 = mano2.contains("7");
           boolean d3 = mano2.contains("8");
           boolean d4 = mano2.contains("9");
           boolean d5 = mano2.contains("0");
           //Quinta Condicion
           boolean f1 = mano2.contains("5");
           boolean f2 = mano2.contains("6");
           boolean f3 = mano2.contains("7");
           boolean f4 = mano2.contains("9");
           boolean f5 = mano2.contains("J");
           //Sexta condicon
           boolean g1 = mano2.contains("4");
           boolean g2 = mano2.contains("5");
           boolean g3 = mano2.contains("6");
           boolean g4 = mano2.contains("7");
           boolean g5 = mano2.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano2.contains("3");
           boolean j2 = mano2.contains("4");
           boolean j3 = mano2.contains("5");
           boolean j4 = mano2.contains("6");
           boolean j5 = mano2.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano2.contains("2");
           boolean h2 = mano2.contains("3");
           boolean h3 = mano2.contains("4");
           boolean h4 = mano2.contains("5");
           boolean h5 = mano2.contains("6");
           //Novena Condicion
           boolean i1 = mano2.contains("A");
           boolean i2 = mano2.contains("2");
           boolean i3 = mano2.contains("3");
           boolean i4 = mano2.contains("4");
           boolean i5 = mano2.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM2 = "Escalera de Color";
           }
           else{
           tipoM2 = "Color";
           }

        }

      }

      //Para Trebol
      else if(totalT2 == 5){
        boolean tA = mano2.contains("A");
        boolean tK = mano2.contains("K");
        boolean tQ = mano2.contains("Q");
        boolean tJ = mano2.contains("J");
        boolean t0 = mano2.contains("0");
        if((tA == true) && (tK == true) && (tQ == true) && (tJ == true) && (t0 == true)){
          tipoM2 = "Escalera Real";
        }
        else if((total2Num1 == 1) && (total2Num2 == 1) && (total2Num3 == 1) && (total2Num4 == 1) && (total2Num5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano2.contains("9");
           boolean e2 = mano2.contains("0");
           boolean e3 = mano2.contains("J");
           boolean e4 = mano2.contains("Q");
           boolean e5 = mano2.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano2.contains("8");
           boolean a2 = mano2.contains("9");
           boolean a3 = mano2.contains("0");
           boolean a4 = mano2.contains("J");
           boolean a5 = mano2.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano2.contains("7");
           boolean b2 = mano2.contains("8");
           boolean b3 = mano2.contains("9");
           boolean b4 = mano2.contains("0");
           boolean b5 = mano2.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano2.contains("6");
           boolean d2 = mano2.contains("7");
           boolean d3 = mano2.contains("8");
           boolean d4 = mano2.contains("9");
           boolean d5 = mano2.contains("0");
           //Quinta Condicion
           boolean f1 = mano2.contains("5");
           boolean f2 = mano2.contains("6");
           boolean f3 = mano2.contains("7");
           boolean f4 = mano2.contains("9");
           boolean f5 = mano2.contains("J");
           //Sexta condicon
           boolean g1 = mano2.contains("4");
           boolean g2 = mano2.contains("5");
           boolean g3 = mano2.contains("6");
           boolean g4 = mano2.contains("7");
           boolean g5 = mano2.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano2.contains("3");
           boolean j2 = mano2.contains("4");
           boolean j3 = mano2.contains("5");
           boolean j4 = mano2.contains("6");
           boolean j5 = mano2.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano2.contains("2");
           boolean h2 = mano2.contains("3");
           boolean h3 = mano2.contains("4");
           boolean h4 = mano2.contains("5");
           boolean h5 = mano2.contains("6");
           //Novena Condicion
           boolean i1 = mano2.contains("A");
           boolean i2 = mano2.contains("2");
           boolean i3 = mano2.contains("3");
           boolean i4 = mano2.contains("4");
           boolean i5 = mano2.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM2 = "Escalera de Color";
           }
           else{
             tipoM2 = "Color";
           }

        }

      }

      //Para Diamante
      else if(totalD2 == 5){
        boolean dA = mano2.contains("A");
        boolean dK = mano2.contains("K");
        boolean dQ = mano2.contains("Q");
        boolean dJ = mano2.contains("J");
        boolean d0 = mano2.contains("0");
        if((dA == true) && (dK == true) && (dQ == true) && (dJ == true) && (d0 == true)){
          tipoM2 = "Escalera Real";
        }
        else if((total2Num1 == 1) && (total2Num2 == 1) && (total2Num3 == 1) && (total2Num4 == 1) && (total2Num5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano2.contains("9");
           boolean e2 = mano2.contains("0");
           boolean e3 = mano2.contains("J");
           boolean e4 = mano2.contains("Q");
           boolean e5 = mano2.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano2.contains("8");
           boolean a2 = mano2.contains("9");
           boolean a3 = mano2.contains("0");
           boolean a4 = mano2.contains("J");
           boolean a5 = mano2.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano2.contains("7");
           boolean b2 = mano2.contains("8");
           boolean b3 = mano2.contains("9");
           boolean b4 = mano2.contains("0");
           boolean b5 = mano2.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano2.contains("6");
           boolean d2 = mano2.contains("7");
           boolean d3 = mano2.contains("8");
           boolean d4 = mano2.contains("9");
           boolean d5 = mano2.contains("0");
           //Quinta Condicion
           boolean f1 = mano2.contains("5");
           boolean f2 = mano2.contains("6");
           boolean f3 = mano2.contains("7");
           boolean f4 = mano2.contains("9");
           boolean f5 = mano2.contains("J");
           //Sexta condicon
           boolean g1 = mano2.contains("4");
           boolean g2 = mano2.contains("5");
           boolean g3 = mano2.contains("6");
           boolean g4 = mano2.contains("7");
           boolean g5 = mano2.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano2.contains("3");
           boolean j2 = mano2.contains("4");
           boolean j3 = mano2.contains("5");
           boolean j4 = mano2.contains("6");
           boolean j5 = mano2.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano2.contains("2");
           boolean h2 = mano2.contains("3");
           boolean h3 = mano2.contains("4");
           boolean h4 = mano2.contains("5");
           boolean h5 = mano2.contains("6");
           //Novena Condicion
           boolean i1 = mano2.contains("A");
           boolean i2 = mano2.contains("2");
           boolean i3 = mano2.contains("3");
           boolean i4 = mano2.contains("4");
           boolean i5 = mano2.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM2 = "Escalera de Color";
           }
           else{
             tipoM2 = "Color";
           }

        }

      }

      //Para pica
      else{
        boolean pA = mano2.contains("A");
        boolean pK = mano2.contains("K");
        boolean pQ = mano2.contains("Q");
        boolean pJ = mano2.contains("J");
        boolean p0 = mano2.contains("0");
        if((pA == true) && (pK == true) && (pQ == true) && (pJ == true) && (p0 == true)){
          tipoM2 = "Escalera Real";

        }
        else if((total2Num1 == 1) && (total2Num2 == 1) && (total2Num3 == 1) && (total2Num4 == 1) && (total2Num5 == 1)){
           //Primera Escalera de Color
           boolean e1 = mano2.contains("9");
           boolean e2 = mano2.contains("0");
           boolean e3 = mano2.contains("J");
           boolean e4 = mano2.contains("Q");
           boolean e5 = mano2.contains("K");
           //Segunda Escalera de Color
           boolean a1 = mano2.contains("8");
           boolean a2 = mano2.contains("9");
           boolean a3 = mano2.contains("0");
           boolean a4 = mano2.contains("J");
           boolean a5 = mano2.contains("Q");
           //Tercera Escalera de Color
           boolean b1 = mano2.contains("7");
           boolean b2 = mano2.contains("8");
           boolean b3 = mano2.contains("9");
           boolean b4 = mano2.contains("0");
           boolean b5 = mano2.contains("J");
           //Cuarta Escalera de Color
           boolean d1 = mano2.contains("6");
           boolean d2 = mano2.contains("7");
           boolean d3 = mano2.contains("8");
           boolean d4 = mano2.contains("9");
           boolean d5 = mano2.contains("0");
           //Quinta Condicion
           boolean f1 = mano2.contains("5");
           boolean f2 = mano2.contains("6");
           boolean f3 = mano2.contains("7");
           boolean f4 = mano2.contains("9");
           boolean f5 = mano2.contains("J");
           //Sexta condicon
           boolean g1 = mano2.contains("4");
           boolean g2 = mano2.contains("5");
           boolean g3 = mano2.contains("6");
           boolean g4 = mano2.contains("7");
           boolean g5 = mano2.contains("8");
           //Septima Escalera de Color
           boolean j1 = mano2.contains("3");
           boolean j2 = mano2.contains("4");
           boolean j3 = mano2.contains("5");
           boolean j4 = mano2.contains("6");
           boolean j5 = mano2.contains("7");
           //Octava Escalera de Color
           boolean h1 = mano2.contains("2");
           boolean h2 = mano2.contains("3");
           boolean h3 = mano2.contains("4");
           boolean h4 = mano2.contains("5");
           boolean h5 = mano2.contains("6");
           //Novena Condicion
           boolean i1 = mano2.contains("A");
           boolean i2 = mano2.contains("2");
           boolean i3 = mano2.contains("3");
           boolean i4 = mano2.contains("4");
           boolean i5 = mano2.contains("5");

           //Primera condicion
           if((e1 == true) && (e2 == true) && (e3 == true) && (e4 == true) && (e5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Segunda condicion
           else if((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true) && (a5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //tercera condicion
           else if((b1 == true) && (b2 == true) && (b3 == true) && (b4 == true) && (b5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Cuarta condicion
           else if((d1 == true) && (d2 == true) && (d3 == true) && (d4 == true) && (d5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //quinta condicion
           else if((f1 == true) && (f2 == true) && (f3 == true) && (f4 == true) && (f5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Sexta condicion
           else if((g1 == true) && (g2 == true) && (g3 == true) && (g4 == true) && (g5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Septima condicion
           else if((h1 == true) && (h2 == true) && (h3 == true) && (h4 == true) && (h5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Octava condicion
           else if((i1 == true) && (i2 == true) && (i3 == true) && (i4 == true) && (i5 == true)){
             tipoM2 = "Escalera de Color";
           }
           //Novena condicion
           else if((j1 == true) && (j2 == true) && (j3 == true) && (j4 == true) && (j5 == true)){
             tipoM2 = "Escalera de Color";
           }
           else{
             tipoM2 = "Color";
           }

        }

      }

    }


    if(tipoM2.equals("No tiene ningun combo")){
      System.out.println("\nEl jugador " + jugador2 + ": " + tipoM2);
    }
    else{
      System.out.println("\nEl jugador " +jugador2 + " tiene: " + tipoM2);
    }

    //CONDICIONES PARA VER QUIEN GANA

    //ESCALERA REAL
    if((tipoM.equals("Escalera Real")) || (tipoM2.equals("Escalera Real"))) {
      if((tipoM.equals("Escalera Real")) && (tipoM2.equals("Escalera Real"))) {
      }
      else if( (tipoM.equals("Escalera Real")) ) {
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else{
        System.out.print("El jugador " + jugador2 + " gano.");
      }
    }

    //ESCALERA DE COLOR
    if( tipoM.equals("Escalera de Color") ){
      if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals(" No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera de Color")) && (tipoM2.equals("Escalera de Color")) ){
      }
      else{
        System.out.print("El jugador " + jugador2 + " gano.");
      }

    }

    //POKER
    if( tipoM.equals("Poker")){
      if( (tipoM.equals("Poker")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Poker")) && (tipoM2.equals("Poker")) ){
      }
      else{
        System.out.print("El jugador " + jugador2 + " gano.");
      }
    }

    //FULL
    if( tipoM.equals("Full")) {
      if( (tipoM.equals("Full")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Full")) && (tipoM2.equals("Full")) ){
      }
      else{
        System.out.print("El jugador " + jugador2 + " gano.");
      }
    }

    //COLOR
    if( tipoM.equals("Color")) {
      if( (tipoM.equals("Color")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Pareja")) ){
         System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Color")) && (tipoM2.equals("Color")) ){
      }
      else{
          System.out.print("El jugador " + jugador2 + " gano.");
      }
    }

    //ESCALERA
    if( tipoM.equals("Escalera")){
      if( (tipoM.equals("Escalera")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Escalera")) && (tipoM2.equals("Escalera")) ){
      }
      else{
          System.out.print("El jugador " + jugador2 + " gano.");
      }
    }

    //TRIO
    if( tipoM.equals("Trio")) {
      if( (tipoM.equals("Trio")) && (tipoM2.equals("Escalera Real")) ){
         System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Trio")) && (tipoM2.equals("Trio")) ){
      }
      else{
        System.out.print("El jugador " + jugador2 + " gano.");
      }

    }

    //DOBLE PAREJA
    if( tipoM.equals("Doble Pareja") ){
      if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Escalera Real")) ) {
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Pareja Doble")) && (tipoM2.equals("Doble Pareja")) ){
      }
      else{
        System.out.print("El jugador " + jugador1 + " gano.");
      }
    }

    //PAREJA
    if( tipoM.equals("Pareja")){
      if( (tipoM.equals("Pareja")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Carta Alta")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Pareja")) && (tipoM2.equals("Pareja")) ){
      }
      else{
        System.out.print("El jugador " + jugador1 + " gano.");
      }
    }

    //CARTA ALTA
    if( tipoM.equals("Carta Alta")){
      if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("No tiene ningun combo")) ){
        System.out.print("El jugador " + jugador1 + " gano.");
      }
      else if( (tipoM.equals("Carta Alta")) && (tipoM2.equals("Carta Alta")) ){
      }
      else{
        System.out.print("El jugador " + jugador1 + " gano.");
      }
    }

    //No tiene combo
    if( tipoM.equals("No tiene ningun combo")){
      if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Escalera Real")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Escalera de Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Poker")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Full")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Color")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Escalera")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Trio")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Doble Pareja")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("Pareja")) ){
        System.out.print("El jugador " + jugador2 + " gano.");
      }
      else if( (tipoM.equals("No tiene ningun combo")) && (tipoM2.equals("No tiene ningun combo")) ){
      }
      else{
        System.out.print("El jugador " + jugador1 + " gano.");
      }
    }
    if(tipoM.equals(tipoM2)){
      System.out.print("Hay empate entre ambos jugadores.");
    }
  }
}
