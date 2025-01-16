package biblioteca;

public class Usuarios {

  //Atributos
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

  public String getnombre() {
        return nombre;
  }

  public String getid_unico() {
        return id_unico;
  }

  public String getrol() {
        return rol;
  }

  public String getlibrosPrestados() {
        return librosPrestados;
  }
}
  public String getlibrosPrestados() {
	return librosPrestados;
  }
}

  //Metodos
  public static Usuarios registrarUsuarios (String nombre, String id_unico, String rol, String librosPrestados) {
	return new Usuarios ();
	    }
  public static void listarUsuarios(Usuarios Usuarios) {
	for (Usuario usuario : usuarios) {
        System.out.println("Nombre: " + usuario.nombre);
        System.out.println("ID Único: " + usuario.idUnico);
        System.out.println("Rol: " + usuario.rol);
        System.out.println("Libros Prestados: " + usuario.librosPrestados);
        System.out.println("---------------------------------");
  }
}
  public boolean puedeRealizarPrestamo() {
	return this.librosPrestados.size() < 5;
  }
}
