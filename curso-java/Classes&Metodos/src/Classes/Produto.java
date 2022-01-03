package Classes;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	double precoComDesconto(){
		return preco * (1 - desconto);
	}

}
