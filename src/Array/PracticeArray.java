package Array;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		int x[][]=new int[4][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of the array");
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j]=sc.nextInt();
			}
			
		}
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
