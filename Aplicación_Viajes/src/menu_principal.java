import java.util.Scanner;

public class menu_principal {

	protected Usuario[] arrayUsuarios = new Usuario[100];
	Scanner sc = new Scanner(System.in);
	int opcion;
	
	public menu_principal() {
		
	}
	
	public void Menu() {
		
		
		System.out.print("------MENÚ INICIO------" + "\n1. Registrar Nuevo Usuario." + "\n2. Iniciar Sesión."
				+ "\n\nIntroduzca opción: ");
		opcion = sc.nextInt();
	}
	
}
