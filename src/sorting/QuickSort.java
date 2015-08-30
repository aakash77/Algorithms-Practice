package sorting;

@SuppressWarnings({"rawtypes","unchecked"})
public class QuickSort {
	
	void sort(Comparable a[]){
		quickSort(a,0,a.length-1);
	}
	
	//Partitioning
	private void quickSort(Comparable a[],int low,int high){
		if(high<=low)
			return ;
		int partition = sorting(a,low,high);
		quickSort(a,low,partition-1);
		quickSort(a,partition+1,high);
	}
	
	//QuickSort Comparing and Swapping
	private int sorting(Comparable a[],int low,int high){
		//a[low] --> pivot
		int i=low,j=high+1;
		while(i<j){
			while(a[++i].compareTo(a[low])<0 && i<high);
			while(a[--j].compareTo(a[low])>0 && j>low);
			if(i<j){
				swap(a,i,j);
			}
		}
		swap(a,low,j);
		return j;
	}
	
	//Swapping
	private void swap(Comparable a[],int x, int y){
		Comparable temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}