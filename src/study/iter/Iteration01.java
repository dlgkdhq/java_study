package study.iter;

public class Iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕안녕");
		
		//반복문
		/* 
			for(초기화; 조건식; 증감식){
			 	실행문
		}
		 */
		System.out.println("===for문===");
		for (int i=1; i<=10; i++) {
			System.out.println("안녕하세욤");
		}
		
		// i : 1~10  <=10   -> 10번 반복
		
		// 조건식 : i < 15	-> 14번 반복
		// i : 1~14 	-> 14번
		
		//단순 몇 회 반복 용도
		int i = 1;
		for (i=7; i != 13; i=i+1) {
			System.out.println("방가");
		}
		
		//실제 반복되는 값을 실행에 활용하는 용도
		
		//1~7일동안 반복 학습 출력
		System.out.println("자바 복습 1일차");
		System.out.println("자바 복습 2일차");
		System.out.println("자바 복습 3일차");
		System.out.println("자바 복습 4일차");
		System.out.println("자바 복습 5일차");
		System.out.println("자바 복습 6일차");
		System.out.println("자바 복습 7일차");
		
		//필요한 숫자 -> 1~7 (반복용도 + 사용하는 용도)
		System.out.println("============");
		for(int j=1; j<=7; j++) {
			// j: 1~7
			System.out.println("자바 복습 " + j +"일차");
		}
		
		//1~50까지 합
		//int num = 1 + 2 + 3 + 4 + .... + 50;
		int num = 0;
		for(int k=1; k<=50; k++) {
			num = num + k;    
			// num += k;
			// k : 1~50
		}
		System.out.println("1~50까지의 합 : " + num);
		
		//k:2
		// k<20
		for(int k=2; k<20; k=k*2) {
			System.out.println(k);
		}
		
		for(int k=400; k>100; k=k-50) {
			System.out.print(k + " ");
		}
		System.out.println();  //줄바꿈 처리
		
		for(int k=100; k>=90; k--) {
			System.out.print(k + " ");
		}
	}

}



















