import java.util.Scanner;

/**
 * 
 */

/**
 * (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid. Here are sample runs:
 * 
 * Enter a SSN: 232-23-5435
 * 
 * - 232-23-5435 is a valid social security number
 * 
 * Enter a SSN: 23-23-5435 - 23-23-5435 is an invalid social security number
 * 
 * @author muneer
 *
 */
public class Check_SSN_DDD_DD_DDDD {

	public static void main(String[] args) {

		System.out.println("Enter a SSN (Social Security Number) in this format: DDD-DD-DDDD ");
		Scanner scan = new Scanner(System.in);
		boolean isSSN = false;
		String ssn = scan.next();
		
		scan.close();
		
		if (ssn.length() == 11) {

			if (ssn.substring(0, 3).length() == 3 && ssn.charAt(3) == '-') {
				String str1 = ssn.substring(0, 3);
				for (int x = 0; x < str1.length(); x++) {
					if (Character.isDigit(str1.charAt(x))) {
						isSSN |= true;
					} else {
						break;
					}
				}
				if (isSSN & ssn.substring(4, 6).length() == 2 && ssn.charAt(6) == '-') {
					String str2 = ssn.substring(4, 6);

					for (int x = 0; x < str2.length(); x++) {
						if (Character.isDigit(str2.charAt(x))) {
							isSSN |= true;
						} else {
							isSSN = false;
							break;
						}
					}
				}

				if (isSSN && ssn.substring(7, ssn.length() - 1).length() == 4) {
					String str3 = ssn.substring(7, ssn.length() - 1);

					for (int x = 0; x < str3.length(); x++) {
						if (Character.isDigit(str3.charAt(x))) {
							isSSN |= true;
						} else {
							isSSN = false;
							break;
						}
					}
				}
			}			
		}
		if (isSSN) {
			System.out.println(ssn + " is a valid social security number");
		} else {
			System.out.println(ssn + " is an invalid social security number");
		}
	}
}
