package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		int num = dameNumero(teclado);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		
		for (int i = num; i > 0; i--) {
			numbers.add(i);
		}
		
		System.out.println("La suma de los números pares hasta el " + num + " es " + dameSuma(numbers));
		
		
		teclado.close();
	}

	public static int dameSuma(ArrayList<Integer> numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) %2 == 0 ) {
				suma += numeros.get(i);
			}
		
		}
		return suma;
		
		
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
