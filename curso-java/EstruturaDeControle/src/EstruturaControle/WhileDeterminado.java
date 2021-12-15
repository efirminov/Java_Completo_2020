package EstruturaControle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("I = %d\n", contador);
//			contador++;
			contador += 2;
		}
	}
}
