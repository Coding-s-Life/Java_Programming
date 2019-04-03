import java.util.Scanner;

/**
 * 
 */

/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges
 * for a triangle and computes the perimeter if the input is valid. Otherwise,
 * display that the input is invalid. The input is valid if the sum of every
 * pair of two edges is greater than the remaining edge.
 * 
 * @author muneer
 *
 */
public class Perimeter_Of_A_Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle. ");
		System.out.println("Enter one side of the triangle: ");

		double a = scan.nextDouble();
		System.out.println("Enter one side of the triangle: ");

		double b = scan.nextDouble();
		System.out.println("Enter one side of the triangle: ");

		double c = scan.nextDouble();
		boolean isEvaluate = false;

		if (a > 0 && b > 0 && c > 0) {
			if ((a + b) > c) {
				isEvaluate |=true;
			}
			if ((b + c) > a && isEvaluate) {
				isEvaluate |=true;
			}
			if ((a + c) > b && isEvaluate) {
				isEvaluate |=true;
			}
			if (isEvaluate) {
				System.out.println("The perimeter of a triangle is " + ( a + b + c));
			}
		} else {
			System.out.println("Inputs are invalid.");
		}		 
	}

}
