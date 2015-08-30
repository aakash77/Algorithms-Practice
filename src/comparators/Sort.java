package comparators;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Sort {
	
	void sort(Object a[],Comparator comparator){
		for (int size=1;size<a.length;size+=size){
			for(int j=0;j<a.length-size;j+=size+size){
				merge(a,j,j+size-1,Math.min(j+size+size-1, a.length-1),comparator);
			}
		}
	}
	
	// Method for merging the sub-arrays into sorted bigger arrays
	@SuppressWarnings("unchecked")
	private void merge(Object a[],int low,int mid,int high,Comparator c){

		Object aux[] = new Object[a.length];

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
			}else if(c.compare(aux[i], aux[j]) < 0){
				a[k] = aux[i];
				i++;
			}else{
				a[k] = aux[j];
				j++;
			}
		}
	}
}