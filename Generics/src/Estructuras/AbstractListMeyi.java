package Estructuras;

import Interfaces.MeyiList;
import Interfaces.MeyiQueue;
import Interfaces.MeyiStack;

public class AbstractListMeyi <T> implements MeyiList<T>, MeyiQueue<T>, MeyiStack<T>{
	
	private AbstractNodeMeyi<T> firstNode;
	
	public AbstractListMeyi() {
	}
	
	private T getElement() {
		return firstNode.getElement();
	}
	
	
	@Override
	public T top() {
		return getElement();
	}

	@Override
	public T pop() {
		AbstractNodeMeyi<T> auxi= firstNode;
		firstNode = auxi.getNextNode();
		return auxi.getElement();
	}

	@Override
	public void push(T element) {
		add(element);
	}

	@Override
	public T peek() {
		return getElement();
	}

	@Override
	public T poll() {
		return pop();
	}

	@Override
	public void ofter(T element) {
		if(firstNode == null)
			add(element);
		else {
			AbstractNodeMeyi<T> auxi = new AbstractNodeMeyi<T>(element);
			getLastNode(firstNode).setNextNode(auxi);
		}
	}

	@Override
	public void add(T element) {
		AbstractNodeMeyi<T> newNode = new AbstractNodeMeyi<T>(element);
		if(firstNode != null) {
			newNode.setNextNode(firstNode);
			firstNode = newNode;
		}
		else {
			firstNode = newNode;
		}
	}

	@Override
	public T deleted(T element) {
		if(firstNode ==null)
			return null;
		else {
			AbstractNodeMeyi<T> auxi = getPreviousNode(firstNode, element);
			if(auxi.getNextNode() ==null) 
				return null;
			else {
				AbstractNodeMeyi<T> removed = auxi.getNextNode();
				auxi.setNextNode(removed.getNextNode());
				return removed.getElement();
			}
		}
	}
	
	private AbstractNodeMeyi<T> getLastNode(AbstractNodeMeyi<T> node){
		if(node.getNextNode() == null)
			return node;
		else
			return getLastNode(node.getNextNode());
	}
	
	private AbstractNodeMeyi<T> getPreviousNode( AbstractNodeMeyi<T> node, T element){
		if(node.getNextNode() == null) {
			return node.getNextNode();
		}
		else if(node.getNextNode().getElement()==element) {
			return node.getNextNode();
		}else
			return getPreviousNode(node.getNextNode(), element);
			
	}

	@Override
	public boolean isEmpty() {
		return firstNode==null;
	}

	
	
	
	

}
