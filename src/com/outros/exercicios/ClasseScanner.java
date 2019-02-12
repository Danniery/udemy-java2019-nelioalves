package com.outros.exercicios;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Ler um texto até a quebra de linha e armazenar em uma variável
		String sentence = sc.nextLine();
		
		// Ler três palavras, uma em cada linha, armazenando cada uma em uma variável
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		//Imprimindo
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//Ler três palavras na mesma linha, separadas por espaço, armazenando cada uma em uma variável.
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
