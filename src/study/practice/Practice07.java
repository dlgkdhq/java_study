package study.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		int age = 2025 - year +1 ;

		if (number == 1 && year < 2000 ) {
			System.out.printf("%d살 남자입니다." , age);
		} else if (number ==2 && year < 2000) {
			System.out.printf("%d살 여자입니다." , age);
		} else if (number == 3 && year >= 2000 ) {
			System.out.printf("%d살 남자입니다." , age);
		} else if (number == 4 && year >= 2000 ) {
			System.out.printf("%d살 여자입니다." , age);
		} else {
			System.out.println("잘못된 입력");
		}
	
		
	}

}
