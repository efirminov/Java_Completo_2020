package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLiguagem = (String) ListaUtil.getUtil1(langs);
		System.out.println(ultimaLiguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUtil1(nums);
		System.out.println(ultimoNumero);
		
		String ultimaLiguagem2 = ListaUtil.getUtil2(langs);
		System.out.println(ultimaLiguagem2);
		
		Integer ultimoNumero2 = ListaUtil.getUtil2(nums);
		System.out.println(ultimoNumero2);
	}

}
