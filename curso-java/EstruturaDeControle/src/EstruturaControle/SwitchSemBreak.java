package EstruturaControle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "branca";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-dai...");
		case "marram":
			System.out.println("Sei o Tekki shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heia Nidan");
		case "amarela":
			System.out.println("Sei o Heian shodan");
//		default:
//			System.out.println("Não sei de nada!");
		}	
	}
}
