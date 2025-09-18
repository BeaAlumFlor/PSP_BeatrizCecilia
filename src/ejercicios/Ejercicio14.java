package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el radio de una circunferencia:");
		double radio = dameRadio(teclado);
		System.out.println("En una circunferencia de radio "+ radio + "cm, el diámetro es "+ calculoDiametro(radio) + "cm y su áres es " + calculoArea(radio) + "cm\u00B2");
		
		teclado.close();
	}
	public static double calculoDiametro (double r) {
		double diametro = Math.round(r*2*1000)/1000.0;
		return diametro;
	}

	
	public static double calculoArea (double r) {
		double area = Math.round(Math.PI * Math.pow(r, 2) * 1000)/1000.0;
		return area;
	}

	
	public static double dameRadio(Scanner teclado) {
		while (true) {
			System.out.println("Dime un número:");
			try {
				double num= teclado.nextDouble();
				return num;
			}catch (Exception e) {
				System.out.println("Introduce un entero.");
				teclado.next();
			}
		}
	}

}
