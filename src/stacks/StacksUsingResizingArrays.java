package stacks;

@SuppressWarnings("unchecked")
public class StacksUsingResizingArrays<Item> {


	private Item stack[];
	private int top = -1;

	/**
	 * Default Constructor
	 */
	StacksUsingResizingArrays(){
		stack = (Item[]) new Object[1];
	}

	/**
	 * Push operation
	 */
	void push(Item item){
		if(stack.length-1 == top){
			resize(stack.length*2);
		}
		stack[++top] = item;
	}

	/**
	 * Pop operation
	 */
	void pop(){
		if(top<0){
			System.out.println("Stack Underflow");
		}else{
			top--;
			stack[top+1]=null;
			if((stack.length-1)/4 == top){
				resize(stack.length/2);
			}
		}
	}
	
	/**
	 * Print the Stack
	 */
	void printArray(){
		for (Item s : stack){
			System.out.println(s);
		}
	}

	/**
	 * Dynamic Resize method
	 */
	private void resize(int capacity){
		Item extendedStack[] = (Item[]) new Object[capacity];
		for(int i=0;i<=top;i++){
			extendedStack[i] = stack[i];
		}
		stack = extendedStack;
	}
}