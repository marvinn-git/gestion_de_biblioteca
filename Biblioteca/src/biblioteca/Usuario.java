package biblioteca;

public class Usuarios {
	
	    private String nombre;
	    private String id_unico;
	    private String rol;
	    private String librosPrestados;

	    public void Usuario(String nombre, String id_unico, String rol, String librosPrestados) {
	        this.nombre = nombre;
	        this.id_unico = id_unico;
	        this.rol = rol;
	        this.librosPrestados = librosPrestados;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getId() {
	        return id_unico;
	    }

	    public String getRol() {
	        return rol;
	    }

	    public String getLibrosPrestados() {
	        return librosPrestados;
	    }
	}
