package sorting;


//Merge the sub arrays of gradually increasing size
@SuppressWarnings({"rawtypes","unchecked"})
public class BottomUpMergeSort {

	void sort(Comparable a[]){
		for (int size=1;size<a.length;size+=size){
			for(int j=0;j<a.length-size;j+=size+size){
				merge(a,j,j+size-1,Math.min(j+size+size-1, a.length-1));
			}
		}
	}
	
	// Method for merging the sub-arrays into sorted bigger arrays
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
