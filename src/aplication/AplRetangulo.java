package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitie.Retangulo;

public class AplRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retang = new Retangulo();
		
		System.out.print("Entre com altura e largura do retângulo:");
		retang.altura = sc.nextDouble();
		retang.largura = sc.nextDouble();
		
		System.out.printf("ÁREA: %.2f%n",retang.area());
		System.out.printf("PERÍMETRO: %.2f%n",retang.perimetro());
		System.out.printf("DIAGONAL: %.2f%n",retang.diagonal());
		
		sc.close();
	}

}
