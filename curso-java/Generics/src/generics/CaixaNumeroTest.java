package generics;

public class CaixaNumeroTest {
	
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero();
		caixaA.guardar(1.2);
		
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero();
		caixaB.guardar(12);
		
		System.out.println(caixaB.abrir());
		
		
	}

}
