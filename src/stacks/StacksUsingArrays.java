package stacks;

public class StacksUsingArrays {
	private String stack[];
	private int top=-1;

	StacksUsingArrays(int size){
		stack = new String[size];
	}

	void push(String item){
		if(top == stack.length-1){
			System.out.println("Stack Overflow");
		}else{
			stack[++top]=item;
		}
	}

	void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}else{
			top--;
			stack[top+1]=null;
		}
	}

	void printArray(){
		for (String s : stack){
			System.out.println(s);
		}
	}
}