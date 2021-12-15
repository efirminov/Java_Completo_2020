/**
 * 
 */
package fundamento.parte1;

import java.util.Scanner;

/**
 * @author Evandro Firmino
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** 2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double conversao = fahrenheit * 1.8 + 32;
		
		System.out.print("Valor em Celsius: " + conversao);
		
		entrada.close();
	}
}
