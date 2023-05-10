import java.util.Scanner;

public class menu_principal extends Menu {

	Scanner sc = new Scanner(System.in);
	protected int opcion1;
	protected int opcion2;

	public menu_principal() {

	}

	public void MenuInicio() { // METODO

		System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
				+ "\n\nEscoja una opción: ");
		this.opcion1 = sc.nextInt();
	}

	public void MenuViajes() { // METODO

		System.out.print("¡Hola! " + super.nombre + " elige una de nuestras opciones: "
				+ " \n(1)-Viajar \n(2)-Recomendaciones \n(3)-Sorteo \n(4)-Salir" + "\n\nEscoja una opción:  ");
		this.opcion2 = sc.nextInt();

	}

	@Override
	public void menuDestino() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuFecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuRecomendaciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSorteo() {
		// TODO Auto-generated method stub
		
	}

}
