package JavaBasics;
/*
 * 2.6** (Summing the digits in an integer) Write a program that reads an integer between
0 and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:
Enter a number between 0 and 1000:
The sum of the digits is 27
 */
public class SummingTheDigitsInAnInteger {
	public static void main(String[] args) {
		int k = 12311;
		int result = 0;
		/*
		 * Here we loop to sum the result if value of k is more than zero. The 'k' is divided using remainder operator to get the remainder 
		 of division and then divided to get the actual value after division.
		 */
		while (k > 0) {
			result += k % 10;
			k = k / 10;
		}
		System.out.println(result);
	}
}
