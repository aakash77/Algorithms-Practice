package queue;

public class QueueUsingLinkedList<Item> {

	private class Node{
		Item item;
		Node next;
	};
	
	private Node first;
	private Node last;
	
	/**
	 * Insert in a queue
	 * @param item
	 */
	void enqueue(Item item){
		Node newNode = new Node();
		newNode.item = item;
		newNode.next=null;
		
		if(first==null){
			first=last=newNode;
		}else{
			last.next = newNode;
			last = newNode;
		}
	}
	
	/**
	 * Removing from a queue
	 */
	void dequeue(){
		if(first==null){
			System.out.println("Queue Empty");
		}else if(first==last){
			System.out.println("Removed "+first.item);
			first=last=null;
		}else{
			System.out.println("Removed "+first.item);
			first = first.next;
		} 
	}
	
	/**
	 * Printing items in the queue
	 */
	void printQueue(){
		for(Node i = first;i!=last.next;i=i.next){
			System.out.print(i.item+" ");
		}
	}
}
