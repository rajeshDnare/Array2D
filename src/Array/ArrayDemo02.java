//program to demonstrate the array
package Array;

import java.util.Scanner;

public class ArrayDemo02 {
	public static void main(String[] args) {
		int[][] yadi = new int[2][2];// declare the array
		System.out.println("Enter the elements of the array");

		Scanner num = new Scanner(System.in);
		for (int i = 0; i < yadi.length; i++) {// traverse through the array
			for (int j = 0; j < yadi[i].length; j++) {
				yadi[i][j] = num.nextInt();

			}

		}

		for (int i = 0; i < yadi.length; i++) {// print the array
			for (int j = 0; j < yadi[i].length; j++) {
				System.out.print(yadi[i][j]);
			}
			System.out.println();

		}

	}

}
