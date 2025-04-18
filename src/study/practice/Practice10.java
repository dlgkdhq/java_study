package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int korean = scanner.nextInt();
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		System.out.print("영어점수 : ");
		int english = scanner.nextInt();

		int total = korean + math + english;
		double mean = (double)total / 3;

		if(korean >=40 && math >=40 && english >=40) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + total);
			System.out.printf("평균 : %.2f\n" , mean);

			if(mean>=60) {
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
			} 
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
