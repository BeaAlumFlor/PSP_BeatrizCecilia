package ejercicios;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Los códigos ASCII extendido son:");
		System.out.println(" ");
		
		
		for (int i = 0; i < 256; i++) {
			char c = (char) i;
			if (i%15 == 0) {
				System.out.println(i + ". " + c + "\t");
			} else {
					System.out.print(i + ". " + c + "\t");
			}
		}
		
	}

}
