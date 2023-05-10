package Aplicacion_Viajes;

import java.util.Scanner;

public class menu_principal {

	protected Usuario[] arrayUsuarios = new Usuario[100];
	Scanner sc = new Scanner(System.in);
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int edad;
	protected int opcion1;
	protected int opcion2;
	
	public menu_principal() {
		
	}
	
	public void Menu() { // METODO
		
		
		System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
				+ "\n\nEscoja una opción: ");
		this.opcion1 = sc.nextInt();
	}
	
	public void MenuViajes() { // METODO
		
		System.out.print("¡Hola! " + nombre + " elige una de nuestras opciones: "
				+ " \n(1)-Viajar \n(2)-Recomendaciones \n(3)-Sorteo \n(4)-Salir" + "\n\nEscoja una opción:  ");
		this.opcion2 = sc.nextInt();
		
		
	}
	
}
