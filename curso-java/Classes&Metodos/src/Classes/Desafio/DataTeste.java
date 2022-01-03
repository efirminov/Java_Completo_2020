package Classes.Desafio;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(29, 05, 1998);
		
		var d2 = new Data();
		d2.ano = 2021;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		System.out.println();
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}