import java.util.Scanner;

public class CostOfShipping {
	/**
	 * 
	 * 3.18 (Cost of shipping) A shipping company uses the following function to
	 * calculate the cost (in dollars) of shipping based on the weight of the
	 * package (in pounds).
	 * 
	 * Write a program that prompts the user to enter the weight of the package and
	 * display the shipping cost. If the weight is greater than 50, display a
	 * message “the package cannot be shipped.”
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of the package: ");
		double weight = scan.nextDouble();		
		scan.close();
		double price = 0.0;
		
		if (weight >= 0 && weight <= 1) {
			price = weight * 3.5;
			System.out.println("The shipping price for an item of " + weight + " kg is " + price + "$");
		} else if (weight > 1 && weight <= 3) {
			price = weight * 5.5;
			System.out.println("The shipping price for an item of " + weight + " kg is " + price + "$");

		} else if (weight > 3 && weight <= 10) {
			price = weight * 8.5;
			System.out.println("The shipping price for an item of " + weight + " kg is " + price + "$");

		} else if (weight > 10 && weight <= 20) {
			price = weight * 10.5;
			System.out.println("The shipping price for an item of " + weight + " kg is " + price + "$");

		} else {
			System.out.println("The package cannot be shipped.");
		}
	}

}
