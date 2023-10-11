public class Cafeteria {
	
	private static final Integer AFORO_MAXIMO = 50;
	
	private Integer aforoActual;
	
	public Cafeteria() {
		aforoActual = 0;
	}
	
	public boolean haySitio() {
		return aforoActual < AFORO_MAXIMO;
	}
	
	public void entraPersona() {
		aforoActual++;
		System.out.println("Entra persona. Aforo actual = " + aforoActual);
	}
	
	public void salePersona() {
		aforoActual--;
		System.out.println("Sale persona. Aforo actual = " + aforoActual);
	}
	
	
}
