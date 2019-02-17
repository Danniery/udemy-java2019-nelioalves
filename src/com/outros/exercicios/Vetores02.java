package com.outros.exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Vetores02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n� inteiro: ");
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine(); // Para consumir a quebra de linha do nextInt() anterior
			System.out.print("Nome do " + (i+1) + "� produto: ");
			String nome = sc.nextLine();
			System.out.print("Pre�o do " + (i+1) + "� produto: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco); // Instanciando os produtos, pois cada posi��o do vetor faz refer�ncia para cada objeto (produto)
		}
		
		double soma = 0.0;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		System.out.printf("M�dia: %.2f", media);
		
		sc.close();

	}

}
