package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		alterarIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter
	public int lerIdade() {
		return idade;
	}
	
	// Setter
	public void alterarIdade(int novaIdade) {
		if(novaIdade >= 0) {
			this.idade = novaIdade;
		}
	}

	@Override
	public String toString() {
		return "Olá eu sou " + getNome() + " e tenho " + lerIdade() + " anos.";
	}
}
