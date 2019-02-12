package com.outros.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nº inteiro: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite o valor da " + (i+1) + "ª altura: ");
			vetor[i] = sc.nextDouble();		
		}
		
		/*for(int i=0; i<vetor.length; i++) {
			System.out.print(String.format("%.2f", vetor[i]) + " ");
		}*/
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		System.out.printf("Média: %.2f", media);
		
		sc.close();
	}

}
