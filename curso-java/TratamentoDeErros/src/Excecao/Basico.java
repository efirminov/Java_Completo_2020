package Excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNome(a1);			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do Usúario");
		}
		
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim ");
		
	}
	
	public static void imprimirNome(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
