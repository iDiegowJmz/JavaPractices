public class CapacidadInsuficiente extends Exception{

    int minVaso = 0;

    public CapacidadInsuficiente(){
        super();
    }

    public String getMessage(){
        String exc = "";

        exc = "La jarra ya no tiene suficiente agua";

        return exc;
    }
    
}
