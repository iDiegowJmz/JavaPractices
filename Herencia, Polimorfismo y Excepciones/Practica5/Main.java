public class Main {
    public static void main(String[] args) {
        Libreria libreria;

        // Intenta cargar la librería desde el archivo
        libreria = Libreria.cargar("libreria.dat");

        // Si la librería no se cargó correctamente, crea una nueva instancia
        if (libreria == null) {
            libreria = new Libreria();
        }

        // Continúa con el resto del programa
        libreria.menuPrincipal();
    }
}
