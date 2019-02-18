package com.outros.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> lista; //List não aceita tipo primitivo
		lista = new ArrayList<>(); //Instanciando a lista (que é um interface) com a classe ArrayList<>() que implementa a interface list
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco"); //Adiciona Marco na 3ª posição da lista (índice 2)
		
		System.out.println(lista.size());
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		/*lista.remove("Anna"); //Faz uma comparação, e se achar Anna, remove (remove("Anna") é outra instância)
		lista.remove(1); //Remove o elemento de índice 1 da lista - Alex 
		
		System.out.println("-----------------------");
		for (String x : lista) {
			System.out.println(x);
		}*/
		
		System.out.println("-----------------------");
		lista.removeIf(x -> x.charAt(0) == 'M');
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index of Marco: " + lista.indexOf("Marco")); //Retorna -1 quando não encontra o elemento na lista
		
		System.out.println("-----------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Filtra lista com base num predicado
		for (String x : result) {																		   //stream() -> converte a lista para poder usar lambda
			System.out.println(x); //Imprime Alex e Anna												   //Collectors.toLista() -> converte para List novamente
		}
		
		//Encontrar primeira ocorrência com base em predicado
		System.out.println("-----------------------");
		String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}

}
