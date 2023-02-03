import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize;
		
		System.out.println("Please input the array size: ");
		arraySize = scanner.nextInt();
		scanner.nextLine();
		
//		Car[] cars = new Car[arraySize];
//		
//		for(Car car : cars) {
//			System.out.println("Please input color of the car: ");
//			String color = scanner.nextLine();
//			
//			System.out.println("Please input model of the car: ");
//			String model = scanner.nextLine();
//			
//			car = new Car(color, model);
//		}
		
		Car[] cars = new Car[arraySize];
		//Arrays.fill(cars, new Car());
		
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		for(Car car : cars) {
			System.out.println("Please input color of the car: ");
			String color = scanner.nextLine();
			
			System.out.println("Please input model of the car: ");
			String model = scanner.nextLine();
			
			car.setColor(color);
			car.setModel(model);
		}
		
		//System.out.println(Arrays.toString(cars));
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
