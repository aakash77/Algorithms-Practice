package sorting;

//Improvement over insertion sort 
@SuppressWarnings("rawtypes")
public class ShellSort {
	
	@SuppressWarnings("unchecked" )
	void sort(Comparable a[]){
		
		int h = 1;
		while(h<a.length/3)
			h = 3*h +1;
		
		while (h>=1){
			for(int i = h;i<a.length;i++){
				int index = Math.abs(i-h);
				if(a[i].compareTo(a[index])<0){
					
					while(index>=0 && a[index].compareTo(a[index+h])>0){
						swap(a,index,index+h);
						index -=h;
					}
				}
			}
			h/=3;
		}
	}
	
	private void swap(Comparable[] a, int j, int i) {
		Comparable temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
