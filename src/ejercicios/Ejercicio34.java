package ejercicios;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// si pongo int, java solo acepta hasta cierto numero. Para números más grandes poner long
		long factorial = 1;
		for (int i = 1; i <= 15; i++) {
			factorial *= i; 
			}
		System.out.println("El factorial de 15 es " + factorial);
	}

}
