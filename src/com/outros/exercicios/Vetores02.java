package com.outros.exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Vetores02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nº inteiro: ");
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine(); // Para consumir a quebra de linha do nextInt() anterior
			System.out.print("Nome do " + (i+1) + "º produto: ");
			String nome = sc.nextLine();
			System.out.print("Preço do " + (i+1) + "º produto: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco); // Instanciando os produtos, pois cada posição do vetor faz referência para cada objeto (produto)
		}
		
		double soma = 0.0;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		System.out.printf("Média: %.2f", media);
		
		sc.close();

	}

}
