import java.util.Random;

//Diego Isaac Jimenez Baroja

/*
  Es un programa para generar contraseñas de diferente nivel
  de seguridad.
*/

public class Contrasena {// Iniciamos programa
  public static void main(String[] args) {

    Random aleatorio = new Random();// Inicializamos random

    // Espacio para definir nuestras varariables que contengan las letras
    // (minusculas y mayusculas), digitos y simbolos especiales que tendra
    // nuestra contraseña
    String letraMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String letraMin = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";
    String especiales = "*#$&+?%";
    String pwd2 = "";

    int cont = 0;

    // Variables enteras para tener un indice de la longitud de cada letra, simbolo
    // o numero
    int valorMayus, valorMinus, valorNum, valorSimb;
    int valorMayus2, valorMinus2, valorNum2, valorSimb2;
    int valorMinus3, valorMinus4, valorMinus5, valorMinus6, valorMinus7, valorMinus8;

    // Variables enteras para saber la ubicacion de cada letra
    int lugarMayus, lugarMinus, lugarNum, lugarSimbolo;
    int lugarMayus2, lugarMinus2, lugarNum2, lugarSimbolo2;
    int lugarMinus3, lugarMinus4, lugarMinus5, lugarMinus6, lugarMinus7, lugarMinus8;

    // Variables char de cada letra, simbolo o numero con los datos que ya
    // deberiamos
    // tener
    char letraMayus, letraMinus, numero, special;
    char letraMayus2, letraMinus2, numero2, special2;
    char letraMinus3, letraMinus4, letraMinus5, letraMinus6, letraMinus7, letraMinus8;


    while(cont!=10){

      // Escogemos que tipo de  contraseña sera la que se generará}
      int tipoPws = aleatorio.nextInt(3)+1;

      pwd2 = "";

      //Seguridad débil: Si la contraseña contiene exactamente un número y exactamente una letra
      //mayúscula
      if(tipoPws==1){
        System.out.print("Contraseña es de seguridad debil");

        //DEFINICION DE LAS LETRAS MINUSCULAS
        valorMinus = aleatorio.nextInt(letraMin.length());
        lugarMinus = 0;
        letraMinus = letraMin.charAt(valorMinus);
        pwd2 = pwd2.substring(0, (lugarMinus)) + letraMinus + pwd2.substring(lugarMinus);

        valorMinus2 = aleatorio.nextInt(letraMin.length());
        lugarMinus2 = 1;
        letraMinus2 = letraMin.charAt(valorMinus2);
        pwd2 = pwd2.substring(0, (lugarMinus2)) + letraMinus2 + pwd2.substring(lugarMinus2);

        valorMinus3 = aleatorio.nextInt(letraMin.length());
        lugarMinus3 = 2;
        letraMinus3 = letraMin.charAt(valorMinus3);
        pwd2 = pwd2.substring(0, (lugarMinus3)) + letraMinus3 + pwd2.substring(lugarMinus3);

        valorMinus4 = aleatorio.nextInt(letraMin.length());
        lugarMinus4 = 3;
        letraMinus4 = letraMin.charAt(valorMinus4);
        pwd2 = pwd2.substring(0, (lugarMinus4)) + letraMinus4 + pwd2.substring(lugarMinus4);


        valorMinus6 = aleatorio.nextInt(letraMin.length());
        lugarMinus6 = 4;
        letraMinus6 = letraMin.charAt(valorMinus6);
        pwd2 = pwd2.substring(0, (lugarMinus6)) + letraMinus6 + pwd2.substring(lugarMinus6);

        //ESPACIO PARA ESCOGER EL CASO DE MAYUSCULA, JUNTO SUS VARIABLES
        int opcionM = aleatorio.nextInt(3)+1;

        if(opcionM==1){

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 2;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          int opcionN = aleatorio.nextInt(2)+1;

          if(opcionN == 1){
            valorNum = aleatorio.nextInt(num.length());
            lugarNum = 4;
            numero = num.charAt(valorNum);
            pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
          }
          else{
            valorNum = aleatorio.nextInt(num.length());
            lugarNum = 7;
            numero = num.charAt(valorNum);
            pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
          }

        }

        else if (opcionM == 2){

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 1;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 4;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          int opcionN = aleatorio.nextInt(2)+1;

          if(opcionN == 1){
            valorNum = aleatorio.nextInt(num.length());
            lugarNum = 0;
            numero = num.charAt(valorNum);
            pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
          }
          else{
            valorNum = aleatorio.nextInt(num.length());
            lugarNum = 7;
            numero = num.charAt(valorNum);
            pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
          }

        }

        else{

            valorSimb = aleatorio.nextInt(especiales.length());
            lugarSimbolo = 4;
            special = especiales.charAt(valorSimb);
            pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

            int opcionN = aleatorio.nextInt(2)+1;

            if(opcionN == 1){
              valorNum = aleatorio.nextInt(num.length());
              lugarNum = 0;
              numero = num.charAt(valorNum);
              pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
            }
            else{
              valorNum = aleatorio.nextInt(num.length());
              lugarNum = 4;
              numero = num.charAt(valorNum);
              pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
            }

            valorMayus = aleatorio.nextInt(letraMay.length());
            lugarMayus = 7;
            letraMayus = letraMay.charAt(valorMayus);
            pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

        }

        System.out.println(", la contraseña es:\t" + pwd2);
        cont++;
      }

      //Seguridad media: Si la contraseña contiene exactamente un número y dos letras mayúscula
      else if(tipoPws==2){

        System.out.print("La contraña es de seguridad media");

        valorMinus = aleatorio.nextInt(letraMin.length());
        lugarMinus = 0;
        letraMinus = letraMin.charAt(valorMinus);
        pwd2 = pwd2.substring(0, (lugarMinus)) + letraMinus + pwd2.substring(lugarMinus);

        valorMinus2 = aleatorio.nextInt(letraMin.length());
        lugarMinus2 = 1;
        letraMinus2 = letraMin.charAt(valorMinus2);
        pwd2 = pwd2.substring(0, (lugarMinus2)) + letraMinus2 + pwd2.substring(lugarMinus2);

        valorMinus4 = aleatorio.nextInt(letraMin.length());
        lugarMinus4 = 2;
        letraMinus4 = letraMin.charAt(valorMinus4);
        pwd2 = pwd2.substring(0, (lugarMinus4)) + letraMinus4 + pwd2.substring(lugarMinus4);

        valorMinus5 = aleatorio.nextInt(letraMin.length());
        lugarMinus5 = 3;
        letraMinus5 = letraMin.charAt(valorMinus5);
        pwd2 = pwd2.substring(0, (lugarMinus5)) + letraMinus5 + pwd2.substring(lugarMinus5);

        //ESPACIO PARA ESCOGER EL CASO DE LAS MAYUSCULAS, JUNTO SUS VARIABLES
        int opcionM = aleatorio.nextInt(3)+1;

        if(opcionM==1){

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 2;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 4;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 7;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);
        }

        else if(opcionM==2){

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 4;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 4;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 7;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);
        }

        else{

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 3;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 0;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 4;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 7;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);
        }

