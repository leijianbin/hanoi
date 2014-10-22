package config;
import java.util.EmptyStackException;

public class LinkedStack<T>{
	public int size;    // Size of stack
	public LinkedListNode<T> head; // Head Node of stack

	public LinkedStack() { // Stack Construction
		size = 0;
		head = null; 
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public void push(T elem) {
		// TODO Auto-generated method stub
		LinkedListNode<T> oldStackHead = head; 
		head = new LinkedListNode<T> (elem);
		head.setLink(oldStackHead);
		size++;
	}
	
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T elemment = (T) head.getInfo(); // sets the element to be the content of head
		head = head.getLink(); // sets head link to the next node
		size--; // decreases the size of stack
		return elemment;	
	}
	
	public T top() { 
		if (isEmpty()){
			throw new EmptyStackException();
		} 
		// TODO Auto-generated method stub
		return (T) head.elem; // returns T element at the top of stack
	}
	
}