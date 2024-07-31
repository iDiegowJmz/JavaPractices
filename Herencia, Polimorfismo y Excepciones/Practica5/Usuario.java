import java.io.Serializable;

public class Usuario implements Serializable{

    private String nombre, correo, numero;
    private int numeroId;

    private Libro [] librosP;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String numero, int numeroId, Libro[] librosP) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.numeroId = numeroId;
        this.librosP = new Libro[3];
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public Libro[] getLibrosP() {
        return librosP;
    }

    public void setLibrosP(Libro[] librosP) {
        this.librosP = librosP;
    }


    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Número: " + numero);
        System.out.println("Número ID: " + numeroId);
        System.out.println("Libros Prestados:");

        if (librosP != null) {
            for (Libro libro : librosP) {
                if (libro != null) {
                    System.out.println("  - " + libro.getTitulo());
                }
            }
        } else {
            System.out.println("No hay libros prestados");
        }
    }

}