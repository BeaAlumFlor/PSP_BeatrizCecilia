package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers= new ArrayList<>();
		Random random =new Random();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(10));
		}
		
		System.out.println(numbers);
		System.out.println("El número más grande de la lista es " + dameMayor(numbers));
	}

	public static int dameMayor(ArrayList<Integer> numbers) {
		int mayor = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > mayor) {
				mayor = numbers.get(i);
			}
		}
		return mayor;
	}
}
