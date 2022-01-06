package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Offer e Add -> adicionam elementos na Fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lan�a uma exce�ao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lan�a uma exce�ao
		System.out.println(fila.element());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty()
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove());// lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.contains(...)
	}
}
