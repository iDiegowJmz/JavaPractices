import java.util.Scanner;


public class MainCoche {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int i = 0;
        int p = 0;
        int pMod = 0;

      	Coche c1 = new Coche("ANC3J-JK", p);
      	Coche c2 = new Coche("SJU6SS-01", p);
        Coche c3 = new Coche("DYJJPS-00", p);
        Coche c4 = new Coche("RSSPRT-PK", p);
        Coche c5 = new Coche("GD7AJS-SQ", p);
        Coche c6 = new Coche("GN8AOS-A1", p);
        Coche c7 = new Coche("MSJQ01-IN", p);
        Coche c8 = new Coche("N195HS-7I", p);
        Coche c9 = new Coche("PSJWO1-P0", p);
        Coche c10 = new Coche("FB1G3J-62", p);

      	Coche[] registro = new Coche[10];
      	registro[0] = c1;
      	registro[1] = c2;
        registro[2] = c3;
        registro[3] = c4;
        registro[4] = c5;
        registro[5] = c6;
        registro[6] = c7;
        registro[7] = c8;
        registro[8] = c9;
        registro[9] = c10;

      	while(i<registro.length) {
            System.out.print("“Otorga al auto con matrícula: " + registro[i].getMatricula()
                  + " que esta en la posicion: " + i +  " un el precio de : $");
            try{

              pMod = sc.nextInt();
              if(pMod <= 0 || pMod >1000000){
                pMod = 500000;
              }


              }catch(java.util.InputMismatchException e){

                System.out.println("No es un numero entero, intentalo de nuevo: ");
                pMod = sc2.nextInt();

              }

              System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");

              System.out.println(i + ".- " + registro[i].getMatricula() + ", $" +
                        pMod);

        i++;
        }

    }

}
