package com.outros.exercicios;

public class ForEach {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		for (String obj : vetor) { // Ler: para cada objeto (obj) no vetor (vetor), faça System.out.println(obj).
			System.out.println(obj);
		}
	}

}
