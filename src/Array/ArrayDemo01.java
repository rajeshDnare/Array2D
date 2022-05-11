package Array;

import java.util.Scanner;

public class ArrayDemo01 {
	public static void main(String[] args) {
		int[] list = new int[5];
		System.out.println("Enter the elements of the array");

		Scanner num = new Scanner(System.in);
		for (int i = 0; i < list.length; i++) {
			list[i]= num.nextInt();
			 
		}

		for (int i : list) {
			System.out.print(i);

		}

	}

}
