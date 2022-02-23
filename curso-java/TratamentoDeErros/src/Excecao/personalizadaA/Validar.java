package Excecao.personalizadaA;

import Excecao.Aluno;

public class Validar {
	
	public Validar() {
	}
	
	public static void aluno(Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo!");
		}
		
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervalo("nota");
		}
	}

}
