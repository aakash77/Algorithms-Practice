package sorting;

@SuppressWarnings({"rawtypes","unchecked"})
public class QuickSelect {
	
	Comparable select(Comparable a[],int k){
		try{
			int low = 0,high = a.length-1;
			while(high>low){
				int partition = sorting(a,low,high);
				if(partition > k-1)
					high = partition-1;
				else if(partition < k-1)
					low = partition+1;
				else 
					return a[k-1];
			}
				return a[low];
		}
		catch(ArrayIndexOutOfBoundsException exception){
			return "Index Exceeds the number of elements";
		}
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
