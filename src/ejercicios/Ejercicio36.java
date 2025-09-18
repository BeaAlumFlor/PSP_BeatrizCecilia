package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		ArrayList<Integer> numbers= new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			int num = dameNumero(teclado);
			suma += num;
			numbers.add(num);
		}
		
		//Con collections.sort(arraylist) puedo ordenador de mayor a menor
		
		Collections.sort(numbers);
		
		System.out.println("Los números escritos en orden inverso son " + numbers.reversed());
		System.out.println("La suma de dichos números es " + suma);
		
		
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
