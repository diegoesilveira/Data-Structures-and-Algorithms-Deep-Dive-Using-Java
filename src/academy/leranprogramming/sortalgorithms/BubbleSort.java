package academy.leranprogramming.sortalgorithms;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		
	}
	
	public static void swap(int[] array, int i, int j) {
		
		if(i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
}
