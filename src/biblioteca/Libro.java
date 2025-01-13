package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int idLibro;
    private int anioPublicacion;
    private int cantidadCopias;
    private int copiasPrestadas;
    private Reserva[] reservas;
    private static int contador = 0;

    public Libro(String titulo, String autor, int anioPublicacion, int cantidadCopias){
        this.titulo = titulo;
        this.autor = autor;
        this.idLibro = contador++;
        this.anioPublicacion = anioPublicacion;
        this.cantidadCopias = cantidadCopias;
        this.copiasPrestadas = 0;
        this.reservas = new Reserva[10];
    }

	public Libro registrarLibro(String titulo, String autor, int anioPublicacion, int cantidadCopias)
	{
		Libro libro = new Libro(titulo, autor, anioPublicacion, cantidadCopias);
		return libro;
	}

	public void consultarLibro(String nombre, Libro[] libros)
	{
		for (int i = 0; i < libros.length; i++)
		{
			if(libros[i] != null && libros[i].titulo.equalsIgnoreCase(nombre))
			{
				System.out.println("Id Libro: " + libro.idLibro + ", Titulo: " + libro.titulo + " , Autor:  " + libro.autor + " , Año Publicación: " + libro.anioPublicacion + " ,Copias totales: " + libro.cantidadCopias);
				return;
			}
	     }
		else
		{
			System.out.println("El libro que buscas no esta en nuestra biblioteca");
		}
	}

	public void consultarLibro(int id, Libro[] libros) {
		for (int i = 0; i < libros.length; i++)
		{
			if(libros[i] != null && libros[i].IdLibro == id)
			{
				System.out.println("Id Libro: " + libro.idLibro + ", Titulo: " + libro.titulo + " , Autor:  " + libro.autor + " , Año Publicación: " + libro.anioPublicacion + " ,Copias totales: " + libro.cantidadCopias);
				return;
			}
	     }
		else
		{
			System.out.println("El libro que buscas no esta en nuestra biblioteca");
		}
	}

	
	public void listarLibros(Libro[] libros)
	{
		System.out.println("El listado de libros de la biblioteca es: ");
        	for (Libro libro : libros)
        	{
            		if(libro != null)
            		{
            			System.out.println("- " + libro.titulo); 
            		}
        	}
   	}


	public aniadirReserva() 
	{
		
	}

	public eliminarReserva()
	{
		
	}
}
