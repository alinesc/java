package mediaNotas;

public class Estudante {
	
	public int n1, n2, n3;
	public String nome;
	
	public int soma() {
		
		return n1+n2+n3;
	}
	
	public void verificaAprovacao() {
		if (soma() >= 60) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
			System.out.print("Faltaram " + (60-soma()) + " pontos.");
			
		}
	}
	
	
}
