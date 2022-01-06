package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Evandro");
		
		lista.add(u1);
		lista.add(new Usuario("Debora"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		System.out.println();
		
		System.out.println(lista.get(3)); // acessar pelo índece
		
		lista.remove(1);
		lista.remove(new Usuario("Manu"));
		
		lista.contains(new Usuario("Bia"));
		
		System.out.println();
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
