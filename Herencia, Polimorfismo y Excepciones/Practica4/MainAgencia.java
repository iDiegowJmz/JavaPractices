import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
Autor: Diego Isaac Jimenez Baroja
Este programa usaremos dos clases, ya que no creo necesario la herencia. Implementaremos
excepciones para que los valores ingresador por los
*/

public class MainAgencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Random aleatorio = new Random();

        //Objetos creados de nuestra clase
        Agencia ag1 = new Agencia();
        Avion av1 = new Avion();

        //Variables inicializadas
        int op = 0;
        int opVuelo = 0;
        int lugar = 0;

        //Los array que ocuparemos.
        String [] reservaciones = new String [15];
        String [] boletosIda = new String [50];
        String [] boletosRegreso = new String [50];

        //Contadores que mostraran la cantidad de habitaciones ocupadaas
        int conSencilla = 5;
        int conFamiliar = 10;

        //Este indice, aunmentara la posicion en que se guarde la reservacion en el arreglo
        int i = 0;

        //Empieza el programa
        System.out.println("- - - Bienvenido a la Agencia Puma - Tours - - -");

        do {
            System.out.println("1.- Crear reservacion para el hotel tropical");
            System.out.println("2.- Cancelar reservacion");
            System.out.println("3.- Buscar reservacion");
            System.out.println("4.- Ver todas las reservaciones");
            System.out.println("5.- Consultar el estatus de las habitaciones del Hotel Tropical");
            System.out.println("6.- Consultar informacion del avion");
            System.out.println("7.- Salir del programa");
            System.out.print("\nSeleccion una de las siguientes opciones: ");

            //Nuestra primer excepcion por si no ingresa un valor correcto
              do {
                try{
                  op = sc.nextInt();
                }catch(InputMismatchException e){
                  System.out.println("No es correcto lo que ingresaste. :(/nIntentalo de nuevo: ");
                  sc.nextLine();
                }
              } while ((op<1) && (op>7));

            //Reservar
            if (op == 1){

                //Aqui primero veremos si hay habitaciones disponibles para raservar
                if((conSencilla>0) && (conFamiliar>0)){
                  //Siempre tendremos el precio en 0, por eso debe ir dentro del ciclo, para que siempre empiece en 0,
                  //Lo mismo para las otras variables
                  int precio = 0;
                  String titular = "";
                  int participantes = 0;
                  int numHabi = 0;

                  String numRe = ag1.identificador();

                  System.out.print("Nombre del titular: ");
                  titular = sc.next();
                  System.out.print("Numero de los participantes: ");
                  try{
                    participantes = sc.nextInt();
                  }catch(InputMismatchException e){

                  System.out.println("No es correcto lo que ingresaste. :(/Intentalo de nuevo: ");
                    sc.nextLine();

                  }

                  //Aqui veremos si esta en el parametro que pide el PDF, en esta parte solo se edita
                  //el precio y los contadores de las habitaciones
                  if(participantes > 0 && participantes <5){
                    if(participantes > 2){

                      if(conFamiliar == 0){
                        System.out.println("Ya no hay habitaciones familiares");
                      }
                      else{
                        System.out.println("Se le asigno una haitacion familiar, incluye una cama kingsize" +
                        " y dos camas individuales por $1,200 la noche");

                        precio = precio + 1200;

                        numHabi = conFamiliar;
                        conFamiliar--;
                      }

                    }
                    else if ((participantes > 0) && (participantes <= 21) ){

                      if (conSencilla == 0) {
                        System.out.println("Ya no hay habitaiones sencillas");
                      }
                      else{
                        System.out.println("Se le asigno una haitacion sencilla incluye una cama matrimonial" +
                        ". Por $580 la noche");

                        precio = precio + 580;

                        numHabi = conSencilla;
                        conSencilla--;
                      }

                    }

                    //Aqui implementaremos la clase de Avion
                    System.out.print("¿Incluye vuelos? de ser asi presione 1, de lo contrario, cualquier otro numero: ");
                    opVuelo = sc.nextInt();

                    if (opVuelo == 1) {
                    	while (true) {

	                    	try{
		                    	  precio = precio + (2000*participantes);
			                      System.out.println("Los boletos de ida");
			                      av1.mostrarBoletos(boletosIda);
			                      av1.escogerBoletos(boletosIda, participantes);
			                      System.out.println("Los boletos de regreso");
			                      av1.mostrarBoletos(boletosRegreso);
			                      av1.escogerBoletos(boletosRegreso, participantes);
			                      break;

					          }catch(ArrayIndexOutOfBoundsException e){
					            System.out.println("Este asiento no exite en el avion, intentalo de nuevo: ");
					            sc2.nextLine();
					          }catch(InputMismatchException e){
					            System.out.println("No es un valor valido");
					            sc2.nextLine();
					          }
				      	}


                    }

                    else{
                      System.out.println("Usted escogio hacer reservacion sin vuelo");
                    }

                    //Aqui llamamos al metodo reservacion, que sera guardada en una variable de tipo String
                    String reserva = ag1.Reservacion(titular, participantes, precio, numHabi, numRe);

                    System.out.println(reserva);

                    //Aqui ya lo guardamos en nuestro arreglo
                    reservaciones [i] = reserva;

                    //E incrementamos el indice
                    i++;

                    if(i >= 15){
                      System.out.println("Ya estan reservadas las 15 habitaciones disponibles");
                    }
                  }
                  else {
                    System.out.println("No se puede hacer reservaciones para clientes con mas de 4 acompaÃ±antes");
                  }
                }

                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");


            }
            else if (op ==  2){

                System.out.println("Ingrese su codigo identificador:");
                String id = sc.next();

                ag1.Cancelar(reservaciones, id);
            }

            else if (op == 3){

                System.out.print("Ingrese el numero de indetificador de reservacion: ");
                String buscar = sc.next();

                ag1.Buscar(reservaciones, buscar);
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");

            }
            else if(op == 4){
              ag1.Mostrar(reservaciones);
            }
            else if(op == 5){
                System.out.println("La disponibilidad de habitaciones sencillas es de: " + conSencilla);
                System.out.println("La disponibilidad de habitaciones suits familiares es de: " + conFamiliar);

                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");

            }
            else if(op == 6){
                System.out.println("Es estatus de voletos de ida es: ");
                av1.mostrarBoletos(boletosIda);
                System.out.println("Es estatus de voletos de regreso es: ");
                av1.mostrarBoletos(boletosRegreso);
            }
            if(op == 7){
                break;
            }
        } while (op!=7);


    }
}
