package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Evandro");
		Aluno aluno2 = new Aluno("Debora");
		Aluno aluno3 = new Aluno("Luna");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1 " + curso1.nome);
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso 2 " + curso2.nome);
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 3 " + curso3.nome);
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPornome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
