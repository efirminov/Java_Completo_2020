package desktop.padroes.observer;

public class Festa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservadores(namorada);
		
		porteiro.registrarObservadores(e -> {
			System.out.println("Supresa via lambda!");
			System.out.println("Ocorreu em: " + e.getMomento());
		});
		
		porteiro.monitorar();
		
	}
}
