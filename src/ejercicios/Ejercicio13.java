package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dime cuántos grados celcius deseas pasar a Fharenheit:");
		double celsius = dameGrados(teclado);
		System.out.println(celsius + "ºC son " + celciusToFarenheit(celsius) + "ºF" );
		
		teclado.close();
	}
	public static double celciusToFarenheit(double n) {
		double farenheit = Math.round(((n*1.8) + 32)*10)/10.0;
		return farenheit;
	}
	
	public static double dameGrados(Scanner teclado) {
		while (true) {
			System.out.println("Dime un número:");
			try {
				double num= teclado.nextDouble();
				return num;
			}catch (Exception e) {
				System.out.println("Introduce un entero o decimal.");
				teclado.next();
			}
		}
	}

}
