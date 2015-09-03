package trees;

public class Red_Black_BST<Key extends Comparable<Key>,Value> {

	//denotes keys in the same node
	private final Boolean RED = true;
	//denotes keys in different nodes
	private final Boolean BLACK = false;
	
	//Denotes each node of the tree
	private class Node{
		Key key;
		Value value;
		Node left,right;
		Boolean color;
		
		public Node(Key key,Value value,Boolean color){
			this.key = key;
			this.value = value;
			this.color = color;
		}
		
	};

	private Node root;
	
	//Method to add new key value
	public void put(Key key,Value value){
		root = insert(root,key,value);
	}
	
	//Method to fetch value of the key
	public Value get(Key key){
		Node x = root;
		while(x!=null){
			if(key.compareTo(x.key)<0)
				x = x.left;
			else if(key.compareTo(x.key)>0)
				x = x.right;
			else
				return x.value;
		}
		return null;
	}
	
	//insert/update a node
	private Node insert(Node h,Key key, Value value){
		if(h==null)
			return new Node(key,value,RED);
		
		if(key.compareTo(h.key)<0)
			h.left = insert(h.left,key,value);
		else if(key.compareTo(h.key)>0)
			h.right = insert(h.right,key,value);
		else
			h.value = value;
		
		if(!isRed(h.left) && isRed(h.right))
			h = rotateLeft(h);
		if(isRed(h.left) && isRed(h.left.left))
			h = rotateRight(h);
		if(h.left.color == RED && h.right.color == RED)
			flipColors(h);
		
		return h;
	}


	//Method to rotate the tree to left in order to balance and simulate B-Tree
	private Node rotateLeft(Node h){

		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	//Method to rotate the tree to right in order to balance and simulate B-Tree
	private Node rotateRight(Node h){
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	//Method to change the colors of node in order to balance and simulate B-Tree	
	private void flipColors(Node h){
		h.color = RED;
		h.left.color = BLACK;
		h.right.color = BLACK;
	}

	//Method to check whether the node is already a 3-node	
	private Boolean isRed(Node h){
		if(h.color == null)
			return false;
		return h.color==RED;
	}
}
