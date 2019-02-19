package Interfaces;

public interface MeyiQueue<T> {
	
	public T peek();
	public T poll();
	public void ofter(T element);
	boolean isEmpty();
	

}
