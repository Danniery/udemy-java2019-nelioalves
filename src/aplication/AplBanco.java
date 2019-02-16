package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitie.Conta;

public class AplBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Haverá depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		Conta conta;
		
		if(resposta == 's') {
			System.out.print("Valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, titular, depositoInicial);
		}
		else {
			conta = new Conta(numConta, titular);			
		}
		
		System.out.println(conta);
		
		System.out.print("\nEntre com um valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("\nDados atualizados da conta:");
		System.out.println(conta);
		
		System.out.print("\nEntre com um valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("\nDados atualizados da conta:");
		System.out.println(conta);
		
		sc.close();
	
	}

}
