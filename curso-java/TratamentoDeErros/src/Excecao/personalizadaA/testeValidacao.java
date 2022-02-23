package Excecao.personalizadaA;

import Excecao.Aluno;

public class testeValidacao {

	public static void main(String[] args) throws StringVazia, NumeroForaIntervalo {

		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVazia e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervalo | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}

}
