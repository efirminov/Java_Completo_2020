package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		// 2. Inverter a string... "110" => "011"
		UnaryOperator<String> inveter = s -> new StringBuilder(s).reverse().toString();
		
		// 3. Converter de volta para inteiro => "011" => 3
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream()
		.map(Integer::toBinaryString) // 1. Número para string binária... 6 => "110"
		.map(inveter)
		.map(binarioParaInt)
		.forEach(System.out::println);
	}

}
