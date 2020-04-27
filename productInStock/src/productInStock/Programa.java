package productInStock;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("name: ");
		product.name = entrada.nextLine();
		System.out.print("price: ");
		product.price = entrada.nextDouble();
		System.out.println("quantity in stock: ");
		product.quantity = entrada.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = entrada.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		entrada.close();
	}

}
