package Buzon;

import java.util.Random;

public class Escritor   implements Runnable{
	private Buzon buzon;
	private Integer indice;
	public Escritor(Buzon buzon,Integer indice) {
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
				if (!buzon.getHayMensaje()) {
					buzon.setHayMensaje(true);
					System.out.println("Escritor "+ indice + " : empieza");
					buzon.setMensaje("hola "+ indice);
					System.out.println("Mensaje escrito por " + indice );
					break;
				} else {
					try {
						System.out.println("Escritor " + indice + " : Esperando para escribir...");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						System.out.println("El hilo no se ha podido dormir");
					}
				}
			}
	}

}
