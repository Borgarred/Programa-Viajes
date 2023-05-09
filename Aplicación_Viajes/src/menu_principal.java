import java.util.Scanner;

public class menu_principal {

	protected Usuario[] arrayUsuarios = new Usuario[100];
	Scanner sc = new Scanner(System.in);
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int edad;
	int opcion1;
	int opcion2;
	
	public menu_principal() {
		
	}
	
	public void Menu() {
		
		
		System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
				+ "\n\nEscoja una opción: ");
		this.opcion1 = sc.nextInt();
	}
	
	public void MenuViajes() {
		
		System.out.print("¡Hola! " + nombre + " elige una de nuestras opciones: "
				+ " \n(1)-Viajar \n(2)-Recomendaciones \n(3)-Sorteo" + "\n\nEscoja una opción: ");
		this.opcion2 = sc.nextInt();
		
		
	}
	
}
