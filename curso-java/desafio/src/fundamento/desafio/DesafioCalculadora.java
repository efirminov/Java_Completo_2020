/**
 * 
 */
package fundamento.desafio;

import java.util.Scanner;

/**
 * @author Evandro Firmino
 *
 */
public class DesafioCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// +, -, *, /, %
		 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite primeiro Número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo Númro: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite qual Operação: ");
		String op = entrada.next();
		
		// Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		
		entrada.close();
	}
}