package aplication;

import java.util.Scanner;

import entities.Aluguel;

public class AplPensao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		Aluguel[] vetor = new Aluguel[10];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
			System.out.println();
		}
		
		System.out.println("Quartos ocupados:");
		for(int i=0; i<10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		sc.close();
	}

}
