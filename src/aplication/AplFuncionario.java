package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class AplFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + func.toString()); // toString � opcional, uma vez que o Java j� entende, por estar no contexto do println,
		  													 // do que se trata.
		System.out.println();
		System.out.print("Qual o percentual de aumento do sal�rio? ");
		double perc = sc.nextDouble();
		func.incrementaSalario(perc);
		
		System.out.println();
		System.out.println("Dados atualizados: " + func); 
		
		sc.close();
	}

}
