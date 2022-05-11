package Array;

import java.util.Scanner;

public class ArrayDemo03 {
	public static void main(String[] args) {
		int[][] ace=new int[3][];//2nd dimension is not same
		ace[0]=new int[3];
		ace[1]=new int[3];
		ace[2]=new int[3];
		
		System.out.println("enter the elements of array");
		Scanner num=new Scanner(System.in);
		for (int i = 0; i < ace.length; i++) {
			for (int j = 0; j < ace[i].length; j++) {
				ace[i][j]=num.nextInt();
			}
		}
		
		//printing the elements of the array
		for (int i = 0; i < ace.length; i++) {
			for (int j = 0; j < ace[i].length; j++) {
				System.out.print(ace[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
