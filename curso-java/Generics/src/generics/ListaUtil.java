package generics;

import java.util.List;

public class ListaUtil {
	
	@SuppressWarnings("rawtypes")
	public static Object getUtil1(List lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUtil2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}

}
