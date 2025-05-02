package study.practice.practice31;

import java.util.Scanner;

public class WeightAfterFiveMonths {

	public static void main (String[] args) {
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		double start = scan.nextDouble();		//현재 몸무게
		int after = scan.nextInt();				//몇달 후?

		// 계산
		double result = weight(start, after);

		// 결과 출력
		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
	}

	// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
	public static double weight(double currentWeight, int months) {
		double expectedWeight = currentWeight;
		
		//몇달만큼 반복
		for (int i=1; i<=months; i++) {
			expectedWeight += 0.231;	//한달에 0.231kg씩 찐다
		}
		return expectedWeight;
	}

}
