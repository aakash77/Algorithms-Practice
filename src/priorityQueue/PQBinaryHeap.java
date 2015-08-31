package priorityQueue;

@SuppressWarnings({"unchecked"})
public class PQBinaryHeap<T extends Comparable<T>> {

	private T[] pq;
	int top;

	PQBinaryHeap(){
		pq = (T[]) new Comparable[2];
		top = 0;
	}

	// insert new item
	public void insert(T item){
		pq[++top] = item;
		swim();
		if(top==pq.length-1)
			resize(pq.length*2);
	}
	
	// deletes the maximum item
	public T delMax(){
		
		T max = pq[1];
		swap(pq,1,top);
		pq[top] = null;
		sink();
		if(top<=pq.length/4){
			resize(pq.length/2);
		}
		top--;
		return max;
	}

	//Rearranging heap if child becomes greater than parent node
	private void swim(){
		int k = top;
		while(k>1 && pq[k/2].compareTo(pq[k])<0){
			swap(pq,k,k/2);
			k/=2;
		}
	}

	//Rearranging heap if parent becomes smaller than child node
	private void sink(){
		int k = 1;
		int j = 2*k;
		while(2*k<=top && (pq[k].compareTo(pq[j]) < 0 || pq[k].compareTo(pq[j+1])<0)){
			if(pq[j].compareTo(pq[j+1])>0){
				swap(pq,k,j);
			}else{
				swap(pq,k,j+1);
			}
			k = j;
			j=2*k;
		}
	}

	//Resize array dynamically
	private void resize(int capacity){
		T[] newArray = (T[]) new Comparable[capacity];
		for(int i=0;i<=top;i++){
			newArray[i] = pq[i];
		}
		pq = newArray;
	}

	//Swapping
	private void swap(T a[],int x, int y){
		T temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	@Override
	public String toString() {
		for(int i=1;i<=top;i++)
			System.out.println(pq[i]);
		return "";
	}
}