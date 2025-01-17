package biblioteca;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear algunos libros de ejemplo
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, 5);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, 3);
        Libro libro3 = new Libro("Matar a un ruiseñor", "Harper Lee", 1960, 4);

        // Crear un arreglo de libros
        Libro[] libros = new Libro[10];
        libros[0] = libro1;
        libros[1] = libro2;
        libros[2] = libro3;

        // Crear un usuario
        Usuario usuario1 = new Usuario("Juan Perez", "Estudiante");

        // Menú de opciones
        while (true) {
            System.out.println("\n***** Menú de Biblioteca *****");
            System.out.println("1. Registrar un libro");
            System.out.println("2. Consultar un libro por título");
            System.out.println("3. Consultar un libro por ID");
            System.out.println("4. Listar libros disponibles");
            System.out.println("5. Realizar una reserva");
            System.out.println("6. Eliminar una reserva");
            System.out.println("7. Realizar un préstamo");
            System.out.println("8. Marcar la devolución de un libro");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Para capturar la siguiente línea

            switch (opcion) {
                case 1:
                    // Registrar un libro
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anioPublicacion = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de copias: ");
                    int cantidadCopias = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    Libro libroNuevo = new Libro(titulo, autor, anioPublicacion, cantidadCopias);
                    libroNuevo.registrarLibro(titulo, autor, anioPublicacion, cantidadCopias);
                    System.out.println("Libro registrado: " + libroNuevo.getTitulo() + " de " + libroNuevo.getAutor());
                    break;

                case 2:
                    // Consultar un libro por título
                    System.out.print("Ingrese el título del libro a consultar: ");
                    String tituloConsulta = scanner.nextLine();
                    libro1.consultarLibro(tituloConsulta, libros);
                    break;

                case 3:
                    // Consultar un libro por ID
                    System.out.print("Ingrese el ID del libro a consultar: ");
                    int idConsulta = scanner.nextInt();
                    libro1.consultarLibro(idConsulta, libros);
                    break;

                case 4:
                    // Listar libros disponibles
                    libro1.listarLibros(libros);
                    break;

                case 5:
                    // Realizar una reserva
                    System.out.print("Ingrese el título del libro para reserva: ");
                    String tituloReserva = scanner.nextLine();
                    System.out.print("Ingrese la fecha de reserva: ");
                    String fechaReserva = scanner.nextLine();
                    
                    Libro libroReserva = null;
                    for (Libro libro : libros) {
                        if (libro != null && libro.getTitulo().equalsIgnoreCase(tituloReserva)) {
                            libroReserva = libro;
                            break;
                        }
                    }

                    if (libroReserva != null && libroReserva.getCopiasDisponibles() > 0) {
                        Reserva nuevaReserva = new Reserva(Reserva.getContador(), usuario1, libroReserva, fechaReserva);
                        libroReserva.aniadirReserva(nuevaReserva);
                    } else {
                        System.out.println("No hay copias disponibles para la reserva.");
                    }
                    break;

                case 6:
                    // Eliminar una reserva
                    System.out.print("Ingrese el ID de la reserva a eliminar: ");
                    int idReserva = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    Reserva.liberarReserva(idReserva);
                    break;

                case 7:
                    // Realizar un préstamo
                    System.out.print("Ingrese el título del libro para préstamo: ");
                    String tituloPrestamo = scanner.nextLine();

                    Libro libroPrestamo = null;
                    for (Libro libro : libros) {
                        if (libro != null && libro.getTitulo().equalsIgnoreCase(tituloPrestamo)) {
                            libroPrestamo = libro;
                            break;
                        }
                    }

                    if (libroPrestamo != null) {
                        Prestamo prestamo = new Prestamo(libroPrestamo, usuario1, 20250117); // Fecha de préstamo arbitraria
                        prestamo.crearPrestamo();
                    } else {
                        System.out.println("No se encontró el libro para préstamo.");
                    }
                    break;

                case 8:
                    // Marcar la devolución de un libro
                    System.out.print("Ingrese el ID del préstamo para devolución: ");
                    int idDevolucion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    // Lógica para marcar devolución (por simplificación, consideramos solo un préstamo para este usuario)
                    Prestamo prestamoDevolucion = new Prestamo(libro1, usuario1, 20250110);
                    prestamoDevolucion.marcarDevolucion();
                    break;

                case 9:
                    // Salir
                    System.out.println("Gracias por usar el sistema de biblioteca.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
