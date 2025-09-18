package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int num1 = dameNumero(teclado);
		int num2 = dameNumero(teclado);
		
		comparaNumero(num1, num2);
		
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
	
	public static void comparaNumero(int n1, int n2) {
		if (n1>n2) {
			System.out.println("El número mayor es " + n1 + " y el número menor " + n2);
		} else if (n2>n1) {
			System.out.println("El número mayor es " + n2 + " y el número menor " + n1);
		} else {
			System.out.println("Los números son iguales");
		}
		
	}

}
