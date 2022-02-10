package lambdas;

public class CalculoTexte1 {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Mutiplicar();
		System.out.println(calculo.executar(2, 3));
		
	}
}
