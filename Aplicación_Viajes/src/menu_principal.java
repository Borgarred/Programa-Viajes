import java.util.Scanner;

public class menu_principal {

	protected Usuario[] arrayUsuarios = new Usuario[100];

	public static void main(String[] args) {

		int opcion;
		Scanner sc1 = new Scanner(System.in);
		Usuario usuario0 = new Usuario(null, null, null, 0);
		menu_viajes viajes = new menu_viajes(usuario0);

		boolean salir = false;

		while (salir == false) {
			System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
					+ "\n\nIntroduzca opción: ");
			opcion = sc1.nextInt();
			System.out.println();

			switch (opcion) {

			case 1: {
				usuario0.NuevoUsuario();
				usuario0.ListaUsuarios();
				System.out.println();
				break;
			}

			case 2: {

				while (true) {
					try {
						usuario0.IniciarSesion();
						System.out.println();
						viajes.menuDestino(usuario0.nombre);
					} catch (Exception e) {
						System.err.println("USUARIO NO REGISTRADO");
						System.out.println();
					}
				}

				

			}

			}

		}
	}
}
