import java.io.Serializable;

public class Bibliotecario implements Serializable{

    private String nombre, correo;
    private int numeroId;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String correo, int numeroId) {
        this.nombre = nombre;
        this.correo = correo;
        this.numeroId = numeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Numero de ID: " + numeroId);
    }

}