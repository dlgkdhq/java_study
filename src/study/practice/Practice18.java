package study.practice;

import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String[] strArr = {"입력", "수정", "조회", "삭제", "종료"};
		for(int i=0; i<strArr.length; i++) {
			System.out.println((i+1) + ". " + strArr[i]);
		}
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = scanner.nextInt();

		if(num>0 && num<5) {
			System.out.println(strArr[num-1] + " 메뉴입니다.");
		} else if (num==5) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
//=============================================================================//
		
		//		System.out.println("1. 입력");
		//		System.out.println("2. 수정");
		//		System.out.println("3. 조회");
		//		System.out.println("4. 삭제");
		//		System.out.println("5. 종료");

		// 		String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};
		// 					//	5
		// 		for(int i=0; i<menuArr.length; i++) {	//i: 0 1 2 3 4
		// 			System.out.println((i+1) + ". " + menuArr[i] );
		// 			//	i:0				0+1.				menuArr[0]
		// 			//					1. 입력
		// 			//					2. 수정
		// 		}
		// 
		// 		Scanner scanner = new Scanner(System.in);
		// 		System.out.print("메뉴 번호를 입력하세요 : ");
		// 		int menu = scanner.nextInt();
		// 
		// 		if(menu >= 1 && menu <= 4) {
		// 			System.out.println( menuArr[menu-1] + " 메뉴입니다." );
		// 		} else if(menu ==5) {
		// 			System.out.println("프로그램이 종료됩니다.");
		// 		} else {
		// 			System.out.println("잘못입력하셨습니다.");
		// 		}

		/*
 		if (menu == 1)
 			System.out.println("입력 메뉴입니다.");
 		else if (menu == 2)
 			System.out.println("수정 메뉴입니다.");
 		else if (menu == 3)
 			System.out.println("조회 메뉴입니다.");
 		else if (menu == 4)
 			System.out.println("삭제 메뉴입니다.");
 		else if (menu == 5)
 			System.out.println("프로그램이 종료됩니다.");
 		else
 			System.out.println("잘못입력하셨습니다.");

 		if (menu >= 1 && menu <= 5) { // 정상 범위
 			if (menu == 1)
 				System.out.println("입력 메뉴입니다.");
 			if (menu == 2)
 				System.out.println("수정 메뉴입니다.");
 			if (menu == 3)
 				System.out.println("조회 메뉴입니다.");
 			if (menu == 4)
 				System.out.println("삭제 메뉴입니다.");
 			if (menu == 5)
 				System.out.println("프로그램이 종료됩니다.");
 		} else {
 			System.out.println("잘못입력하셨습니다.");
 		}

 		switch(menu){
 		case 1:
 			System.out.println("입력 메뉴입니다.");
 			break;
 		case 2:
 			System.out.println("수정 메뉴입니다.");
 			break;
 		case 3:
 			System.out.println("조회 메뉴입니다.");
 			break;
 		case 4:
 			System.out.println("삭제 메뉴입니다.");
 			break;
 		case 5:
 			System.out.println("프로그램이 종료됩니다.");
 			break;
 		default:
 			System.out.println("잘못입력하셨습니다.");
 		}
		 */

	}

}
