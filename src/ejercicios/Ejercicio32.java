package ejercicios;

import java.util.ArrayList;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] companeros = {"Jose", "Annah", "Rodrigo", "Ignacio", "Bryan"};
		
		String cadena = " ";
		
		for (int i = 0; i < companeros.length; i++) {
			cadena += companeros[i] + ", ";
		}
		System.out.print(cadena.substring(0,cadena.length()-2) + "\n");
		
		ArrayList<String> companeros2 = new ArrayList<>();
		
		companeros2.add("Jose");
		companeros2.add("Annah");
		companeros2.add("Rodrigo");
		companeros2.add("Ignacio");
		companeros2.add("Bryan");
		
		String cadena2 = " ";
		
		for (int i = 0; i < companeros2.size(); i++) {
			cadena2 += companeros2.get(i) + ", ";
		}

		System.out.print(cadena2.substring(0,cadena2.length()-2));
		
	}

}
