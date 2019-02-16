package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitie.Estudante;

public class AplEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean scape = true;
		
		while(scape != false) {
			Estudante aluno = new Estudante();
			System.out.print("Aluno: ");
			aluno.nome = sc.nextLine();
			System.out.print("1º tri: ");
			aluno.notaPrimeiro = sc.nextDouble();
			System.out.print("2º tri: ");
			aluno.notaSegundo = sc.nextDouble();
			System.out.print("3º tri: ");
			aluno.notaTerceiro = sc.nextDouble();
			
			System.out.println();
			System.out.println("Final = " + String.format("%.2f",aluno.notaFinal()));
			System.out.println(aluno.calculaAprova());
			
			System.out.println();
			System.out.print("Outro aluno (s/n)? ");
			char c = sc.next().charAt(0);
			System.out.println();
			
			if(c == 'n')
				scape = false;
			
			sc.nextLine();
		}
		sc.close();
	}

}
