package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		int contador = 0;
		
		do {
			int num = dameNumero(teclado);
			suma += num;
			contador++;
			} while (contador<5);
		
		
		System.out.println("La suma de los 5 números es " + suma);
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
