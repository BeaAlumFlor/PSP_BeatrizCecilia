package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> datos = new ArrayList<>();
		
		dameDatos(teclado, datos);
		String nombre=datos.get(0);
		int annos = Integer.parseInt(datos.get(1)); 
		
		
		
		System.out.println(nombre +  " tu nivel y salario en el sector es " + dameNivelSalario(annos));
		
		teclado.close();
		
		
		
	}
	
	public static String dameNivelSalario(int n) {
		String cadena;
		if (n<1) {
			cadena= "Desarrollador Junior L1 - 15000-18000";
			return cadena;
		} else if (n<2) {
			cadena= "Desarrollador Junior L2 - 18000-22000";
			return cadena;
		}else if (n<5) {
			cadena= "Desarrollador Senior L1 - 22000-28000";
			return cadena;
		} else if (n<8) {
			cadena= "Desarrollador Senior L2 - 28000-36000";
			return cadena;
		} else if (n>=8) {
			cadena= "Analista/Arquitecto. Salario a convenir en base a rol";
			return cadena;
		} else {
			return "Si no tienes experiencia, estas en Desarrollador Junior L1 - 15000-18000";
		}
	}
	
	
	
	public static ArrayList<String> dameDatos(Scanner teclado, ArrayList<String>datos) {
		System.out.println("Dime tu nombre:");
		datos.add(teclado.nextLine()); 
		while (true) {
			System.out.println("Dime cuántos años tienes de experiencia:");
			try {
				int num = teclado.nextInt();
				datos.add(Integer.toString(num));
				return datos;
			}catch (Exception e) {
				System.out.println("Introduce un entero.");
				teclado.next();
			}
		}
	}

}
