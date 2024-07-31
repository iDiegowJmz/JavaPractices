import java.util.Scanner;

public class PruebaAutomovil {
    public static void main (String [] args){

        boolean carro;

        Scanner sc = new Scanner(System.in);

        //Espacio para pedir los datos del automovil
        System.out.print("Escoge la marca de tu auto: ");
            String mar = sc.next();
        System.out.print("\nEscoge el modelo de tu auto: ");
            String mod = sc.next();
        System.out.print("\nEscoge el color de tu auto: ");
            String col = sc.next();
        System.out.print("\nEscoge la capacidad total del tanque: ");
            double totalTanque = sc.nextDouble();
        System.out.print("\nEscoge la capacidad actual del tanque: ");
            double actualTanque = sc.nextDouble();
        System.out.print("\nSi su auto se encuentra apagado, presione 1, de lo" +
                        " contrario, ingrese otro numero diferente de 1");
            int estado = sc.nextInt();

        //Condiciones para saber si esta encendido o apagado el auto
        if(estado == 1){
          carro = true;
        }
        else{
          carro = false;
        }

        //Creamos nuestro auto con el metodo auto que tiene todos los parametros
        Automovil auto1 = new Automovil(mar, mod, col, totalTanque, actualTanque, carro);
        System.out.print(auto1);  //Imprimimos nuestro auto

        //Condicion para ver si ocupamos el metodo donde echamos gasolina al auto
        if(totalTanque != actualTanque){
          System.out.print("\nSu tanque actual tiene menos de lo total, ¿Desea echar gasolina?" +
                            " De ser asi, presione 1, de lo contrario, ingrese otro numero" +
                            " diferente de 1 para que su auto comience a avanzar");
            int gasolina = sc.nextInt();

          if(gasolina == 1){
            System.out.print("\nEscoge 1 para llenar el tanque por completo, de lo contrario"+
                              " ingrese otro numero diferente de 1");
              int gas = sc.nextInt();
            if(gas==1){
                  auto1.cargarTodoElTanque();

                  System.out.print("\n¿Cuantos kilometros quieres avanzar?");
                    int km = sc.nextInt();

                  auto1.avanzar(km);
            }
            else{
              System.out.print("\nIngresa el monto que vas a pagar, considerando que "+
                              "el litro esta en $19.8: ");
                double dinero = sc.nextInt();
              auto1.cargarGasolina(dinero);

              System.out.print("\n¿Cuantos kilometros quieres avanzar?");
                int km = sc.nextInt();

              auto1.avanzar(km);
            }
          }
          //Metodo para avanzar
          else{
            System.out.print("\n¿Cuantos kilometros quieres avanzar?");
                int km = sc.nextInt();

            auto1.avanzar(km);
          }

        }

        else{
        System.out.print("\n¿Cuantos kilometros quieres avanzar?");
          int km = sc.nextInt();

        auto1.avanzar(km);
        }


        //Creamos un auto sin parametros, esto para tener un iniciar el metodo carreritas
        Automovil auto = new Automovil();

        //Pedimos los datos para los autos que estaran en las carreritas
        System.out.print("\nEscoge el modelo del primer auto: ");
            String mod1 = sc.next();
        System.out.print("\nEscoge el color del primer auto: ");
            String col1 = sc.next();

        System.out.print("\nEscoge el modelo del primer auto: ");
            String mod2 = sc.next();
        System.out.print("\nEscoge el color del primer auto: ");
            String col2 = sc.next();

        //Creamos nuestros autos con el metodo que tiene dos parametros
        Automovil auto2 = new Automovil(mod1, col1);
        Automovil auto3 = new Automovil(mod2, col2);

        //Iniciamos nuestro metodo
        auto2.carreritas(auto2,auto3);

    }
}
