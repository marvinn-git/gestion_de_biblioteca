package biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int IDLibro;
	private int anioPublicacion;
	private int cantidadCopias;
	private Reserva[] reservas;
	private static int contador = 0;
	
	public Libro(String titulo, String autor, int anioPublicacion ,int cantidadCopias)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.IDLibro = contador;
		this.anioPublicacion = anioPublicacion;
		this.cantidadCopias = cantidadCopias;
		contador++;
		
		
	}
	
	public Libro registrarLibro(String titulo, String autor, int anioPublicacion ,int cantidadCopias)
	{
		
	}
	
	public void consultarLibro(String nombre)
	{
		System.out.println();
	}
	
	public void consultarLibro(int id)
	{
		System.out.println();
	}
	
	
	public void consultarLibro(int IDLibro )
	{
		
	}
	
	public aniadirReserva() 
	{
		
	}
	
	public eliminarReserva()
	{
		
	}
	
	
	

}
