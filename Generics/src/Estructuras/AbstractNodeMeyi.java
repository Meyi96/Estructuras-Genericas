package Estructuras;

public class AbstractNodeMeyi <E>{
	
	private E element;
	private AbstractNodeMeyi<E> nextNode;
	
	public AbstractNodeMeyi(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public AbstractNodeMeyi<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(AbstractNodeMeyi<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
