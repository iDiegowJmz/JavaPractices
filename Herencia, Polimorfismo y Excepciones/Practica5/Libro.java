import java.io.Serializable;
import java.time.LocalDate;

public class Libro implements Serializable{

    private LocalDate fechaPrestamo;
   private String titulo,autor, editoria, isbn;
   private int ejemplares;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editoria, String isbn, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.editoria = editoria;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditoria() {
        return editoria;
    }

    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void mostrarDatosLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editoria);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ejemplares: " + ejemplares);
    }

}