import java.util.Scanner;

/**
 * 
 */

/**
 * 4.12 (Hex to binary) Write a program that prompts the user to enter a hex
 * digit and displays its corresponding binary number. Here is a sample run:
 * 
 * Convert hex to binary Enter a hex digit: B The binary value is 1011 Enter a
 * hex digit: G G is an invalid input
 * 
 * @author muneer
 *
 */
public class HexadecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Convert hex to binary.");

		System.out.println("Enter a hex digit: ");

		String num = scan.next();
		StringBuffer strBuffer = new StringBuffer();

		if (num.length() != 1) {
			System.out.println("Please enter only one hexadecimal digit. ");
		} else {
			char ch = num.charAt(0);
			int number = 0;

			if (ch <= 'F' && ch >= 'A') {
				number = ch - 'A' + 10;
			} else if (Character.isDigit(ch)) {
				number = (int) ch;
			}
			System.out.println("Digit is " + number);


			while ((number / 2) != 0) {
				strBuffer.append(number % 2);
				if ((number / 2) == 1 ) {
					strBuffer.append("1");
				}
				if (strBuffer.length() == 4) {
					strBuffer.append(" ");
				} else if (strBuffer.length() == 9) {
					strBuffer.append("\n");
				}
				number = number / 2;
				System.out.println("Number is " + number);
			}
		}
		System.out.println("The binary value is : " + strBuffer.reverse());
	}
}
