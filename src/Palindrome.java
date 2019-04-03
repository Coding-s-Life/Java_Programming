import java.util.Scanner;

public class Palindrome {
	/**
	 * 3.12 (Palindrome number) Write a program that prompts the user to enter a
	 * three-digit integer and determines whether it is a palindrome number. A
	 * number is palindrome if it reads the same from right to left and from left to
	 * right. Here is a sample run of this program:
	 * 
	 * Enter a three-digit integer: 121 121 is a palindrome
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a three-digit integer: ");
		Scanner scan = new Scanner(System.in);

		int palindrome = scan.nextInt();
		scan.close();
		char[] charArray = String.valueOf(palindrome).toCharArray();

		char[] rightToLeft = new char[charArray.length];
		int x = 0;
		for (int i = charArray.length-1; i >= 0; i--) {
			rightToLeft[x] = charArray[i];
			x++;
		}
		boolean isPalindrome = false;
		for(int y = 0; y < charArray.length; y++) {
			if(charArray[y] == rightToLeft[y]) {
				isPalindrome |= true;
			}else {
				isPalindrome = false;
			}
		}
		if (isPalindrome) {
			System.out.println(charArray + " is a palindrome.");
		} else {
			System.out.println(charArray + " is not a palindrome.");
		}
	}
}
