import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * *3.5 (Find future dates) Write a program that prompts the user to enter an
 * integer for today’s day of the week (Sunday is 0, Monday is 1, ..., and
 * Saturday is 6). Also prompt the user to enter the number of days after today
 * for a future day and dis- play the future day of the week. Here is a sample
 * run:
 * 
 * Enter today's day: 1 
 * Enter the number of days elapsed since today: 3 
 * Today is Monday and the future day is Thursday
 * 
 * @author muneer
 *
 */
public class FutureDates {

	static enum DAY_OF_MONTH {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

	};

	public static void main(String[] args) {
		Calendar cal = GregorianCalendar.getInstance();


		int day = (int) ((Math.random() * ((31 - 1) + 1)) + 1);
		System.out.println("Day: " + day);
		int dayFromCalendar = cal.get(day);
		System.out.println("DayFromCalendar: " + dayFromCalendar);

		String nameOfDays = "";
		
		switch (dayFromCalendar) {
		case 0:
			nameOfDays = DAY_OF_MONTH.SUNDAY.name();
			break;
		case 1:
			nameOfDays = DAY_OF_MONTH.MONDAY.name();

			break;
		case 2:
			nameOfDays = DAY_OF_MONTH.TUESDAY.name();

			break;
		case 3:
			nameOfDays = DAY_OF_MONTH.WEDNESDAY.name();

			break;
		case 4:
			nameOfDays = DAY_OF_MONTH.THURSDAY.name();

			break;
		case 5:
			nameOfDays = DAY_OF_MONTH.FRIDAY.name();

			break;
		case 6:
			nameOfDays = DAY_OF_MONTH.SATURDAY.name();

			break;
		default:
			nameOfDays = "Wrong Day!";
		}
		
		System.out.println("Day is " + nameOfDays);
	}

}
