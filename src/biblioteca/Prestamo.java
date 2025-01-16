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
}
