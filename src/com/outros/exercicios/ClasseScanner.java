package com.outros.exercicios;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Ler um texto at� a quebra de linha e armazenar em uma vari�vel
		String sentence = sc.nextLine();
		
		// Ler tr�s palavras, uma em cada linha, armazenando cada uma em uma vari�vel
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		//Imprimindo
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//Ler tr�s palavras na mesma linha, separadas por espa�o, armazenando cada uma em uma vari�vel.
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
