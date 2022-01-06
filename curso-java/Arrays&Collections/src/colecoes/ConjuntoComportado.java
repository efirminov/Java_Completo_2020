package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		lista.add("Evandro");
		lista.add("Ana");
		lista.add("Luca");
		lista.add("Pedro");
		lista.add("Carlos");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int n: nums) {
			System.out.println(n);
		}
	}
}
