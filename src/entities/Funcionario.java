package entities;

public class Funcionario {

	public String nome;
	public Double salarioBruto;
	public Double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void incrementaSalario(double percentagem) {
		salarioBruto *= 1 + (percentagem / 100);
	}
	
	public String toString() {
		return nome	+ ", $ " + String.format("%.2f", salarioLiquido()); 
	}
}
