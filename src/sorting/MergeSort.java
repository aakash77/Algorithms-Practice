package sorting;

@SuppressWarnings({"rawtypes","unchecked"})
public class MergeSort {


	void sort(Comparable a[]){
		sorting(a,0,a.length-1);
	}

	private void sorting(Comparable a[],int low,int high){

		if (high<=low)
			return;

		int mid = (low+high)/2;

		sorting(a,low,mid);
		sorting(a,mid+1,high);
		/****optimization****/
		if(a[mid].compareTo(a[mid+1])<0)
			return;
		/****optimization****/
		merge(a,low,mid,high);
	}

	
	private void merge(Comparable a[],int low,int mid,int high){
		
		Comparable aux[] = new Comparable[a.length];
		
		for(int k = low;k<=high;k++){
			aux[k] = a[k];
		}
		
		int i = low;
		int j = mid+1;
		for(int k = low;k<=high;k++){
			if(j>high){
				a[k] = aux[i];
				i++;
			}else if(i>mid){
				a[k] = aux[j];
				j++;
			}else if(aux[i].compareTo(aux[j]) < 0){
				a[k] = aux[i];
				i++;
			}else{
				a[k] = aux[j];
				j++;
			}
		}
	}
}