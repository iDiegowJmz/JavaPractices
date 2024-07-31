    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import static java.time.temporal.ChronoUnit.DAYS;
    import java.util.InputMismatchException;
    import java.util.Scanner;
    import java.io.Serializable;
    
    public class Libreria implements Serializable{
    
        private static final long serialVersionUID = 85930233957019525L;
    
        private Libro [] libros;
    
        private Usuario [] usuarios;
    
        private Usuario [] userEspera;
    
        private Bibliotecario [] bibliotecarios;
    
    
        //Contructor
        public Libreria() {
    
            this.libros = new Libro[15];
            this.usuarios = new Usuario[15];
            this.userEspera = new Usuario[15];
            this.bibliotecarios = new Bibliotecario[15];
    
            // Agregar algunos libros
            libros[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", "Sudamericana", "74621", 5);
            libros[1] = new Libro("El principito", "Antoine de Saint-Exupéry", "Reynal & Hitchcock", "84812", 3);
            libros[2] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", "98231", 2);
            libros[3] = new Libro("Las aventuras de Tom Sawyer", "Mark Twain", "Chatto & Windus", "78871", 1);
            libros[4] = new Libro("El señor de los anillos", "J.R.R. Tolkien", "George Allen & Unwin", "57703", 10);
            libros[5] = new Libro("Orgullo y prejuicio", "Jane Austen", "Thomas Egerton", "09164", 7);
            libros[6] = new Libro("El proceso", "Franz Kafka", "Verlag Die Schmiede", "53271", 2);
            libros[7] = new Libro("Los hermanos Karamázov", "Fiódor Dostoyevski", "The Russian Messenger", "02942", 5);
            libros[8] = new Libro("Crimen y castigo", "Fiódor Dostoyevski", "Editorial El Áncora", "06846", 3);
            libros[9] = new Libro("Ulises", "James Joyce", "Sylvia Beach", "6293", 0);
            libros[10] = new Libro("El gran Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "6423", 0);
            libros[11] = new Libro("1984", "George Orwell", "Penguin Books", "5233", 0);
            libros[12] = new Libro("Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", "1453", 9);
    
            // Agregar algunos usuarios
            usuarios[0] = new Usuario("Juan Pérez", "juan.perez@example.com", "5534567890", 5412, null);
            usuarios[1] = new Usuario("María García", "maria.garcia@example.com", "5587654321", 5214, null);
            usuarios[2] = new Usuario("Juan", "juan@gmail.com", "5598214564", 9823, null);
            usuarios[3] = new Usuario("María", "maria@gmail.com", "5508135535", 6891, null );
            usuarios[4] = new Usuario("Carlos", "carlos@gmail.com", "5509879335", 9885, null);

            // Agregar algunos bibliotecarios

            bibliotecarios[0] = new Bibliotecario("Juan P", "p@gmail.com",4313);
            bibliotecarios[0] = new Bibliotecario("Laura", "laura@gmail.com", 1941);
            bibliotecarios[1] = new Bibliotecario("Carlos", "carlos@hotmail.com", 8731);
            bibliotecarios[2] = new Bibliotecario("Ana", "ana@yahoo.com", 1102);
            bibliotecarios[3] = new Bibliotecario("Pedro", "pedro@gmail.com", 8531);
    
        }
    
        //Getters y setters
        public Libro[] getLibros() {
            return libros;
        }
    
        public void setLibros(Libro[] libros) {
            this.libros = libros;
        }
    
        public Usuario[] getUsuarios() {
            return usuarios;
        }
    
        public void setUsuarios(Usuario[] usuarios) {
            this.usuarios = usuarios;
        }
    
        public Usuario[] getUserEspera() {
            return userEspera;
        }
    
        public void setUserEspera(Usuario[] userEspera) {
            this.userEspera = userEspera;
        }
    
        public Bibliotecario[] getBibliotecarios() {
            return bibliotecarios;
        }
    
        public void setBibliotecarios(Bibliotecario[] bibliotecarios) {
            this.bibliotecarios = bibliotecarios;
        }
    
        //Metodos para guardar y cargar los datos.
        public void guardar(String archivo) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
                oos.writeObject(this);
                System.out.println("Guardado exitoso en el archivo: " + archivo);
            } catch (IOException e) {
                System.err.println("Error al guardar: " + e.getMessage());
            }
        }
    
        public static Libreria cargar(String archivo) {
            Libreria libreria = null;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                libreria = (Libreria) ois.readObject();
                System.out.println("Carga exitosa desde el archivo: " + archivo);
            } catch (FileNotFoundException e) {
                System.err.println("Archivo no encontrado: " + e.getMessage());
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar: " + e.getMessage());
            }
            return libreria;
        }

        public void mostrarUsuarios() {
            // Mostrar todos los usuarios
            System.out.println("Usuarios:");
            for (Usuario u : usuarios) {
                if (u != null) {
                    System.out.println("- " + u.getNombre() + " (ID: " + u.getNumeroId() + ")");
                }
            }
        }

        public void mostrarBibliotecarios() {
            // Mostrar todos los bibliotecarios
            System.out.println("Bibliotecarios:");
            for (Bibliotecario b : bibliotecarios) {
                if (b != null) {
                    System.out.println("- " + b.getNombre() + " (ID: " + b.getNumeroId() + ")");
                }
            }
        }


        public boolean prestarLibro(int numeroIdUsuario, String isbnLibro) {
            // Buscar al usuario
            Usuario usuario = null;
            for (Usuario u : usuarios) {
                if (u != null && u.getNumeroId() == numeroIdUsuario) {
                    usuario = u;
                    break;
                }
            }
            if (usuario == null) {
                System.out.println("Usuario no encontrado.");
                return false;
            }
    
            // Verificar si el usuario ya tiene 3 libros prestados
            int librosPrestados = 0;
            for (Libro libroPrestado : usuario.getLibrosP()) {
                if (libroPrestado != null) {
                    librosPrestados++;
                }
            }
            if (librosPrestados >= 3) {
                System.out.println("No puedes solicitar más de 3 libros.");
                return false;
            }
    
            // Buscar el libro
            Libro libro = null;
            for (Libro l : libros) {
                if (l != null && l.getIsbn().equals(isbnLibro)) {
                    libro = l;
                    break;
                }
            }
            if (libro == null) {
                System.out.println("Libro no encontrado.");
                return false;
            }
    
            // Verificar si hay ejemplares disponibles del libro
            if (libro.getEjemplares() <= 0) {
                System.out.println("No hay ejemplares disponibles de este libro.");
                return false;
            }

            // Prestar el libro al usuario
            Libro[] librosPrestadosUsuario = usuario.getLibrosP();
            for (int i = 0; i < librosPrestadosUsuario.length; i++) {
                if (librosPrestadosUsuario[i] == null) {
                    librosPrestadosUsuario[i] = libro;
                    libro.setEjemplares(libro.getEjemplares() - 1);

                    // Actualizar la fecha de préstamo
                    libro.setFechaPrestamo(LocalDate.now());

                    // Calcular la fecha de entrega
                    LocalDate fechaEntrega = libro.getFechaPrestamo().plusDays(5);

                    // Mostrar el mensaje de éxito
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    System.out.println("Libro solicitado con éxito: " + libro.getTitulo() + ". Debes entregarlo el " + fechaEntrega.format(formatter));
                    guardar("libreria.dat");
                    return true;
                }
            }

            // No se pudo prestar el libro
            return false;
        }

        public boolean regresarLibro(int numeroIdUsuario, String isbnLibro) {
            // Buscar al usuario
            Usuario usuario = null;
            for (Usuario u : usuarios) {
                if (u != null && u.getNumeroId() == numeroIdUsuario) {
                    usuario = u;
                    break;
                }
            }
            if (usuario == null) {
                System.out.println("Usuario no encontrado.");
                return false;
            }

            // Mostrar la lista de libros prestados
            System.out.println("Libros prestados:");
            Libro[] librosPrestadosUsuario = usuario.getLibrosP();
            boolean hayLibrosPrestados = false;
            for (Libro l : librosPrestadosUsuario) {
                if (l != null) {
                    System.out.println("- " + l.getTitulo());
                    hayLibrosPrestados = true;
                }
            }
            if (!hayLibrosPrestados) {
                System.out.println("No hay libros para devolver.");
                return false;
            }

            // Buscar el libro
            Libro libro = null;
            for (Libro l : libros) {
                if (l != null && l.getIsbn().equals(isbnLibro)) {
                    libro = l;
                    break;
                }
            }
            if (libro == null) {
                System.out.println("Libro no encontrado.");
                return false;
            }

            // Verificar si el usuario tiene el libro prestado
            boolean libroEncontrado = false;
            for (int i = 0; i < librosPrestadosUsuario.length; i++) {
                if (librosPrestadosUsuario[i] != null && librosPrestadosUsuario[i].getIsbn().equals(isbnLibro)) {
                    librosPrestadosUsuario[i] = null;
                    libro.setEjemplares(libro.getEjemplares() + 1);
                    libroEncontrado = true;
                    break;
                }
            }
            if (!libroEncontrado) {
                System.out.println("El usuario no tiene este libro prestado.");
                return false;
            }

            // Calcular la multa si el libro se devolvió tarde
            LocalDate fechaDevolucion = LocalDate.now();
            LocalDate fechaPrestamo = libro.getFechaPrestamo();
            long diasDeRetraso = DAYS.between(fechaPrestamo, fechaDevolucion) - 5;
            if (diasDeRetraso > 0) {
                double multa = diasDeRetraso * 20;
                System.out.println("El libro se devolvió con " + diasDeRetraso + " días de retraso. Se debe pagar una multa de $" + multa);
            } else {
                System.out.println("Libro devuelto con éxito: " + libro.getTitulo());
            }

            // Verificar si el usuario ha alcanzado el número máximo de libros prestados
            int contadorLibrosPrestados = 0;
            for (Libro l : librosPrestadosUsuario) {
                if (l != null) {
                    contadorLibrosPrestados++;
                }
            }

            if(contadorLibrosPrestados >= 4){
                System.out.println("Ya tienes el límite de libros prestados");
            }

            return true;
        }



        public boolean agregarAListaDeEspera(int numeroIdUsuario, String isbnLibro) {
            // Buscar al usuario
            Usuario usuario = null;
            for (Usuario u : usuarios) {
                if (u != null && u.getNumeroId() == numeroIdUsuario) {
                    usuario = u;
                    break;
                }
            }
            if (usuario == null) {
                System.out.println("Usuario no encontrado.");
                return false;
            }
    
            // Buscar el libro
            Libro libro = null;
            for (Libro l : libros) {
                if (l != null && l.getIsbn().equals(isbnLibro)) {
                    libro = l;
                    break;
                }
            }
            if (libro == null) {
                System.out.println("Libro no encontrado.");
                return false;
            }
    
            // Verificar si hay ejemplares disponibles del libro
            if (libro.getEjemplares() > 0) {
                System.out.println("Hay ejemplares disponibles de este libro. No es necesario agregar al usuario a la lista de espera.");
                return false;
            }
    
            // Agregar al usuario a la lista de espera
            for (int i = 0; i < userEspera.length; i++) {
                if (userEspera[i] == null) {
                    userEspera[i] = usuario;
                    System.out.println("Usuario agregado a la lista de espera: " + usuario.getNombre());
                    guardar("libreria.dat");
                    return true;
                }
            }
            System.out.println("No se pudo agregar al usuario a la lista de espera.");
            return false;
        }
    
        public boolean crearUsuario(String nombre, String correo, String numero, int numeroId) {
            // Verificar que el número de ID sea válido
            if (numeroId < 1000 || numeroId > 9999) {
                System.out.println("El número de ID debe tener 4 dígitos.");
                return false;
            }
    
            // Verificar que el número de ID no esté repetido
            for (Usuario u : usuarios) {
                if (u != null && u.getNumeroId() == numeroId) {
                    System.out.println("Ya existe un usuario con este número de ID.");
                    return false;
                }
            }
    
            // Crear el nuevo usuario
            Usuario nuevoUsuario = new Usuario(nombre, correo, numero, numeroId, null);
    
            // Agregar el nuevo usuario al arreglo de usuarios
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] == null) {
                    usuarios[i] = nuevoUsuario;
                    System.out.println("Usuario creado con éxito: " + nuevoUsuario.getNombre());
                    guardar("libreria.dat");
                    return true;
                }
            }
            System.out.println("No se pudo crear el usuario.");
            return false;
        }
    
        public boolean crearBibliotecario(String nombre, String correo, int numeroId) {
            // Verificar que el número de ID sea válido
            if (numeroId < 1000 || numeroId > 9999) {
                System.out.println("El número de ID debe tener 4 dígitos.");
                return false;
            }
    
            // Verificar que el número de ID no esté repetido
            for (Bibliotecario b : bibliotecarios) {
                if (b != null && b.getNumeroId() == numeroId) {
                    System.out.println("Ya existe un bibliotecario con este número de ID.");
                    return false;
                }
            }
    
            // Crear el nuevo bibliotecario
            Bibliotecario nuevoBibliotecario = new Bibliotecario(nombre, correo, numeroId);
    
            // Agregar el nuevo bibliotecario al arreglo de bibliotecarios
            for (int i = 0; i < bibliotecarios.length; i++) {
                if (bibliotecarios[i] == null) {
                    bibliotecarios[i] = nuevoBibliotecario;
                    System.out.println("Bibliotecario creado con éxito: " + nuevoBibliotecario.getNombre());
                    guardar("libreria.dat");
                    return true;
                }
            }
            System.out.println("No se pudo crear el bibliotecario.");
            guardar("libreria.dat");

            return false;
        }
    
        public boolean agregarLibro(String titulo, String autor, String editorial, String isbn, int ejemplares) {
            // Crear el nuevo libro
            Libro nuevoLibro = new Libro(titulo, autor, editorial, isbn, ejemplares);
    
            // Agregar el nuevo libro al arreglo de libros
            for (int i = 0; i < libros.length; i++) {
                if (libros[i] == null) {
                    libros[i] = nuevoLibro;
                    System.out.println("Libro agregado con éxito: " + nuevoLibro.getTitulo());
                    guardar("libreria.dat");
                    return true;
                }
            }
            System.out.println("No se pudo agregar el libro.");
            return false;
        }
    
        public boolean agregarEjemplares(String isbnLibro, int cantidad) {
            // Verificar que la cantidad sea válida
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor a 0.");
                return false;
            }
    
            // Buscar el libro
            Libro libro = null;
            for (Libro l : libros) {
                if (l != null && l.getIsbn().equals(isbnLibro)) {
                    libro = l;
                    break;
                }
            }
            if (libro == null) {
                System.out.println("Libro no encontrado.");
                return false;
            }
    
            // Agregar los ejemplares al libro
            libro.setEjemplares(libro.getEjemplares() + cantidad);
            System.out.println("Ejemplares agregados con éxito: " + libro.getTitulo());
            guardar("libreria.dat");
            return true;
        }

        public void mostrarLibrosParaPrestar() {
            System.out.println("Libros disponibles para prestar:");
            for (Libro libro : libros) {
                if (libro != null && libro.getEjemplares() > 1) {
                    System.out.println("Titulo: "+ libro.getTitulo() + ", Autor:" +  libro.getAutor() + ", Editorial: "  +
                            libro.getEditoria() + ", ISBN: " + libro.getIsbn() + ", Ejemplares: " + libro.getEjemplares());
                }
            }
        }

        public void mostrarLibrosPrestados(int numeroIdUsuario) {
            // Buscar al usuario
            Usuario usuario = null;
            for (Usuario u : usuarios) {
                if (u != null && u.getNumeroId() == numeroIdUsuario) {
                    usuario = u;
                    break;
                }
            }
            if (usuario == null) {
                System.out.println("Usuario no encontrado.");
                return;
            }

            // Mostrar la lista de libros prestados
            System.out.println("Libros prestados:");
            Libro[] librosPrestadosUsuario = usuario.getLibrosP();
            boolean hayLibrosPrestados = false;
            for (Libro l : librosPrestadosUsuario) {
                if (l != null) {
                    System.out.println("- " + l.getTitulo() + "(ISBN: " + l.getIsbn() + " )");
                    hayLibrosPrestados = true;
                }
            }
            if (!hayLibrosPrestados) {
                System.out.println("No hay libros prestados.");
            }
        }



        public void mostrarListaEspera() {
            // Mostrar la lista de espera
            System.out.println("Lista de espera:");
            for (Usuario u : userEspera) {
                if (u != null) {
                    System.out.println("- Nombre: " + u.getNombre() + ", Correo: " + u.getCorreo() + ", Numero: " + u.getNumero() + " (ID: " + u.getNumeroId() + ")");
                }
            }
        }
    
        public boolean quitarListaEspera(int numeroId) {
            // Buscar al usuario en la lista de espera
            int indiceUsuario = -1;
            for (int i = 0; i < userEspera.length; i++) {
                if (userEspera[i] != null && userEspera[i].getNumeroId() == numeroId) {
                    indiceUsuario = i;
                    break;
                }
            }
            if (indiceUsuario == -1) {
                System.out.println("Usuario no encontrado en la lista de espera.");
                return false;
            }
    
            // Quitar al usuario de la lista de espera
            Usuario usuario = userEspera[indiceUsuario];
            userEspera[indiceUsuario] = null;
            System.out.println("Se le comunico al usuario " + usuario.getNombre() + " para notificarle que esta disponible su libro" +
                    " por lo tanto se quitara de la lista de espera");
            guardar("libreria.dat");
            return true;
        }
    
    
        public boolean bajaLibro(String isbnLibro, String causa) {
            // Verificar que la causa sea válida
            if (!causa.equals("Maltrato") && !causa.equals("Robo") && !causa.equals("Antiguedad")) {
                System.out.println("La causa debe ser Maltrato, Robo o Antiguedad.");
                return false;
            }
    
            // Buscar el libro
            Libro libro = null;
            int indiceLibro = -1;
            for (int i = 0; i < libros.length; i++) {
                if (libros[i] != null && libros[i].getIsbn().equals(isbnLibro)) {
                    libro = libros[i];
                    indiceLibro = i;
                    break;
                }
            }
            if (libro == null) {
                System.out.println("Libro no encontrado.");
                return false;
            }
    
            // Dar de baja el libro
            libros[indiceLibro] = null;
            System.out.println("Libro dado de baja con éxito: " + libro.getTitulo() + " (Causa: " + causa + ")");
            guardar("libreria.dat");
            return true;
        }

        public void mostrarLibrero() {
            // Mostrar todos los libros
            System.out.println("Libros:");
            for (Libro l : libros) {
                if (l != null) {
                    System.out.println("Titulo: "+ l.getTitulo() + ", Autor:" +  l.getAutor() + ", Editorial: "  +
                            l.getEditoria() + ", ISBN: " + l.getIsbn() + ", Ejemplares: " + l.getEjemplares());
                }
            }
        }

        public void mostrarCeroEjemplares() {
            // Mostrar los libros con cero ejemplares
            System.out.println("Libros con cero ejemplares:");
            for (Libro l : libros) {
                if (l != null && l.getEjemplares() == 0) {
                    System.out.println("Titulo: "+ l.getTitulo() + ", Autor:" +  l.getAutor() + ", Editorial: "  +
                            l.getEditoria() + ", ISBN: " + l.getIsbn() + ", Ejemplares: " + l.getEjemplares());
                }
            }
        }

        public Usuario buscarUsuario(int numeroId) {
            // Buscar al usuario por su número de ID
            for (Usuario u : usuarios) {
                if (u != null && u.getNumeroId() == numeroId) {
                    return u;
                }
            }
            return null;
        }

        public Bibliotecario buscarBibliotecario(int numeroId) {
            // Buscar al bibliotecario por su número de ID
            for (Bibliotecario b : bibliotecarios) {
                if (b != null && b.getNumeroId() == numeroId) {
                    return b;
                }
            }
            return null;
        }

        public void menuUsuario() {
            Scanner sc = new Scanner(System.in);
            int op = 0;
            int numeroId = 0;
            String numeroIsbn = "";
            boolean salir = false;

            while (!salir) {
                try {
                    // Mostrar el menú de opciones
                    System.out.println("Menú de usuario:");
                    System.out.println("1. Mostrar libros");
                    System.out.println("2. Solicitar préstamo");
                    System.out.println("3. Devolver libro");
                    System.out.println("4. Agregarme a lista de espera");
                    System.out.println("5. Regresar al menú principal");
                    System.out.print("Escoge la opción: ");
                    op = sc.nextInt();
                    sc.nextLine();

                    switch (op) {
                        case 1:
                            mostrarLibrero();
                            break;
                        case 2:
                            System.out.print("Introduce tu numero ID: ");
                            numeroId = sc.nextInt();
                            mostrarLibrosParaPrestar();
                            System.out.print("Introduce el numero ISBN del libro que deseas solicitar: ");
                            numeroIsbn = sc.next();

                            prestarLibro(numeroId, numeroIsbn);
                            break;
                        case 3:
                            System.out.print("Introduce tu numero ID: ");
                            numeroId = sc.nextInt();
                            mostrarLibrosPrestados(numeroId);
                            System.out.print("Introduce el numero ISBN del libro que deseas solicitar: ");
                            numeroIsbn = sc.next();

                            regresarLibro(numeroId, numeroIsbn);
                            break;
                        case 4:
                            mostrarCeroEjemplares();
                            System.out.print("Introduce tu numero ID: ");
                            numeroId = sc.nextInt();
                            System.out.print("Introduce el numero ISBN del libro que deseas solicitar: ");
                            numeroIsbn = sc.next();
                            agregarAListaDeEspera(numeroId, numeroIsbn);
                            break;
                        case 5:
                            logUsuario();
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un valor numérico válido.");
                    sc.nextLine(); // Limpiar el búfer de entrada
                }
            }
        }


        public void menuBibliotecario() {
            // Mostrar el menú de opciones

            Scanner sc = new Scanner(System.in);
            int op = 0;
            int c = 0;
            int numeroId = 0;
            int ejemplares = 0;

            String titulo = "";
            String autor = "";
            String editorial = "";
            String isbn = "";
            String causa = "";

            boolean salir = false;

            while (!salir) {
                try {
                    System.out.println("Menú de bibliotecario:");
                    System.out.println("1. Agregar libro");
                    System.out.println("2. Agregar ejemplar");
                    System.out.println("3. Dar de baja libro");
                    System.out.println("4. Mostrar lista de espera");
                    System.out.println("5. Regresar al menú principal");
                    op = sc.nextInt();
                    sc.nextLine();

                    switch (op) {
                        case 1:
                            System.out.println("Introduce el título del libro: ");
                            titulo = sc.nextLine();
                            System.out.println("Introduce el autor del libro: ");
                            autor = sc.nextLine();
                            System.out.println("Introduce la editorial del libro: ");
                            editorial = sc.nextLine();
                            System.out.println("Introduce el número ISBN que tendrá el libro: ");
                            isbn = sc.nextLine();
                            System.out.println("Introduce la cantidad de ejemplares: ");
                            ejemplares = sc.nextInt();
                            sc.nextLine();

                            agregarLibro(titulo, autor, editorial, isbn, ejemplares);
                            mostrarLibrero();
                            break;
                        case 2:
                            mostrarLibrero();
                            System.out.print("Introduce el número ISBN del libro: ");
                            isbn = sc.next();
                            System.out.print("Introduce la cantidad de ejemplares que quieres agregar: ");
                            ejemplares = sc.nextInt();

                            agregarEjemplares(isbn, ejemplares);
                            mostrarLibrero();
                            break;
                        case 3:
                            mostrarLibrero();
                            System.out.print("Introduce el número ISBN del libro que deseas dar de baja: ");
                            isbn = sc.next();
                            System.out.println("La causa de la baja del libro fue:");
                            System.out.println("1.- Maltrato");
                            System.out.println("2.- Robo");
                            System.out.println("3.- Antigüedad");
                            c = sc.nextInt();

                            if (c == 1) {
                                causa = "Maltrato";
                            } else if (c == 2) {
                                causa = "Robo";
                            } else if (c == 3) {
                                causa = "Antiguedad";
                            } else {
                                System.out.println("Opción inválida");
                                break;
                            }

                            bajaLibro(isbn, causa);
                            mostrarLibrero();
                            break;
                        case 4:
                            mostrarListaEspera();
                            System.out.println("Escoge el número ID del usuario: ");
                            numeroId = sc.nextInt();
                            quitarListaEspera(numeroId);
                            mostrarListaEspera();
                            break;
                        case 5:
                            logBibliotecario();
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un valor numérico válido.");
                    sc.nextLine(); // Limpiar el búfer de entrada
                }
            }
        }


        public void logUsuario() {
            Scanner sc = new Scanner(System.in);
            int op = 0;
            String nombre = "", telefono = "", correo = "";
            int numeroId = 0;
            boolean opcionValida = false;
            while (!opcionValida) {
                // Mostrar las opciones
                System.out.println("1. Nuevo usuario");
                System.out.println("2. Usuario registrado");
                System.out.println("3. Ir a menú principal");
                System.out.print("Escoge la opción: ");
                try {
                    op = sc.nextInt();
                    sc.nextLine();
                    opcionValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    sc.next();
                }
            }

            if (op == 1) {
                System.out.print("Ingresa tu nombre: ");
                nombre = sc.nextLine();
                System.out.print("Ingresa tu correo: ");
                correo = sc.nextLine();
                System.out.print("Ingresa tu teléfono: ");
                telefono = sc.nextLine();
                System.out.print("Ingresa tu nuevo número ID (Máx 4 dígitos): ");
                numeroId = sc.nextInt();
                if (crearUsuario(nombre, correo, correo, numeroId)) {
                    menuUsuario();
                } else {
                    logUsuario();
                }
            } else if (op == 2) {
                mostrarUsuarios();
                System.out.print("Ingresa tu nuevo número ID (Máx 4 dígitos): ");
                numeroId = sc.nextInt();
                if (buscarUsuario(numeroId) != null) {
                    menuUsuario();
                } else {
                    logUsuario();
                }
            } else if (op == 3) {
                menuPrincipal();
            }
        }


        public void logBibliotecario() {
            Scanner sc = new Scanner(System.in);
            int op = 0;
            String nombre = "", correo = "";
            int numeroId = 0;
            boolean opcionValida = false;
            while (!opcionValida) {
                // Mostrar las opciones
                System.out.println("1. Nuevo bibliotecario");
                System.out.println("2. Bibliotecario registrado");
                System.out.println("3. Ir a menu principal");
                System.out.print("Escoge la opcion: ");
                try {
                    op = sc.nextInt();
                    sc.nextLine();
                    opcionValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    sc.next();
                }
            }

            if (op == 1) {
                System.out.print("Ingresa tu nombre: ");
                nombre = sc.nextLine();
                System.out.print("Ingresa tu correo: ");
                correo = sc.nextLine();
                System.out.print("Ingresa tu nuevo numero ID (Max 4 digitos): ");
                numeroId = sc.nextInt();
                if (crearBibliotecario(nombre, correo, numeroId)) {
                    menuBibliotecario();
                } else {
                    logBibliotecario();
                }
            } else if (op == 2) {
                mostrarBibliotecarios();
                System.out.print("Ingresa tu nuevo numero ID (Max 4 digitos): ");
                numeroId = sc.nextInt();
                if (buscarBibliotecario(numeroId) != null) {
                    menuBibliotecario();
                } else {
                    logBibliotecario();
                }
            } else if (op == 3) {
                menuPrincipal();
            }
        }


        public void menuPrincipal() {
            Scanner sc = new Scanner(System.in);
            int op = 0;
            boolean opcionValida = false;

            while (!opcionValida) {
                // Mostrar el menú de opciones
                System.out.println("Menú principal:");
                System.out.println("1. Bibliotecario");
                System.out.println("2. Usuario");
                System.out.println("3. Salir");
                System.out.print("Escoge la opción: ");

                try {
                    op = sc.nextInt();
                    sc.nextLine();
                    opcionValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    sc.next();
                }
            }

            switch (op) {
                case 1:
                    logBibliotecario();
                    break;
                case 2:
                    logUsuario();
                    break;
                case 3:
                    System.out.println("Hasta luego :)");
                    System.exit(0); // Terminar la ejecución del programa
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }