package fundamento.parte1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/** 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		entrada.close();	
	}
}
