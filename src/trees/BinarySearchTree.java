package trees;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {
	
	//Denotes each node of the tree
	private class Node{
		Node left;
		Node right;
		Key key;
		Value value;
		public Node(Key key,Value value){
			this.key = key;
			this.value = value;
		}
	};
	
	//pointing to root node
	private Node root;
	
	//Method to add new key value
	public void put(Key key,Value value){
		root = insert(root,key,value);
	}
	
	//insert/update a node
	private Node insert(Node x,Key key,Value value){
		if(x==null)
			return new Node(key,value);
		if(key.compareTo(x.key)< 0 )
			x.left = insert(x.left,key,value);
		else if(key.compareTo(x.key) > 0)
			x.right = insert(x.right,key,value);
		else
			x.value = value;
		return x;
	}
	
	//Method to fetch value of the key
	public Value get(Key key){
		Node x = root;
		while(x!=null){
			if (key.compareTo(x.key)<0){
				x = x.left;
			}else if(key.compareTo(x.key)>0){
				x = x.right;
			}else{
				return x.value;
			}
		}
		return null;
	}
}