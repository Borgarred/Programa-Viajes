package Aplicacion_Viajes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//HERENCIA
public class menu_viajes extends Usuario {

	// Atributos e abrimos scanner
	Scanner sc = new Scanner(System.in);
	protected Usuario usuario;
	protected int tipo;
	String nombreHotel;
	String localidad;
	int fecha;
	String comunidad;
	int destino;
	int playa;

	public menu_viajes() {
	} // Quitamos los argumentos de la inicializacion del método

	public void menuDestino() {

		System.out.println("---ORGANIZA TU VIAJE--- \n¿En que parte de España quieres viajar? (Comunidad Autonoma)");
		this.comunidad = sc.nextLine();

		if (comunidad.equals("Andalucía")) {
			System.out.println("--OPCIONES PARA VIAJAR EN ANDALUCIA--"
					+ "\nPara el destino Andalucia tenemos viajes a Cadiz o Córdoba"
					+ "\n¿Qué destino prefieres? \n(1)Cadiz \n(2)Córdoba");
			destino = sc.nextInt();

		}

		else if (comunidad.equals("Canarias")) {
			System.out.println("--OPCIONES PARA VIAJAR EN CANARIAS--"
					+ "\nPara el destino Canarias tenemos viajes a Tenerife o La Palma"
					+ "\n¿Qué destino prefieres? \n(1)Tenerife \n(2)La Palma");
			destino = sc.nextInt();

		}

		else if (comunidad.equals("Madrid")) {
			System.out.println("--OPCIONES PARA VIAJAR EN MADRID--");
			System.out.println(
					"Para el destino Madrid tenemos viajes a Madrid Capital o Getafe\n¿Qué destino prefieres? \n(1)Madrid Capital \n(2)Getafe");
			destino = sc.nextInt();

		}

		else if (comunidad.equals("Extremadura")) {
			System.out.println("--OPCIONES PARA VIAJAR EN EXTREMADURA--");
			System.out.println(
					"Para el destino Extremadura tenemos viajes a Cáceres o Badajoz\n¿Qué destino prefieres? \n(1)Cáceres \n(2)Badajoz");
			destino = sc.nextInt();
		}

		else {
			System.err.println("Lo sentimos no hay viajes en " + comunidad + " disponibles...");
		}

	}

	public void menuFecha() {

		sc.nextLine();

		System.out.print("¡Perfecto! Vamos a elegir fechas para tu estancia: \nIntroduce en que mes vas a viajar: ");
		String mes = sc.nextLine();

		System.out.print("Selecciona la fecha de entrada: ");
		int diaIda = sc.nextInt();

		System.out.print("Selecciona la fecha de salida: ");
		int diaVuelta = sc.nextInt();

		System.out.println();
		System.out.println("¡Ya hemos organizado tu viaje! \nViaje a " + this.destino + " en el mes de " + mes
				+ ", desde el dia " + diaIda + " hasta el dia " + diaVuelta);
		System.out.println();
	}

	public void menuRecomendaciones() {

		System.out.println("---RECOMENDACIONES---");
		System.out.println("Para recomedarte el mejor destino para ti, necesitamos hacerte algunas preguntas");
		System.out.println("¿Prefieres un destino con playa?\n(1)Si \n(2)No");
		playa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Prefieres un destino en la peninsula?\n(1)Si \n(2)No");
		this.destino = Integer.parseInt(sc.nextLine());

		if (playa == 1 && destino == 1) {
			System.out.println(
					"La mejor opcion para ti, es un viaje a Andalucía. \nPara organizar tu viaje pulsa la opcion Viajar");
			System.out.println();
		}

		else if (playa == 1 && destino == 2) {
			System.out.println(
					"La mejor opcion para ti, es un viaje a Canarias. \nPara organizar tu viaje pulsa la opcion Viajar");
			System.out.println();

		}

		else if (playa == 2 && destino == 1) {
			System.out.println("¿Prefieres un destino en la capital?\n(1)Si \n(2)No");
			int peninsula = Integer.parseInt(sc.nextLine());
			if (peninsula == 1) {
				System.out.println(
						"La mejor opcion para ti, es un viaje a Madrid. \nPara organizar tu viaje pulsa la opcion Viajar");
				System.out.println();
			} else if (peninsula == 2) {
				System.out.println(
						"La mejor opcion para ti, es un viaje a Extremadura. \nPara organizar tu viaje pulsa la opcion Viajar");
				System.out.println();

			}
		}

		else if (playa == 2 && destino == 2) {
			System.err.println("Lo sentimos no hay viajes disponibles sin playa y fuera de la peninsula...");

		}
	}

	public void menuSorteo() {

		Stack<String> pila = new Stack<>();

		// Agregar elementos a la pila
		pila.push("🎁");
		pila.push("🎁");
		pila.push("🎁");
		Queue<String> cola = new LinkedList<>();

		// Agregar elementos a la cola
		cola.add("🎁");
		cola.add("🎁");
		cola.add("🎁");

		// Imprimir la pila
		System.out.println("¡Estamos sorteando un viaje a Mallorca!");
		System.out.println("Para participar solo tienes que elegir un regalo, ¡Suerte!");
		System.out.println(pila);

		System.out.println("Elige un regalo del 1 al 3: ");
		int n = Integer.parseInt(sc.nextLine());

		switch (n) {
		case 1: {
			// Eliminar un elemento de la pila
			String eliminado = pila.pop();
			//El elemento uno tiene premio sale por pantalla lo siguiente:
			System.out.println("¡FELICIDADES! \nERES EL GANADOR DEL VIAJE A MALLORCA");
			System.out.println("Introduce tu email para enviarte proximamente todos los datos: ");
			String email = sc.nextLine();
			System.out.println("¡Perfecto, espera nuestra respuesta pronto!");
			System.out.println();
			break;
		}
		case 2: {
			//El elemento dos no tiene premio sale por pantalla lo siguiente:
			System.out.println("Lo sentimos ese regalo no tiene premio...");
			System.out.println();

			break;
		}
		case 3: {
			//El elemento tres no tiene premio sale por pantalla lo siguiente:
			System.out.println("Lo sentimos ese regalo no tiene premio...");
			System.out.println();

			break;
		}
		}
	}

}
