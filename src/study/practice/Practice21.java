package study.practice;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[4][4];

		/*
		 1.
			1  2  3  4
			5  6  7  8
			9  10 11 12
			13 14 15 16
		 */
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num = num + 1;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		/*
		 2.
			1 5  9 13
			2 6 10 14
			3 7 11 15
			4 8 12 16
		 */
		num = 1;
		for(int i=0; i<arr.length; i++) {	
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+1) + (4*j);
				num = num +1 ;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 3.
			16 15 14 13
			12 11 10 9
			8  7  6  5
			4  3  2  1
		 */
		num = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num = num - 1;		// (16-j) - (i*4)
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 4.
			16 12 8 4
			15 11 7 3
			14 10 6 2
			13 9  5 1
		 */
		num = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (16-i) -(4*j) ;
				num = num - 1;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
