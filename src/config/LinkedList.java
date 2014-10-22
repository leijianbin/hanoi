package config;
import structures.ListInterface;

public class LinkedList<T> implements ListInterface<T> {

	private LinkedListNode<T> head;
	private LinkedListNode<T> tail;
	private int size;
	
	@Override
	public int size() {
		return this.size;
	}
	@Override
	public LinkedList<T> append(T elem) {
		if(elem == null) {
			throw new NullPointerException();
		}
		if(head == null) {//if the head is null, create the head
			head = new LinkedListNode<T>(elem);
			tail = head;
		}
		else {
			LinkedListNode<T> temp = new LinkedListNode<T>(elem);
			tail.setLink(temp);
			tail = temp;
		}
		this.size ++;
		return this;
	}
	@Override
	public T remove(int n) {
		
		if (n >= this.size || n < 0){ //check the index of n
			throw new IndexOutOfBoundsException();
		}
		
		LinkedListNode<T> currentNode = head;
		LinkedListNode<T> previewNode = null;
		if(n == 0) {
			head = head.getLink();
		}
		else {
			while(n != 0)
			{
				previewNode = currentNode;
				currentNode = currentNode.getLink();
				n--;
			}
			previewNode.setLink(currentNode.getLink());
		}
		this.size --;
		return currentNode.getInfo();
	}
	
}
