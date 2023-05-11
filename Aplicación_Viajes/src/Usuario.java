package Aplicacion_Viajes;
import java.util.Scanner;


public class Usuario {

	DatosUsuario arrayUsuarios[] = new DatosUsuario[20];
	
	Scanner sc = new Scanner(System.in);
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int edad;

	int numeroUsuarios = 0;
	
	public void Hola() {
		System.out.println("Hola");
	}

 	public Usuario() {

	}

	public Usuario(String nombre, String apellidos, String DNI, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.edad = edad;
	}

	public void NuevoUsuario() {
		
		int indice = 0;
		
		// Indice del último registro existente
		for (int i = 19 ; i >= 0; i--) {
			if (this.arrayUsuarios[i] == null) {
				indice = i ;
			}
		}
		
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

		this.arrayUsuarios[indice] = new DatosUsuario(nombre, apellidos, DNI, edad);
	}

	public void ListaUsuarios() {

		int i = 0;

		System.out.println("--------Lista de alumnos:--------");
		while (i < numeroUsuarios) {
			System.out.println(i + 1 + "º. " + arrayUsuarios[i].nombre + " " + arrayUsuarios[i].apellidos);
			i = i + 1;
		}
	}
	
	public int IniciarSesion() {

		int indice = 0;
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduzca sus apellidos: ");
		String apellidos = sc.nextLine();
		boolean salir = false;
		
		for (int i = 0; i < arrayUsuarios.length; i++)
		{
			if(arrayUsuarios[i] != null) {
				if (arrayUsuarios[i].nombre.equals(nombre) && arrayUsuarios[i].apellidos.equals(apellidos)) {
					this.nombre = nombre;
					this.apellidos = apellidos;
					System.out.println("¡Has iniciado sesión con " + nombre + " " + apellidos + "!");
					salir = true;
					indice = i;
				} 
			}
		}
		
		if (salir == false) {
			indice = -1;
		}
		return indice;
	}
}                                                                                                                                        
