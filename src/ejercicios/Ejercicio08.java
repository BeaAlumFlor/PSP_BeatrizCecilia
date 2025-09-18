package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int number = dameNumero(teclado);
		
		if (number == 1) {
			System.out.println("En orden el mes " + number + " es Enero");
		} else if (number ==2) {
			System.out.println("En orden el mes " + number + " es Febrero");
		} else if (number ==3) {
			System.out.println("En orden el mes " + number + " es Marzo");
		} else if (number ==4) {
			System.out.println("En orden el mes " + number + " es Abril");
		} else if (number ==5) {
			System.out.println("En orden el mes " + number + " es Mayo");
		} else if (number ==6) {
			System.out.println("En orden el mes " + number + " es Junio");
		} else if (number ==7) {
			System.out.println("En orden el mes " + number + " es Julio");
		} else if (number ==8) {
			System.out.println("En orden el mes " + number + " es Agosto");
		} else if (number ==9) {
			System.out.println("En orden el mes " + number + " es Septiembre");
		} else if (number ==10) {
			System.out.println("En orden el mes " + number + " es Octubre");
		} else if (number ==11) {
			System.out.println("En orden el mes " + number + " es Noviembre");
		} else if (number ==12) {
			System.out.println("En orden el mes " + number + " es Diciembre");
		}
		teclado.close();
	}
	
	public static int dameNumero(Scanner teclado) {
		int num=0;
		while (true){
			System.out.println("Introduce un número entero: ");
			if (teclado.hasNextInt()) {
				num = teclado.nextInt();
				if (num >= 1 && num <= 12) {
	                return num;
	            } else {
	                System.out.println("El número debe estar entre 1 y 12.");
	            }
			} else {
				 System.out.println("Entrada no válida.");
				 teclado.next();
			}
		} 

	}

}
