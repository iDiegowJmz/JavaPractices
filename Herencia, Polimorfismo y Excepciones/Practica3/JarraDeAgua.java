import java.util.Scanner;

public class JarraDeAgua {

    Scanner sc = new Scanner (System.in);
    int litros;

    public JarraDeAgua() {
      this.litros = 3;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int depositarAgua(int numeroVasos){

        int capDepositada = getLitros() + numeroVasos;
        return capDepositada;

    }

    public int retirarAgua(int numeroVasos){

        int capRetirada = getLitros() - numeroVasos;
        return capRetirada;

    }

    @Override
    public String toString() {
        return "Jarra tiene un total de: " + litros + " lts de agua";
    }

}
