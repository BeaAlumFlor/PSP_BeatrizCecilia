package ejercicios;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		System.out.println("Los códigos ASCII son:");
		System.out.println(" ");
		
		
		for (int i = 0; i < 128; i++) {
			char c = (char) i;
			if (i%10 == 0) {
				System.out.println(i + ". " + c + "\t");
			} else {
					System.out.print(i + ". " + c + "\t");
			}
		}
		

	}

}
