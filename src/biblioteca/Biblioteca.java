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

			switch (opcion) {
			case 1:
				if (contadorUsuarios < usuarios.length)
				{
					System.out.print("Ingrese nombre: ");
					String nombre = scanner.nextLine();
					System.out.print("Ingrese ID: ");
					String id = scanner.nextLine();
					valido = false;
					String rol;
					do 
					{
						System.out.print("Ingrese rol: (Profesor, estudiante o invitado)");
						rol = scanner.next();
						if(rol.equalsIgnoreCase("Profesor") || rol.equalsIgnoreCase("estudiante") || rol.equalsIgnoreCase("invitado"))
						{
							valido = true;
						}	
						else
						{
							System.out.println("Error: rol incorrecto.");
						}
					} while (!valido);
					usuarios[contadorUsuarios++] = new Usuario(nombre, id, rol);
					System.out.println("Usuario registrado.");
				}
				else
				{
					System.out.println("Error: No se puede registrar mas usuarios.");
				}
				break;
      
    }
  }
