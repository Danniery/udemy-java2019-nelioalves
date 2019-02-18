package entities;

public class Estudante {
	
	public String nome;
	public Double notaPrimeiro, notaSegundo, notaTerceiro;
	
	public double notaFinal() {
		return notaPrimeiro + notaSegundo + notaTerceiro;
	}
	
	public String calculaAprova() {
		if (notaFinal() < 60) {
			return "REPROVADO!\n" + "Faltaram " + (60 - notaFinal()) + " pontos!";
		}
		else {
			return "APROVADO!";
		}
	}

}
