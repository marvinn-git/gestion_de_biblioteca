package biblioteca;

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
