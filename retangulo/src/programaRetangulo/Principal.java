package programaRetangulo;

import java.util.Scanner;

import objeto.Retangulo;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com altura e largura do retângulo");
		Retangulo retangulo = new Retangulo();
		retangulo.altura = entrada.nextDouble();
		retangulo.largura = entrada.nextDouble();
		System.out.print("Área = ");
		System.out.printf("%.2f%n",retangulo.area());
		System.out.print("Perímetro = ");
		System.out.printf("%.2f%n",retangulo.perimetro());
		System.out.print("Diagonal = ");
		System.out.printf("%.2f%n",retangulo.diagonal());
		entrada.close();
	}

}
