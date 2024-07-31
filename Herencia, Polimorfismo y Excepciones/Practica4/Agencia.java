import java.util.Random;
import java.util.Scanner;

//Autor: Diego Isaac Jimenez Baroja

public class Agencia {

    Random aleatorio = new Random();

    String nombre;
    int ocupantes;
    int precio;
    int habitacion;

    public Agencia (){

    }

    public Agencia(String nombre, int ocupantes, int precio, int habitacion) {
        this.nombre = nombre;
        this.ocupantes = ocupantes;
        this.precio = precio;
        this.habitacion = habitacion;
    }

    //Este metodo dara el numero indetificador
    public String identificador () {
      int j = 0;
      String letras = "ABCDEFGHIJKLMNOPQRSTWXYZ";
      String numeros = "1234567890";
      String numRe = "";

      while(j<4){

      int opcionRe = aleatorio.nextInt(2)+1;

          if(opcionRe == 1){
              int valorLetra = aleatorio.nextInt(letras.length());
              char letraCar = letras.charAt(valorLetra);
              numRe = numRe + letraCar;
          }
          else{
              int valorNum = aleatorio.nextInt(numeros.length());
              char numeroCar = numeros.charAt(valorNum);
              numRe = numRe + numeroCar;
          }
          j++;
      }

      return numRe;
    }

    //Aqui dara la sentencia que pide el PDF, como este metodo regresa un String, se agregara al arreglo reservaciones
    public String Reservacion (String nombre, int ocupantes, int precio, int habitacion, String numReservacion){
        String rese = "El numero identificador de la reservacion es: " + numReservacion +
                "\nNombre de titular: " + nombre +
                "\nNumero de acompaÃƒÂ±antes: " + ocupantes +
                "\nPrecio : $" + precio +
                "\nNumero de habitacion asignada: " + habitacion;

        return rese;
    }

    //Metodo para buscar una reservacion
    public void Buscar (String [] array, String palabra){

      for(int g=0; g<array.length; g++) {
        if(array[g]!=null) {
          if(array[g].contains(palabra)) {
            System.out.println(array[g]);
          }
        }
      }

    }

    //Metodo para cancelar la reservacion
    public void Cancelar (String [] array, String palabra){
    	Boolean encontrado=false;
	    for (int j=0; j<array.length; j++) {
	        if (array[j]!=null) {
	          if (array[j].contains(palabra)) {
	            array[j]=null;
	            encontrado=true;
	            break;
	          }

	        }

	      }
	      if (encontrado==true) {
	      	System.out.println("Se ha cancelado la reservacion con exito");
	      } else {
	      	System.out.println("No se encontro el numero de la reservacion, vuelva a intentarlo");
	      }

	    }

      //Mostrara todas las reservaciones
      public void Mostrar (String [] array){
      	for(int r=0; r<array.length; r++) {

  	        if (array [r] != null) {
  	        System.out.print(array[r]);
  	        System.out.println("");

  	        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");

  	        }
  	      }
  	    }

}
