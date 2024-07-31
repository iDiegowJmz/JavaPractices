public class Micro extends Autobus{

        public Micro(int ns, int np, int nr) {
            super(ns, np, nr);

            if(nr>=5) {
            System.out.println("Error, el micro con el numero de serie: " + ns +
            " no puede tener mas de 4 llantas");
            }
        }
}
