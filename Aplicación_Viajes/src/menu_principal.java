import java.util.Scanner;

public class menu_principal {

	protected Usuario[] arrayUsuarios = new Usuario[100];

	public static void main(String[] args) {

		int opcion;
		Scanner sc1 = new Scanner(System.in);
		Usuario usuario0 = new Usuario(null, null, null, 0);

		boolean salir = false;

		while (salir == false) {
			System.out.println("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión.");
			opcion = sc1.nextInt();

			switch (opcion) {

			case 1: {
				usuario0.NuevoUsuario();
				usuario0.ListaUsuarios();
				System.out.println();
				break;
			}

			case 2: {
				usuario0.IniciarSesion();
			}
			}
		}
	}

}
