package fundamento.desafio;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na Terça (V OU F)
		// Trabalho quinta  (V OU F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		
		boolean comprou32 =  trabalho1 ^ trabalho2;
		System.out.println("Comprou Tv 32\"? " + comprou32);
		
		boolean comprouSorvete = trabalho1 || trabalho2;
		System.out.println("Comprou Sorvete\"? " +comprouSorvete);
		
		System.out.println("Mais saudável? "+ !comprouSorvete);
		
	}

}
