package com.outros.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> lista; //List n�o aceita tipo primitivo
		lista = new ArrayList<>(); //Instanciando a lista (que � um interface) com a classe ArrayList<>() que implementa a interface list
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco"); //Adiciona Marco na 3� posi��o da lista (�ndice 2)
		
		System.out.println(lista.size());
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		/*lista.remove("Anna"); //Faz uma compara��o, e se achar Anna, remove (remove("Anna") � outra inst�ncia)
		lista.remove(1); //Remove o elemento de �ndice 1 da lista - Alex 
		
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
		System.out.println("Index of Marco: " + lista.indexOf("Marco")); //Retorna -1 quando n�o encontra o elemento na lista
		
		System.out.println("-----------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Filtra lista com base num predicado
		for (String x : result) {																		   //stream() -> converte a lista para poder usar lambda
			System.out.println(x); //Imprime Alex e Anna												   //Collectors.toLista() -> converte para List novamente
		}
		
		//Encontrar primeira ocorr�ncia com base em predicado
		System.out.println("-----------------------");
		String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}

}
