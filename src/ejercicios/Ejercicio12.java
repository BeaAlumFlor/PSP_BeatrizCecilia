package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<>();
		
		System.out.println("A continuación, te pediré 10 notas.");
		
		for (int i = 0; i < 10; i++) {
			notas.add(dameNota(teclado));
		}
		
		int suspensos = 0;
		int aprobados = 0;
		int notables = 0;
		int sobresalientes = 0;
		int matricula = 0;
		
		
		for (int nota: notas) {
			if (nota == 10) {
				matricula++;				
			} else if (nota >= 9) {
				sobresalientes++;
			} else if (nota >= 7) {
				notables++;
			} else if (nota >= 5) {
				aprobados++;
			} else {
				suspensos++;
			}
		}
		
		System.out.println("El número de suspensos es " + suspensos + ", el número de aprobados es " + aprobados + ", el número de notables es " + notables + ", el número de sobresalientes es " + sobresalientes + " y el número de matrículas es " + matricula +".");
		
		teclado.close();
	}

	public static int dameNota(Scanner teclado) {
		
		int num=0;
		
		while (true) {
			System.out.println("Dame una nota: ");
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
		
}
