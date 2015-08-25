package stacks;

public class StacksUsingLinkedList {
	
	private class Node{
		String item;
		Node next;
	};
	
	Node first;
	
	void push(String item){
		Node newNode = new Node();
		newNode.item = item;
		newNode.next = first;
		first = newNode;
	}

	void pop(){
		if(first==null){
			System.out.println("Stack Underflow");
		}else{
			first = first.next;
		}
	}

	void printArray(){
		Node temp = first;
		while(temp!=null){
			System.out.print(temp.item + " ");
			temp = temp.next;
		}
	}
}