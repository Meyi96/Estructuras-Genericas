package generics;

public class Prueba {
	
	private int numero;
	private char caracter;
	
	public Prueba(int numero, char caracter) {
		this.numero = numero;
		this.caracter = caracter;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	@Override
	public String toString() {
		return "Prueba [numero=" + numero + ", caracter=" + caracter + "]";
	} 
	
	
	
	
}
