package sorting;

@SuppressWarnings({"rawtypes","unchecked"})
public class HeapSort {

	private Comparable heapArray[];
	private int top;

	void sort(Comparable a[]){
		top=0;
		
		//Creating new array for bottom-up heap which will then used for sorting
		heapArray = new Comparable[a.length+1];
		
		//It creates a heap of the given array
		for(Comparable c : a)
			insert(c);
		
		//Sorting
		while(top>=1){
			swap(heapArray,1,top);
			top--;
			sink();
		}
		
		//Returning the sorted array
		int i=1;
		while(i!=heapArray.length){
			a[i-1] = heapArray[i];
			i++;
		}
	}

	// insert new item
	private void insert(Comparable item){
		heapArray[++top] = item;
		swim();
	}

	//Rearranging heap if child becomes greater than parent node
	private void swim(){
		int k = top;
		while(k>1 && heapArray[k/2].compareTo(heapArray[k])<0){
			swap(heapArray,k,k/2);
			k/=2;
		}
	}

	//Rearranging heap if parent becomes smaller than child node
	private void sink(){
		int k = 1;
		int j = 2*k;
		while(2*k<=top && (heapArray[k].compareTo(heapArray[j]) < 0 || heapArray[k].compareTo(heapArray[j+1]) < 0)){
			if(heapArray[j].compareTo(heapArray[j+1])>=0){
				swap(heapArray,k,j);
			}else{
				swap(heapArray,k,j+1);
			}
			k = j;
			j=2*k;
		}
	}

	//Swapping
	private void swap(Comparable a[],int x, int y){
		Comparable temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}