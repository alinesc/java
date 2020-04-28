package salarioEmpregado;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Empregado cadastro1 = new Empregado();
		System.out.print("Nome: ");
		cadastro1.nome = entrada.nextLine();
		System.out.print("Salário Bruto: ");
		cadastro1.salarioBruto = entrada.nextDouble();
		System.out.print("Imposto: ");
		cadastro1.imposto = entrada.nextDouble();
		System.out.print("Empregado " + cadastro1.nome + ", R$ ");
		System.out.printf("%.2f%n", cadastro1.salarioLiquido());
		System.out.print("Porcentagem de aumento salarial: ");
		double aumento = entrada.nextDouble();
		cadastro1.aumentoSalarial(aumento);
		System.out.print("Dados atualizados: " + cadastro1.nome + ", R$ ");
		System.out.printf("%.2f%n", cadastro1.salarioLiquido());
			
		entrada.close();	
		}

}
