package com.outros.exercicios;

import java.util.Locale;

public class ClassePrint {

	// System.out.println; System.out.print; System.out.printf
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Deskt";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.print("Products:\n");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f%n",	measure);

	}

}
