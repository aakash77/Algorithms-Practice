package sorting;


//Also Known as 3-way Quick Sort to optimize duplicate keys scenario
@SuppressWarnings({"rawtypes","unchecked"})
public class DuplicateKeysQuickSort {

	void sort(Comparable a[]){
		int low = 0,high = a.length-1;
		dkQuickSort(a,low,high);
	}
	
	//Recursive Sorting
	private void dkQuickSort(Comparable a[],int low,int high){
		if(low>=high)
			return ;
		int partition = partition(a, low, high);
		dkQuickSort(a,low,partition-1);
		dkQuickSort(a,partition+1,high);
	} 

	//Partitioning and Swapping
	private int partition(Comparable a[],int low,int high){
		int p = low,i=low+1,j=high;
		while(i<=j){
			if(a[i].compareTo(a[p])<0){
				swap(a,i,p);
				i++;
				p++;
			}
			else if(a[i].compareTo(a[p])>0){
				swap(a,i,j);
				j--;
			}
			else
				i++;
		}
		return p;
	}
	//Swapping
	private void swap(Comparable a[],int x, int y){
		Comparable temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
