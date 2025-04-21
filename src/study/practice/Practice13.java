package study.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		prac1();
//		prac2();
//		prac3();
//		prac4();
//		prac5();
//		prac6();
		prac7();
	}	
	
	public static void prac1() {
		//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = scanner.nextInt();

		if(num1%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		System.out.println( (num1%2==0) ? "even" : "odd"); 
	}
	public static void prac2() {
		//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num2 = scanner.nextInt();

		if(num2%7==0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		
		System.out.println( (num2%7==0) ? "7의 배수입니다" : "아닙니다"); 
	}
	public static void prac3() {
		//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.

		int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%5==0) {
				sum = sum + i;
			}
		}
		System.out.printf("1~1000까지 5의 배수의 합은 %d 입니다.\n", sum);
		
		sum=0;
		for(int i=5;i<=1000; i=i+5) {
			sum = sum + i;
		}
		System.out.println("1~1000까지 5의 배수의 합: "+ sum);
	}	
	public static void prac4() {
		//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		//		ex) 입력 : 10
		//		결과 : **********
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~50까지 숫자를 입력하세요 : ");
		int num4 = scanner.nextInt();

		if(num4>=1 && num4<=50) {
			for(int i=1; i<=num4; i++) {
				System.out.print("*");
			}
		}else {
			System.out.println("잘못 입력했습니다.");
		}

		System.out.println();
		
		for(int i=1; i<=num4; i++) {
			System.out.print("*");
		}
	}
	public static void prac5() {
		//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		//		ex) 1 - 2 + 3 - 4 .....

		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum = sum-i;
			}else {
				sum = sum+i;
			}
		}System.out.println("합계 : " + sum);

	}
	public static void prac6() {
		//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.


		//		sum=0;
		//		for(int i=1; i<=1000; i++) {
		//			if(sum>1000) {
		//				break;
		//			}
		//			sum = sum + i;
		//		} System.out.println("누적 합계 : "+ sum);

		int sum=0;
		int i=1;
		while(sum<=1000) {
			sum=sum+i;
			i++;
			//sum = sum + i++;	 위 두개 합친 식
		} 
		System.out.println("누적 합계 : " + sum);

	}
	public static void prac7() {
		//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		//		ex) 입력 3
		//		3 * 1 = 3
		//		3 * 2 = 6
		//		3 * 3 = 9
		//		...
		//		3 * 9 = 27
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 몇 단?(1~9) : ");
		int num7 = scanner.nextInt();

		if(num7>=1 && num7<=9) {
			for(int i=1; i<=9; i++) {
				int result = num7 * i;
				System.out.printf("%d * %d = %d\n", num7, i, result);
			}
		}
	}

}







































