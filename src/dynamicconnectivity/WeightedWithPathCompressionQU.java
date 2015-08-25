package dynamicconnectivity;

public class WeightedWithPathCompressionQU {
	
	private int array[];
	private int size[]; // Extra Array to maintain the size of each tree

	public WeightedWithPathCompressionQU(int n) {
		array = new int[n];
		size = new int[n];
		for(int i=0;i<n;i++){
			array[i]=i;
			size[i]=1;
		}
	}

	// Calculate root of the number
	int root(int a){
		if (a==array[a]){
			return a;
		}else{
			array[a] = array[array[a]]; // Path Compressing so that all elements directly points to the root
			return root(array[a]);
		}
	}

	// Check whether the numbers are connected
	Boolean IsConnected(int a, int b){
		return root(a)==root(b);
	}

	// Connect the numbers
	void union(int a, int b){
		
		int rootA = root(a); 
		int rootB = root(b);
		
		if(rootA == rootB) return;
		if(size[rootA]>size[rootB]){
			array[rootB] = rootA;
			size[rootA] += size[rootB];
		}else{
			array[rootA] = rootB;
			size[rootB] += size[rootA];
		}
	}

}
