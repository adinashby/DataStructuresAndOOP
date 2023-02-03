import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input the array size: ");
		int arraySize = scanner.nextInt();
		
		int[] input = new int[arraySize];
		
		for(int i = 0; i < input.length; i++) {
			System.out.println("Please input element no. " + (i + 1) + ": ");
			input[i] = scanner.nextInt();
		}
		
//		System.out.println("Before sorting: " + Arrays.toString(input));
//		Arrays.sort(input);
//		System.out.println("After sorting: " + Arrays.toString(input));
//		
//		int largest = input[input.length - 1];
//		int smallest = input[0];
//		
//		System.out.println("The largest element is: " + largest);
//		System.out.println("The smallest element is: " + smallest);
		
//		int maximum = input[0];
//		
//		for(int i = 0; i < input.length; i++) {
//			
//			if(maximum < input[i]) {
//				maximum = input[i];
//			}
//		}
		
		int maximum = Integer.MIN_VALUE;
		
		for(int num : input) {
			if(num > maximum) {
				maximum = num;
			}
		}
		
		System.out.println("Maximum is: " + maximum);
	}

}
