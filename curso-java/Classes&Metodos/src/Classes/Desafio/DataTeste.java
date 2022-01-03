package Classes.Desafio;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 29;
		d1.mes = 05;
		d1.ano = 1998;
		
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 03;
		d2.ano = 2022;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		System.out.println();
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}