/**
 * 
 */
package fundamento.parte1;

import java.util.Scanner;

/**
 * @author Evandro Firmino
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		scanner.close();

	}

}
