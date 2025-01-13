package biblioteca;

public class Usuarios {
	
	    private String nombre;
	    private String id_unico;
	    private String rol;
	    private String librosPrestados;

	    // Constructor
	    public void Usuario(String nombre, String id_unico, String rol) {
	        this.nombre = nombre;
	        this.id = id_unico;
	        this.rol = rol;
	        this.librosPrestados = librosPrestados;
	    }

	    // Métodos getters
	    public String getNombre() {
	        return nombre;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getRol() {
	        return rol;
	    }

	    public String getLibrosPrestados() {
	        return librosPrestados;
      }
}
