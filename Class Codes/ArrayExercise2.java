import java.util.Scanner;

public class ArrayExercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize;
		
		do {
			System.out.println("Please input the array size: ");
			arraySize = scanner.nextInt();
		} while(arraySize % 2 == 1);
		
		int[] input = new int[arraySize];
		
		for(int i = 0; i < input.length; i++) {
			System.out.println("Please input element no. " + (i + 1) + ": ");
			input[i] = scanner.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 1; i < input.length; i += 2) {
			sum += input[i];
		}
		
		System.out.println("Sum is: " + sum);

	}

}
