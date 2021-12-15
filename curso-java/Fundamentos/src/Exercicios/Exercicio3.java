/**
 * 
 */
package Exercicios;

import java.util.Scanner;

/**
 * @author Evandro Firmino
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.print("IMC: " + imc);
		
	}

}
