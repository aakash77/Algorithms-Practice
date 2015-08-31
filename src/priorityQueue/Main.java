package priorityQueue;

public class Main {

	public static void main(String[] args) {
		PQBinaryHeap<String> pqBinaryHeap = new PQBinaryHeap<String>();
		/*Integer num[] = {4,9,1,2,5,5,6,11,974923,5999};*/
		pqBinaryHeap.insert("T");
		pqBinaryHeap.insert("P");
		pqBinaryHeap.insert("R");
		pqBinaryHeap.insert("N");
		pqBinaryHeap.insert("H");
		pqBinaryHeap.insert("O");
		pqBinaryHeap.insert("A");
		pqBinaryHeap.insert("E");
		pqBinaryHeap.insert("I");
		pqBinaryHeap.insert("G");
		pqBinaryHeap.insert("S");
		System.out.println(pqBinaryHeap.toString());
		System.out.println(pqBinaryHeap.delMax());
		System.out.println(pqBinaryHeap.toString());
	}

}
