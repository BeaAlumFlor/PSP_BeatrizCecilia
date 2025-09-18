package ejercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		ArrayList<String> premios = new ArrayList<>();
		premios.add("Peluche");
		premios.add("Helado");
		premios.add("Piruleta");
		

		System.out.println("Dame un número del 1 al 10:");
		int num = dameNumero(teclado);
		
		Random random = new Random();
		int num2 = random.nextInt(10)+1;
		
		System.out.println("El número del sistema es " + num2);
		
		if (num == num2) {
			System.out.println("Enhorabuena los números coinciden. Has ganado un premio a elegir.");
			int premi = damePremio(premios,teclado);
			
			System.out.println("El premio elegido es "+ premios.get(premi-1));
		} else {
			System.out.println("Lo siento, los números no coincide. ¡Suerte a la próxima!");
		}
	
		teclado.close();
	}

	
	public static int dameNumero(Scanner teclado) {
		int num=0;
		
		while (true) {
			System.out.println("Introduce un número entero: ");
			try {
				num = teclado.nextInt();
				if (num >= 1 && num <= 10) {
					
	                return num;
	                }
			} catch (Exception e) {
				System.out.println("Entrada no válida.");
				teclado.next();
			}
		}
		
	}
	
	public static int damePremio(ArrayList<String> premios,Scanner teclado) {
		System.out.println("Los premios a elegir son:");
		
		for (int i = 0; i < premios.size(); i++) {
			System.out.println((i+1)+". "+premios.get(i));
		}
		
		int premio = 0;
		
		while (true) {
			System.out.println("Dime que premio deseas:");
			try {
				premio = teclado.nextInt();
				if (premio >= 1 && premio <= premios.size()) {
	                return premio;
	                }
			} catch (Exception e) {
				System.out.println("Entrada no válida. Introduce el número correspondiente al premio elegido.");
				teclado.next();
			}
		}
		
		
	}
}
		
		
	
