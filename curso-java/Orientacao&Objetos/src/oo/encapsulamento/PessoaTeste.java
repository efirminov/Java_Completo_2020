package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Evandro", 30);
		// p1.idade = -30; // alterar
		
		System.out.println(p1.lerIdade()); // ler 
		
		System.out.println(p1); // toString
		
	}
}