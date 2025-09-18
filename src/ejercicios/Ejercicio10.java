package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		int number = dameNumero(teclado);
		String sentencia = "En orden el mes " + number + " es " + meses[number-1] ;
		System.out.println(sentencia);
		
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
