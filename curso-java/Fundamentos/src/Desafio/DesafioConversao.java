package Desafio;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro sal�rio: ");
		String primeiro = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu segundo sal�rio: ");
		String segundo = entrada.next().replace(",", ".");
		
		System.out.print("Digite a sue ultimo sal�rio: ");
		String terceiro = entrada.next().replace(",", ".");
		
		double num1 = Double.parseDouble(primeiro);
		double num2 = Double.parseDouble(segundo);
		double num3 = Double.parseDouble(terceiro);
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.println("M�dia �: " + media);
		
		entrada.close();

	}

}
