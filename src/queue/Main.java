package queue;

public class Main {

	public static void main(String[] args) {
		
		QueueUsingLinkedList<String> obj = new QueueUsingLinkedList<String>();
		obj.enqueue("1");
		obj.enqueue("2");
		obj.enqueue("3");
		obj.enqueue("4");
		obj.enqueue("5");
		obj.printQueue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
	}
}
