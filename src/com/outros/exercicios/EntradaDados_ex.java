package com.outros.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados_ex {

	public static void main(String[] args) {
		
		String fullName, lastName, age;
		int bedroom;
		double price, height;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		fullName = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		bedroom = sc.nextInt();
		
		System.out.println("Enter product price:");
		price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
		lastName = sc.next();
		age = sc.next();
		height = sc.nextDouble();
		
		System.out.println(fullName);
		System.out.println(bedroom);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();

	}

}
