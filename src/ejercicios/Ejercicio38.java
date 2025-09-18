package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		int num1= dameNumero(teclado);
		int num2 = dameNumero(teclado);
		
		long inicio = System.currentTimeMillis();
		ArrayList<Integer> numbers= new ArrayList<>();
		
		numbers =dameIntervalo(num1, num2, numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("El número "+ numbers.get(i) + ""+ esPrimo(numbers.get(i)));
		}
		
		
		
		teclado.close();
		long fin = System.currentTimeMillis();
		long tiempoTotal = fin - inicio;

		System.out.println("Tiempo de ejecución: " + tiempoTotal + " ms");
	}

	
	public static String esPrimo(int num){
		int contador = 0;
		for (int i = num; i > 0; i--) {
			if (num%i == 0) {
				contador++;
			}
		}
		if (contador > 2) {
			return " no es primo, sino compuesto";
		} else if (num == 1) {
			return " no es primo, ni compuesto, es especial";
		}else{
			return " es primo";
		}
		
	}
	
	
	public static ArrayList<Integer> dameIntervalo(int n1, int n2, ArrayList<Integer> numbers) {
		if (n1>n2) {
			for (int i = n2; i <= n1; i++) {
				numbers.add(i);
			}
			return numbers;
		} else if (n2>n1) {
			for (int i = n1; i <= n2; i++) {
				numbers.add(i);
			}
			return numbers;
		} else {
			numbers.add(n1);
			return numbers;
		}
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
