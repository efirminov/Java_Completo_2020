package Excecao.personalizadaB;

import Excecao.Aluno;

public class testeValidacao {

	public static void main(String[] args){

		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			
		} catch (StringVazia e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervalo | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim");
	}

}
