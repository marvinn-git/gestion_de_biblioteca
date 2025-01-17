package biblioteca;

import java.util.List;

public class Prestamo {

	private int ID_prestamo = 0;
	private String libro;
	private String usuario;
	private int fecha_prestamo;
	private int fecha_devolucion;
	
	public Prestamo(int ID_prestamo, String libro, String usuario, int fecha_prestamo, int fecha_devolucion) {
		this.ID_prestamo = ID_prestamo;
		this.libro = libro;
		this.usuario = usuario;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_devolucion = fecha_devolucion;
		
	}
	// Métodos
    public static Prestamo crearPrestamo(int ID_prestamo, String libro, String usuario, int fecha_prestamo, int fecha_devolucion, List<Prestamo> prestamos, usuario usuario, libro libro) {
        if (!validarDisponibilidad(libro, usuario, prestamos)) {
            throw new IllegalArgumentException("No se puede realizar el préstamo: libro no disponible o límite de préstamos alcanzado.");
        }

        libro.setDisponible(false);
        usuario.incrementarPrestamosActivos();
        return new Prestamo(ID_prestamo, libro, usuario, fecha_prestamo, fecha_devolucion);
    }
    public void marcarDevolucion(libro libro, usuario usuario) {
        this.fecha_devolucion = (int) (System.currentTimeMillis() / 1000L); // Marca la fecha de devolución actual en segundos
        libro.setDisponible(true);
        usuario.decrementarPrestamosActivos();
    }
    private static boolean validarDisponibilidad(libro libro, usuario usuario) {
        if (!libro.isDisponible()) {
            return false; // El libro no está disponible
        }
    }
 // Getters y Setters
    public int getID_prestamo() {
        return ID_prestamo;
    }

    public libro getLibro() {
        return libro;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public int getfecha_prestamo() {
        return fecha_prestamo;
    }

    public int getfecha_devolucion() {
        return fecha_devolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "ID_prestamo='" + ID_prestamo + '\'' +
                ", libro=" + libro +
                ", usuario=" + usuario +
                ", fecha_prestamo=" + fecha_prestamo +
                ", fecha_devolucion=" + (fecha_devolucion != null ? fecha_devolucion : "Pendiente") +
                '}';
    }
	}
