package trees;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<String, String> bst = new BinarySearchTree<String, String>();
		System.out.println(bst.get("hola"));
		bst.put("hola", "1");
		bst.put("Jan", "1");
		bst.put("Feb", "2");
		bst.put("Mar", "3");
		bst.put("Apr", "4");
		bst.put("May", "5");
		bst.put("June", "6");
		bst.put("hola", "13");
		System.out.println(bst.get("Jan"));
		System.out.println(bst.get("Feb"));
		System.out.println(bst.get("Mar"));
		System.out.println(bst.get("June"));
		System.out.println(bst.get("Apr"));
		System.out.println(bst.get("hola"));
	}

}
