package fundamento.parte1;

import java.util.Scanner;

public class Exercicio5 {
	/** 5. Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea. */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Digite a Base:");
		double base = entrada.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A �rea do Tri�ngulo �: " + area);
		
		entrada.close();
	}

}
