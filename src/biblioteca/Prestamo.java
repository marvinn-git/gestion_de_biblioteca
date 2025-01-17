package biblioteca;

public class Prestamo {
    private int idPrestamo;
    private Libro libro;
    private Usuario usuario;
    private int fechaPrestamo;
    private int fechaDevolucion;
    private static int contadorPrestamos = 0; 

    public Prestamo(Libro libro, Usuario usuario, int fechaPrestamo) {
        this.idPrestamo = ++contadorPrestamos; 
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = (fechaPrestamo + 7);  // +7 días
    }

    // Métodos

    // Crear un préstamo
    public void crearPrestamo() {
        // Verificar si el libro está disponible
        if (libro.getCopiasDisponibles() > 0 && usuario.puedeRealizarPrestamo()) {
            // Reducir el número de copias disponibles y aumentar las copias prestadas
            libro.setCopiasDisponibles(libro.getCopiasDisponibles() - 1);
            libro.setCopiasPrestadas(libro.getCopiasPrestadas() + 1);
            usuario.setLibrosPrestados(usuario.getLibrosPrestados() + 1);
            System.out.println("Préstamo realizado con éxito. El libro " + libro.getTitulo() + " ha sido prestado a " + usuario.getNombre());
        } else {
            System.out.println("No se puede realizar el préstamo. El libro no está disponible o el usuario ha alcanzado el límite de préstamos.");
        }
    }

    // Marcar la devolución de un libro
    public void marcarDevolucion() {
        // Aumentar las copias disponibles y reducir las copias prestadas
        libro.setCopiasDisponibles(libro.getCopiasDisponibles() + 1);
        libro.setCopiasPrestadas(libro.getCopiasPrestadas() - 1);
        usuario.setLibrosPrestados(usuario.getLibrosPrestados() - 1);
        System.out.println("Devolución realizada con éxito. El libro " + libro.getTitulo() + " ha sido devuelto por " + usuario.getNombre());
    }

    // Validar disponibilidad del libro
    public boolean validarDisponibilidad() {
        return libro.getCopiasDisponibles() > 0;
    }

    // Getters y Setters
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(int fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public static int getContadorPrestamos() {
        return contadorPrestamos;
    }
}
