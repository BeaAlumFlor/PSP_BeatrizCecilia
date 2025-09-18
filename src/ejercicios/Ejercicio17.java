package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe tu contraseña: ");
		String password = dameContrasenna(teclado);
		String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{5,}$";
		
		if (password.matches(regex)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida. Debe tener 5 caracteres, al menos una mayúscula y un número.");
        }
		teclado.close();
	}

	public static String dameContrasenna(Scanner teclado) {
		
		String num = teclado.nextLine();
		return num;
	}
}
