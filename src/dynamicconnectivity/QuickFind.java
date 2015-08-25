package dynamicconnectivity;

public class QuickFind {
	
	private int array[];
	
	//Init array
	QuickFind(int n){
		array = new int[n];
		for(int i=0;i<n;i++){
			array[i]=i;
		}
	}
	
	Boolean IsConnected(int a, int b){
		return array[a]==array[b];
	}
	
	void union(int a, int b){
		int pid = array[a];
		int qid = array[b];
		for (int i : array) {
			if (array[i]==pid){
				array[i]=qid;
			}
		}
	}
	
}
