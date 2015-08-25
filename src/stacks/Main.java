package stacks;

public class Main {

	public static void main(String[] args) {
		
		/*StacksUsingArrays obj = new StacksUsingArrays(10);
		obj.push("hey");
		obj.pop();
		obj.pop();
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");
		obj.push("hey");*/
		/*********************************************************/
		/*StacksUsingLinkedList obj = new StacksUsingLinkedList();
		obj.push("1");
		obj.push("2");
		obj.push("3");
		obj.push("4");
		obj.push("5");
		obj.push("6");
		obj.push("7");
		obj.printArray();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();*/
		/*********************************************************/
		
		StacksUsingResizingArrays<String> obj = new StacksUsingResizingArrays<String>();
		obj.push("1");
		obj.printArray();
		obj.push("2");
		obj.printArray();
		obj.push("3");
		obj.printArray();
		obj.push("4");
		obj.printArray();
		obj.push("5");
		obj.printArray();
		obj.push("6");
		obj.printArray();
		obj.push("7");
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
		obj.pop();
		obj.printArray();
	}

}