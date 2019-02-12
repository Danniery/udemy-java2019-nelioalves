package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;

public class AplEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// PARTE 1 - LENDO DADOS
		
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();

		List<Employee> lista = new ArrayList<>();
		
		int i=0;
		while (i < n) {
			sc.nextLine();
			System.out.println("Emregado #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			Employee result = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (result != null) {
				System.out.println("Id existente. Entre com outro!");
				System.out.println();
				continue;
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			lista.add(new Employee(id, nome, salario));
			System.out.println();
			i++;
		}
		
		
		// PARTE 2 - ATUALIZAÇÃO DE SALÁRIO DE EMPREGADO
		
		System.out.print("Entre com o ID do empregado que receberá aumento: ");
		int id2 = sc.nextInt();
		Employee emp = lista.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Empregado inexistente!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			emp.aumentoSalario(percent);
		}
	
		
		// PARTE 3 - LISTANDO OS EMPREGADOS
		
		System.out.println();
		System.out.println("Lista de empregados:");
		for (Employee e : lista) {
			System.out.println(e);
		}
		
		sc.close();

	}

}
