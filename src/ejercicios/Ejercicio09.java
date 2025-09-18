package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int number = dameNumero(teclado);
		
		switch (number) {
			case 1:
				System.out.println("En orden el mes " + number + " es Enero");
				break;
			case 2:
				System.out.println("En orden el mes " + number + " es Febrero");
				break;
			case 3:
				System.out.println("En orden el mes " + number + " es Marzo");
				break;
			case 4:
				System.out.println("En orden el mes " + number + " es Abril");
				break;
			case 5:
				System.out.println("En orden el mes " + number + " es Mayo");
				break;
			case 6:
				System.out.println("En orden el mes " + number + " es Junio");
				break;
			case 7:
				System.out.println("En orden el mes " + number + " es Julio");
				break;
			case 8:
				System.out.println("En orden el mes " + number + " es Agosto");
				break;
			case 9:
				System.out.println("En orden el mes " + number + " es Septiembre");
				break;
			case 10:
				System.out.println("En orden el mes " + number + " es Octubre");
				break;
			case 11:
				System.out.println("En orden el mes " + number + " es Noviembre");
				break;
			case 12:
				System.out.println("En orden el mes " + number + " es Diciembre");
				break;
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
