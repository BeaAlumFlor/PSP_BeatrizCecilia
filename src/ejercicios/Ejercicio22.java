package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("En el siguiente programa puedes darme tantos nombres como quieras. Cuando finalices introduce 0.");
		ArrayList<String> nombres=  new ArrayList<>();
		
		boolean salir = false;
		
		while (!salir) {
			System.out.println("Dime un nombre: ");
			String nombre= dameNombre(nombres, teclado);
			if (nombre.equals("0")) {
				salir= true;
			} else {
				nombres.add(nombre);
			}
			
		}
								
		System.out.println(nombres);
		teclado.close();
	}
	public static String dameNombre(ArrayList<String> lista, Scanner teclado) {
		
		String nom = teclado.nextLine();
		return nom;
	}

}
