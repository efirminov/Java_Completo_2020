package br.com.efirminov.cm;

import br.com.efirminov.cm.modelo.Tabuleiro;
import br.com.efirminov.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
		
	}

}
