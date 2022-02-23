package Excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVazia extends Exception{
	
	private String nomeDoAtributo;
	
	public  StringVazia(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazia!", nomeDoAtributo);
	}

}
