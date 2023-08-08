package coreJava.example.arrays;

public class findMinimumValue {
	
	public static void main(String[] args) {
		int [] array_A = {1,15,4,3,8,10,18,100,57,0};
		findMinValueArray(array_A);
	}

	private static void findMinValueArray(int[] array_A) {
		int min_value =array_A[0];
		for(int i= 1; i<= array_A.length-1; i++) {
			if(min_value > array_A[i]) {
				min_value = array_A[i];
			}
		}
		System.out.println("min value in list :"+ min_value);
		
	}

}
