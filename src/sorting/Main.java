package sorting;

public class Main {
	public static void main(String[] args) {
		/*Integer num[] = {4,9,1,2,5,5,6,11,974923,5999};*/
		String words[] = {"ass","cde","ass","xyz","ass","bcd","abc","ass"};
		/*InsertionSort selection = new InsertionSort();*/
		/*SelectionSort selection = new SelectionSort();*/
		/*ShellSort selection = new ShellSort();*/
		/*MergeSort selection = new MergeSort();*/
		/*BottomUpMergeSort selection = new BottomUpMergeSort();*/
		/*QuickSort selection = new QuickSort();*/
		DuplicateKeysQuickSort selection = new DuplicateKeysQuickSort();
		selection.sort(words);
		for(String s : words)
			System.out.println(s);
		
		/*selection.sort(num);
		for(int s : num)
			System.out.println(s);*/
		
		/**
		 * Select for finding k smallest value 
		 */
		/*QuickSelect selection = new QuickSelect();
		System.out.println(selection.select(words, 2));*/
	}
}
