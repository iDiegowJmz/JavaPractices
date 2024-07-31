import java.util.Scanner;
public class MediosTransporte{

public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    System.out.println("Introduce el numero de llantas del microbus: ");
        int numR = sc.nextInt();
    Autobus metrobus = new Autobus(91019,120,24);
    Micro microbus = new Micro(12345, 40, numR);


    if(numR <= 4){
        microbus.avanzar();
        microbus.bajarPasajeros();
    }

    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

    metrobus.avanzar();
    metrobus.bajarPasajeros();

  }

}
