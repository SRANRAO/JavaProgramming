package coreJava.example.arrays;

public class ReverseAnArray {
	
	public static void reverseArray(int[] numbers) {
		printArray(numbers);
		int max_Size = numbers.length-1;
		int min_Size = 0;
		while (min_Size < max_Size) {
			int temVar = numbers[min_Size];
			numbers[min_Size] = numbers[max_Size];
			numbers[max_Size] = temVar;
			min_Size++;
			max_Size--;
		}
		printArray(numbers);
	}
	
	
	private static void printArray(int[] numbers) {
		for(int i =0; i <= numbers.length-1; i++ ) {
			System.out.println(numbers[i] +" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int [] array_A = {1,15,4,3,8,10,18,100,57};
		reverseArray(array_A);
	}

}
