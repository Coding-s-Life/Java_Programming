import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {

	public static void main(String[] args) {
		int[] intArray = new int[10];

		double[][] double_2D_Array = new double[2][4];

		String[][][] string_3D_Array = new String[1][2][3];

		for (int i = 0; i < 10; i++) {
			intArray[i] = ((int) (Math.random() * 10 + i)) + i;
		}

		Arrays.sort(intArray);

		System.out.println("Enter a number between 0 to 10: ");
		Scanner scan = new Scanner(System.in);
		int searchedValue = scan.nextInt();
		scan.close();
		int lowerBound = 0;
		int upperBound = intArray.length - 1;
		boolean isFound = false;

		while (upperBound >= lowerBound) {
			int middleBound = (lowerBound + upperBound) / 2;

			if (searchedValue < intArray[middleBound]) {
				upperBound = middleBound - 1;
			} else if (searchedValue > intArray[middleBound]) {
				lowerBound = middleBound + 1;
			} else if (searchedValue == intArray[middleBound]) {
				System.out.println("Value " + searchedValue + " is found at the " + middleBound
						+ " location of the array.");
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("Searched Value: " + searchedValue + " is not found.");
		}
	}
}
