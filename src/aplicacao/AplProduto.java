package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class AplProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		
		//Utilizando os m�todos get e set
		produto.setNome("Computador Desktop");
		System.out.println("Nome atualizado: " + produto.getNome());
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o n�mero de produtos para serem adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Entre com o n�mero de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}
