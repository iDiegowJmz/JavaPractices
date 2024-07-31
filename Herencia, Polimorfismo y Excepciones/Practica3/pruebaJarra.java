import java.util.Scanner;

public class pruebaJarra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dep = 0;
        int ret = 0;
        int numeroVasos = 0;
        JarraDeAgua jarra1 = new JarraDeAgua();

        int op;
        do {
            System.out.println("1.- Depositar agua a la jarra");
            System.out.println("2.- Retirar agua de la jarra");
            System.out.println("3.- Salir");
            System.out.println("Escoge un numero del siguiente menu");
            op = sc.nextInt();

            if(op == 1){
                System.out.println("¿Cuanto vasos deseas depositar?");
                try {
                    numeroVasos = sc.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("No es un numero entero, intentalo de nuevo: ");
                    sc.next();
                }

                dep = jarra1.depositarAgua(numeroVasos);

                try {
                    if(dep > 10){
                        throw new CapacidadSuficiente();
                    }
                } catch (CapacidadSuficiente ex) {
                    System.out.println(ex.getMessage());
                }

                System.out.println("La capacidad actual de la jarra es de: " + dep);
            }

            else if(op == 2){
                System.out.println("¿Cuanto vasos deseas retirar?");
                try {
                    numeroVasos = sc.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("No es un numero entero, intentalo de nuevo: ");
                    sc.next();
                }

                ret = jarra1.retirarAgua(numeroVasos);

                try {
                    if(ret < 0){
                        throw new CapacidadInsuficiente();
                    }
                } catch (CapacidadInsuficiente ex) {
                    ex.getMessage();
                }

                System.out.println("La capacidad actual de la jarra es de: " + ret);
            }

            else if(op == 3){
                break;
            }

            else {

            }
        } while (op != 3);
    }

}
