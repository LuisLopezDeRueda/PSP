package Buzon;

import java.util.Random;

public class Lector implements Runnable {
	private Buzon buzon;
	private Integer indice;

	public Lector(Integer indice, Buzon buzon) {
		this.buzon = buzon;
		this.indice = indice;
	}

	@Override
	public void run() {
		Random random = new Random();
		try {
			Thread.sleep((random.nextInt(4)) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (true) {
			if (buzon.getHayMensaje()) {
				buzon.setHayMensaje(false);
				System.out.println("Lector " + indice + " Leyendo el mensaje: " + buzon.getMensaje());
				System.out.println("Lector " + indice + " : he terminado de leer ");
				break;
			} else {
				try {
					System.out.println("Lectro " + indice + " : Esperando para leer...");
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					System.out.println("El hilo no se ha podido dormir");
				}
			}
		}
	}

}
