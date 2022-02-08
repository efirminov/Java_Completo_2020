package oo.heranca.desafio;

public interface Luxo {
	
	public void ligarAr();
	abstract void desligarAr();
	
	default int velovidadeDoAr() {
		return 1;
	};

}
