package aplicacion_viajes;

import java.util.Scanner;

public class menu_principal extends Usuario {

	int opcion1;
	int opcion2;

	public menu_principal() {
	}

	public menu_principal(String email, String contraseña, String nombre, String apellidos, String DNI, int edad) {
		super(email, contraseña, nombre, apellidos, DNI, edad);
	}

	public void MenuInicio() { // METODO
		
		Scanner escaner1 = new Scanner(System.in);

		System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
				+ "\n\nEscoja una opción: ");
		this.opcion1 = escaner1.nextInt();
	}

	public void MenuViajes(int indice, Usuario user) { // METODO
		
		Scanner escaner2 = new Scanner(System.in);

		System.out.print("¡Hola! " + user.arrayUsuarios[indice].getNombre() + " elige una de nuestras opciones: "
				+ " \n(1)-Viajar \n(2)-Recomendaciones \n(3)-Sorteo \n(4)-Salir" + "\n\nEscoja una opción: ");
		this.opcion2 = escaner2.nextInt();

	}
	


}
