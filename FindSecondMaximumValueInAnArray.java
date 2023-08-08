package coreJava.example.arrays;

public class FindSecondMaximumValueInAnArray {

	public static void main(String[] args) {
		int [] array_A = {1,15,4,3,8,10,18,100,57,0,90};
		findSecondMaxValue(array_A);

	}

	private static void findSecondMaxValue(int[] array_A) {
		int max_value=Integer.MIN_VALUE;
		int secondMax_value = Integer.MIN_VALUE;
		for(int i =0; i<= array_A.length-1; i++) {
			if(array_A[i] > max_value) {
				secondMax_value = max_value;
				max_value = array_A[i];
				
				
			}else if(array_A[i] > secondMax_value && array_A[i] != max_value ) {
				secondMax_value = array_A[i];
			}
		}
		System.out.println("secondMax_value========="+secondMax_value);
	}

}
