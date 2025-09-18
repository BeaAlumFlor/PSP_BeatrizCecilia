package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
 		int dni = dameDni(teclado);
 		
 		int posicion = calculaResto(dni);
 		
 		System.out.println("Tu DNI completo es " + dni + letras[posicion]);
		
 		teclado.close();
	}
	
	public static int calculaResto(int n) {
		int resto = n % 23;
		return resto;
	}
	
	public static int dameDni(Scanner teclado) {
		int num = 0;
		while (true) {
			System.out.println("Dime tu DNI sin letras:");
			try {
				
				num = teclado.nextInt();
				if (num > 9999999 && num < 100000000) {
					return num;
					}
				else {
					System.out.println("El número debe tener 8 dígitos.");
					num=0;
					}
			} catch (Exception e) {
				System.out.println("Entrada no válida.");
				teclado.next();
				}
		}
	}
	
	


}
