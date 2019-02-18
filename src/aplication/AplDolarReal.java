package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class AplDolarReal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o pre�o do d�lar? ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos d�lares pretende comprar? ");
		double montante = sc.nextDouble();
				
		System.out.printf("Valor a ser pago em reais = R$ %.2f ", CurrencyConverter.calcDolarParaReal(montante, cotacao));

		sc.close();
	}

}
