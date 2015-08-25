package sorting;

@SuppressWarnings("rawtypes") 
public class InsertionSort {

	@SuppressWarnings("unchecked") 
	public void sort(Comparable a[]){
		for(int i=1;i<a.length;i++){

			if(a[i].compareTo(a[i-1])<0){
				int j=i-1;
				Comparable temp = a[i];
				while(j>=0 && temp.compareTo(a[j])<0){
					swap(a,j,j+1);
					j--;
				}
			}
		}
	}
	
	private void swap(Comparable[] a, int j, int i) {
		Comparable temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
