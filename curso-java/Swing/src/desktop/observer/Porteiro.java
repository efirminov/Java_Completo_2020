package desktop.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro  extends Thread {
	
	private List<ChegadaAniversarianteObserver> observes = new ArrayList<ChegadaAniversarianteObserver>();
	
	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observes.add(observer);
	}
	
	@Override
	public void run() {
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			int valor = entrada.nextInt();
			
			if (valor == 1) {
				ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
				
				for (ChegadaAniversarianteObserver observer : this.observes) {
					observer.chegou(event);
					
				}
			} else {
				System.out.println("Alarme falso...");
			}
		}
	}

}
