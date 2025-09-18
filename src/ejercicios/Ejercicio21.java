package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<String> nombres=  new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime un nombre: ");
			nombres.add(dameNombre(nombres, teclado));
		}
		
		System.out.println(nombres);
	
		teclado.close();
	}
	public static String dameNombre(ArrayList<String> lista, Scanner teclado) {
		String nom = teclado.nextLine();
		return nom;
	}

}
