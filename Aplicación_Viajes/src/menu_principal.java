package Aplicacion_Viajes;

//La clase menu_principal hereda de Usuario
public class menu_principal extends Usuario {

	int opcion1;
	int opcion2;

	public menu_principal() {
	}

	public menu_principal(String nombre, String apellidos, String DNI, int edad) {
		super(nombre, apellidos, DNI, edad);
	}

	
	public void MenuInicio() { //Este metodo sale al principio de la aplicación siempre.

		System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
				+ "\n\nEscoja una opción: ");
		this.opcion1 = sc.nextInt();
	}

	public void MenuViajes(int indice, Usuario user) { //Metodo que al iniciar sesión correctamente sale por pantalla

		System.out.print("¡Hola! " + user.arrayUsuarios[indice].getNombre() + " elige una de nuestras opciones: "
				+ " \n(1)-Viajar \n(2)-Recomendaciones \n(3)-Sorteo \n(4)-Salir" + "\n\nEscoja una opción:  ");
		this.opcion2 = sc.nextInt();
	}
	
	
}
