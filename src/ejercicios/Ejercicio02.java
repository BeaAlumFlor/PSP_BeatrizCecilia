package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {


		System.out.println("Dime tu nombre:");
		Scanner teclado = new Scanner(System.in);
		String entrada = teclado.nextLine();
		
		System.out.println("Hola " + entrada);
		teclado.close();
	}

}
