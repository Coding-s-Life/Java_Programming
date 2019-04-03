import java.util.Scanner;

/**
 * 
 */

/**
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week. The formula is :
 * 
 * h=(q+((13*(m+1))/5)+Y+(Y/4)-(Y/100)+(Y/400))%7
 * 
 * where h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3:
 * Tuesday, 4: Wednesday, 5: Thursday, 6: Friday). q is the day of the month. m
 * is the month (3: March, 4: April, ..., 12: December). January and February
 * are counted as months 13 and 14 of the previous year. j is the century
 * (i.e.,). year/100 k is the year of the century (i.e., year % 100).
 * 
 * Note that the division in the formula performs an integer division. Write a
 * pro- gram that prompts the user to enter a year, month, and day of the month,
 * and displays the name of the day of the week. Here are some sample runs:
 * 
 * Enter year: (e.g., 2012): 2015 Enter month: 1-12: 1 Enter the day of the
 * month: 1-31: 25 Day of the week is Sunday
 * 
 * Enter year: (e.g., 2012): 2012 Enter month: 1-12: 5 Enter the day of the
 * month: 1-31: 12 Day of the week is Saturday
 * 
 * (Hint: January and February are counted as 13 and 14 in the formula, so you
 * need to convert the user input 1 to 13 and 2 to 14 for the month and change
 * the year to the previous year.)
 */
public class Science_Day_Of_Week {
	
	static enum DAYS_OF_WEEK {
		SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	};

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year_j = scan.nextInt();

		System.out.println("Enter month: 1-12: ");
		int month_m = scan.nextInt();

		System.out.println("Enter the day of the month: 1-31: ");
		int day_q = scan.nextInt();
		
		int yearOfThCentury = (year_j % 100);
		int century_j = (year_j / 100);
		
		scan.close();
		/*
		 * h=(q+((26*(m+1))/10)+K+(K/4)-(J/4)+5 * J)%7
		 * 
		 * where h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3:
		 * Tuesday, 4: Wednesday, 5: Thursday, 6: Friday). q is the day of the month. m
		 * is the month (3: March, 4: April, ..., 12: December). January and February
		 * are counted as months 13 and 14 of the previous year. j is the century
		 * (i.e.,). year/100 k is the year of the century (i.e., year % 100).
		 */
		
		if (month_m == 1) {
			month_m = 13;
		}
		else if (month_m == 2) {
			month_m = 14;
		}
		
		int day = (day_q + ((13*(month_m+1))/5)+yearOfThCentury+(yearOfThCentury/4)+(century_j/4)+(5*century_j)) % 7 ; 
		
		for (DAYS_OF_WEEK days : DAYS_OF_WEEK.values()) {
			if (days.ordinal() == day) {
				String nameOfDay_h = days.name();
				System.out.println("Day of the week is " + nameOfDay_h);				
			}
		}
		
	}

}
