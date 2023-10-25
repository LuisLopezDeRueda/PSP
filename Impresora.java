package Ejercicio1;

public class Impresora {

	private String usuarioActual = null;
	private Integer numCopias = 1;

	public synchronized void imprimir(String usuario, String texto) {
		
		if(!isOcupada()) {
			ocuparImpresora(usuario);
		}
		if(isOcupadaPorUsuario(usuario)) {
			System.out.println(usuario + " - (copia " + numCopias + ") - " + texto);
		}
		numCopias++;
		if (numCopias > 5) {
			numCopias = 1;
		}
	}

	public boolean isOcupada() {
		return usuarioActual != null;
	}

	public boolean isOcupadaPorUsuario(String usuario) {
		return isOcupada() && usuarioActual.equals(usuario);
	}

	public void liberarImpresora() {
		usuarioActual = null;
	}

	public void ocuparImpresora(String usuario) {
		usuarioActual = usuario;
	}

}
