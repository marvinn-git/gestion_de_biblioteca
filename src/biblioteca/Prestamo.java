package biblioteca;

public class Prestamo {
public class Prestamo {
	    // Atributos
	    private String idPrestamo;
	    private String libro;
	    private String usuario;
	    private int fechaPrestamo;
	    private int fechaDevolucion;
public Prestamo(int ID_prestamo, String libro, String usuario, int fecha_prestamo, int fecha_devolucion) {
	this.ID_prestamo = ID_prestamo;
	this.libro = libro;		this.usuario = usuario;
	this.fecha_prestamo = fecha_prestamo;
	this.fecha_devolucion = fecha_devolucion;	
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
	
}
