package sorting;

@SuppressWarnings("rawtypes")
public class SelectionSort{

	@SuppressWarnings("unchecked")
	public void sort(Comparable[] a){

		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if (a[j].compareTo(a[i])<0){
					swap(a,j,i);
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