        System.out.println(", la contraseña es:\t" + pwd2);
        cont++;
      }

      //Seguridad alta: Si la contraseña contiene dos números y dos mayúsculas
      else{

        System.out.print("La contraña es de seguridad alta");

        valorMinus = aleatorio.nextInt(letraMin.length());
        lugarMinus = 0;
        letraMinus = letraMin.charAt(valorMinus);
        pwd2 = pwd2.substring(0, (lugarMinus)) + letraMinus + pwd2.substring(lugarMinus);

        valorMinus2 = aleatorio.nextInt(letraMin.length());
        lugarMinus2 = 1;
        letraMinus2 = letraMin.charAt(valorMinus2);
        pwd2 = pwd2.substring(0, (lugarMinus2)) + letraMinus2 + pwd2.substring(lugarMinus2);

        valorMinus4 = aleatorio.nextInt(letraMin.length());
        lugarMinus4 = 2;
        letraMinus4 = letraMin.charAt(valorMinus4);
        pwd2 = pwd2.substring(0, (lugarMinus4)) + letraMinus4 + pwd2.substring(lugarMinus4);

        //ESPACIO PARA ESCOGER EL CASO DE LAS MAYUSCULAS, JUNTO SUS VARIABLES
        int opcionM = aleatorio.nextInt(6)+1;

        if(opcionM==1){

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 2;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 4;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorNum2 = aleatorio.nextInt(num.length());
          lugarNum2 = 5;
          numero2 = num.charAt(valorNum2);
          pwd2 = pwd2.substring(0, (lugarNum2)) + numero2 + pwd2.substring(lugarNum2);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 7;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);

        }

        else if(opcionM==2){
          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 1;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 4;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 6;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorNum2 = aleatorio.nextInt(num.length());
          lugarNum2 = 7;
          numero2 = num.charAt(valorNum2);
          pwd2 = pwd2.substring(0, (lugarNum2)) + numero2 + pwd2.substring(lugarNum2);
        }

        else if(opcionM==3){
          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 0;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 3;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 4;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorNum2 = aleatorio.nextInt(num.length());
          lugarNum2 = 4;
          numero2 = num.charAt(valorNum2);
          pwd2 = pwd2.substring(0, (lugarNum2)) + numero2 + pwd2.substring(lugarNum2);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 7;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);
        }

        else if(opcionM==4){
          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 0;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 1;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 4;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 5;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);

          valorNum2 = aleatorio.nextInt(num.length());
          lugarNum2 = 7;
          numero2 = num.charAt(valorNum2);
          pwd2 = pwd2.substring(0, (lugarNum2)) + numero2 + pwd2.substring(lugarNum2);
        }

        else if(opcionM==5){
          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 1;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 4;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);

          valorNum2 = aleatorio.nextInt(num.length());
          lugarNum2 = 6;
          numero2 = num.charAt(valorNum2);
          pwd2 = pwd2.substring(0, (lugarNum2)) + numero2 + pwd2.substring(lugarNum2);

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 7;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);
        }

        else{
          valorMayus = aleatorio.nextInt(letraMay.length());
          lugarMayus = 0;
          letraMayus = letraMay.charAt(valorMayus);
          pwd2 = pwd2.substring(0, (lugarMayus)) + letraMayus + pwd2.substring(lugarMayus);

          valorNum = aleatorio.nextInt(num.length());
          lugarNum = 1;
          numero = num.charAt(valorNum);
          pwd2 = pwd2.substring(0, (lugarNum)) + numero + pwd2.substring(lugarNum);

          valorMayus2 = aleatorio.nextInt(letraMay.length());
          lugarMayus2 = 2;
          letraMayus2 = letraMay.charAt(valorMayus2);
          pwd2 = pwd2.substring(0, (lugarMayus2)) + letraMayus2 + pwd2.substring(lugarMayus2);

          valorSimb = aleatorio.nextInt(especiales.length());
          lugarSimbolo = 4;
          special = especiales.charAt(valorSimb);
          pwd2 = pwd2.substring(0, (lugarSimbolo)) + special + pwd2.substring(lugarSimbolo);

          valorNum2 = aleatorio.nextInt(num.length());
          lugarNum2 = 7;
          numero2 = num.charAt(valorNum2);
          pwd2 = pwd2.substring(0, (lugarNum2)) + numero2 + pwd2.substring(lugarNum2);

        }

          System.out.println(", la contraseña es:\t" + pwd2);
          cont++;;
      }
    }

  }
}//Fin de codigo
