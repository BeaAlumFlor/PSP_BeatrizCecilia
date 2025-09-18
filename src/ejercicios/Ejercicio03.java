package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1 = dameNumero(teclado);
		int num2 = dameNumero(teclado);
		
		System.out.println("La suma de los dos números es " + sumar(num1, num2));
		
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
	
	public static int sumar(Integer n1, Integer n2) 
	{
		return n1+n2;
	}

}
