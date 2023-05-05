import java.util.Scanner;

public class Usuario extends menu_principal {

	Scanner sc = new Scanner(System.in);
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int edad;

	int numeroUsuarios = 0;

	public Usuario(String nombre, String apellidos, String DNI, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.edad = edad;
	}

	public void NuevoUsuario() {

		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduzca sus apellidos: ");
		String apellidos = sc.nextLine();

		System.out.print("Introduzca su DNI: ");
		String DNI = sc.nextLine();

		System.out.print("Introduzca su edad: ");
		int edad = sc.nextInt();

		sc.nextLine();

		System.out.println();

		this.arrayUsuarios[numeroUsuarios] = new Usuario(nombre, apellidos, DNI, edad);
		numeroUsuarios = numeroUsuarios + 1;

	}

	public void ListaUsuarios() {

		int i = 0;

		System.out.println("--------Lista de alumnos:--------");
		while (i < numeroUsuarios) {
			System.out.println(i + 1 + "º. " + arrayUsuarios[i].nombre + " " + arrayUsuarios[i].apellidos);
			i = i + 1;
		}
	}

	public void IniciarSesion() {

		int i = 0;

		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		/*
		 * System.out.print("Introduzca sus apellidos: "); String apellidos =
		 * sc.nextLine();
		 */

		boolean salir = false;
		while (salir == false) {

			if (arrayUsuarios[i].nombre == nombre /* && arrayUsuarios[i].apellidos == apellidos */) {

				this.nombre = nombre;
				/* this.apellidos = apellidos; */
				System.out.println("¡Has iniciado sesión con " + nombre/* + " " + apellidos +"!" */);
				salir = true;
			} else {
				i = i + 1;
				;
			}
		}
	}

}
