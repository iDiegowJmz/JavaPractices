public class CapacidadSuficiente extends Exception{

    int maxVaso = 10;

    public CapacidadSuficiente(){
        super();
    }

    public String getMessage(){
        String exc = "";

        exc = "La jarra de agua rebasa su limite maximo";

        return exc;
    }
}
