package biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private String IDLibro;
	private int anioPublicacion;
	private int cantidadCopias;
	private Reserva[] reservas;
	
	public Libro(String titulo, String autor, String IDLibro, int anioPublicacion ,int cantidadCopias)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.IDLibro = IDLibro;
		this.anioPublicacion = anioPublicacion;
		this.cantidadCopias = cantidadCopias;
	}

}
