package dominio;

public class Lampada {
	private boolean ligada;
	private int potencia;
	
	
	public boolean Ligada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void ligar() {
		this.ligada = true;
	}
	public void desligar() {
		this.ligada = false;
	}
	
	public boolean estaLigada() {
		return ligada;
	}
	
	public int verificarPotencia() {
		return potencia;
	}
	
	public void alterarPotencia(int novaPotencia) {
		potencia = novaPotencia;
	}
	
}
