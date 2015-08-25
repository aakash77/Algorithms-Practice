package dynamicconnectivity;

public class QuickUnion {
	private int array[];

	//Init array
	QuickUnion(int n){
		array = new int[n];
		for(int i=0;i<n;i++){
			array[i]=i;
		}
	}
	// Calculate root of the number
	int root(int a){
		if (a==array[a]){
			return a;
		}else{
			return root(array[a]);
		}
	}
	// Check whether the numbers are connected
	Boolean IsConnected(int a, int b){
		return root(a)==root(b);
	}
	// Connect the numbers
	void union(int a, int b){
		array[root(a)] = root(b);
	}
}