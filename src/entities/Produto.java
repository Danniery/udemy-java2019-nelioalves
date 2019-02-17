package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() { //Construtor padr�o
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0; //Linha opcional, visto que para int o padr�o � inicalizar com 0
	}
	
	public Produto(String nome, double preco, int quantidade) { //N�o tem retorno
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() { //Sobreposi��o do m�todo toString() da classe Object
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidade(s), Total: R$ "
			+ String.format("%.2f", valorTotalEmEstoque());
		
	}
}
