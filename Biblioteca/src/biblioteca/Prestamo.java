package biblioteca;

public class Prestamo {
// Atributos
    private String idPrestamo;
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    // Constructor
    public Prestamo(Libro libro, Usuario usuario) {
        if (!validarDisponibilidad(libro, usuario)) {
            throw new IllegalArgumentException("No se puede realizar el préstamo: libro no disponible o límite de préstamos alcanzado.");
        }

        this.idPrestamo = UUID.randomUUID().toString(); // Genera un ID único
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = null; // Se define al marcar devolución

        libro.setDisponible(false); // Marca el libro como prestado
        usuario.incrementarPrestamosActivos();
    }

    // Métodos

    // Crear un nuevo préstamo
    public static Prestamo crearPrestamo(Libro libro, Usuario usuario) {
        return new Prestamo(libro, usuario);
    }

    // Marcar la devolución del préstamo
    public void marcarDevolucion() {
        this.fechaDevolucion = LocalDate.now();
        libro.setDisponible(true); // Marca el libro como disponible
        usuario.decrementarPrestamosActivos();
    }

    // Validar la disponibilidad del libro y las restricciones del usuario
    private static boolean validarDisponibilidad(Libro libro, Usuario usuario) {
        if (!libro.isDisponible()) {
            return false; // El libro no está disponible
        }

        // Verificar el límite de préstamos según el rol del usuario
        int limitePrestamos = usuario.getRol().equals("Estudiante") ? 3 : 5;
        return usuario.getPrestamosActivos() < limitePrestamos;
    }

    // Getters y Setters
    public String getIdPrestamo() {
        return idPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "idPrestamo='" + idPrestamo + '\'' +
                ", libro=" + libro +
                ", usuario=" + usuario +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + (fechaDevolucion != null ? fechaDevolucion : "Pendiente") +
                '}';
    }
		
}
