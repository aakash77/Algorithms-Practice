package sorting;

public class Main {
	public static void main(String[] args) {
		Integer num[] = {4,9,1,2,5,5,6,11,974923,5999};
		/*String words[] = {"ass","cde","xyz","bcd","abc"};*/
		/*InsertionSort selection = new InsertionSort();*/
		/*SelectionSort selection = new SelectionSort();*/
		ShellSort selection = new ShellSort();
		selection.sort(num);
		for(int s : num)
			System.out.println(s);
	}
}
