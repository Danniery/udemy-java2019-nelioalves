package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class AplProduct {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of product: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			String name = "";
			double price = 0.0;
			
			
			switch(ch) {
				case 'i': 
					sc.nextLine();
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					list.add(new ImportedProduct(name, price, customsFee));
					break;
				case 'c':
					sc.nextLine();
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					list.add(new Product(name, price));
					break;
				case 'u':
					sc.nextLine();
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next()); 
					list.add(new UsedProduct(name, price, manufactureDate));
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();

	}

}
