package generics;


public class Clasegenerica <T>{
	
	private T dato;
	
	public Clasegenerica(T dato){
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	public static void main(String[] args) {
		Clasegenerica<String> n1= new Clasegenerica<>("Hola mundo");
		Clasegenerica<String> n2= new Clasegenerica<>("y chao");
		Clasegenerica<Integer> n3= new Clasegenerica<>(1999);
		Clasegenerica<Boolean> n4= new Clasegenerica<>(true);
		Clasegenerica<Prueba> n5= new Clasegenerica<>(new Prueba(123, 'A'));
		System.out.println(n1.getDato() +" "+ n2.getDato() +" "+ n3.getDato() +" "+ n4.getDato() +" "+ n5.getDato());
		
		
	}
	

}
