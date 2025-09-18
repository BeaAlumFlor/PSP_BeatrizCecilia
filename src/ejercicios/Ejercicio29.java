package ejercicios;

import java.util.ArrayList;

public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		
		var coche = new Vehiculo("coche", "Renault", "Clio");
		var coche2 = new Vehiculo("coche", "Nissan", "Micra");
		var moto = new Vehiculo("moto", "Honda", "SuperSport");
		var moto2 = new Vehiculo("moto", "Honda", "Adventure");
		var coche3 = new Vehiculo("coche", "Toyota", "YarisCross");
		
		
		vehiculos.add(coche);
		vehiculos.add(coche2);
		vehiculos.add(moto);
		vehiculos.add(moto2);
		vehiculos.add(coche3);
		
		
		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i).datos());
		}
		
		
		
	}

	public static class Vehiculo {
		
		private String tipo;
		private String marca;
		private String modelo;
		
		
		public Vehiculo (String tipo, String marca, String modelo) {
			this.tipo = tipo;
			this.marca = marca;
			this.modelo = modelo;
		}
		
		public String datos() {
			return "El vehículo es un/a " + tipo + " de la marca " + marca + " y modelo " + modelo;
		}
		
		
	}
}
