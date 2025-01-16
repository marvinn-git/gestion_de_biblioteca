package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int idReserva;
    private Usuario usuario;
    private Libro libro;
    private String fechaReserva;

    // Lista estática para gestionar reservas
    private static List<Reserva> listaReservas = new ArrayList<>();

    // Constructor
    public Reserva(int idReserva, Usuario usuario, Libro libro, String fechaReserva) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
    }

    // Métodos Getter y Setter
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    // Método para crear una reserva
    public static Reserva crearReserva(int idReserva, Usuario usuario, Libro libro, String fechaReserva) {
        Reserva nuevaReserva = new Reserva(idReserva, usuario, libro, fechaReserva);
        listaReservas.add(nuevaReserva);
        System.out.println("Reserva creada con éxito para el usuario: " + usuario.getNombre() +
                ", Libro: " + libro.getTitulo() + ", Fecha: " + fechaReserva);
        return nuevaReserva;
    }

    // Método para listar reservas de un libro
    public static void listarReservasDeUnLibro(Libro libro) {
        System.out.println("Reservas para el libro: " + libro.getTitulo());
        boolean hayReservas = false;

        for (Reserva reserva : listaReservas) {
            if (reserva.getLibro().equals(libro)) {
                System.out.println("ID Reserva: " + reserva.getIdReserva() +
                        ", Usuario: " + reserva.getUsuario().getNombre() +
                        ", Fecha: " + reserva.getFechaReserva());
                hayReservas = true;
            }
        }

        if (!hayReservas) {
            System.out.println("No hay reservas para este libro.");
        }
    }

    // Método para liberar una reserva
    public static boolean liberarReserva(int idReserva) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getIdReserva() == idReserva) {
                listaReservas.remove(reserva);
                System.out.println("Reserva con ID " + idReserva + " eliminada con éxito.");
                return true;
            }
        }
        System.out.println("Reserva con ID " + idReserva + " no encontrada.");
        return false;
    }
}
