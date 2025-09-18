package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe tu contraseña: ");
		String password = dameContrasenna(teclado);
		String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{5,}$";
		
		System.out.print("Escribe de nuevo tu contraseña: ");
		String password2 = dameContrasenna(teclado);
		
		if (password.equals(password2)) {
			if (password.matches(regex)) {
	            System.out.println("Las contraseñas coinciden y es válida.");
	        } else {
	            System.out.println("Las contraseñas coinciden pero es inválida. Debe tener 5 caracteres, al menos una mayúscula y un número.");
	        }
		} else {
			System.out.println("Las contraseñas no coinciden");
		}
		teclado.close();
	}

	public static String dameContrasenna(Scanner teclado) {
		String num = teclado.nextLine();
		return num;
	}
}