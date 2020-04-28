package mediaNotas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner nota = new Scanner (System.in);
		Estudante estudante1 = new Estudante();
		System.out.print("Nome do aluno: ");
		estudante1.nome = nota.nextLine();
		System.out.print("Notas: ");
		estudante1.n1 = nota.nextInt();
		estudante1.n2 = nota.nextInt();
		estudante1.n3 = nota.nextInt();
		System.out.println("Nota final: " + estudante1.soma());
		//estudante1.soma();
		estudante1.verificaAprovacao();
		
		nota.close();
	}

}
