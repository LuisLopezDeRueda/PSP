package Ejercicio1;

public class Lanzador {

	public static void main(String[] args) {
		Impresora impresora = new Impresora(); // �nica y compartida

		
		Usuario escritor1 = new Usuario("Blas", impresora);
		Thread hiloAlumno = new Thread(escritor1);
		hiloAlumno.start();
		Usuario escritor2 = new Usuario("Laura", impresora);
		Thread hiloAlumno2 = new Thread(escritor2);
		hiloAlumno2.start();
		Usuario escritor3 = new Usuario("Epi", impresora);
		Thread hiloAlumno3= new Thread(escritor3);
		hiloAlumno3.start();
	}
}
