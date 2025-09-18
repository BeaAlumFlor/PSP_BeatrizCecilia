package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("En este programa te voy a pedir que introduzcas tu fecha de nacimiento, dandome primero el dia:");
		
		dameNumero(numeros, teclado);
		System.out.println("Ahora el mes: ");
		dameNumero(numeros, teclado);
		System.out.println("Ahora el año: ");
		dameNumero(numeros, teclado);
		
		
		int suma = 0;
		suma = calculoLista(suma, numeros);
		
		numeros.clear();
		
		//Pasamos el resultado a números en la lista
		String sumatorio = String.valueOf(suma);
		for (int i = 0; i < 2; i++) {
			numeros.add(Character.getNumericValue(sumatorio.charAt(i)));
		}
		
		suma = 0; 
		suma= calculoLista(suma, numeros);
		
		System.out.print("Tu número de la suerte es " + suma);
		
	}

	public static int calculoLista(int variable, ArrayList<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			variable += lista.get(i);
		}
		return variable;
	}
	
	public static void dameNumero(ArrayList<Integer> datos, Scanner teclado) {
		int num = 0;
		while (num>=0) {
			try {
				num = teclado.nextInt();
				if (num>0) {
					String numero = Integer.toString(num);
					int longitud = numero.length();
					if (longitud == 1) {
						datos.add(Character.getNumericValue(numero.charAt(0)));
					} else if (longitud == 2) {
						datos.add(Character.getNumericValue(numero.charAt(0)));
						datos.add(Character.getNumericValue(numero.charAt(1)));
					} else if (longitud == 4) {
						datos.add(Character.getNumericValue(numero.charAt(0)));
						datos.add(Character.getNumericValue(numero.charAt(1)));
						datos.add(Character.getNumericValue(numero.charAt(2)));
						datos.add(Character.getNumericValue(numero.charAt(3)));
					} 
					num = -9;
				} else {
						System.out.println("Escribe números positivos.");
						num= 0;
				}
			}catch (Exception e) {
				System.out.println("Introduce un entero.");
				teclado.next();
			}
		}
		
				
	}
	
	
	
}
