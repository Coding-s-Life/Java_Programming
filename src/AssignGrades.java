import java.util.Arrays;
import java.util.Scanner;

/*
 * *7.1 (Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:

Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
 */

public class AssignGrades {

	public static void main(String[] args) {

		System.out.println("Enter the number of students: ");
		Scanner scan = new Scanner(System.in);
		int numberOfStudents = scan.nextInt();

		int[] scoreArray = new int[numberOfStudents];

		System.out.println("Enter " + numberOfStudents + " scores: ");
		for (int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(scoreArray);
		int bestScore = scoreArray[scoreArray.length - 1];

		for (int i = 0; i < scoreArray.length; i++) {
			if (scoreArray[i] >= (bestScore - 10)) {
				System.out.println("Student " + i + " score is " + scoreArray[i] + " and grade is A");
			} else if (scoreArray[i] >= (bestScore - 20)) {
				System.out.println("Student " + i + " score is " + scoreArray[i] + " and grade is B");
			} else if (scoreArray[i] >= (bestScore - 30)) {
				System.out.println("Student " + i + " score is " + scoreArray[i] + " and grade is C");
			} else if (scoreArray[i] >= (bestScore - 40)) {
				System.out.println("Student " + i + " score is " + scoreArray[i] + " and grade is D");
			} else {
				System.out.println("Grade is F");
			}
		}
	}
}
