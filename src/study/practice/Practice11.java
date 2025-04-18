package study.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		1번
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		if((year%4==0 && year%100 != 0 ) || year%400==0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
		
//		if(year%4==0 ) {
//			if(year%100==0) {
//				if(year%400==0) {
//					System.out.println("윤년");
//				} else {
//					System.out.println("윤년 아님");
//				}
//			}else {
//				System.out.println("윤년");
//			}
//		} else {
//			System.out.println("윤년아님");
//		}
		

	}

}
