package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Offer e Add -> adicionam elementos na Fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lança uma exceçao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lança uma exceçao
		System.out.println(fila.element());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty()
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove());// lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.contains(...)
	}
}
