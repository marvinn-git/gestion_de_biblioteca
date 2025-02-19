package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int idLibro;
    private int anioPublicacion;
    private int cantidadCopias;
    private int copiasdisponibles;
    private int copiasPrestadas;
    private Reserva[] reservas;
    private static int contador = 0;

    public Libro(String titulo, String autor, int anioPublicacion, int cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLibro = contador++;
        this.anioPublicacion = anioPublicacion;
        this.cantidadCopias = cantidadCopias;
        this.copiasdisponibles = cantidadCopias;
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
				System.out.println("Id Libro: " + libros[i].idLibro + ", Titulo: " + libros[i].titulo + " , Autor:  " + libros[i].autor + " , Año Publicación: " + libros[i].anioPublicacion + " ,Copias totales: " + libros[i].cantidadCopias);
				return;
			}
	     }
		System.out.println("El libro que buscas no esta en nuestra biblioteca");
		}
	

	public void consultarLibro(int id, Libro[] libros) {
		for (int i = 0; i < libros.length; i++)
		{
			if(libros[i] != null && libros[i].idLibro == id)
			{
				System.out.println("Id Libro: " + libros[i].idLibro + ", Titulo: " + libros[i].titulo + " , Autor:  " + libros[i].autor + " , Año Publicación: " + libros[i].anioPublicacion + " ,Copias totales: " + libros[i].cantidadCopias);
				return;
			}
	     }
		System.out.println("El libro que buscas no esta en nuestra biblioteca");
	}

	
	public void listarLibros(Libro[] libros)
	{
		System.out.println("El listado de libros de la biblioteca es: ");
        for (Libro libro : libros)
        {
            if(libro != null && libro.cantidadCopias > libro.copiasPrestadas)
            {
            	System.out.println("- " + libro.titulo); 
            }
        }
    }

	public void aniadirReserva(Reserva reserva) 
	{
		for (int i = 0; i < reservas.length; i++)
		{
			if(reservas[i] == null)
			{
				reservas[i] = reserva;
				System.out.println("La reserva se ha realizado con éxito");
				return;	
			}	
		}
		System.out.println("Listado de reserva lleno. No se ha realizado la reserva");
		
	}

	public void eliminarReserva(Reserva reserva)
	{
		for (int i = 0; i < reservas.length; i++)
		{
			if(reservas[i].equals(reserva))
			{
				reservas[i] = null;
				System.out.println("La reserva se ha eliminado con éxito");
			}
		}
		System.out.println("Error al eliminar la reserva. Puede que la reserva a la que hace referencia no exista.");			
	}

	
	// Getter y Setter para 'titulo'
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter y Setter para 'autor'
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter y Setter para 'idLibro'
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    // Getter y Setter para 'anioPublicacion'
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Getter y Setter para 'cantidadCopias'
    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
        this.copiasdisponibles = cantidadCopias - this.copiasPrestadas; // Actualiza copias disponibles
    }

    // Getter y Setter para 'copiasdisponibles'
    public int getCopiasDisponibles() {
        return copiasdisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasdisponibles = copiasDisponibles;
    }

    // Getter y Setter para 'copiasPrestadas'
    public int getCopiasPrestadas() {
        return copiasPrestadas;
    }

    public void setCopiasPrestadas(int copiasPrestadas) {
        this.copiasPrestadas = copiasPrestadas;
        this.copiasdisponibles = cantidadCopias - copiasPrestadas; // Actualiza copias disponibles
    }

    // Getter y Setter para 'reservas'
    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    // Método estático para obtener el contador de libros
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Libro.contador = contador;
    }

}
