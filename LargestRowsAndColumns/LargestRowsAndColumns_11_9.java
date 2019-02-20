package chapter_13_AbstractClassesAndInterfaces;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * *11.9 (Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.)
 
Here is a sample run of the program:
Enter the array size n: 4
The random array is
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2, 3
 */
public class LargestRowsAndColumns_11_9 {

	public static void main(String[] args) {

		System.out.println("Enter the array size n: ");
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		scan.close();
		
		int[] rowArray = new int[arraySize];
		int[] colArray = new int[arraySize];
		
		int[][] twoDimArray = new int[arraySize][arraySize];
		
		ArrayList<Integer> rowList = new ArrayList<>();
		ArrayList<Integer> columnList = new ArrayList<>();
		Random random = new Random(1L);
		int rowMax = 0;
		int colMax = 0;
		
		for(int row = 0; row <arraySize; row++){
			for (int column = 0; column <arraySize; column++){
				twoDimArray[row][column] = (int)random.nextInt(1)+1;			
			}
		}
		
		// printing
		for(int row = 0; row <arraySize; row++){
			for (int column = 0; column <arraySize; column++){
				System.out.print(twoDimArray[row][column]);			
			}
			System.out.println();
		}		
		// For Row
		for(int row = 0; row <arraySize; row++){
			for (int column = 0; column <arraySize; column++){
				if (twoDimArray[row][column] == 1) {
					rowMax++;
				}				
			}
			System.out.println("Row Max: " + rowMax);
			if (rowMax > 0) {
				rowArray[row] = rowMax;
				rowList.add(row);
			}
		}
		
		// For Column
		for(int row = 0; row <arraySize; row++){
			for (int column = 0; column <row; column++){
				if (twoDimArray[column][row] == 1) {
					colMax++;
				}
				System.out.println("Column Max: " + colMax);
				if (colMax > 0){
					colArray[column] = colMax;
					columnList.add(column);
				}
			}			
		}
		
		System.out.println("The largest row index: " + rowList.iterator().next());
		System.out.println("The largest column index: " + columnList.iterator().next());
	}
}
