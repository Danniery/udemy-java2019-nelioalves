package util;


public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double calcDolarParaReal(double montante, double precoDolar) {
		return montante * precoDolar * (1 + IOF);
	}
}
