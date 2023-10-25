package Ejercicio1;

public class Usuario implements Runnable{

	private String nombre;
	private Impresora impresora;
	
	public Usuario(String nombre, Impresora impresora) {
		this.nombre = nombre;
		this.impresora = impresora;
	}
	
	public  void escribir() {
		for (int i = 1; i <= 5; i++) {
			String texto = "Texto " + i;
			impresora.imprimir(nombre, texto);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error con el hilo");
			}
		}
		impresora.liberarImpresora();
	}

	@Override
	public void run() {
		escribir();
		
	}

}
