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
