package graus1;

public class Temperatura {
	
	public static void main(String[] Args) {

		double Celsius = 30, Kelvin, Reaumur, Rankine, Fahrenheit;

		Fahrenheit = Celsius * 1.8 + 32;
		Kelvin = Celsius + 273.15;
		Rankine = Celsius * 1.8 + 32 + 459.67;
		Reaumur = Celsius * 0.8;

		System.out.println("A temperatura em Fahrenheit �:" +Fahrenheit);
		System.out.println("A temperatura em Kelvin �: " + Kelvin);
		System.out.println("A temperatura em Reaumur �: " + Rankine);
		System.out.println("A temperatura em Rankine �: " + Reaumur);
	
	}

}



