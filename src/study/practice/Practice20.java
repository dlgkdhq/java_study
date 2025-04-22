package study.practice;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prac1();
		//prac2();
		//prac3();
		//prac4();
		
	}
	public static void prac1() {
	//1.
			//2x + 4y = 10 이 만족하는
			//모든 x, y 쌍을 구하시오.
			//(x와 y는 자연수 1~10)

			for(int x=1; x<=10; x++) {			//2*x < 10
				for(int y=1; y<=10; y++) {		//4*y < 10으로 쓰면 계산 횟수가 더 적어짐
					if((2*x)+(4*y)==10) {
						System.out.printf("(%d, %d)\n",x,y);
					}
				}
			}
	}
	public static void prac2() {
//			2.
//			정수 2개를 입력 받아서,
//			아래 계산 결과를 출력하시오.
//			큰수 - 작은수
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수 2개를 입력해주세요 : ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			if(num1>num2) {
				System.out.println(num1 - num2);
			} else if(num1<num2) {
				System.out.println(num2 - num1);
			}
	}
	public static void prac3() {
//			3.
//			윷놀이 게임
//			4개의 윷을 입력받고 결과를 출력하시오.
//			(뒷도는 없습니다!)
//			0 : 안 뒤집어진 상태
//			1 : 뒤집어진 상태
//			ex) 입력 0 0 1 0
//			결과 도
//			입력 0 1 0 1
//			결과 개
			
			Scanner scanner = new Scanner(System.in);
			
			int[] arrs = new int[4];
			
			int sum = 0;
			System.out.print("윷 결과(0: 안뒤집어진 상태, 1: 뒤집어진 상태) : ");
			for(int i=0; i<arrs.length; i++) {
				arrs[i] = scanner.nextInt();
				sum = sum + arrs[i];
			}
			
			if(sum==1) {
				System.out.println("도");
			}else if(sum==2) {
				System.out.println("개");
			}else if(sum==3) {
				System.out.println("걸");
			}else if(sum==4) {
				System.out.println("윷");
			}else if(sum==0) {
				System.out.println("모");
			}else {
				System.out.println("0과 1로 입력해주세요");
			}
	}
	public static void prac4() {
//			4. 입력받은 수 만큼 별 출력하기
//			ex) 4
//			****
//			5
//			*****
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 : ");
			int starnum = scanner.nextInt();
			for(int i=0; i<starnum; i++) {
				System.out.print("*");
			}
	}
}