package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		
		do {
			num1 = dameNumero(teclado);
			num2 = dameNumero(teclado);
			if (num1 != num2) {
				System.out.println("Los números no coinciden");
			}
		} while (num1 != num2);
		
		System.out.println("Los dos números son iguales");
		teclado.close();
	}
	public static int dameNumero(Scanner teclado) {
		while (true) {
			System.out.println("Dime un número:");
			try {
				int num= teclado.nextInt();
				return num;
			}catch (Exception e) {
				System.out.println("Introduce un entero.");
				teclado.next();
			}
		}
	}

}
