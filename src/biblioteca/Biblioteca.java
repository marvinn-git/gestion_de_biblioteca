package biblioteca;

public class Biblioteca {
	public static void main(String[] args) {
		Usuario[] usuarios = new Usuario[10];
		Libro[] libros = new Libro[10];
		int contadorUsuarios = 0;
		int contadorLibros = 0;
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		boolean valido = false;

		while(true) {
			do 
			{
			System.out.println("\n--- Menú Biblioteca ---");
			System.out.println("1. Registrar usuario");
			System.out.println("2. Registrar libro");
			System.out.println("3. Realizar préstamo");
			System.out.println("4. Devolver libro");
			System.out.println("5. Listar usuarios");
			System.out.println("6. Listar libros");
			System.out.println("7. Salir");
			System.out.print("Seleccione una opción: ");
	
				if (scanner.hasNextInt())
				{
					opcion = scanner.nextInt();
					scanner.nextLine();
					valido = true;
				}
				else
				{
					System.out.println("Error: Tipo de dato incorrecto.");
					scanner.nextLine();
				}
			} while (!valido);
      
    }
  }
