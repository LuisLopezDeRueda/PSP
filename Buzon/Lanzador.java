package Buzon;

public class Lanzador {
	public static void main(String[] args) {
		// Join espero a que terminen mis hijos para seguir se usa cuando tiene final es
		// programa
		Buzon buzon = new Buzon();
		Escritor escritor = new Escritor(buzon,1);
		Thread escritorThread = new Thread(escritor);
		escritorThread.start();
		
		Escritor escritor2 = new Escritor(buzon,2);
		Thread escritorThread2 = new Thread(escritor2);
		escritorThread2.start();
		

		Lector lector = new Lector(1, buzon);
		Thread lectorThread = new Thread(lector);
		lectorThread.start();

		Lector lector2 = new Lector(2, buzon);
		Thread lectorThread2 = new Thread(lector2);
		lectorThread2.start();

		try {
			escritorThread.join();
			lectorThread.join();
			lectorThread2.join();
		} catch (InterruptedException e) {
			System.out.println("No se ha cerrado los hilos");
		}
	}
}
