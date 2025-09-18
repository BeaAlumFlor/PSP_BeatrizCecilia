package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {

		Integer num1 = 8;
		Integer num2 = 4;
		
		System.out.println("La suma de los números " + num1 + " y " + num2 + " es:");
		System.out.println(sumar(num1, num2));
	}
	
	public static int sumar(Integer n1, Integer n2) 
	{
		return n1+n2;
	}

}
