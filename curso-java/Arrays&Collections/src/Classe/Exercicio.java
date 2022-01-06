package Classe;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		//Primeiro modo de fazer um Array
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		//Segundo modo de fazer um Array
		
		double totalAlunoB = 0;
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}