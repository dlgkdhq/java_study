package study.practice;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//들여쓰기 정렬 
		// 영역 지정해서 -> Ctrl + i
		// 전체 영역지정 -> Ctrl + a

		prac1();
		prac2();
		prac3();
		prac4();
	}	
	public static void prac1() {

		//1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

		Scanner scanner = new Scanner(System.in);
		System.out.print("시간을 입력하세요 : ");
		int time = scanner.nextInt();

		if (time <= 12) {
			System.out.println("오전입니다");

			if (time <= 6 && time >= 1) {
				System.out.println("이른 오전입니다");
			} else {
				System.out.println("늦은 오전입니다");
			}
		} else if (time > 12 && time <= 24) {
			System.out.println("오후입니다");

			if (time >= 13 && time <= 18) {
				System.out.println("이른 오후입니다");
			} else {
				System.out.println("늦은 오후입니다");
			}
		} else {
			System.out.println("잘못입력했습니다");
		}
	
	//		// 선생님 답 ---이외에는 github 참조~
	//		System.out.println("1~24 중 하나의 정수 입력 : ");
	//		int hour = scanner.nextInt();
	//
	//		if (hour >= 1 && hour <= 6) {
	//			System.out.println("오전입니다");
	//			System.out.println("이른 오전입니다");
	//		} else if (hour >= 7 && hour <= 12) {
	//			System.out.println("오전입니다");
	//			System.out.println("늦은 오전입니다");
	//		} else if (hour > 12 && hour <= 18) {
	//			System.out.println("오후입니다");
	//			System.out.println("이른 오후입니다");
	//		} else if (hour > 18 && hour <= 24) {
	//			System.out.println("오후입니다");
	//			System.out.println("늦은 오후입니다");
	//		} else {
	//			System.out.println("잘못입력했습니다");
	//		}
	}
	public static void prac2() {
		//2번 아래 코드를 if문으로 변경

		int diceNum = 0; // 주사위 수 1~6

		if (diceNum == 1) {
			System.out.println("1");
		} else if (diceNum == 2) {
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}


	}
	public static void prac3() {
		//3번 아래 코드를 swtich 문으로 변경

		//String 값 비교
		//localNum == "031" 비교x
		//localNum.equals("031") 비교o	true/false

		String localNum = "031";

		switch (localNum) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "02":
			System.out.println("서울입니다");
			break;
		case "041":
			System.out.println("충남입니다");
			break;
		case "051":
			System.out.println("부산입니다");
			break;
			//		default:
		}
	}
	public static void prac4() {
		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.

		int score = 80;
		int grade = score / 10;

		switch (grade) {
		case 10: 
		case 9:
			System.out.println("학점 A");
			break;
		case 8:
			System.out.println("학점 B");
			break;
		case 7:
			System.out.println("학점 C");
			break;
		default:
			System.out.println("학점 F");

		}
	}

	}
